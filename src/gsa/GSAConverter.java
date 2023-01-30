package gsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.WritableToken;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.JavaBaseListener;
import antlr.JavaParser;
import outputs.Output;

public class GSAConverter extends JavaBaseListener {

    public TokenStreamRewriter rewriter;
    int indexIncrease = 0;
    int tabAmount = 1;
    List<Integer> extraLines;
    
    // variable-specific variables
    public Map<String, Integer> varCounts;	// keeps track of the amount of each variable
	public Map<String, String> varTypes;	// keeps track of the type of each variable
	
	// class-specific variables
	Token classFirstLine;
	String className;
	
	// method-specific variables
	boolean methodFirstLineFound = false;
	Token currentFirstLine;
	boolean afterVarDefs = false;
	HashMap<String,String> formalParams;
	String currentMethod = "";
	
	// block-specific variables
	Stack<HashMap<String, Integer>> prevVarCounts;
	
	// expression-specific variables
	boolean assignedVariableIndexed = false;
	String currentAssignee = "";
	
	// conditions
	boolean insideIfCondition = false;
	int ifConditionDepth = 0;
	boolean insideWhileCondition = false;
	int whileConditionDepth = 0;
	
	// if statement variables
	Stack<List<Pair<Token, Token>>> ifConditionIntervals; // stack for each if-chain - stack for each if block within the chain - and pair for each condition
	Stack<JavaParser.StatementContext> ifParents;
	Stack<Integer> ifChainLengths;
	Stack<List<JavaParser.StatementContext>> nextIfBlocks;		// stack element for each if-chain - list of if blocks within the if-chain
	Stack<List<HashMap<String,Integer>>> ifChainsLastDefinedVars;	// stack of if-chains - list of each block in the if-chain - map of each variable/count pair in the given if block
	Stack<Integer> ifChainsLastDefinedVarsIndex;
	Stack<JavaParser.StatementContext> finalIfBlocks;
	Stack<HashMap<String, Integer>> beforeIfChain; 		// same as prevVarCounts, but specifically used for if statement conditions
	
	// while statement variables
	Stack<List<String>> firstVarFound;								// each while loop will have a list of vars that have been defined with the entry func. all vars after that can behave normally
	Stack<HashMap<JavaParser.PrimaryContext,Integer>> phiEntryVars;	// keeps track of the phi entry function placement locations
	
    public GSAConverter(CommonTokenStream tokens, List<Integer> addedLines) {
        rewriter = new TokenStreamRewriter(tokens);
        extraLines = addedLines;
        
        varCounts = new HashMap<>();
        varTypes = new HashMap<>();
        
        prevVarCounts = new Stack<>();
        
        ifConditionIntervals = new Stack<>();
        ifParents = new Stack<>();
        ifChainLengths = new Stack<>(); 
        nextIfBlocks = new Stack<>();
        ifChainsLastDefinedVars = new Stack<>();
        ifChainsLastDefinedVarsIndex = new Stack<>();
        finalIfBlocks = new Stack<>();
        beforeIfChain = new Stack<>();
        
        firstVarFound = new Stack<>();
        phiEntryVars = new Stack<>();	
    }
    
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    	className = ctx.Identifier().getText();
    }
    
    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
		classFirstLine = ctx.LBRACE().getSymbol();
    }
    
    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
    	String var = ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().getText();
    	
    	// check if this is an array
    	if(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0) != null) {
    		
    		// get bracket count
			int bracketCount = ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK().size();
			String brackets = "";
			for(int i=0; i<bracketCount; i++) {
				brackets += "[]";
			}
    		
    		// delete brackets
    		rewriter.replace(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0).getSymbol(), ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().RBRACK(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().RBRACK().size()-1).getSymbol(), "");
    		
    		// add array type
    		varTypes.put(var, getType(ctx.typeSpec().getText() + brackets));
    	}
    	else {
    		varTypes.put(var, getType(ctx.typeSpec().getText()));
    	}
    	
    	// replace the type with the "Var<>" version
    	rewriter.replace(ctx.typeSpec().start, "Var<" + varTypes.get(var) + ">");
    	
    	// check if this is NOT an assignment statement
    	if(ctx.variableDeclarators().variableDeclarator(0).ASSIGN() == null) {
    		rewriter.insertAfter(ctx.variableDeclarators().variableDeclarator(0).stop, "_" + varCounts.get(var));
    	}
    	// if it is an assignment statement
    	else {
    		// right-side needs to be reformatted
    		Token start = ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer().start;
	    	Token end = ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer().stop;
	    	newVariable(var, start, end);
    		
    	}
    	
    }
    
    @Override
    public void exitTypeSpec(JavaParser.TypeSpecContext ctx) {
    	// array
    	if(currentMethod.equals("") && ctx.LBRACK(0) != null) {
    		// remove all brackets
    		rewriter.replace(ctx.LBRACK(0).getSymbol(), ctx.RBRACK(ctx.RBRACK().size()-1).getSymbol(), "");
    	}
    }
    
    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx)  {
    	currentMethod = ctx.Identifier().getText();
    }
    
    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx)  {
    	currentMethod = "";
    }
    
    @Override
    public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
    	formalParams = new HashMap<>();
    }
    
    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
    	formalParams.put(ctx.variableDeclaratorId().getText(), ctx.typeSpec().getText());
    	
    	// change type
    	rewriter.replace(ctx.typeSpec().start, ctx.typeSpec().stop, getType(ctx.typeSpec().getText()));
    }
    
    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
    	methodFirstLineFound = false;
    	afterVarDefs = false;
    }
    
    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
    	currentFirstLine = null;
    }
    
    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
    	tabAmount += 1;
    	
    	if(!methodFirstLineFound) {
    		currentFirstLine = ctx.LBRACE().getSymbol();
    		methodFirstLineFound = true;
    		
    		// declare the formal parameters as our Var type
    		String comment2 = "\n\t\t// formal parameters";
    		rewriter.insertAfter(currentFirstLine, comment2);
    		indexIncrease += comment2.length();
    		for(String key : formalParams.keySet()) {
    			if(varCounts.containsKey(key)) {
    				varCounts.put(key, varCounts.get(key) + 1);
    			}
    			else {
    				varCounts.put(key, 0);
    				varTypes.put(key, getType(formalParams.get(key)));
    			}
    			
        		// add the actual declaration
    			String decl = "\n\t\tVar<" + varTypes.get(key) + "> " + key + "_" + varCounts.get(key) + " = new Var<" + varTypes.get(key) + ">(" + key + ");";
    			rewriter.insertAfter(currentFirstLine, decl);
        		indexIncrease += decl.length();
        		
        		// add the record statement
        		int lineNum = ctx.getStart().getLine();
        		for(Integer n : extraLines) {
        			if(n < ctx.getStart().getLine()) {
        				lineNum--;
        			}
        		}
        		rewriter.insertAfter(currentFirstLine, "\n\t\t" + createRecordStatement(className, currentMethod, lineNum, key + "_" + varCounts.get(key)) + ";");
        		
        		
    		}
    		
    		// add a comment
    		String comment = "\n\n\t\t// all variables are declared to null";
    		rewriter.insertAfter(currentFirstLine, comment);
    		indexIncrease += comment.length();
    		
    	}
    }
    
    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
    	tabAmount -= 1;
    }
    
    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
    	if(!afterVarDefs) {
    		afterVarDefs = true;
    		String comment = "\n\t\t/* PROGRAM STARTS */\n\t\t";
    		rewriter.insertBefore(ctx.start, comment);
    		indexIncrease += comment.length();
    	}
    }
    
    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
    	if(ctx.IF() != null) {
    		insideIfCondition = true;
    		
    		// get potential parent from if chain length
    		RuleContext parent = ctx.parent;
    		if(!ifChainLengths.isEmpty()) {
    			for(int i = 0; i < (ifChainLengths.peek() - 1); i++) {
    				parent = parent.parent;
    			}
    		}
    		
    		// check if this if statement is in a chain
    		if(!ifParents.isEmpty() && ifParents.peek().equals(parent)) {  			
    			// add the condition's starting index to the existing stack
    			ifConditionIntervals.peek().add(new Pair<Token,Token>(ctx.parExpression().start, null));
    			Integer len = ifChainLengths.pop();
    			ifChainLengths.push(len + 1);
    			
    			// add the hash-map for this specific block
    			ifChainsLastDefinedVars.peek().add(new HashMap<>());
    			
    			// push this if block onto nextIfBlocks stack
    			nextIfBlocks.push(new ArrayList<>());
    			nextIfBlocks.peek().add(ctx.statement(0));
    			
    			// check to see if this if statement has an else statement, and check if it is the ending else statement
    			if(ctx.ELSE() != null && ctx.statement(1).IF() == null) {
    				nextIfBlocks.peek().add(ctx.statement(1));
    				
    				// if the else statement is present, add a hash-map for it
    				ifChainsLastDefinedVars.peek().add(new HashMap<>());
    			}
    			// check to see if this has no else statement
    			else if(ctx.ELSE() == null) {
    				// it must be the final if block for this chain
    				finalIfBlocks.push(ctx.statement(0));
    			}
    		}
    		// if not, add it to the parent list
    		else {
    			ifParents.add(ctx);
    			
    			// create a new condition interval stack for this if statement chain, and set the chain length to 1
    			ifConditionIntervals.push(new Stack<>());
    			ifChainLengths.push(1);
    			
    			// push the condition's starting index into the stack
    			ifConditionIntervals.peek().add(new Pair<Token,Token>(ctx.parExpression().start, null));
    			
    			// since this is a new if chain, add it to the last defined variables stack
    			ifChainsLastDefinedVars.push(new Stack<>());
    			
    			// add the hash-map for this specific block
    			ifChainsLastDefinedVars.peek().add(new HashMap<>());
    			ifChainsLastDefinedVarsIndex.push(0);
    			
    			// since this is a new if chain, create a new stack for the nextIfBlocks stack
    			nextIfBlocks.push(new ArrayList<>());
    			nextIfBlocks.peek().add(ctx.statement(0));
    			
    			// check to see if this if statement has an else statement, and check if it is the ending else statement
    			if(ctx.ELSE() != null && ctx.statement(1).IF() == null) {
    				nextIfBlocks.peek().add(ctx.statement(1));
    				
    				// if the else statement is present, add a hash-map for it
    				ifChainsLastDefinedVars.peek().add(new HashMap<>());
    			}
    			// check to see if this has no else statement
    			else if(ctx.ELSE() == null) {
    				// it is a solo if statement
    				finalIfBlocks.push(ctx.statement(0));
    			}
    			
    			// pre-if chain variable counts
            	HashMap<String,Integer> preVarCounts = new HashMap<>();
            	preVarCounts.putAll(varCounts);
            	prevVarCounts.push(preVarCounts);
            	prevVarCounts.push(preVarCounts);
            	beforeIfChain.push(preVarCounts);
    			
    		}
    	}
    	else if(ctx.WHILE() != null) {
    		insideWhileCondition = true;
    		
    		// a new while statement has been found, so a stack element must be added for all while loop related stacks
    		firstVarFound.push(new ArrayList<>());
    		phiEntryVars.push(new HashMap<JavaParser.PrimaryContext,Integer>());
    		
    		// save the var counts prior to this loop
    		HashMap<String,Integer> preVarCounts = new HashMap<>();
        	preVarCounts.putAll(varCounts);
        	prevVarCounts.push(preVarCounts);
        	
    	}
    }
    
    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
    	if(ctx.IF() != null) {

    		
    	}
    	// check if this is an if statement block that needs to gather all of its last variable definitions
    	else if(!nextIfBlocks.isEmpty() && nextIfBlocks.peek().contains(ctx)) {
    		// obtain the changed variables
    		List<String> changedKeys = new ArrayList<>();
    		
    		// get the previous variable counts
    		HashMap<String, Integer> tempIfMap = prevVarCounts.pop();
    		
    		for(String v : varCounts.keySet()) {
    			if(tempIfMap.containsKey(v) && !varCounts.get(v).equals(tempIfMap.get(v))) {
    				changedKeys.add(v);
    			}
    		}
    		
    		// add all changed variables to the last defined variables list
    		Integer index = ifChainsLastDefinedVarsIndex.pop();
    		for(String v : changedKeys) {
    			ifChainsLastDefinedVars.peek().get(index).put(v, varCounts.get(v));
    		}
    		ifChainsLastDefinedVarsIndex.push(index + 1);
    		
    		// check if the nextIfBlocks list contains one or two elements
    		if(nextIfBlocks.peek().size() == 1) {
    			nextIfBlocks.pop();
    			
    			// update the prevVarCounts map because it would affect future if blocks if not updated
            	HashMap<String,Integer> tempVarCounts = new HashMap<>();
            	tempVarCounts.putAll(varCounts);
            	prevVarCounts.push(tempVarCounts);
            	
            	// check to see if this if statement is the final if statement
            	if(!finalIfBlocks.isEmpty() && finalIfBlocks.peek().equals(ctx)) {
            		finalIfBlocks.pop();
            		prevVarCounts.pop(); // pop the newly updated one
            		beforeIfChain.pop();
            		
            		/* PHI-IF */
        			JavaParser.StatementContext par = ifParents.pop();
        			
        			// add a phi-if function for every changed variable
        			List<HashMap<String,Integer>> chain = ifChainsLastDefinedVars.pop();
        			ifChainsLastDefinedVarsIndex.pop();
        			HashMap<String,Integer> definedPriorToIfChain = prevVarCounts.pop();
        			List<Pair<Token,Token>> conditions = ifConditionIntervals.pop();
        			for(String v : varCounts.keySet()) {
        				if(definedPriorToIfChain.containsKey(v) && !varCounts.get(v).equals(definedPriorToIfChain.get(v))) {
            				varCounts.put(v, varCounts.get(v) + 1);  
            				
            				// tab amount
            				String ws = "";
            				for(int i=0; i<tabAmount; i++) {
            					ws += '\t';
            				}
            				
        					String phi_if = "\n" + ws + v + "_" + varCounts.get(v) + " = ";
        					
        					if(conditions.size() > 1) {
        						// loop through all conditions
    	    					for(int i = 0; i < conditions.size()-1; i++) {
    	    						// always check to make sure the variable was changed in each block
    	    						Integer count = 0;
    	    						if(chain.get(i).get(v) == null) {
    	    							count = definedPriorToIfChain.get(v);
    	    						}
    	    						else {
    	    							count = chain.get(i).get(v);
    	    						}
    	    						phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(i).a.getTokenIndex(), conditions.get(i).b.getTokenIndex())) + "," + v + "_" + count + ",";
    	    					}
    	    					// number of closing brackets
    	    					String closingBrackets = ")";
    	    					for(int j = 0; j < conditions.size()-1; j++) {
    	    						closingBrackets += ")";
    	    					}
    	    					
    	    					// always check to make sure the variable was changed in each block
	    						Integer count = 0;
	    						if(chain.get(conditions.size()-1).get(v) == null) {
	    							count = definedPriorToIfChain.get(v);
	    						}
	    						else {
	    							count = chain.get(conditions.size()-1).get(v);
	    						}
    	    					
    	    					// else case
    	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(conditions.size()-1).a.getTokenIndex(), conditions.get(conditions.size()-1).b.getTokenIndex())) + "," + v + "_" + count + "," + v + "_" + definedPriorToIfChain.get(v) + closingBrackets + ";";

    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
    	    					indexIncrease += phi_if.length();
        					}
        					else {
        						// just an if statement
    	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(0).a.getTokenIndex(), conditions.get(0).b.getTokenIndex())) + "," + v + "_" + chain.get(0).get(v) + "," + v + "_" + definedPriorToIfChain.get(v) + ");";
    	    					
    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
    	    					indexIncrease += phi_if.length();
        					}
        					
        					// add the record statement
        	        		int lineNum = ctx.getStart().getLine();
        	        		for(Integer n : extraLines) {
        	        			if(n < ctx.getStart().getLine()) {
        	        				lineNum--;
        	        			}
        	        		}
        					rewriter.insertAfter(par.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v))+ ";");
        					
            			}
        			}
            	}
    		}
    		/* 2 ELEMENTS (i.e. if/else) */
    		// on the if statement
    		else if(nextIfBlocks.peek().indexOf(ctx) == 0) {
    			// update the prevVarCounts map because it would affect future if blocks if not updated
            	HashMap<String,Integer> tempVarCounts = new HashMap<>();
            	tempVarCounts.putAll(varCounts);
            	prevVarCounts.push(tempVarCounts);
    		}
    		// on the else statement (END OF AN IF CHAIN)
    		else {
    			nextIfBlocks.pop();
    			beforeIfChain.pop();
    			
    			/* PHI-IF */
    			JavaParser.StatementContext par = ifParents.pop();
    			
    			// add a phi-if function for every changed variable
    			List<HashMap<String,Integer>> chain = ifChainsLastDefinedVars.pop();
    			ifChainsLastDefinedVarsIndex.pop();
    			HashMap<String,Integer> definedPriorToIfChain = prevVarCounts.pop();
    			List<Pair<Token,Token>> conditions = ifConditionIntervals.pop();
    			for(String v : varCounts.keySet()) {
    				if(definedPriorToIfChain.containsKey(v) && !varCounts.get(v).equals(definedPriorToIfChain.get(v))) {
        				varCounts.put(v, varCounts.get(v) + 1);  
        				
        				// tab amount
        				String ws = "";
        				for(int i=0; i<tabAmount; i++) {
        					ws += '\t';
        				}
        				
    					String phi_if = "\n" + ws + v + "_" + varCounts.get(v) + " = ";
    					
    					if(conditions.size() > 1) {
    						// loop through all conditions
	    					for(int i = 0; i < conditions.size()-1; i++) {
	    						// always check to make sure the variable was changed in each block
	    						Integer count = 0;
	    						if(chain.get(i).get(v) == null) {
	    							count = definedPriorToIfChain.get(v);
	    						}
	    						else {
	    							count = chain.get(i).get(v);
	    						}
	    						phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(i).a.getTokenIndex(), conditions.get(i).b.getTokenIndex())) + "," + v + "_" + count + ",";
	    					}
	    					// number of closing brackets
	    					String closingBrackets = ")";
	    					for(int j = 0; j < conditions.size()-1; j++) {
	    						closingBrackets += ")";
	    					}
	    					
	    					// always check to make sure the variable was changed in each block
    						Integer count = 0;
    						if(chain.get(conditions.size()-1).get(v) == null) {
    							count = definedPriorToIfChain.get(v);
    						}
    						else {
    							count = chain.get(conditions.size()-1).get(v);
    						}
    						Integer elseCount = 0;
    						if(chain.get(conditions.size()).get(v) == null) {
    							elseCount = definedPriorToIfChain.get(v);
    						}
    						else {
    							elseCount = chain.get(conditions.size()).get(v);
    						}
	    					
	    					// else case
	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(conditions.size()-1).a.getTokenIndex(), conditions.get(conditions.size()-1).b.getTokenIndex())) + "," + v + "_" + count + "," + v + "_" + elseCount + closingBrackets + ";";

	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
	    					indexIncrease += phi_if.length();
    					}
    					else {
    						// always check to make sure the variable was changed in each block
    						Integer count = 0;
    						if(chain.get(0).get(v) == null) {
    							count = definedPriorToIfChain.get(v);
    						}
    						else {
    							count = chain.get(0).get(v);
    						}
    						Integer elseCount = 0;
    						if(chain.get(1).get(v) == null) {
    							elseCount = definedPriorToIfChain.get(v);
    						}
    						else {
    							elseCount = chain.get(1).get(v);
    						}
    						
    						// just an if-else statement
	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(0).a.getTokenIndex(), conditions.get(0).b.getTokenIndex())) + "," + v + "_" + count + "," + v + "_" + elseCount + ");";
	    					
	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
	    					indexIncrease += phi_if.length();
    					}
    					
    					// add the record statement
    	        		int lineNum = ctx.getStart().getLine();
    	        		for(Integer n : extraLines) {
    	        			if(n < ctx.getStart().getLine()) {
    	        				lineNum--;
    	        			}
    	        		}
    					rewriter.insertAfter(par.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v))+ ";");
    					
        			}
    			}
    		}
    		
    	}
    	else if(ctx.WHILE() != null) {
    		
    		// pop off all stack elements for this loop
    		List<String> varsFound = firstVarFound.pop();
    		HashMap<JavaParser.PrimaryContext,Integer> tokens = phiEntryVars.pop();
    		HashMap<String,Integer> prevVarCount = prevVarCounts.pop();
    		
    		// tab amount
			String ws = "";
			for(int i=0; i<tabAmount; i++) {
				ws += '\t';
			}
			
			// add the phi entry functions
    		for(JavaParser.PrimaryContext t : tokens.keySet()) {
    			String txt = "Phi.Entry(" + t.getText() + "_" + tokens.get(t) + "," + t.getText() + "_" + (varCounts.get(t.getText())) + ").value";
    			rewriter.replace(t.start,t.stop,txt);
    			indexIncrease += txt.length();
    		}
    		
    		// add the phi exit functions
    		for(String v : varCounts.keySet()) {
    			if(prevVarCount.containsKey(v) && !varCounts.get(v).equals(prevVarCount.get(v))) {
    				varCounts.put(v, varCounts.get(v) + 1);
    				String exit = "\n" + ws + v + "_" + varCounts.get(v) + " = Phi.Exit(" + v + "_" + prevVarCount.get(v) + "," + v + "_" + (varCounts.get(v)-1) + ");";
    				rewriter.insertAfter(ctx.stop, exit);
    				indexIncrease += exit.length();
    				
    				// define the variable at the top
    				nullDeclaration(v);
    				
    				// add the record statement
            		int lineNum = ctx.getStart().getLine();
            		for(Integer n : extraLines) {
            			if(n < ctx.getStart().getLine()) {
            				lineNum--;
            			}
            		}
    				rewriter.insertAfter(ctx.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v))+ ";");
    			}
    		}
    		
    	}
    	else if(ctx.FOR() != null) {
    		
    		// tab amount
			String ws = "";
			for(int i=0; i<tabAmount; i++) {
				ws += '\t';
			}
			
			// WHILE loop stuff:
    		// pop off all stack elements for this loop
    		List<String> varsFound = firstVarFound.pop();
    		HashMap<JavaParser.PrimaryContext,Integer> tokens = phiEntryVars.pop();
    		HashMap<String,Integer> prevVarCount = prevVarCounts.pop();
			
			// add the phi entry functions
    		for(JavaParser.PrimaryContext t : tokens.keySet()) {
    			String txt = "Phi.Entry(" + t.getText() + "_" + tokens.get(t) + "," + t.getText() + "_" + (varCounts.get(t.getText())) + ").value";
    			rewriter.replace(t.start,t.stop,txt);
    			indexIncrease += txt.length();
    		}
    		
    		// add the phi exit functions
    		for(String v : varCounts.keySet()) {
    			if(prevVarCount.containsKey(v) && !varCounts.get(v).equals(prevVarCount.get(v))) {
    				varCounts.put(v, varCounts.get(v) + 1);
    				String exit = "\n" + ws + v + "_" + varCounts.get(v) + " = Phi.Exit(" + v + "_" + prevVarCount.get(v) + "," + v + "_" + (varCounts.get(v)-1) + ");";
    				rewriter.insertAfter(ctx.stop, exit);
    				indexIncrease += exit.length();
    				
    				// define the variable at the top
    				nullDeclaration(v);
    				
    				// add the record statement
            		int lineNum = ctx.getStart().getLine();
            		for(Integer n : extraLines) {
            			if(n < ctx.getStart().getLine()) {
            				lineNum--;
            			}
            		}
    				rewriter.insertAfter(ctx.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v)) + ";");
    			}
    		}
    		
    		// move assignments to above the loop header
    		String assignments = rewriter.getText(new Interval(ctx.forControl().forInit().start.getTokenIndex(), ctx.forControl().SEMI(0).getSymbol().getTokenIndex())) + "\n" + ws;
    		rewriter.insertBefore(ctx.start, assignments);
    		
    		// add iterator to end of the loop
    		// check whether or not this is the only time this var is being assigned a value
    		String iteration = "\t" + rewriter.getText(new Interval(ctx.forControl().forUpdate().start.getTokenIndex(), ctx.RPAREN().getSymbol().getTokenIndex()-1)) + ");\n" + ws;
    		rewriter.insertBefore(ctx.stop, iteration);
    		
    		// FOR loops needs to be transformed into WHILE loops
    		String condition = rewriter.getText(new Interval(ctx.forControl().expression().start.getTokenIndex(), ctx.forControl().expression().stop.getTokenIndex()));
    		String whileLoop = "while(" + condition + ")";
    		rewriter.replace(ctx.start, ctx.RPAREN().getSymbol(), whileLoop);
    		
    		
    		
    	}
    	
    }
     
    @Override 
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 

    	// first, obtain the type of the variable being declared
    	String type = ctx.typeSpec().getText();
    	String var = ctx.variableDeclarators().start.getText();
    	
    	// check if it is an array
    	if(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0) != null) {
    		// get bracket count
			int bracketCount = ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK().size();
			String brackets = "";
			for(int i=0; i<bracketCount; i++) {
				brackets += "[]";
			}
			
			// delete brackets
			rewriter.replace(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0).getSymbol(), ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().RBRACK(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().RBRACK().size()-1).getSymbol(), "");
			
			varTypes.put(var, getType(type) + brackets);
    	}
    	else {
    		varTypes.put(var, getType(type));
    	}
    	
    	
    	// next, erase the type AND the space
    	int startIndex = ctx.typeSpec().start.getTokenIndex();
    	int endIndex = ctx.variableDeclarators().variableDeclarator().get(0).variableDeclaratorId().start.getTokenIndex() - 1;
    	rewriter.delete(startIndex,endIndex);
    	indexIncrease -= (endIndex - startIndex);
    	
    	
    	
    }
    
    @Override 
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 
    	String var = ctx.variableDeclarators().start.getText();
    	
    	// tab amount
		String ws = "";
		for(int i=0; i<tabAmount; i++) {
			ws += '\t';
		}
    			
    	// check to make sure this declaration is also an assign statement
		if(ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer() != null) {
			
			// create the variable object
	    	Token start = ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer().start;
	    	Token end = ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer().stop;
	    	newVariable(var, start, end);	
	    	
	    	// add the record statement
    		int lineNum = ctx.getStart().getLine();
    		for(Integer n : extraLines) {
    			if(n < ctx.getStart().getLine()) {
    				lineNum--;
    			}
    		}
	    	String record = createRecordStatement(className, currentMethod, lineNum, var + "_" + varCounts.get(var));
			rewriter.insertAfter(ctx.stop, ";\n" + ws + record.substring(0, record.length()));
		}
		// declaration with no assign can be erased
		else {
			rewriter.insertBefore(ctx.start, "//");
			
			// no record statement for no value?
//			String record = createRecordStatement(className, currentMethod, ctx.getStart().getLine(), var + "_" + varCounts.get(var));
//			rewriter.insertAfter(ctx.stop, "\n" + ws + record.substring(0, record.length()));
			
			// erase
			rewriter.delete(ctx.start, ctx.stop);
		}
    }
    
    @Override 
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) { 
    	
    	Token t = ctx.variableDeclaratorId().getStart();
    	String var = t.getText();
    	
    	// this variable has been assigned
		assignedVariableIndexed = true;
		
		if(varCounts.containsKey(var)) {
			varCounts.put(var, varCounts.get(var)+1);
			
			// make sure this is an assignment declaration
			if(ctx.variableInitializer() != null) {
				String count = "_" + varCounts.get(var);
				rewriter.insertAfter(t, count);
				indexIncrease += count.length();
			}
			
		}
		else {
			varCounts.put(var, 0);
			// make sure this is an assignment declaration
			if(ctx.variableInitializer() != null) {
				String count = "_"+varCounts.get(var);
				rewriter.insertAfter(t, count);
				indexIncrease += count.length();
			}
			
		}
			
		if(currentFirstLine != null) {
			// declare the variable at the top of the file
			nullDeclaration(var);
		}
		
    }
    	
    
    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
    	
    	if(ctx.ASSIGN() != null) {
    		
    		// first, increase the count for this variable
    		String var = ctx.start.getText();
    		if(varCounts.get(var) != null) {
    			varCounts.put(var, varCounts.get(var)+1);
    		}
    		else {
    			varCounts.put(var,0);
    		}
    		
    		// set the current assignee to this variable
    		assignedVariableIndexed = false;
    		currentAssignee = var;
    		
    		// declare this variable at the top
    		nullDeclaration(var);
    	}
    	
    }
    
    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
    	if(ctx.ASSIGN() != null) {
    		currentAssignee = "";
    		
    		// create the variable object (MUST DO AT EXIT SO PARENTHESE IS PLACED AT END)
        	Token start = ctx.expression().get(1).start;
        	Token end = ctx.expression().get(1).stop;
        	newVariable(ctx.start.getText(), start, end);
        	
        	String var = ctx.start.getText();
        	
        	// tab amount
    		String ws = "";
    		for(int i=0; i<tabAmount; i++) {
    			ws += '\t';
    		}
    		
    		// add the record statement
    		int lineNum = ctx.getStart().getLine();
    		for(Integer n : extraLines) {
    			if(n < ctx.getStart().getLine()) {
    				lineNum--;
    			}
    		}
    		String record = createRecordStatement(className, currentMethod, lineNum, var + "_" + varCounts.get(var));
        	rewriter.insertAfter(ctx.stop, ";\n" + ws + record.substring(0,record.length()));
        	
        	// add variable to if statement list of most recent variable definitions
    		if(ifChainsLastDefinedVars.size() > 0) {
    			ifChainsLastDefinedVars.peek().get(ifChainsLastDefinedVarsIndex.peek()).put(var, varCounts.get(var));
    		}
    	}
    }
    
    @Override 
    public void enterParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideIfCondition) {
    		ifConditionDepth += 1;
    	}	
    	else if(insideWhileCondition) {
    		whileConditionDepth += 1;
    	}
    }
    
    @Override 
    public void exitParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideIfCondition) {
    		ifConditionDepth -= 1;
    		
    		if(ifConditionDepth == 0) {
    			insideIfCondition = false;
    			
    			// add the condition's ending index to the list
    			Token start = ifConditionIntervals.peek().get(ifConditionIntervals.peek().size()-1).a;
    			ifConditionIntervals.peek().set(ifConditionIntervals.peek().size()-1, new Pair<Token,Token>(start, ctx.stop));
    		}
    	}	
    	if(insideWhileCondition) {
    		whileConditionDepth -= 1;
    		
    		if(whileConditionDepth == 0) {
    			insideWhileCondition = false;
    		}
    	}	
    }
    
    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {

    	// variables that are just now being declared have already had their index added
    	if(varCounts.containsKey(ctx.getText())) {
    		if(insideWhileCondition) {
    			// we know this condition variable will need to be replaced with a phi entry function (this will be done later)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText()));
    			
    		}
    		// inside a while loop AND left/right side variables are equivalent
    		else if(assignedVariableIndexed && currentAssignee.equals(ctx.getText()) && firstVarFound.size() > 0 && !firstVarFound.peek().contains(ctx.getText())) {
    			// we know this variable will be replaced with a phi entry function (which will be placed later, because it depends on the last instance of the variable in the loop)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText())-1);
    			
    			// add this var to the list
    			firstVarFound.peek().add(ctx.getText());
    		
    		}
    		// inside a while loop AND left/right side variables are NOT equivalent
    		else if(assignedVariableIndexed && firstVarFound.size() > 0 && !firstVarFound.peek().contains(ctx.getText())) {
    			// we know this variable will be replaced with a phi entry function (which will be placed later, because it depends on the last instance of the variable in the loop)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText())-1);
    		
    		}
    		// if this variable is equal to the variable being assigned, make sure you use the variable previously defined
    		else if(insideIfCondition) {
    			String variable = "_" + beforeIfChain.peek().get(ctx.getText()) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		else if(ifChainsLastDefinedVars.size() > 0 && assignedVariableIndexed) {
				int num = (varCounts.get(ctx.getText()));
				if(!ifChainsLastDefinedVars.peek().get(ifChainsLastDefinedVarsIndex.peek()).containsKey(ctx.getText())) {
					num = beforeIfChain.peek().get(ctx.getText());
				}
				else if(currentAssignee.equals(ctx.getText())) {
					num = (varCounts.get(ctx.getText())-1);
				}
    			String variable = "_" + num + ".value";
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		else if(assignedVariableIndexed && currentAssignee.equals(ctx.getText())) {
    			String variable = "_" + (varCounts.get(ctx.getText())-1) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		// right-side variable
    		else if(assignedVariableIndexed) {
    			String variable = "_" + varCounts.get(ctx.getText()) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		// left-side variable
    		else {
    			String variable = "_" + varCounts.get(ctx.getText());
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
        		assignedVariableIndexed = true;
    		}

    	}
    }
    
    // ARRAYS
    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
    	rewriter.replace(ctx.primitiveType().start, getType(ctx.primitiveType().getText()));
    }
    
    /* HELPERS */
    
    // always returns a non-primitive type
    public String getType(String t) {
    	
    	String brackets = "";
    	while(t.contains("[]")) {
    		brackets += "[]";
    		t = t.substring(0,t.lastIndexOf("[]"));
    	}
    	
    	switch(t) {
    		case "int":
    			return "Integer" + brackets;
    		case "char":
    			return "Character" + brackets;
    		case "boolean":
    			return "Boolean" + brackets;
    		case "double":
    			return "Double" + brackets;
    		case "float":
    			return "Float" + brackets;
    		default:
    			return t + brackets;
    	}
    }
    
    // creates the right-hand side of an assignment statement
    public void newVariable(String var, Token start, Token end) {
    	String before = "new Var<" + varTypes.get(var) + ">(";
    	String after = ")";
    	rewriter.insertBefore(start, before);
    	rewriter.insertAfter(end, after);
    	indexIncrease += before.length() + after.length();
    }
    
    // creates the null declaration at the top of the file
    public void nullDeclaration(String var) {
    	// declare the variable at the top of the file
		String decl = "";
		if(varCounts.get(var) == null) {
			decl = "\n\t\tVar<" + varTypes.get(var) + "> " + var + "_0 = null;";
		}
		else {
			decl = "\n\t\tVar<" + varTypes.get(var) + "> " + var + "_" + varCounts.get(var) + " = null;";
		}
    	rewriter.insertAfter(currentFirstLine, decl);
    	indexIncrease += decl.length();
    }
    
    // returns a string of a record statement for the given inputs
    public String createRecordStatement(String className, String methodName, int lineNumber, String var) {
    	return "Output.record(\"" + className + "\", \"" + currentMethod + "\", " + lineNumber + ", \"" + var + "\", " + var + ".value)";
    }
    
}