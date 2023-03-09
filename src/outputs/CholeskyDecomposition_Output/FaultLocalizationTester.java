package outputs.CholeskyDecomposition_Output;

import Jama.Matrix;
import gsa.FaultLocalization;

import gsa.Output;
import outputs.LUDecomposition_Output.LUDecomposition;
import outputs.LUDecomposition_Output.LUDecomposition_Faulty;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		// JAMA
		double[][] mv = {{5,7,6,5}, {7,10,8,7}, {6,8,10,9},{5,7,9,10}};
		Matrix m = new Matrix(mv);
		CholeskyDecomposition og = new CholeskyDecomposition(m);
		CholeskyDecomposition_Faulty n = new CholeskyDecomposition_Faulty(m);
				
		FaultLocalization fl = new FaultLocalization("CholeskyDecomposition");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("CholeskyDecomposition");
		og.solve(m);
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("CholeskyDecomposition");
				n.solve(m);
			} catch(Exception e) {
				Output.programFail("CholeskyDecomposition");
			}
		}
		fl.run();
	}
}
