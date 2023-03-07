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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
        List<String> globalVars = preprocessor.globalVars;
        
        // create the output folder
        try {
			Files.createDirectories(Paths.get("src/outputs/"+className+"_Output"));
		} catch (Exception e) {
			System.out.println(e);
		}
        
        saveFile();
        
        List<Integer> addedLines = preprocessor.getAddedLines();

        // re-populate the lexer and the parser using the new pre-processed file
        CharStream inputStream = null;
        try {
        	inputStream = CharStreams.fromFileName(srcFolder + "outputs/" + className + "_Output/" + className + ".java");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        JavaLexer lexer = new JavaLexer(inputStream);
        tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        parseTree = parser.compilationUnit();
        
        // GSA pass
        GSAConverter listener = new GSAConverter(tokens, addedLines, false, globalVars);	// object-oriented version
        walker.walk((ParseTreeListener)listener, parseTree);
        parsedCode = listener.rewriter.getText();
        causalMap = listener.causalMap;
        saveFile(); 
        
        // fault version pass
        GSAConverter faultListener = new GSAConverter(tokens, addedLines, true, globalVars);
        walker.walk((ParseTreeListener)faultListener, parseTree);
        parsedCode = faultListener.rewriter.getText();
        saveFaultyFile();

        createTable();
        try {
        	getRFile();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        createFaultLocalizationFile();
    }
    
    void saveFile(){
    	
    	// GSA Java file
        try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output"+"/"+className+".java"))){
            out.print(parsedCode);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        // causal map
        if(causalMap != null) {
	        try (PrintStream map = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output"+"/"+className+"Map.txt"))){
	        	for(String key : causalMap.keySet()) {
	        		String line = key;
	        		for(String v : causalMap.get(key)) {
	        			line += ", " + v;
	        		}
	        		map.println(line);
	        	}
	        	map.close();
	        } catch (Exception e){
	            e.printStackTrace();
	        }
        }
    }
    
    void createTable() {
    	try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output"+"/"+className+".R"))) {
    		// header
    		out.println("genCFmeansRF_fault_binerrs <- function() {\n\nresults <- data.frame(row.names=seq(1,10))\n");
    		
    		// variables
    		for(String key : causalMap.keySet()) {
    			out.print("fault_binerrs_" + key + "_treat_df <- data.frame(Y=fault_binerrs_all$Y");
    			out.print(", " + key + "=fault_binerrs_all$" + key);
    			for(String v : causalMap.get(key)) {
    				out.print(", " + v + "=fault_binerrs_all$" + v);
    			}
    			out.println(")\nresults[[\"" + key + "\"]] <- CFmeansForDecileBinsRF(fault_binerrs_" + key + "_treat_df, \"Y\", \"" + key + "\")\n");
    		}
    		
    		// footer
    		out.println("return(results)\n\n}");
    		
    		out.close();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    void getRFile() throws IOException {
    	File source = new File("src/gsa/RFCIcode.R");
    	File dest = new File("src/outputs/"+className+"_Output"+"/RFCIcode.R");
    	if(!dest.exists()) {
    		Files.copy(source.toPath(), dest.toPath());
    	}
    }
    
    void saveFaultyFile(){
        try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output"+"/"+className+"_Faulty.java"))){
            out.print(parsedCode);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    void createFaultLocalizationFile() {
    	try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output"+"/FaultLocalizationTester.java"))){
            out.println("package outputs." + className + "_Output;\n");
            out.println("import gsa.FaultLocalization;\n");
            out.println("public class FaultLocalizationTester {\n");
            out.println("\tpublic static void main(String[] args) {");
            out.println("\t\tFaultLocalization fl = new FaultLocalization(\"" + className + "\");");
            out.println("\t\tfl.clearFiles();");
            out.println("\t\tString[] a = {};");
            out.println("\t\t" + className + ".main(a);");
            out.println("\t\tfor(int i=0; i<fl.numberOfExecutions; i++) {");
            out.println("\t\t\t" + className + "_Faulty.main(a);");
            out.println("\t\t}");
            out.println("\t\tfl.run();");
            out.println("\t}");
            out.println("}");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
