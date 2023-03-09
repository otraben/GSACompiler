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
    int tabAmount = 1;
    List<Integer> extraLines;
    Stack<HashMap<String,Integer>> scope;
    boolean faultyVersion;
    
    // variable-specific variables
    public Map<String, Integer> varCounts;	// keeps track of the amount of each variable
	public Map<String, String> varTypes;	// keeps track of the type of each variable
	public List<String> globals;
	public List<String> arrays;
	
	// class-specific variables
	Token classFirstLine;
	String className = "";
	int classCounter = 0;
	
	// constructor
	boolean insideConstructor = false;
	String constructorLine = "";
	
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
	int currentAssigneeNum = -1;
	
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
	int ifDepth = 0;
	
	// while statement variables
	Stack<List<String>> firstVarFound;								// each while loop will have a list of vars that have been defined with the entry func. all vars after that can behave normally
	Stack<HashMap<JavaParser.PrimaryContext,Integer>> phiEntryVars;	// keeps track of the phi entry function placement locations
	Stack<HashMap<JavaParser.PrimaryContext,Integer>> phiEntryCausalNums;
	Stack<HashMap<String,Integer>> whileIfVars;
	String whileOrIf = "";
	
	// causal map
	public HashMap<String, List<String>> causalMap;
	
	// do while loops
	boolean insideDoLoop = false;
	
    public GSAConverter(CommonTokenStream tokens, List<Integer> addedLines, boolean faulty, List<String> globalVars) {
        rewriter = new TokenStreamRewriter(tokens);
        extraLines = addedLines;
        
        varCounts = new HashMap<>();
        varTypes = new HashMap<>();
        globals = globalVars;
        arrays = new ArrayList<>();
        
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
        phiEntryCausalNums = new Stack<>();
        whileIfVars = new Stack<>();
        
        scope = new Stack<>();
        scope.push(new HashMap<>());
        
        causalMap = new HashMap<>();
        
        faultyVersion = faulty;
    }
    
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    	// the first class name should be the name of the file
    	if(className == "") {
    		className = ctx.Identifier().getText();
    	}
    	classCounter++;
    	
    	if(faultyVersion && classCounter == 1) {
    		rewriter.replace(ctx.Identifier().getSymbol(), className + "_Faulty");
    	}
    }
    
    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
    	// the first interface name should be the name of the file
    	if(className == "") {
    		className = ctx.Identifier().getText();	
    	}
    	classCounter++;
    	
    	if(faultyVersion) {
    		rewriter.replace(ctx.Identifier().getSymbol(), className + "_Faulty");
    	}
    }
    
    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
		classFirstLine = ctx.LBRACE().getSymbol();
    }
    
    @Override
    public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
    	currentMethod = ctx.Identifier().getText();
    	insideConstructor = true;
    	
    	if(faultyVersion && classCounter == 1) {
    		rewriter.replace(ctx.Identifier().getSymbol(), className + "_Faulty");
    	}
    }
    
    @Override
    public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {	
    	currentMethod = "";
    	insideConstructor = false;
    	constructorLine = "";
    }
    
    @Override
    public void enterConstructorBody(JavaParser.ConstructorBodyContext ctx) {
    	methodFirstLineFound = false;
    	afterVarDefs = false;
    }
    
    @Override
    public void exitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
    	if(!constructorLine.equals("")) {
    		rewriter.replace(currentFirstLine, "{\n\t\t" + constructorLine + ";");
    	}
    	currentFirstLine = null;
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
    	// make sure it is not an array
    	if(ctx.typeSpec().LBRACK(0) == null) {
    		formalParams.put(ctx.variableDeclaratorId().getText(), ctx.typeSpec().getText());
    	}
    	else {
    		arrays.add(ctx.variableDeclaratorId().getText());
    	}
    	
    	
    	// change type
    	//rewriter.replace(ctx.typeSpec().start, ctx.typeSpec().stop, getType(ctx.typeSpec().getText()));
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
    	
    	scope.push(new HashMap<>());
    	
    	if(!methodFirstLineFound) {
    		currentFirstLine = ctx.LBRACE().getSymbol();
    		methodFirstLineFound = true;
    		
    		// declare the formal parameters as our Var type
    		String comment2 = "\n\t\t// formal parameters";
    		rewriter.insertAfter(currentFirstLine, comment2);
    		for(String key : formalParams.keySet()) {
    			if(varCounts.containsKey(key)) {
    				varCounts.put(key, varCounts.get(key) + 1);
    				scope.peek().put(key, varCounts.get(key));
    			}
    			else {
    				varCounts.put(key, 0);
    				scope.peek().put(key, varCounts.get(key));
    				varTypes.put(key, getType(formalParams.get(key)));
    			}
    			causalMap.put(key + "_" + varCounts.get(key), new ArrayList<>());
    			
        		// add the actual declaration
    			String decl = "\n\t\tVar<" + varTypes.get(key) + "> " + key + "_" + varCounts.get(key) + " = new Var<" + varTypes.get(key) + ">(" + key + ");";
    			rewriter.insertAfter(currentFirstLine, decl);
        		
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
    		
    	}
    }
    
    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
    	tabAmount -= 1;
    	
    	scope.pop();
    }
    
    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
    	if(!afterVarDefs) {
    		afterVarDefs = true;
    		String comment = "\n\t\t/* PROGRAM STARTS */\n\t\t";
    		rewriter.insertBefore(ctx.start, comment);
    	}
    }
    
    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
    	
    	if(ctx.IF() != null) {
    		ifDepth++;
    		insideIfCondition = true;
    		whileOrIf = "if";
    		
    		// get potential parent from if chain length
    		RuleContext parent = ctx.parent;
    		if(!ifChainLengths.isEmpty()) {
    			for(int i = 0; i < (ifChainLengths.peek() - 1); i++) {
    				parent = parent.parent;
    			}
    		}
    		
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
    			
    			if(!beforeIfChain.isEmpty()) {
    				// pre-if chain variable counts
	            	HashMap<String,Integer> preVarCounts = new HashMap<>();
	            	preVarCounts.putAll(varCounts);
	            	prevVarCounts.push(preVarCounts);
	            	prevVarCounts.push(preVarCounts);
	            	beforeIfChain.push(beforeIfChain.peek());
    			}
    			else {
    				// pre-if chain variable counts
	            	HashMap<String,Integer> preVarCounts = new HashMap<>();
	            	preVarCounts.putAll(varCounts);
	            	prevVarCounts.push(preVarCounts);
	            	prevVarCounts.push(preVarCounts);
	            	beforeIfChain.push(preVarCounts);
    			}
    			
    			
    		}
    	}
    	else if(ctx.WHILE() != null) {
    		whileOrIf = "while";
    		// check for DO WHILE loops
    		if(ctx.DO() != null) {
    			insideDoLoop = true;
    		}
    		else {
    			insideWhileCondition = true;
    		}
    		
    		
    		// a new while statement has been found, so a stack element must be added for all while loop related stacks
    		firstVarFound.push(new ArrayList<>());
    		phiEntryVars.push(new HashMap<JavaParser.PrimaryContext,Integer>());
    		phiEntryCausalNums.push(new HashMap<JavaParser.PrimaryContext,Integer>());
    		whileIfVars.push(new HashMap<>());
    		
    		// save the var counts prior to this loop
    		HashMap<String,Integer> preVarCounts = new HashMap<>();
        	preVarCounts.putAll(varCounts);
        	prevVarCounts.push(preVarCounts);
        	
    	}
    }
    
    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
    	if(ctx.IF() != null) {
    		ifDepth--;
    		whileOrIf = "";
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
        				boolean varInScope = false;
        				Stack<HashMap<String,Integer>> tempScope = (Stack<HashMap<String, Integer>>) scope.clone();
        				
            			while(!tempScope.isEmpty()) {
  
            				if(tempScope.peek().containsKey(v)) {
            					varInScope = true;
            					break;
            				}
            				tempScope.pop();
            			}
        				if(definedPriorToIfChain.containsKey(v) && !varCounts.get(v).equals(definedPriorToIfChain.get(v)) && varInScope) {
            				varCounts.put(v, varCounts.get(v) + 1);  
            				scope.peek().put(v, varCounts.get(v));
            				
            				// causal map entry
            				List<String> causalVars = new ArrayList<>();
            				
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
    	    						causalVars.add(v + "_" + count);
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
    	    					causalVars.add(v + "_" + count);
    	    					causalVars.add(v + "_" + definedPriorToIfChain.get(v));
    	    					
    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
        					}
        					else {
        						// just an if statement
    	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(0).a.getTokenIndex(), conditions.get(0).b.getTokenIndex())) + "," + v + "_" + chain.get(0).get(v) + "," + v + "_" + definedPriorToIfChain.get(v) + ");";
    	    					causalVars.add(v + "_" + chain.get(0).get(v));
    	    					causalVars.add(v + "_" + definedPriorToIfChain.get(v));
    	    					
    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
        					}
        					
        					// add the record statement
        	        		int lineNum = ctx.getStart().getLine();
        	        		for(Integer n : extraLines) {
        	        			if(n < ctx.getStart().getLine()) {
        	        				lineNum--;
        	        			}
        	        		}
        					rewriter.insertAfter(par.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v))+ ";");
        					causalMap.put(v + "_" + varCounts.get(v), causalVars);
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
    				boolean varInScope = false;
    				Stack<HashMap<String,Integer>> tempScope = (Stack<HashMap<String, Integer>>) scope.clone();
    				
        			while(!tempScope.isEmpty()) {

        				if(tempScope.peek().containsKey(v)) {
        					varInScope = true;
        					break;
        				}
        				tempScope.pop();
        			}
    				if(definedPriorToIfChain.containsKey(v) && !varCounts.get(v).equals(definedPriorToIfChain.get(v)) && varInScope) {
        				varCounts.put(v, varCounts.get(v) + 1);  
        				scope.peek().put(v, varCounts.get(v));
        				
        				// causal map entry
        				List<String> causalVars = new ArrayList<>();
        				
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
	    						causalVars.add(v + "_" + count);
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
	    					causalVars.add(v + "_" + count);
	    					causalVars.add(v + "_" + elseCount);
	    					
	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
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
	    					causalVars.add(v + "_" + count);
	    					causalVars.add(v + "_" + elseCount);
	    					
	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
    					}
    					
    					// add the record statement
    	        		int lineNum = ctx.getStart().getLine();
    	        		for(Integer n : extraLines) {
    	        			if(n < ctx.getStart().getLine()) {
    	        				lineNum--;
    	        			}
    	        		}
    					rewriter.insertAfter(par.stop, "\n" + ws + createRecordStatement(className, currentMethod, lineNum, v + "_" + varCounts.get(v))+ ";");
    					causalMap.put(v + "_" + varCounts.get(v), causalVars);
    					
        			}
    			}
    		}
    		
    	}
    	else if(ctx.WHILE() != null) {
    		whileOrIf = "";
    		// pop off all stack elements for this loop
    		List<String> varsFound = firstVarFound.pop();
    		HashMap<JavaParser.PrimaryContext,Integer> tokens = phiEntryVars.pop();
    		HashMap<JavaParser.PrimaryContext,Integer> causalNums = phiEntryCausalNums.pop();
    		HashMap<String,Integer> prevVarCount = prevVarCounts.pop();
    		HashMap<String,Integer> ifVars = whileIfVars.pop();
    		
    		// tab amount
			String ws = "";
			for(int i=0; i<tabAmount; i++) {
				ws += '\t';
			}
			
			// add the phi entry functions
    		for(JavaParser.PrimaryContext t : tokens.keySet()) {
    			List<String> causalVars = new ArrayList<>();
    			int beforeNum = tokens.get(t);
    			if(beforeNum == -1) {
    				if(prevVarCount.get(t.getText()) != null) {
    					//beforeNum = prevVarCount.get(t.getText());
    					beforeNum = -1;
    				}
    				else {
    					beforeNum = -1;
    				}			
    			}
    			
    			if(ifVars.containsKey(t.getText())) {
    				try {
    					beforeNum = ifVars.get(t.getText());
    				}
    				catch(Exception e) {
    					// skip
    				}		
    			}
    			
    			// specific case for multi-dimensional loops
    			if(beforeNum == varCounts.get(t.getText()) && firstVarFound.size()>0) {
    				phiEntryVars.peek().put(t, varCounts.get(t.getText()));
    			}
    			else {
    				String txt = "Phi.Entry(" + t.getText() + "_" + beforeNum + "," + t.getText() + "_" + (varCounts.get(t.getText())) + ").value";
        			rewriter.replace(t.start,t.stop,txt);
        			causalVars.add(t.getText() + "_" + beforeNum);
        			causalVars.add(t.getText() + "_" + (varCounts.get(t.getText())));
        			if(causalNums.get(t) != null) {
        				causalMap.put(t.getText() + "_" + causalNums.get(t), causalVars);
        			}
    			}
 
    		}
    		
    		// add the phi exit functions
    		l1:
    		for(String v : varCounts.keySet()) {
    			// check if this is a variable in scope or if it was newly defined in the loop
    			Stack<HashMap<String,Integer>> tempScope = (Stack<HashMap<String, Integer>>) scope.clone();
    			while(!tempScope.peek().containsKey(v)) {
    				tempScope.pop();
    				if(tempScope.isEmpty()) {
    					continue l1;
    				}
    			}
    			if(prevVarCount.containsKey(v) && !varCounts.get(v).equals(prevVarCount.get(v))) {
    				
    				// remove variable versions if they were declared inside a different scope
    				String remove = "";
    				if(firstVarFound.size()>0) {
    					if(scope.peek().containsKey(v)) {
    						remove = "\n" + ws + v + "_" + varCounts.get(v) + " = null;";		
    					}
    				}
    				
    				varCounts.put(v, varCounts.get(v) + 1);
    				scope.peek().put(v, varCounts.get(v));
    				String exit = "\n" + ws + v + "_" + varCounts.get(v) + " = Phi.Exit(" + v + "_" + prevVarCount.get(v) + "," + v + "_" + (varCounts.get(v)-1) + ");";
    				rewriter.insertAfter(ctx.stop, exit);
    				rewriter.insertAfter(ctx.stop, remove);
    				
    				
    				
    				// causal map entry
    				List<String> causalVars = new ArrayList<>();
    				causalVars.add(v + "_" + prevVarCount.get(v));
    				causalVars.add(v + "_" + (varCounts.get(v)-1));
    				causalMap.put(v + "_" + varCounts.get(v), causalVars);
    				
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
    	
    }
     
    @Override 
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 

    	// first, obtain the type of the variable being declared
    	String type = ctx.typeSpec().getText();
    	String var = ctx.variableDeclarators().start.getText();
    	
    	// check if it is NOT an array
    	if(!(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0) != null || ctx.typeSpec().LBRACK(0) != null)) {
    		varTypes.put(var, getType(type));
    		
    		// next, erase the type AND the space (and any other keywords, like final)
        	int startIndex = ctx.start.getTokenIndex();
        	int endIndex = ctx.variableDeclarators().variableDeclarator().get(0).variableDeclaratorId().start.getTokenIndex() - 1;
        	rewriter.delete(startIndex,endIndex);
        	
        	// if this is inside a loop, add it to the firstVarFound list, because it should not have phi entry functions
        	if(firstVarFound.size() > 0 && !firstVarFound.peek().contains(var)) {
        		firstVarFound.peek().add(var);
        	}
    	}
    	else {
    		arrays.add(var);
    	}
	
    }
    
    @Override 
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 
    	String var = ctx.variableDeclarators().start.getText();
    	
    	// tab amount
		String ws = "";
		for(int i=0; i<tabAmount; i++) {
			ws += '\t';
		}
		
		// make sure this is not an array
		if(ctx.variableDeclarators().variableDeclarator(0).variableDeclaratorId().LBRACK(0) == null && ctx.typeSpec().LBRACK(0) == null) {
			
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
				
				// add variable to if statement list of most recent variable definitions
	    		if(ifChainsLastDefinedVars.size() > 0) {
	    			try {
	    				ifChainsLastDefinedVars.peek().get(ifChainsLastDefinedVarsIndex.peek()).put(var, varCounts.get(var));
	    			}
	    			catch(Exception e) {
	    				int i = ifChainsLastDefinedVarsIndex.peek();
	    				ifChainsLastDefinedVarsIndex.pop();
	    				ifChainsLastDefinedVarsIndex.push(i-1);
	    				ifChainsLastDefinedVars.peek().get(ifChainsLastDefinedVarsIndex.peek()).put(var, varCounts.get(var));
	    			}
	    		}
			}
			// declaration with no assign can be erased
			else {
				rewriter.insertBefore(ctx.start, "//");
				
				// no record statement for no value?
//				String record = createRecordStatement(className, currentMethod, ctx.getStart().getLine(), var + "_" + varCounts.get(var));
//				rewriter.insertAfter(ctx.stop, "\n" + ws + record.substring(0, record.length()));
				
				// erase
				rewriter.delete(ctx.start, ctx.stop);
			}
			
			
		}
    			
    	
    }
    
    @Override 
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) { 
    	
    	// ensure this is NOT a global variable
    	if(currentFirstLine != null) {
	    	Token t = ctx.variableDeclaratorId().getStart();
	    	String var = t.getText();
	    	
	    	// this variable has been assigned
			assignedVariableIndexed = true;
			currentAssignee = var;
			
			// make sure this is not an array
			if(ctx.variableDeclaratorId().LBRACK(0) == null) {
				if(varCounts.containsKey(var)) {
					varCounts.put(var, varCounts.get(var)+1);
					scope.peek().put(var, varCounts.get(var));
					
					// causal map entry
					List<String> causalVars = new ArrayList<>();
					causalMap.put(var + "_" + varCounts.get(var), causalVars);
					
					// make sure this is an assignment declaration
					if(ctx.variableInitializer() != null) {
						String count = "_" + varCounts.get(var);
						rewriter.insertAfter(t, count);
					}
					
				}
				else {
					varCounts.put(var, 0);
					scope.peek().put(var, varCounts.get(var));
					
					// causal map entry
					List<String> causalVars = new ArrayList<>();
					causalMap.put(var + "_" + varCounts.get(var), causalVars);
					
					// make sure this is an assignment declaration
					if(ctx.variableInitializer() != null) {
						String count = "_"+varCounts.get(var);
						rewriter.insertAfter(t, count);
					}
					
				}
				
				currentAssigneeNum = varCounts.get(var);
				nullDeclaration(var);
			}
		}
		
		
		
    }
    
    @Override
    public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
    	// this variable has been assigned
    	assignedVariableIndexed = false;
    	currentAssignee = "";
    }
    	
    
    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
    	
    	if(ctx.ASSIGN() != null && ctx.expression(0).LBRACK() == null) {
    		// first, increase the count for this variable
    		String var = ctx.start.getText();
    		
    		// set the current assignee to this variable
    		assignedVariableIndexed = false;
    		currentAssignee = var;
    		currentAssigneeNum = -1;
    		
    		// check if it is a global variable
    		if((!globals.contains(var) && !arrays.contains(var) && !var.equals("this") && !var.equals("super")) || varCounts.get(var) != null) {
    		
	    		if(varCounts.get(var) != null) {
	    			varCounts.put(var, varCounts.get(var)+1);	
	    		}
	    		else {
	    			varCounts.put(var,0);	
	    		}
	    		
	    		scope.peek().put(var, varCounts.get(var));
	    		
	    		// causal map entry
				List<String> causalVars = new ArrayList<>();
	    		causalMap.put(var + "_" + varCounts.get(var), causalVars);
	    		
	    		// declare this variable at the top
	    		nullDeclaration(var);
    		}
    		else {
    			assignedVariableIndexed = true;
    		}
    	}	
    }
    
    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
    	if(ctx.ASSIGN() != null && ctx.expression(0).LBRACK() == null) {
    		currentAssignee = "";
    		currentAssigneeNum = -1;
    		String var = ctx.start.getText();
    		
    		// check if it is a global variable
    		if((!globals.contains(var) && !arrays.contains(var) && !var.equals("this") && !var.equals("super")) || varCounts.get(var) != null) {
    		
	    		// create the variable object (MUST DO AT EXIT SO PARENTHESE IS PLACED AT END)
	        	Token start = ctx.expression().get(1).start;
	        	Token end = ctx.expression().get(1).stop;
	        	newVariable(ctx.start.getText(), start, end);

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
	    		
	    		// if inside a loop, make sure the assigned variable will no longer be used for phi entry functions, because it has been used
	    		if(firstVarFound.size() > 0 && !firstVarFound.peek().contains(var)) {
	    			firstVarFound.peek().add(var);
	    		}
    		}
	
    	}
    	// check if the constructor has a constructor call within it
    	try {
    		if(insideConstructor && ctx.LPAREN() != null && (ctx.expression(0).primary().getText().equals("this") || ctx.expression(0).primary().getText().equals("super"))) {
	    		constructorLine = ctx.getText();
	    		rewriter.delete(ctx.start, ctx.stop);
	    	}
    	} catch (Exception e) {
    		// skip
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
    	else if(insideDoLoop) {
    		insideWhileCondition = true;
    		whileConditionDepth += 1;
    		insideDoLoop = false;
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
    	if(varCounts.containsKey(ctx.getText()) && !globals.contains(ctx.getText()) && !arrays.contains(ctx.getText()) && !ctx.getText().equals("this") && !ctx.getText().equals("super")) {
    		if(insideWhileCondition) {
    			// we know this condition variable will need to be replaced with a phi entry function (this will be done later)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText()));
    			
    			if(ifDepth > 0 && whileOrIf.equals("while")) {
    				whileIfVars.peek().put(ctx.getText(), beforeIfChain.peek().get(ctx.getText()));
    			}
    			
    		}
    		// inside a while loop AND left/right side variables are equivalent
    		else if(assignedVariableIndexed && currentAssignee.equals(ctx.getText()) && firstVarFound.size() > 0 && !firstVarFound.peek().contains(ctx.getText())) {
    			// we know this variable will be replaced with a phi entry function (which will be placed later, because it depends on the last instance of the variable in the loop)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText())-1);
    			phiEntryCausalNums.peek().put(ctx, varCounts.get(ctx.getText()));
    			
    			// add this var to the list
    			firstVarFound.peek().add(ctx.getText());
    			
    			if(ifDepth > 0 && whileOrIf.equals("while")) {
    				whileIfVars.peek().put(ctx.getText(), beforeIfChain.peek().get(ctx.getText()));
    			}
    		
    		}
    		// inside a while loop AND left/right side variables are NOT equivalent
    		else if(assignedVariableIndexed && firstVarFound.size() > 0 && !firstVarFound.peek().contains(ctx.getText())) {
    			// we know this variable will be replaced with a phi entry function (which will be placed later, because it depends on the last instance of the variable in the loop)
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText()));
    			phiEntryCausalNums.peek().put(ctx, varCounts.get(ctx.getText()));
    			
    			if(ifDepth > 0 && whileOrIf.equals("while")) {
    				whileIfVars.peek().put(ctx.getText(), beforeIfChain.peek().get(ctx.getText()));
    			}
    		
    		}
    		// inside a while loop BUT this is NOT an assignment statement
    		else if(firstVarFound.size() > 0 && !firstVarFound.peek().contains(ctx.getText()) && currentAssignee.equals("")) {
    			phiEntryVars.peek().put(ctx, varCounts.get(ctx.getText()));

    			if(ifDepth > 0 && whileOrIf.equals("while")) {
    				whileIfVars.peek().put(ctx.getText(), beforeIfChain.peek().get(ctx.getText()));
    			}
    		}
    		// if this variable is equal to the variable being assigned, make sure you use the variable previously defined
    		else if(insideIfCondition) {
    			Stack<HashMap<String,Integer>> tempScope = (Stack<HashMap<String, Integer>>) scope.clone();
    			while(!tempScope.isEmpty() && !tempScope.peek().containsKey(ctx.getText())) {
    				tempScope.pop();
    			}
    			String variable = "_" + tempScope.peek().get(ctx.getText()) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
    		}
    		else if(ifChainsLastDefinedVars.size() > 0 && assignedVariableIndexed) {
				int num = (varCounts.get(ctx.getText()));
				if(!ifChainsLastDefinedVars.peek().get(ifChainsLastDefinedVarsIndex.peek()).containsKey(ctx.getText())) {
					Stack<HashMap<String,Integer>> tempScope = (Stack<HashMap<String, Integer>>) scope.clone();
					tempScope.pop();
	    			while(!tempScope.isEmpty() && !tempScope.peek().containsKey(ctx.getText())) {
	    				tempScope.pop();
	    			}
					num = tempScope.peek().get(ctx.getText());
				}
				else if(currentAssignee.equals(ctx.getText())) {
					num = (varCounts.get(ctx.getText())-1);
				}
    			String variable = "_" + num + ".value";
    			rewriter.insertAfter(ctx.start, variable);

    			if(causalMap.get(currentAssignee + "_" + currentAssigneeNum) != null) {
    				causalMap.get(currentAssignee + "_" + currentAssigneeNum).add(ctx.getText() + "_" + num);
    			}

    		}
    		// not an assignment statement
    		else if(currentAssignee.equals("")) {
    			String variable = "_" + (varCounts.get(ctx.getText())) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
    		}
    		else if(assignedVariableIndexed && currentAssignee.equals(ctx.getText())) {
    			String variable = "_" + (varCounts.get(ctx.getText())-1) + ".value";
    			rewriter.insertAfter(ctx.start, variable);
    			causalMap.get(currentAssignee + "_" + currentAssigneeNum).add(ctx.getText() + "_" + (varCounts.get(ctx.getText())-1));
    		}
    		// right-side variable
    		else if(assignedVariableIndexed) {
    			int varNum = varCounts.get(ctx.getText());
    			String variable = "_" + varNum + ".value";
    			rewriter.insertAfter(ctx.start, variable);
 
    			if(causalMap.get(currentAssignee + "_" + currentAssigneeNum) != null) {
    				causalMap.get(currentAssignee + "_" + currentAssigneeNum).add(ctx.getText() + "_" + (varCounts.get(ctx.getText())));
    			}
    		}
    		// left-side variable
    		else {
    			String variable = "_" + varCounts.get(ctx.getText());
    			rewriter.insertAfter(ctx.start, variable);
        		assignedVariableIndexed = true;
        		currentAssignee = ctx.getText();
        		currentAssigneeNum = varCounts.get(ctx.getText());
    		}

    	}
    }
    
    // Constructors
    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
    	if(ctx.getText().equals(className) && faultyVersion) {
    		rewriter.insertAfter(ctx.stop, "_Faulty");
    	}
    }
    
    /* HELPERS */
    
    // always returns a non-primitive type
    public String getType(String t) {
    	
    	String brackets = "";
    	while(t.contains("[]")) {
    		brackets += "[]";
    		t = t.substring(0,t.lastIndexOf("[]"));
    	}
    	
    	if(faultyVersion && t.equals(className)) {
    		return className + "_Faulty";
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
    		case "long":
    			return "Long" + brackets;
    		case "short":
    			return "Short" + brackets;
    		case "byte":
    			return "Byte" + brackets;
    		default:
    			return t + brackets;
    	}
    }
    
    // creates the right-hand side of an assignment statement
    public void newVariable(String var, Token start, Token end) {
    	String cast = "";
    	if(varTypes.get(var) != null && varTypes.get(var).equals("Double")) {
    		cast = "(double)";
    	}
    	String before = "new Var<" + varTypes.get(var) + ">(" + cast + "(";
    	String after = "))";
    	rewriter.insertBefore(start, before);
    	rewriter.insertAfter(end, after);
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
    }
    
    // returns a string of a record statement for the given inputs
    public String createRecordStatement(String className, String methodName, int lineNumber, String var) {
    	return "Output.record(\"" + className + "\", \"" + currentMethod + "\", " + lineNumber + ", \"" + var + "\", " + var + ".value)";
    }
    
}