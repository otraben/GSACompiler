package gsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.JavaBaseListener;
import antlr.JavaParser;

public class NewJavaListener extends JavaBaseListener {

	public Map<String, Integer> varCounts;	// keeps track of the amount of each variable
	public Map<String, String> varTypes;	// keeps track of the type of each variable
	public Map<String, Boolean> defined;
	public Stack<HashMap<String, Integer>> tempIfMaps;
    public TokenStreamRewriter rewriter;
    public int tabAmount;
    public int indexIncrease; 	// keeps track of how much the index has been increased in the rewriter
    String className = "";
    
    // if statement stuff
    public Stack<Pair<Integer, Integer>> conditionIntervals;
    public boolean insideIfCondition = false;
    public int ifConditionDepth = 0;
    public int ifStatementDepth = 0;
    
    // assignment stuff
    public String currentAssignee = "";
    public boolean assignedVariableIndexed = false;
    
    public NewJavaListener(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
        varCounts = new HashMap<>();
        varTypes = new HashMap<>();
        defined = new HashMap<>();
        tempIfMaps = new Stack<>();
        tabAmount = 1;
        indexIncrease = 0;
        
        conditionIntervals = new Stack<>();
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
    public void enterBlock(JavaParser.BlockContext ctx) {
    	tabAmount += 1;
    }
    
    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
    	tabAmount -= 1;
    }
    
    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
    	
    	// statement types
    	if(ctx.IF() != null) {
    		HashMap<String, Integer> tempIfMap = new HashMap<>();
    		tempIfMap.putAll(varCounts);
    		tempIfMaps.push(tempIfMap);
    		insideIfCondition = true;
    		conditionIntervals.push(new Pair<Integer,Integer>(ctx.parExpression().start.getStartIndex() + indexIncrease, -1));
    		ifStatementDepth++;
    	}
    	else if(ctx.WHILE() != null) {
    		
    		// tab amount
			String ws = "";
			for(int i=0; i<tabAmount; i++) {
				ws += '\t';
			}
    		
    		String phi_entry = "Phi.Entry();" + "\n" + ws;
    		rewriter.insertBefore(ctx.start, phi_entry);
			indexIncrease += phi_entry.length();
    	}


    }
    
    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
    	
    	// statement types
    	if(ctx.IF() != null) {
    		ifStatementDepth--;
    		
    		// obtain the changed variables
    		List<String> changedKeys = new ArrayList<>();
    		
    		// pop the current IF statement
    		HashMap<String, Integer> tempIfMap = tempIfMaps.pop();
    		
    		for(String v : varCounts.keySet()) {
    			if(!varCounts.get(v).equals(tempIfMap.get(v))) {
    				changedKeys.add(v);
    			}
    		}
    		
    		// get updated condition
			Pair<Integer,Integer> interval = conditionIntervals.pop();
			String condition = rewriter.getText().substring(interval.a, interval.b);
    		
    		// phi_if
    		for(String v : changedKeys) {
    			varCounts.put(v, varCounts.get(v)+1);
    			
    			// tab amount
    			String ws = "";
    			for(int i=0; i<tabAmount; i++) {
    				ws += '\t';
    			}
    				
    			// check the amount of times the variable was changed (THIS WILL NEED TO BE REVISITED)
    			String phi_if = "";
    			// changed once
    			if((varCounts.get(v) - tempIfMap.get(v)) == 2) {
    				if(ifStatementDepth > 0) {
    					phi_if = "\n" + ws + v + "_" + varCounts.get(v) + " = Phi.If(" + condition + "," + v + "_" + (varCounts.get(v) - 1) + "," + v + "_" + (varCounts.get(v) - 2) + ");";
    				}
    				else {
    					phi_if = "\n" + ws + varTypes.get(v) + " " + v + "_" + varCounts.get(v) + " = Phi.If(" + condition + "," + v + "_" + (varCounts.get(v) - 1) + "," + v + "_" + (varCounts.get(v) - 2) + ");";
    				}
    				
    				String declr = varTypes.get(v) + " " + v + "_" + (varCounts.get(v)-1) + " = " + defaultVal(varTypes.get(v)) + ";" + "\n" + ws;
    				rewriter.insertBefore(ctx.start, declr);
        			indexIncrease += declr.length();
        			defined.put(v + "_" + (varCounts.get(v)-1), true);
    			}
    			// else
    			else {
    				if(ifStatementDepth > 0) {
    					phi_if = "\n" + ws + v + "_" + varCounts.get(v) + " = Phi.If(" + condition + "," + v + "_" + (varCounts.get(v) - 2) + "," + v + "_" + (varCounts.get(v) - 1) + ");";
    				}
    				else {
    					phi_if = "\n" + ws + varTypes.get(v) + " " + v + "_" + varCounts.get(v) + " = Phi.If(" + condition + "," + v + "_" + (varCounts.get(v) - 2) + "," + v + "_" + (varCounts.get(v) - 1) + ");";
    				}
        			
    				for(int j=varCounts.get(v)-1; j>=tempIfMap.get(v)+1; j--) {
    					if(!defined.containsKey(v + "_" + j)) {
    						String declr = varTypes.get(v) + " " + v + "_" + (j) + " = " + defaultVal(varTypes.get(v)) + ";" + "\n" + ws;
            				rewriter.insertBefore(ctx.start, declr);
                			indexIncrease += declr.length();
                			defined.put(v + "_" + j, true);
    					}	
    				}
    			}
    			
    			rewriter.insertAfter(ctx.stop, phi_if);
    			indexIncrease += phi_if.length();
    			
    		}

    	}


    }
    
    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
    	if(ctx.ASSIGN() != null) {
    		Token t = ctx.start;
    		String var = t.getText();
    		varCounts.put(var, varCounts.get(var)+1);
    		currentAssignee = var;
    		assignedVariableIndexed = false;
    		
    		// add initialization
    		if(ifStatementDepth == 0) {
    			rewriter.insertBefore(t, varTypes.get(var) + " ");
        		indexIncrease += (varTypes.get(var) + " ").length();
        		defined.put(var + "_" + varCounts.get(var), true);
    		}
    		
    	}
    	else if(ctx.ADD_ASSIGN() != null || ctx.SUB_ASSIGN() != null || ctx.MUL_ASSIGN() != null || ctx.DIV_ASSIGN() != null || 
    			ctx.AND_ASSIGN() != null || ctx.OR_ASSIGN() != null || ctx.XOR_ASSIGN() != null || ctx.MOD_ASSIGN() != null || 
    			ctx.LSHIFT_ASSIGN() != null || ctx.RSHIFT_ASSIGN() != null || ctx.URSHIFT_ASSIGN() != null) {
    		
    		Token t = ctx.start;
    		String var = t.getText();
    		varCounts.put(var, varCounts.get(var)+1);
    		currentAssignee = var;
    		assignedVariableIndexed = false;
    		
    		// get operator
    		Token op = 	ctx.ADD_ASSIGN() != null ? ctx.ADD_ASSIGN().getSymbol() : 
				ctx.SUB_ASSIGN() != null ? ctx.SUB_ASSIGN().getSymbol() :
				ctx.MUL_ASSIGN() != null ? ctx.MUL_ASSIGN().getSymbol() :
				ctx.DIV_ASSIGN() != null ? ctx.DIV_ASSIGN().getSymbol() :
				ctx.AND_ASSIGN() != null ? ctx.AND_ASSIGN().getSymbol() :
				ctx.OR_ASSIGN() != null ? ctx.OR_ASSIGN().getSymbol() :
				ctx.XOR_ASSIGN() != null ? ctx.XOR_ASSIGN().getSymbol() :
				ctx.MOD_ASSIGN() != null ? ctx.MOD_ASSIGN().getSymbol() :
				ctx.LSHIFT_ASSIGN() != null ? ctx.LSHIFT_ASSIGN().getSymbol() :
				ctx.RSHIFT_ASSIGN() != null ? ctx.RSHIFT_ASSIGN().getSymbol() :
				ctx.URSHIFT_ASSIGN().getSymbol();
					
    		
    		// add itself to the right side
    		rewriter.insertAfter(op, " " + var + "_" + (varCounts.get(var)-1) + " " + op.getText().replaceAll("=", ""));
    		indexIncrease += (" " + var + "_" + (varCounts.get(var)-1) + " " + op.getText().replaceAll("=", "")).length();
    		
    		// add initialization
    		if(ifStatementDepth == 0) {
    			rewriter.insertBefore(t, varTypes.get(var) + " ");
        		indexIncrease += (varTypes.get(var) + " ").length();
        		defined.put(var + "_" + varCounts.get(var), true);
    		}
    		
    		// replace operator
    		rewriter.replace(op, "=");
    		indexIncrease += "=".length() - op.getText().length();
    	}
    	else if(ctx.INC() != null || ctx.DEC() != null) {
    		Token t = ctx.start;
    		String var = t.getText();
    		varCounts.put(var, varCounts.get(var)+1);
    		
    		// get operator
    		Token op = 	ctx.INC() != null ? ctx.INC().getSymbol() :
    					ctx.DEC().getSymbol();
    		
    		// add itself to the right side
    		rewriter.insertAfter(op, " " + var + "_" + (varCounts.get(var)-1) + " " + op.getText().charAt(0) + " " + 1);
    		indexIncrease += (" " + var + "_" + (varCounts.get(var)-1) + " " + op.getText().charAt(0) + " " + 1).length();
    		
    		// add initialization
    		rewriter.insertBefore(t, varTypes.get(var) + " ");
    		indexIncrease += (varTypes.get(var) + " ").length();
    		defined.put(var + "_" + varCounts.get(var), true);
    		
    		// replace operator
    		rewriter.replace(op, " =");
    		indexIncrease += " =".length() - op.getText().length();
    	}
    		
    }
    
    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
    	if(ctx.ASSIGN() != null || ctx.ADD_ASSIGN() != null || ctx.SUB_ASSIGN() != null || ctx.MUL_ASSIGN() != null || ctx.DIV_ASSIGN() != null || ctx.AND_ASSIGN() != null || ctx.OR_ASSIGN() != null || ctx.XOR_ASSIGN() != null || ctx.MOD_ASSIGN() != null || ctx.LSHIFT_ASSIGN() != null || ctx.RSHIFT_ASSIGN() != null || ctx.URSHIFT_ASSIGN() != null) {
    		assignedVariableIndexed = false;
    		currentAssignee = "";
    	}
    }
    
    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
    	// if a variable is being referenced in an expression, then it must use the most recently declared version of that variable
    	if(varCounts.containsKey(ctx.getText())) {
    		// as long as at least one variable has been found (i.e. confirming that the leftside variable has been reached), and the leftside variable is equal to this current variable, then go back one index
    		if(assignedVariableIndexed && currentAssignee.equals(ctx.getText()) && ifStatementDepth > 0) {
    			String variable = "_" + tempIfMaps.peek().get(ctx.getText());
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		else if(assignedVariableIndexed && currentAssignee.equals(ctx.getText())) {
    			String variable = "_" + (varCounts.get(ctx.getText())-1);
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
    		}
    		else {
    			String variable = "_" + varCounts.get(ctx.getText());
    			rewriter.insertAfter(ctx.start, variable);
        		indexIncrease += variable.length();
        		assignedVariableIndexed = true;
    		}

    	}
    }
    
    @Override 
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) { 
    	
    	Token t = ctx.variableDeclaratorId().getStart();
    	String var = t.getText();
		if(varCounts.containsKey(var)) {
			varCounts.put(var, varCounts.get(var)+1);
			rewriter.insertAfter(t, "_" + varCounts.get(var));
			indexIncrease += ("_"+varCounts.get(var)).length();
		}
		else {
			varCounts.put(var, 0);
			rewriter.insertAfter(t, "_"+varCounts.get(var));
			indexIncrease += ("_"+varCounts.get(var)).length();
			
		}
    }
    
    @Override 
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { 
    	String type = ctx.typeSpec().getText();
    	String var = ctx.variableDeclarators().start.getText();
    	varTypes.put(var, type);
    }
    
    @Override 
    public void enterParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideIfCondition) {
    		ifConditionDepth += 1;
    	}
    	
    }
    
    @Override 
    public void exitParExpression(JavaParser.ParExpressionContext ctx) { 
    	if(insideIfCondition) {
    		
    		ifConditionDepth -= 1;
    		
    		// if condition is done
    		if(ifConditionDepth == 0) {
    			insideIfCondition = false;
    			Integer start = conditionIntervals.pop().a;
    			conditionIntervals.push(new Pair<Integer,Integer>(start, ctx.stop.getStopIndex() + indexIncrease + 1));
    		}
    		
    	}
    	
    }
    
    // helper function that determines the default value of a given variable type
    public String defaultVal(String type) {
    	switch(type) {
    		case "int":
    			return "0";
    		case "String":
    			return "\"\"";
    		default:
    			return "null";
    	}
    }
}