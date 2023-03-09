package outputs.SingularValueDecomposition_Output;

import Jama.Matrix;
import gsa.FaultLocalization;

import gsa.Output;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		double[][] mv = {{1,2},{3,4}};
		Matrix m = new Matrix(mv);
		
		FaultLocalization fl = new FaultLocalization("SingularValueDecomposition");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("SingularValueDecomposition");
		SingularValueDecomposition og = new SingularValueDecomposition(m);
		og.rank();
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("SingularValueDecomposition");
				SingularValueDecomposition_Faulty n = new SingularValueDecomposition_Faulty(m);
				n.rank();
			} catch(Exception e) {
				Output.programFail("SingularValueDecomposition");
			}
		}
		fl.run();
	}
}
