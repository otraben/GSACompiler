package outputs.LU_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("LU");
		fl.clearFiles();
		String[] a = {};
		LU.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			LU_Faulty.main(a);
		}
		fl.run();
	}
}
