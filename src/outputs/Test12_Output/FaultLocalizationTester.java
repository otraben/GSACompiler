package outputs.Test12_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("Test12");
		fl.clearFiles();
		String[] a = {};
		Test12.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			Test12_Faulty.main(a);
		}
		fl.run();
	}
}
