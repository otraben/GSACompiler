package outputs.LU_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("LU");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("LU");
		LU.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("LU");
				LU_Faulty.main(a);
			} catch(Exception e) {
				Output.programFail("LU");
			}
		}
		fl.run();
	}
}
