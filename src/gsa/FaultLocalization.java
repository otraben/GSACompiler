package gsa;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import outputs.Test_Output.Test;
import outputs.Test_Output.Test_Faulty;

public class FaultLocalization {
	
	public int numberOfExecutions = 100;
	public String outputFilePath;
	public String outYFilePath;
	public String causalMapFilePath;
	public String newoutputFilePath;
	
	public FaultLocalization(String className) {
		outputFilePath = "src/outputs/"+className+"_Output/output.txt";
		outYFilePath = "src/outputs/"+className+"_Output/outY.txt";
		causalMapFilePath = "src/outputs/"+className+"_Output/" + className + "Map.txt";
		newoutputFilePath = "src/outputs/"+className+"_Output/newoutput.txt";
	}
	
	public void clearFiles() {
		// clear the output file and outY file
		try (PrintStream out = new PrintStream(new FileOutputStream(outputFilePath))){
            out.print("");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
		try (PrintStream out = new PrintStream(new FileOutputStream(outYFilePath))){
            out.print("");
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
	}
	
	public void run() {
		
		// obtain the correct output (turn all numerical values to doubles)
		Double correctOutput = null;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(outputFilePath));
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
		
		// create a hash map to keep track of each variable and their corresponding values for each execution
		HashMap<String,List<Double>> outputs = new HashMap<>();
		
		// first, read through the causal map to add all known variables
		try {
			BufferedReader reader = new BufferedReader(new FileReader(causalMapFilePath));
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
			BufferedReader reader = new BufferedReader(new FileReader(outputFilePath));
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
					if(line.equals("NA")) {
						try (PrintStream out = new PrintStream(new FileOutputStream(outYFilePath, true))){
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
					else if(Double.parseDouble(line) == correctOutput) {
						// Y = 0
						try (PrintStream out = new PrintStream(new FileOutputStream(outYFilePath, true))){
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
						try (PrintStream out = new PrintStream(new FileOutputStream(outYFilePath, true))){
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
					try {
						if(outputs.get(line.substring(0,line.indexOf(","))).size() == executionCount) {
							outputs.get(line.substring(0,line.indexOf(","))).set(executionCount-1, Double.parseDouble(line.substring(line.indexOf(",")+1)));
						}
						else {
							outputs.get(line.substring(0,line.indexOf(","))).add(Double.parseDouble(line.substring(line.indexOf(",")+1)));
						}
						
					}
					catch(Exception e) {
						// move on
					}		
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
		try (PrintStream out = new PrintStream(new FileOutputStream(newoutputFilePath))){
			// create the row for each variable
            for(String v : outputs.keySet()) {
            	
            	// check if this variable is ever used
            	boolean allNull = true;
            	for(Double o : outputs.get(v)) {
            		if(o != null) {
            			allNull = false;
            			break;
            		}
            	}
            	
            	out.print(String.format("%30s", v));
            	
            	// add every value
            	int count = 1;
            	for(Double o : outputs.get(v)) {
            		// skip the first 2
            		if(count > 2) {
            			if(o != null) {
            				if(o == Double.POSITIVE_INFINITY) {
            					out.print(String.format("%15g", 1000000000.0));
            				}
            				else if(o == Double.NEGATIVE_INFINITY) {
            					out.print(String.format("%15g", -1000000000.0));
            				}
            				else {
            					out.print(String.format("%15g", o));
            				}
	            		} 
            			else if(allNull) {
            				out.print(String.format("%15s", 0.00000));
            			}
            			else {
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
