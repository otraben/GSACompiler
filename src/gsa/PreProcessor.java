package gsa;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.JavaBaseListener;
import antlr.JavaParser;

public class PreProcessor extends JavaBaseListener {
	public TokenStreamRewriter rewriter;
	public String className;
	int tabAmount = 0;
	
	// foreach loops
	boolean foreachLoop = false;
	
	public PreProcessor(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);   
    }
	
	@Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
		// add this file to the outputs package
    	Token t = ctx.qualifiedName().start;
    	rewriter.replace(t, "outputs");
    }
	
	@Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		// save the class name for the translator
    	className = ctx.Identifier().getText();
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
	public void exitStatement(JavaParser.StatementContext ctx) {
		if(ctx.FOR() != null && !foreachLoop) {
			// tab amount
			String ws = "";
			for(int i=0; i<tabAmount+1; i++) {
				ws += '\t';
			}
			
			// move assignments to above the loop header
			String assignments = rewriter.getText(new Interval(ctx.forControl().forInit().start.getTokenIndex(), ctx.forControl().SEMI(0).getSymbol().getTokenIndex())) + "\n" + ws;
			rewriter.insertBefore(ctx.start, assignments);
			
			// add iterator to end of the loop
    		// check whether or not this is the only time this var is being assigned a value
			String iteratorOnly = rewriter.getText(new Interval(ctx.forControl().forUpdate().start.getTokenIndex(), ctx.RPAREN().getSymbol().getTokenIndex()));
    		String iteration = "\t" + iteratorOnly.substring(0,iteratorOnly.length()-1) + ";\n" + ws;
    		rewriter.insertBefore(ctx.stop, iteration);
    		
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
		
		// tab amount
		String ws = "";
		for(int i=0; i<tabAmount+1; i++) {
			ws += '\t';
		}
		
		for(TerminalNode comma : ctx.variableDeclarators().COMMA()) {
			// create a new line for each variable declared in the same line
			rewriter.replace(comma.getSymbol(), ";\n" + ws + type + " ");
		}
	}
	
	@Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
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
}
