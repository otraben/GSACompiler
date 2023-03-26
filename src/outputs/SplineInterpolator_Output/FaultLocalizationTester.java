package outputs.SplineInterpolator_Output;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		double[] x = {1,2,3,4};
		double[] y = {5,6,7,8};
		
		FaultLocalization fl = new FaultLocalization("SplineInterpolator");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("SplineInterpolator");
		SplineInterpolator og = new SplineInterpolator();
		og.interpolate(x,y);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("SplineInterpolator");
				SplineInterpolator_Faulty n = new SplineInterpolator_Faulty();
				n.interpolate(x, y);
			} catch(Exception e) {
				Output.programFail("SplineInterpolator");
			}
		}
		fl.run();
	}
}
