package outputs.Test_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test");
		Test.main(null);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			Test_Faulty.main(null);
		}
		fl.run();
	}
}
