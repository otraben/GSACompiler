package outputs.FFT_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		FaultLocalization fl = new FaultLocalization("FFT");
		fl.clearFiles();
		String[] a = {"2"};
		Output.newExecution("FFT");
		FFT.main(a);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("FFT");
				FFT_Faulty.main(a);
			} catch(Exception e) {
				Output.programFail("FFT");
			}
		}
		fl.run();
	}
}
