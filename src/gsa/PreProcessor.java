package gsa;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import antlr.JavaBaseListener;
import antlr.JavaParser;

public class PreProcessor extends JavaBaseListener {
	public TokenStreamRewriter rewriter;
	public String className;
	
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
    public void enterExpression(JavaParser.ExpressionContext ctx) {
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
	}
}
