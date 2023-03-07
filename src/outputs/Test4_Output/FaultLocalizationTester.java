package outputs.Test4_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test4");
		fl.clearFiles();
		String[] a = {};
		Test4.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			Test4_Faulty.main(a);
		}
		fl.run();
	}
}
