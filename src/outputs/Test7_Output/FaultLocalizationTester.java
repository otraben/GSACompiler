package outputs.Test7_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test7");
		Test7.main(null);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			Test7_Faulty.main(null);
		}
		fl.run();
	}
}
