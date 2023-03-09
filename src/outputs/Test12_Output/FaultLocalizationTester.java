package outputs.Test12_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test12");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("Test12");
		Test12.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("Test12");
				Test12_Faulty.main(a);
			} catch(Exception e) {
				Output.programFail("Test12");
			}
		}
		fl.run();
	}
}
