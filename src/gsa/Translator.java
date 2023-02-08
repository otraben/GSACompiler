package gsa;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntegerList;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import antlr.JavaLexer;
import antlr.JavaParser;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;

public class Translator {

    CommonTokenStream tokens;
    ParseTree parseTree;
    ParseTreeWalker walker;
    String parsedCode;
    String className;
    String srcFolder;
    HashMap<String, List<String>> causalMap;

    public Translator(String file){

    	// save the path to the user's src folder
    	srcFolder = file.substring(0, file.indexOf("tests"));
    	
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(file);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        JavaLexer lexer = new JavaLexer(inputStream);
        tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        parseTree = parser.compilationUnit();
    }
    
    void translate(){
        walker = new ParseTreeWalker();
        
        // pre-processing pass
        PreProcessor preprocessor = new PreProcessor(tokens);	// object-oriented version
        walker.walk((ParseTreeListener)preprocessor, parseTree);
        parsedCode = preprocessor.rewriter.getText();
        className = preprocessor.className;
        saveFile();
        
        List<Integer> addedLines = preprocessor.getAddedLines();
        
        // re-populate the lexer and the parser using the new pre-processed file
        CharStream inputStream = null;
        try {
        	inputStream = CharStreams.fromFileName(srcFolder + "outputs\\" + className + ".java");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        JavaLexer lexer = new JavaLexer(inputStream);
        tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        parseTree = parser.compilationUnit();
        
        // GSA pass
        GSAConverter listener = new GSAConverter(tokens, addedLines);	// object-oriented version
        walker.walk((ParseTreeListener)listener, parseTree);
        parsedCode = listener.rewriter.getText();
        causalMap = listener.causalMap;

        saveFile(); 
    }
    
    void saveFile(){
    	// GSA Java file
        try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+".java"))){
            out.print(parsedCode);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        // causal map
        if(causalMap != null) {
	        try (PrintStream map = new PrintStream(new FileOutputStream("src/outputs/"+className+"Map.txt"))){
	        	for(String key : causalMap.keySet()) {
	        		String line = key;
	        		for(String v : causalMap.get(key)) {
	        			line += ", " + v;
	        		}
	        		map.println(line);
	        	}
	           
	        } catch (Exception e){
	            e.printStackTrace();
	        }
        }
    }
}
