package outputs.Test13_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test13");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("Test13");
		Test13.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("Test13");
				Test13_Faulty.main(a);
			} catch(Exception e) {
				Output.programFail("Test13");
			}
		}
		fl.run();
	}
}
