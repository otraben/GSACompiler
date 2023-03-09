package outputs.QRDecomposition_Output;

import Jama.Matrix;
import gsa.FaultLocalization;

import gsa.Output;
import outputs.LUDecomposition_Output.LUDecomposition;
import outputs.LUDecomposition_Output.LUDecomposition_Faulty;
public class FaultLocalizationTester {

	public static void main(String[] args) {
		// JAMA
		double[][] mv = {{1,2},{3,4}};
		Matrix m = new Matrix(mv);
		QRDecomposition og = new QRDecomposition(m);
		QRDecomposition_Faulty n = new QRDecomposition_Faulty(m);
		
		FaultLocalization fl = new FaultLocalization("QRDecomposition");
		fl.clearFiles();
		String[] a = {};
		Output.newExecution("QRDecomposition");
		og.getH();
		for(int i=0; i<fl.numberOfExecutions; i++) {
			try {
				Output.newExecution("QRDecomposition");
				n.getH();
			} catch(Exception e) {
				Output.programFail("QRDecomposition");
			}
		}
		fl.run();
	}
}
