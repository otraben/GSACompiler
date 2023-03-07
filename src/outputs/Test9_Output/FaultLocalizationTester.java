package outputs.Test9_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test9");
		Test9.main(null);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			Test9_Faulty.main(null);
		}
		fl.run();
	}
}
