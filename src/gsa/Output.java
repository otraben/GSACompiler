package gsa;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Output {
	
	// informs the tool that a new execution of the given file has begun
	public static void newExecution(String className) {
		
		try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output/output.txt", true))){
            out.println("*** new execution ***");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
	}

	// adds a variable-value pair to the output file of the program currently being executed
	public static <T> void record(String className, String method, int lineNumber, String var, T value) {
		try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output/output.txt", true))){
            out.println(var + "," + value);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
	}
	
	// this functions needs to be MANUALLY input into the program for the "program output" (i.e. this will determine whether the program had a faulty or non-faulty outcome)
	public static <T> void recordProgramOutput(String className, T value, boolean faulty) {
		if(faulty) {
			try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output/output.txt", true))){
	            out.println("*** OUTPUT ***\n" + value);
	            out.close();
	        } catch (Exception e){
	            e.printStackTrace();
	        }
		}
		else {
			try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/"+className+"_Output/output.txt", true))){
	            out.println("*** CORRECTOUTPUT ***\n" + value);
	            out.close();
	        } catch (Exception e){
	            e.printStackTrace();
	        }
		}
		
	}
	
}
