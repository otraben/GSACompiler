package outputs.Test_Output;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FaultLocalization {
	
	public static int numberOfExecutions = 100;
	
	public static void main(String[] args) {
		
		String filePath = "src/outputs/Test_Output/output.txt";
		
		// clear the output file and outY file
		try (PrintStream out = new PrintStream(new FileOutputStream(filePath))){
            out.print("");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
		try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/Test_Output/outY.txt"))){
            out.print("");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
		
		// run the non-faulty version of code to get the correct output
		Test.main(null);
		
		// obtain the correct output (turn all numerical values to doubles)
		Double correctOutput = null;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			while(line != null) {
				if(line.equals("*** CORRECTOUTPUT ***")) {
					correctOutput = Double.parseDouble(reader.readLine());
					break;
				}
				line = reader.readLine();
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// clear the output file again
		try (PrintStream out = new PrintStream(new FileOutputStream(filePath))){
            out.print("");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
		
		// run the faulty version of code
		for(int i=0; i<numberOfExecutions; i++) {
			Test_Faulty.main(null);
		}
		
		// create a hash map to keep track of each variable and their corresponding values for each execution
		HashMap<String,List<Double>> outputs = new HashMap<>();
		
		// first, read through the causal map to add all known variables
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/outputs/Test_Output/TestMap.txt"));
			String line = reader.readLine();
			while(line != null && !line.equals("")) {
				if(line.contains(",")) {
					outputs.put(line.substring(0,line.indexOf(",")), new ArrayList<>());
				}
				else {
					outputs.put(line, new ArrayList<>());
				}
				line = reader.readLine();
			}
			reader.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// read through the output file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			// skip first "new execution"
			line = reader.readLine();
			int executionCount = 1;
			while(line != null) {
				if(line.equals("*** new execution ***")) {
					// set all variables that were not reached to null (N/A)
					for(String v : outputs.keySet()) {
						if(outputs.get(v).size() < executionCount) {
							outputs.get(v).add(null);
						}
					}
					executionCount++;
				}
				else if(line.equals("*** OUTPUT ***")) {
					// check if this is equal to the correct output
					line = reader.readLine();
					if(Double.parseDouble(line) == correctOutput) {
						// Y = 0
						try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/Test_Output/outY.txt", true))){
							if(executionCount == 1) {
								out.print("0 ");
							}
							else {
								out.print(" 0 ");
							}
							out.close();
				            
				        } catch (Exception e){
				            e.printStackTrace();
				        }
					}
					else {
						// Y = 1
						try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/Test_Output/outY.txt", true))){
							if(executionCount == 1) {
								out.print("1 ");
							}
							else {
								out.print(" 1 ");
							}
							out.close();
				            
				        } catch (Exception e){
				            e.printStackTrace();
				        }
					}
				}
				// must be a variable-value pair
				else {
					outputs.get(line.substring(0,line.indexOf(","))).add(Double.parseDouble(line.substring(line.indexOf(",")+1)));
				}
				line = reader.readLine();
			}
			// set all variables that were not reached to null (N/A)
			for(String v : outputs.keySet()) {
				if(outputs.get(v).size() < executionCount) {
					outputs.get(v).add(null);
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// create the new output file
		try (PrintStream out = new PrintStream(new FileOutputStream("src/outputs/Test_Output/newoutput.txt"))){
			// create the row for each variable
            for(String v : outputs.keySet()) {
            	out.print(String.format("%30s", v));
            	
            	// add every value
            	int count = 1;
            	for(Double o : outputs.get(v)) {
            		// skip the first one
            		if(count != 1) {
            			if(o != null) {
	            			out.print(String.format("%15g", o));
	            		} else {
	            			out.print(String.format("%15s", "NA"));
	            		}   
            		}
            		count++;      		
            	}
            	out.print("\n");
            }
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
	}
}
