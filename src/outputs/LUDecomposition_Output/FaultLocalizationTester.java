package outputs.LUDecomposition_Output;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		double[][] ma = {{1,2},{3,4}};
		RealMatrix m = MatrixUtils.createRealMatrix(ma);
		
		FaultLocalization fl = new FaultLocalization("LUDecomposition");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("LUDecomposition");
		LUDecomposition og = new LUDecomposition(m,0.5);
		og.getSolver().solve(m);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {			
				Output.newExecution("LUDecomposition");
				LUDecomposition_Faulty n = new LUDecomposition_Faulty(m,0.5);
				n.getSolver().solve(m);
			} catch(Exception e) {
				Output.programFail("LUDecomposition");
			}
		}
		fl.run();
	}
}
