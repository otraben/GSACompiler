package outputs.FastCosineTransformer_Output;

import org.apache.commons.math3.transform.DctNormalization;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		// APACHE
		FastCosineTransformer og = new FastCosineTransformer(DctNormalization.STANDARD_DCT_I);
		FastCosineTransformer_Faulty n = new FastCosineTransformer_Faulty(DctNormalization.STANDARD_DCT_I);
		double[] d = {1,2,3,4,5,6,7,8,9};
		
		FaultLocalization fl = new FaultLocalization("FastCosineTransformer");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("FastCosineTransformer");
		og.fct(d);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("FastCosineTransformer");
				n.fct(d);
			} catch(Exception e) {
				Output.programFail("FastCosineTransformer");
			}
		}
		fl.run();
	}
}
