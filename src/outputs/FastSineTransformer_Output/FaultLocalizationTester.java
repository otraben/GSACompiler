package outputs.FastSineTransformer_Output;

import org.apache.commons.math3.transform.DctNormalization;
import org.apache.commons.math3.transform.DstNormalization;

import gsa.FaultLocalization;

import gsa.Output;
import outputs.FastCosineTransformer_Output.FastCosineTransformer;
import outputs.FastCosineTransformer_Output.FastCosineTransformer_Faulty;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		// APACHE
		FastSineTransformer og = new FastSineTransformer(DstNormalization.STANDARD_DST_I);
		FastSineTransformer_Faulty n = new FastSineTransformer_Faulty(DstNormalization.STANDARD_DST_I);
		double[] d = {0,2,3,4,5,6,7,8};
				
		FaultLocalization fl = new FaultLocalization("FastSineTransformer");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("FastSineTransformer");
		og.fst(d);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("FastSineTransformer");
				n.fst(d);
			} catch(Exception e) {
				Output.programFail("FastSineTransformer");
			}
		}
		fl.run();
	}
}
