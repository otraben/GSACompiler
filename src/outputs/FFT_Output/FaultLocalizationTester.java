package outputs.FFT_Output;

import gsa.FaultLocalization;

public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("FFT");
		fl.clearFiles();
		String[] a = {"2"};
		FFT.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			FFT_Faulty.main(a);
		}
		fl.run();
	}
}
