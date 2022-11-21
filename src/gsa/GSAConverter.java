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

public class GSAConverter extends JavaBaseListener {

    public TokenStreamRewriter rewriter;
    String className = "";
    int indexIncrease = 0;
    int tabAmount = 1;
    
    // variable-specific variables
    public Map<String, Integer> varCounts;	// keeps track of the amount of each variable
	public Map<String, String> varTypes;	// keeps track of the type of each variable
	
	// method-specific variables
	boolean methodFirstLineFound = false;
	Token currentFirstLine;
	boolean afterVarDefs = false;
	
	// block-specific variables
	Stack<HashMap<String, Integer>> prevVarCounts;
	
	// expression-specific variables
	boolean assignedVariableIndexed = false;
	String currentAssignee = "";
	
	// conditions
	boolean insideCondition = false;
	int conditionDepth = 0;
	
	// if statement variables
	Stack<List<Pair<Token, Token>>> ifConditionIntervals; // stack for each if-chain - stack for each if block within the chain - and pair for each condition
	Stack<JavaParser.StatementContext> ifParents;
	Stack<Integer> ifChainLengths;
	Stack<List<JavaParser.StatementContext>> nextIfBlocks;		// stack element for each if-chain - list of if blocks within the if-chain
	Stack<List<HashMap<String,Integer>>> ifChainsLastDefinedVars;	// stack of if-chains - list of each block in the if-chain - map of each variable/count pair in the given if block
	Stack<Integer> ifChainsLastDefinedVarsIndex;
	Stack<JavaParser.StatementContext> finalIfBlocks;
    
    public GSAConverter(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
        
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
    }
    
    @Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
    	Token t = ctx.qualifiedName().start;
    	rewriter.replace(t, "outputs");
    	indexIncrease += "outputs".length() - ctx.qualifiedName().getText().length();
    }
    
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    	className = ctx.Identifier().getText();
    }
    
    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
    	methodFirstLineFound = false;
    	afterVarDefs = false;
    }
    
    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
    	tabAmount += 1;
    	
    	if(!methodFirstLineFound) {
    		currentFirstLine = ctx.LBRACE().getSymbol();
    		methodFirstLineFound = true;
    		
    		// add a comment
    		String comment = "\n\t\t// all variables are declared to null";
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
    		insideCondition = true;
    		
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
    			
    		}
    	}
    	else if(ctx.WHILE() != null) {
    		insideCondition = true;
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
            		
            		/* PHI-IF */
        			JavaParser.StatementContext par = ifParents.pop();
        			
        			// add a phi-if function for every changed variable
        			List<HashMap<String,Integer>> chain = ifChainsLastDefinedVars.pop();
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
    	    						phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(i).a.getTokenIndex(), conditions.get(i).b.getTokenIndex())) + "," + v + "_" + chain.get(i).get(v) + ",";
    	    					}
    	    					// number of closing brackets
    	    					String closingBrackets = ")";
    	    					for(int j = 0; j < conditions.size()-1; j++) {
    	    						closingBrackets += ")";
    	    					}
    	    					
    	    					// else case
    	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(conditions.size()-1).a.getTokenIndex(), conditions.get(conditions.size()-1).b.getTokenIndex())) + "," + v + "_" + chain.get(conditions.size()-1).get(v) + "," + v + "_" + definedPriorToIfChain.get(v) + closingBrackets + ";";

    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
    	    					indexIncrease += phi_if.length();
        					}
        					else {
        						// just an if-else statement
    	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(0).a.getTokenIndex(), conditions.get(0).b.getTokenIndex())) + "," + v + "_" + chain.get(0).get(v) + "," + v + "_" + definedPriorToIfChain.get(v) + ");";
    	    					
    	    					// add declaration
    	    					nullDeclaration(v);
    	    					
    	    					rewriter.insertAfter(par.stop, phi_if);
    	    					indexIncrease += phi_if.length();
        					}
        					
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
    			
    			/* PHI-IF */
    			JavaParser.StatementContext par = ifParents.pop();
    			
    			// add a phi-if function for every changed variable
    			List<HashMap<String,Integer>> chain = ifChainsLastDefinedVars.pop();
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
	    						phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(i).a.getTokenIndex(), conditions.get(i).b.getTokenIndex())) + "," + v + "_" + chain.get(i).get(v) + ",";
	    					}
	    					// number of closing brackets
	    					String closingBrackets = ")";
	    					for(int j = 0; j < conditions.size()-1; j++) {
	    						closingBrackets += ")";
	    					}
	    					
	    					// else case
	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(conditions.size()-1).a.getTokenIndex(), conditions.get(conditions.size()-1).b.getTokenIndex())) + "," + v + "_" + chain.get(conditions.size()-1).get(v) + "," + v + "_" + chain.get(conditions.size()).get(v) + closingBrackets + ";";

	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
	    					indexIncrease += phi_if.length();
    					}
    					else {
    						// just an if-else statement
	    					phi_if += "Phi.If(" + rewriter.getText(new Interval(conditions.get(0).a.getTokenIndex(), conditions.get(0).b.getTokenIndex())) + "," + v + "_" + chain.get(0).get(v) + "," + v + "_" + chain.get(1).get(v) + ");";
	    					
	    					// add declaration
	    					nullDeclaration(v);
	    					
	    					rewriter.insertAfter(par.stop, phi_if);
	    					indexIncrease += phi_if.length();
    					}
    					
        			}
    			}
    		}
    		
    		
    	}
    }
    
    @Override 
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 
    	
    	// first, obtain the type of the variable being declared
    	String type = ctx.typeSpec().getText();
    	String var = ctx.variableDeclarators().start.getText();
    	varTypes.put(var, getType(type));
    	
    	// next, erase the type AND the space
    	int startIndex = ctx.typeSpec().start.getTokenIndex();
    	int endIndex = ctx.variableDeclarators().variableDeclarator().get(0).variableDeclaratorId().start.getTokenIndex() - 1;
    	rewriter.delete(startIndex,endIndex);
    	indexIncrease -= (endIndex - startIndex);
    	
    	// declare the variable at the top of the file
		nullDeclaration(var);
    	
    	// create the variable object
    	Token rightSide = ctx.variableDeclarators().variableDeclarator().get(0).variableInitializer().start;
    	newVariable(var, rightSide);
    	
    }
    
    @Override 
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) { 
    	
    	Token t = ctx.variableDeclaratorId().getStart();
    	String var = t.getText();
		if(varCounts.containsKey(var)) {
			varCounts.put(var, varCounts.get(var)+1);
			String count = "_" + varCounts.get(var);
			rewriter.insertAfter(t, count);
			indexIncrease += count.length();
		}
		else {
			varCounts.put(var, 0);
			String count = "_"+varCounts.get(var);
			rewriter.insertAfter(t, count);
			indexIncrease += count.length();
			
		}
    }
    
    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
    	
    	if(ctx.ASSIGN() != null) {
    		
    		// first, increase the count for this variable
    		String var = ctx.start.getText();
    		varCounts.put(var, varCounts.get(var)+1);
    		
    		// set the current assignee to this variable
    		assignedVariableIndexed = false;
    		currentAssignee = var;
    		
    		// declare this variable at the top
    		String decl = "\n\t\tVar<" + varTypes.get(var) + "> " + var + "_" + varCounts.get(var) + " = null;";
        	rewriter.insertAfter(currentFirstLine, decl);
        	indexIncrease += decl.length();
        	
        	// create the variable object
        	Token rightSide = ctx.expression().get(1).start;
        	newVariable(var, rightSide);
    	}
    	
    }
    
    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
    	currentAssignee = "";
    }
    
    @Override 
    public void enterParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideCondition) {
    		conditionDepth += 1;
    	}	
    }
    
    @Override 
    public void exitParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideCondition) {
    		conditionDepth -= 1;
    		
    		if(conditionDepth == 0) {
    			insideCondition = false;
    			
    			// add the condition's ending index to the list
    			Token start = ifConditionIntervals.peek().get(ifConditionIntervals.peek().size()-1).a;
    			ifConditionIntervals.peek().set(ifConditionIntervals.peek().size()-1, new Pair<Token,Token>(start, ctx.stop));
    		}
    	}	
    }
    
    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {

    	// variables that are just now being declared have already had their index added
    	if(varCounts.containsKey(ctx.getText())) {
    		// if this variable is equal to the variable being assigned, make sure you use the variable previously defined
    		if(insideCondition) {
    			String variable = "_" + varCounts.get(ctx.getText()) + ".value";
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
    
    /* HELPERS */
    
    // always returns a non-primitive type
    public String getType(String t) {
    	switch(t) {
    		case "int":
    			return "Integer";
    		case "char":
    			return "Character";
    		case "boolean":
    			return "Boolean";
    		default:
    			return t;
    	}
    }
    
    // creates the right-hand side of an assignment statement
    public void newVariable(String var, Token rightSide) {
    	String before = "new Var<" + varTypes.get(var) + ">(";
    	String after = ")";
    	rewriter.insertBefore(rightSide, before);
    	rewriter.insertAfter(rightSide, after);
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
    
}