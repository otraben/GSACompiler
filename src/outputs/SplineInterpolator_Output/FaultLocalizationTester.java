package outputs.SplineInterpolator_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		SplineInterpolator og = new SplineInterpolator();
		SplineInterpolator_Faulty n = new SplineInterpolator_Faulty();
		double[] x = {1,2,3};
		double[] y = {4,5,6};
		
		FaultLocalization fl = new FaultLocalization("SplineInterpolator");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("SplineInterpolator");
		og.interpolate(x,y);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("SplineInterpolator");
				n.interpolate(x, y);
			} catch(Exception e) {
				Output.programFail("SplineInterpolator");
			}
		}
		fl.run();
	}
}
