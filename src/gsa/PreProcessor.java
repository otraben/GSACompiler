package gsa;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.JavaBaseListener;
import antlr.JavaParser;
import antlr.JavaParser.ExpressionContext;
import antlr.JavaParser.StatementContext;
import antlr.JavaParser.VariableDeclaratorContext;

public class PreProcessor extends JavaBaseListener {
	public TokenStreamRewriter rewriter;
	public String className = "";
	int tabAmount = 0;
	
	List<Integer> lineIncreases = new ArrayList<>();
	int extraLines = 0;
	
	// foreach loops
	boolean foreachLoop = false;
	
	// package
	Token p;
	
	// global variables
	public List<String> globalVars = new ArrayList<>();
	
	// these vars are used for the specific case where an if statement has phi.entry vars used within it
	int loopDepth = 0;
	int ifConditionDepth = 0;
	boolean ifStatement = false;
	boolean literal = false;
	Token ifStatementToken;
	String primaryName = "";
	
	
	public PreProcessor(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);   
    }
	
	public List<Integer> getAddedLines() {
		return lineIncreases;
	}
	
	@Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
		// add this file to the outputs package
    	Token t = ctx.qualifiedName().start;
    	p = t;
    	
    	// add imports
    	rewriter.insertAfter(ctx.stop, "\nimport gsa.Output;\nimport gsa.Phi;\nimport gsa.Var;\n");
    	lineIncreases.add(ctx.getStart().getLine() + extraLines);
    	lineIncreases.add(ctx.getStart().getLine() + extraLines);
    	lineIncreases.add(ctx.getStart().getLine() + extraLines);
    	lineIncreases.add(ctx.getStart().getLine() + extraLines);
		extraLines+=4;
    	
    }
	
	@Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    	// the first class name should be the name of the file
    	if(className == "") {
    		className = ctx.Identifier().getText();
    	}
    	
    	// add new package title
    	rewriter.replace(p, "outputs." + className + "_Output");
    }
    
    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
    	// the first interface name should be the name of the file
    	if(className == "") {
    		className = ctx.Identifier().getText();
    	}
    }
	
	@Override
	public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
		String type = ctx.typeSpec().getText();
		
		// tab amount
		String ws = "";
		for(int i=0; i<tabAmount+1; i++) {
			ws += '\t';
		}
		
		for(TerminalNode comma : ctx.variableDeclarators().COMMA()) {
			// create a new line for each variable declared in the same line
			rewriter.replace(comma.getSymbol(), ";\n" + ws + type + " ");
			lineIncreases.add(ctx.getStart().getLine() + extraLines);
			extraLines++;
		}
		
		// add global variables to a list
		for(VariableDeclaratorContext vd : ctx.variableDeclarators().variableDeclarator()) {
			String var = vd.variableDeclaratorId().getText();
			var = var.replaceAll("\\[", "");
			var = var.replaceAll("\\]", "");
			globalVars.add(var);
		}
	}
	
	@Override
	public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
		// check for an array declared with the brackets next to the variable name
		if(ctx.variableDeclaratorId().LBRACK(0) != null) {
			
			// get bracket count
			int bracketCount = ctx.variableDeclaratorId().LBRACK().size();
			String brackets = "";
			for(int i=0; i<bracketCount; i++) {
				brackets += "[]";
			}
			
			// delete brackets
			rewriter.replace(ctx.variableDeclaratorId().LBRACK(0).getSymbol(), ctx.variableDeclaratorId().RBRACK(ctx.variableDeclaratorId().RBRACK().size()-1).getSymbol(), "");
			
			// add brackets to type
			rewriter.insertAfter(ctx.typeSpec().stop, brackets);
		}
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
		if(ctx.FOR()!=null || ctx.WHILE()!=null) {
			loopDepth++;
		}
		else if(ctx.IF()!=null) {
			ifStatement = true;
			if(!(ctx.getParent() instanceof StatementContext && ((StatementContext)ctx.getParent()).IF() != null)) {
				ifStatementToken = ctx.start;
			}
		}
	}
	
	@Override
	public void exitStatement(JavaParser.StatementContext ctx) {
		
		if(ctx.FOR()!=null || ctx.WHILE()!=null) {
			loopDepth--;
		}

		// tab amount
		String ws = "";
		for(int i=0; i<tabAmount+1; i++) {
			ws += '\t';
		}
		
		// make sure braces are present in all cases
		for(int i=0; i<ctx.getChildCount(); i++) {
			// do not separate else if chains
			if(ctx.getChild(i) instanceof StatementContext && !(ctx.getChild(i-1).getText().contains("else") && ((StatementContext) ctx.getChild(i)).IF() != null)) {
				StatementContext s = (StatementContext) ctx.getChild(i);
				if(s.block() == null && !s.getText().equals(";")) {
					rewriter.insertBefore(s.start, "{\n\t" + ws);
					lineIncreases.add(s.start.getLine() + extraLines);
					rewriter.insertAfter(s.stop, "\n" + ws + "}");
					lineIncreases.add(s.stop.getLine() + extraLines);
				}
				else if(s.block() == null) {
					rewriter.insertBefore(s.start.getTokenIndex()-1, "{\n\t" + ws);
					lineIncreases.add(s.start.getLine() + extraLines);
					rewriter.insertAfter(s.stop, "\n" + ws + "}");
					lineIncreases.add(s.stop.getLine() + extraLines);
				}
			}
		}
//		for(StatementContext s : ctx.statement()) {
//			if(s.parent.get) {
//				if(s.block() == null && !s.getText().equals(";")) {
//					rewriter.insertBefore(s.start, "{\n\t" + ws);
//					lineIncreases.add(s.start.getLine() + extraLines);
//					rewriter.insertAfter(s.stop, "\n" + ws + "}");
//					lineIncreases.add(s.stop.getLine() + extraLines);
//				}
//				else if(s.block() == null) {
//					rewriter.insertBefore(s.start.getTokenIndex()-1, "{\n\t" + ws);
//					lineIncreases.add(s.start.getLine() + extraLines);
//					rewriter.insertAfter(s.stop, "\n" + ws + "}");
//					lineIncreases.add(s.stop.getLine() + extraLines);
//				}
//			}
//		}
		
		if(ctx.FOR() != null && !foreachLoop) {
			
			// move assignments to above the loop header
			if(ctx.forControl().forInit() != null) {
				String assignments = rewriter.getText(new Interval(ctx.forControl().forInit().start.getTokenIndex(), ctx.forControl().SEMI(0).getSymbol().getTokenIndex())) + "\n" + ws;
				rewriter.insertBefore(ctx.start, assignments);
				lineIncreases.add(ctx.getStart().getLine()- 1 + extraLines);
				extraLines++;
			}
				
			// add iterator(s) to end of the loop
    		// check whether or not this is the only time this var is being assigned a value
			for(ExpressionContext exp : ctx.forControl().forUpdate().expressionList().expression()) {
//				String iteratorOnly = rewriter.getText(new Interval(ctx.forControl().forUpdate().start.getTokenIndex(), ctx.RPAREN().getSymbol().getTokenIndex()));
//	    		String iteration = "\t" + iteratorOnly.substring(0,iteratorOnly.length()-1) + ";\n" + ws;
				//ExpressionContext exp = ctx.forControl().forUpdate().expressionList().expression(i);
				
				// have to translate the expression to a regular assign expression
				String expText = "";
				if(exp.ADD_ASSIGN() != null || exp.SUB_ASSIGN() != null || exp.MUL_ASSIGN() != null || exp.DIV_ASSIGN() != null || 
						exp.AND_ASSIGN() != null || exp.OR_ASSIGN() != null || exp.XOR_ASSIGN() != null || exp.MOD_ASSIGN() != null || 
								exp.LSHIFT_ASSIGN() != null || exp.RSHIFT_ASSIGN() != null || exp.URSHIFT_ASSIGN() != null) {
						
						// get operator
			    		Token op = 	exp.ADD_ASSIGN() != null ? exp.ADD_ASSIGN().getSymbol() : 
			    			exp.SUB_ASSIGN() != null ? exp.SUB_ASSIGN().getSymbol() :
			    			exp.MUL_ASSIGN() != null ? exp.MUL_ASSIGN().getSymbol() :
			    			exp.DIV_ASSIGN() != null ? exp.DIV_ASSIGN().getSymbol() :
			    			exp.AND_ASSIGN() != null ? exp.AND_ASSIGN().getSymbol() :
			    			exp.OR_ASSIGN() != null ? exp.OR_ASSIGN().getSymbol() :
			    			exp.XOR_ASSIGN() != null ? exp.XOR_ASSIGN().getSymbol() :
			    			exp.MOD_ASSIGN() != null ? exp.MOD_ASSIGN().getSymbol() :
			    			exp.LSHIFT_ASSIGN() != null ? exp.LSHIFT_ASSIGN().getSymbol() :
			    			exp.RSHIFT_ASSIGN() != null ? exp.RSHIFT_ASSIGN().getSymbol() :
			    			exp.URSHIFT_ASSIGN().getSymbol();
			    		
			    		// get variable
			    		String var = exp.start.getText();
			    		
			    		// transform it into a regular ASSIGN expression
			    		expText = exp.getText();
			    		expText = expText.substring(0,expText.indexOf(op.getText())) + " = " + var + " " + op.getText().replaceAll("=", "") + " " + expText.substring(expText.indexOf(op.getText())+ op.getText().length());
						
					}
					// transform decrement and increment statements into ASSIGN statements
					else if(exp.INC() != null || exp.DEC() != null) {
						
						// get operator
			    		Token op = 	exp.INC() != null ? exp.INC().getSymbol() :
			    			exp.DEC().getSymbol();
			    		
			    		// get variable
			    		String var = exp.start.getText();
			    		
			    		// transform it into a regular ASSIGN expression
			    		expText = exp.getText();
			    		expText = expText.substring(0,expText.indexOf(op.getText())) + " = " + var + " " + op.getText().substring(1) + " 1";
					}
				
				String iteration = "\t" + expText + ";\n" + ws;
				
				// check if the loop has no braces
				if(ctx.statement(0).block() == null) {
					iteration = ";\n\t" + ws + expText;
				}
	    		rewriter.insertBefore(ctx.stop, iteration);
	    		lineIncreases.add(ctx.getStop().getLine() - 1 + extraLines);
	    		extraLines++;
			}
			
    		// FOR loops needs to be transformed into WHILE loops
    		String condition = rewriter.getText(new Interval(ctx.forControl().expression().start.getTokenIndex(), ctx.forControl().expression().stop.getTokenIndex()));
    		String whileLoop = "while(" + condition + ")";
    		rewriter.replace(ctx.start, ctx.RPAREN().getSymbol(), whileLoop);
		}
		else if(ctx.FOR() != null) {
			foreachLoop = false;
		}
		
	}
	
	@Override
	public void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
		foreachLoop = true;
	}
	
	@Override
	public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
		String type = ctx.typeSpec().getText();
		
		// check if the array is attached to the type
		String brackets = "";
		if(type.contains("[]")) {
			rewriter.replace(ctx.typeSpec().LBRACK(0).getSymbol(), ctx.typeSpec().RBRACK(ctx.typeSpec().RBRACK().size()-1).getSymbol(), "");
		}
		while(type.contains("[]")) {
			brackets += "[]";
			type = type.substring(0, type.lastIndexOf("[]"));
		}
		
		// tab amount
		String ws = "";
		for(int i=0; i<tabAmount+1; i++) {
			ws += '\t';
		}
		
		for(VariableDeclaratorContext v : ctx.variableDeclarators().variableDeclarator()) {
			rewriter.insertAfter(v.variableDeclaratorId().stop, brackets);
		}
		
		for(TerminalNode comma : ctx.variableDeclarators().COMMA()) {
			// create a new line for each variable declared in the same line
			rewriter.replace(comma.getSymbol(), ";\n" + ws + type + " ");
			lineIncreases.add(ctx.getStart().getLine() + extraLines);
			extraLines++;
		}
	}
	
	@Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
		
		// array?
		if(ctx.LBRACK()!=null && ifStatement) {
			try {
				primaryName = ctx.expression(0).primary().getText();
			}
			catch(Exception e) {
				// nothing
			}
			
		}
		
		// transform all assignment variants into generic ASSIGN statements
		if( ctx.ADD_ASSIGN() != null || ctx.SUB_ASSIGN() != null || ctx.MUL_ASSIGN() != null || ctx.DIV_ASSIGN() != null || 
			ctx.AND_ASSIGN() != null || ctx.OR_ASSIGN() != null || ctx.XOR_ASSIGN() != null || ctx.MOD_ASSIGN() != null || 
    		ctx.LSHIFT_ASSIGN() != null || ctx.RSHIFT_ASSIGN() != null || ctx.URSHIFT_ASSIGN() != null) {
			
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
    		
    		// get variable
    		String var = ctx.start.getText();
    		
    		// check if this is an array

    		if(ctx.expression(0).LBRACK() != null) {
    			var = ctx.expression(0).getText();
    		}
    		
    		// transform it into a regular ASSIGN expression
    		rewriter.insertAfter(op, " " + var + " " + op.getText().replaceAll("=", ""));
    		rewriter.replace(op, "=");
			
		}
		// transform decrement and increment statements into ASSIGN statements
		else if(ctx.INC() != null || ctx.DEC() != null) {
			
			// get operator
    		Token op = 	ctx.INC() != null ? ctx.INC().getSymbol() :
    					ctx.DEC().getSymbol();
    		
    		// get variable
    		String var = ctx.start.getText();
    		
    		// transform it into a regular ASSIGN expression
    		rewriter.insertAfter(op, " " + var + " " + op.getText().substring(1) + " 1");
    		rewriter.replace(op, " =");
			
		}
	}
	
	@Override
	public void enterParExpression(JavaParser.ParExpressionContext ctx) {
		if(ifStatement) {
			ifConditionDepth++;
		}
	}
	
	@Override
	public void exitParExpression(JavaParser.ParExpressionContext ctx) {
		if(ifStatement) {
			ifConditionDepth--;
			if(ifConditionDepth==0) {
				ifStatement = false;
			}
		}
	}
	
	@Override
	public void exitPrimary(JavaParser.PrimaryContext ctx) {
		if(ifStatement && !literal && !primaryName.equals(ctx.getText())) {
			rewriter.insertBefore(ifStatementToken, ctx.getText() + " = " + ctx.getText() + ";\n");
			lineIncreases.add(ctx.getStart().getLine() + extraLines);
			extraLines++;
		}
		else if(primaryName.equals(ctx.getText())) {
			primaryName = "";
		}
		literal = false;
	}
	
	@Override
	public void enterLiteral(JavaParser.LiteralContext ctx) {
		literal = true;
	}

}
