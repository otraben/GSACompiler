package outputs.Test_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("Test");
		Test.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("Test");
				Test_Faulty.main(a);
			} catch(Exception e) {
				Output.programFail("Test");
			}
		}
		fl.run();
	}
}
