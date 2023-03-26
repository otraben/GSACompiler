package outputs.CholeskyDecomposition_Output;
import gsa.Fluky;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import Jama.Matrix;

/** Cholesky Decomposition.
   <P>
   For a symmetric, positive definite matrix A, the Cholesky decomposition
   is an lower triangular matrix L so that A = L*L'.
   <P>
   If the matrix is not symmetric or positive definite, the constructor
   returns a partial decomposition and sets an internal flag that may
   be queried by the isSPD() method.
   */

public class CholeskyDecomposition_Faulty implements java.io.Serializable {

/* ------------------------
   Class variables
 * ------------------------ */

   /** Array for internal storage of decomposition.
   @serial internal array storage.
   */
   private double[][] L;

   /** Row and column dimension (square matrix).
   @serial matrix dimension.
   */
   private int n;

   /** Symmetric and positive definite flag.
   @serial is symmetric and positive definite flag.
   */
   private boolean isspd;

/* ------------------------
   Constructor
 * ------------------------ */

   /** Cholesky algorithm for symmetric and positive definite matrix.
       Structure to access L and isspd flag.
   @param  Arg   Square, symmetric matrix.
   */

   public CholeskyDecomposition_Faulty (Matrix Arg) {
		// formal parameters
		Var<Matrix> Arg_0 = new Var<Matrix>(Arg);
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 45, "Arg_0", Arg_0.value);

		// all variables are declared to null
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Double> d_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> k_1 = null;
		Var<Integer> j_3 = null;
		Var<Integer> k_2 = null;
		Var<Double> s_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> k_3 = null;
		Var<Integer> i_2 = null;
		Var<Double> s_1 = null;
		Var<Integer> i_3 = null;
		Var<Double> s_2 = null;
		Var<Integer> i_4 = null;
		Var<Double> s_3 = null;
		Var<Double> d_1 = null;
		Var<Integer> k_4 = null;
		Var<Double> d_2 = null;
		Var<Integer> k_5 = null;
		Var<Double> d_3 = null;
		Var<Integer> k_6 = null;
		Var<Integer> k_7 = null;
		Var<Integer> k_8 = null;
		Var<Integer> j_4 = null;
		Var<Integer> k_9 = null;
		Var<Integer> k_10 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;


     // Initialize.
      
		/* PROGRAM STARTS */
		double A[][] = Arg_0.value.getArray();
      n = Arg_0.value.getRowDimension();
      L = new double[n][n];
      isspd = (Arg_0.value.getColumnDimension() == n);
      // Main loop.
      j_0 = new Var<Integer>((0));
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 54, "j_0", j_0.value);
		j_1 = new Var<Integer>((j_0.value));
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 54, "j_1", j_1.value);
		j_2 = new Var<Integer>((j_1.value));
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 54, "j_2", j_2.value);
		while(Phi.Entry(j_2,j_5).value < n) {
         double Lrowj[] = L[Phi.Entry(j_2,j_5).value];
         d_0 = new Var<Double>((double)(0.0));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "d_0", d_0.value);
         k_0 = new Var<Integer>((0));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "k_0", k_0.value);
			k_1 = new Var<Integer>((k_0.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "k_1", k_1.value);
			j_3 = new Var<Integer>((Phi.Entry(j_2,j_5).value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "j_3", j_3.value);
			k_2 = new Var<Integer>((k_1.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 58, "k_2", k_2.value);
			while(Phi.Entry(k_2,k_4).value < Phi.Entry(j_3,j_5).value) {
            double Lrowk[] = L[Phi.Entry(k_2,k_4).value];
            s_0 = new Var<Double>((double)(0.0));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "s_0", s_0.value);
            i_0 = new Var<Integer>((0));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "i_0", i_0.value);
				i_1 = new Var<Integer>((i_0.value));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 58, "i_1", i_1.value);
				k_3 = new Var<Integer>((Phi.Entry(k_2,k_4).value));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 59, "k_3", k_3.value);
				i_2 = new Var<Integer>((i_1.value));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "i_2", i_2.value);
				while(Phi.Entry(i_2,i_3).value < Phi.Entry(k_3,k_4).value) {
               s_1 = new Var<Double>((double)(Phi.Entry(s_0,s_1).value + Lrowk[Phi.Entry(i_2,i_3).value]*Lrowj[Phi.Entry(i_2,i_3).value]));
					Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "s_1", s_1.value);
            	i_3 = new Var<Integer>((Phi.Entry(i_2,i_3).value + 1));
					Output.record("CholeskyDecomposition", "CholeskyDecomposition", 61, "i_3", i_3.value);
				}
				s_2 = Phi.Exit(s_0,s_1);
				s_1 = null;
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "s_2", s_2.value);
				i_4 = Phi.Exit(i_2,i_3);
				i_3 = null;
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "i_4", i_4.value);
            s_3 = new Var<Double>((double)((A[Phi.Entry(j_2,j_3).value][k_3.value]-s_2.value)/L[k_3.value][k_3.value]));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 62, "s_3", s_3.value);
				Lrowj[k_3.value] = s_3.value;
            d_1 = new Var<Double>((double)(Phi.Entry(d_0,d_1).value + s_3.value*s_3.value));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 64, "d_1", d_1.value);
            isspd = isspd & (A[k_3.value][Phi.Entry(j_3,j_5).value] == A[Phi.Entry(j_3,j_5).value][k_3.value]); 
         	k_4 = new Var<Integer>((k_3.value + 1));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 65, "k_4", k_4.value);
			}
			d_2 = Phi.Exit(d_0,d_1);
			d_1 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 59, "d_2", d_2.value);
			k_5 = Phi.Exit(k_2,k_4);
			k_4 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 59, "k_5", k_5.value);
         d_3 = new Var<Double>((double)(A[j_3.value][j_3.value] - d_2.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 67, "d_3", d_3.value);
         isspd = isspd & (d_3.value > 0.0);
         L[j_3.value][j_3.value] = Math.sqrt(Math.max(d_3.value,0.0));
         k_6 = new Var<Integer>((j_3.value+1));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 69, "k_6", k_6.value);
			k_7 = new Var<Integer>((k_6.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 69, "k_7", k_7.value);
			k_8 = new Var<Integer>((k_7.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 68, "k_8", k_8.value);
			j_4 = new Var<Integer>((j_3.value));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 69, "j_4", j_4.value);
			while(Phi.Entry(k_8,k_9).value < n) {
            L[Phi.Entry(j_4,j_5).value][Phi.Entry(k_8,k_9).value] = 0.0;
         	k_9 = new Var<Integer>((Phi.Entry(k_8,k_9).value + 1));
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 71, "k_9", k_9.value);
			}
			k_10 = Phi.Exit(k_8,k_9);
			k_9 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 70, "k_10", k_10.value);
      	j_5 = new Var<Integer>((j_4.value + 1));
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 72, "j_5", j_5.value);
		}
		j_6 = Phi.Exit(j_2,j_5);
		j_5 = null;
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 55, "j_6", j_6.value);
   }

/* ------------------------
   Temporary, experimental code.
 * ------------------------ *\

   \** Right Triangular Cholesky Decomposition.
   <P>
   For a symmetric, positive definite matrix A, the Right Cholesky
   decomposition is an upper triangular matrix R so that A = R'*R.
   This constructor computes R with the Fortran inspired column oriented
   algorithm used in LINPACK and MATLAB.  In Java, we suspect a row oriented,
   lower triangular decomposition is faster.  We have temporarily included
   this constructor here until timing experiments confirm this suspicion.
   *\

   \** Array for internal storage of right triangular decomposition. **\
   private transient double[][] R;

   \** Cholesky algorithm for symmetric and positive definite matrix.
   @param  A           Square, symmetric matrix.
   @param  rightflag   Actual value ignored.
   @return             Structure to access R and isspd flag.
   *\

   public CholeskyDecomposition (Matrix Arg, int rightflag) {
      // Initialize.
      double[][] A = Arg.getArray();
      n = Arg.getColumnDimension();
      R = new double[n][n];
      isspd = (Arg.getColumnDimension() == n);
      // Main loop.
      for (int j = 0; j < n; j++) {
         double d = 0.0;
         for (int k = 0; k < j; k++) {
            double s = A[k][j];
            for (int i = 0; i < k; i++) {
               s = s - R[i][k]*R[i][j];
            }
            R[k][j] = s = s/R[k][k];
            d = d + s*s;
            isspd = isspd & (A[k][j] == A[j][k]); 
         }
         d = A[j][j] - d;
         isspd = isspd & (d > 0.0);
         R[j][j] = Math.sqrt(Math.max(d,0.0));
         for (int k = j+1; k < n; k++) {
            R[k][j] = 0.0;
         }
      }
   }

   \** Return upper triangular factor.
   @return     R
   *\

   public Matrix getR () {
      return new Matrix(R,n,n);
   }

\* ------------------------
   End of temporary code.
 * ------------------------ */

/* ------------------------
   Public Methods
 * ------------------------ */

   /** Is the matrix symmetric and positive definite?
   @return     true if A is symmetric and positive definite.
   */

   public boolean isSPD () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return isspd;
   }

   /** Return triangular factor.
   @return     L
   */

   public Matrix getL () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return new Matrix(L,n,n);
   }

   /** Solve A*X = B
   @param  B   A Matrix with as many rows as A and any number of columns.
   @return     X so that L*L'*X = B
   @exception  IllegalArgumentException  Matrix row dimensions must agree.
   @exception  RuntimeException  Matrix is not symmetric positive definite.
   */

   public Matrix solve (Matrix B) {
		// formal parameters
		Var<Matrix> B_0 = new Var<Matrix>(B);
		Output.record("CholeskyDecomposition", "solve", 165, "B_0", B_0.value);

		// all variables are declared to null
		Var<Integer> nx_0 = null;
		Var<Integer> k_11 = null;
		Var<Integer> k_12 = null;
		Var<Integer> k_13 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> nx_1 = null;
		Var<Integer> j_9 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> k_14 = null;
		Var<Integer> i_7 = null;
		Var<Integer> i_8 = null;
		Var<Integer> i_9 = null;
		Var<Integer> j_10 = null;
		Var<Integer> j_11 = null;
		Var<Integer> k_15 = null;
		Var<Integer> k_16 = null;
		Var<Integer> nx_2 = null;
		Var<Integer> k_17 = null;
		Var<Integer> k_18 = null;
		Var<Integer> k_19 = null;
		Var<Integer> k_20 = null;
		Var<Integer> j_12 = null;
		Var<Integer> j_13 = null;
		Var<Integer> nx_3 = null;
		Var<Integer> j_14 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Integer> i_12 = null;
		Var<Integer> k_21 = null;
		Var<Integer> i_13 = null;
		Var<Integer> i_14 = null;
		Var<Integer> j_15 = null;
		Var<Integer> j_16 = null;
		Var<Integer> k_22 = null;
		Var<Integer> k_23 = null;
		Var<Integer> nx_4 = null;
		Var<Integer> k_24 = null;
      
		/* PROGRAM STARTS */
		if (B_0.value.getRowDimension() != n) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      if (!isspd) {
         throw new RuntimeException("Matrix is not symmetric positive definite.");
      }

      // Copy right hand side.
      double X[][] = B_0.value.getArrayCopy();
      nx_0 = new Var<Integer>((B_0.value.getColumnDimension()));
		Output.record("CholeskyDecomposition", "solve", 175, "nx_0", nx_0.value);

	      // Solve L*Y = B;
	      k_11 = new Var<Integer>((0));
		Output.record("CholeskyDecomposition", "solve", 178, "k_11", k_11.value);
		k_12 = new Var<Integer>((k_11.value));
		Output.record("CholeskyDecomposition", "solve", 178, "k_12", k_12.value);
		k_13 = new Var<Integer>((k_12.value));
		Output.record("CholeskyDecomposition", "solve", 178, "k_13", k_13.value);
		while(Phi.Entry(k_13,k_16).value < n) {
	        j_7 = new Var<Integer>((0));
			Output.record("CholeskyDecomposition", "solve", 179, "j_7", j_7.value);
			j_8 = new Var<Integer>((j_7.value));
			Output.record("CholeskyDecomposition", "solve", 179, "j_8", j_8.value);
			nx_1 = new Var<Integer>((Phi.Entry(nx_0,nx_1).value));
			Output.record("CholeskyDecomposition", "solve", 179, "nx_1", nx_1.value);
			j_9 = new Var<Integer>((j_8.value));
			Output.record("CholeskyDecomposition", "solve", 180, "j_9", j_9.value);
			while(Phi.Entry(j_9,j_10).value < Phi.Entry(nx_1,nx_1).value) {
	           i_5 = new Var<Integer>((0));
				Output.record("CholeskyDecomposition", "solve", 180, "i_5", i_5.value);
				i_6 = new Var<Integer>((i_5.value));
				Output.record("CholeskyDecomposition", "solve", 179, "i_6", i_6.value);
				k_14 = new Var<Integer>((Phi.Entry(k_13,k_14).value));
				Output.record("CholeskyDecomposition", "solve", 179, "k_14", k_14.value);
				i_7 = new Var<Integer>((i_6.value));
				Output.record("CholeskyDecomposition", "solve", 179, "i_7", i_7.value);
				while(Phi.Entry(i_7,i_8).value < Phi.Entry(k_14,k_16).value) {
	               X[Phi.Entry(k_14,k_16).value][Phi.Entry(j_9,j_10).value] = X[Phi.Entry(k_14,k_16).value][Phi.Entry(j_9,j_10).value] - X[Phi.Entry(i_7,i_8).value][Phi.Entry(j_9,j_10).value]*L[Phi.Entry(k_14,k_16).value][Phi.Entry(i_7,i_8).value];
	           	i_8 = new Var<Integer>((Phi.Entry(i_7,i_8).value + 1));
					Output.record("CholeskyDecomposition", "solve", 181, "i_8", i_8.value);
				}
				i_9 = Phi.Exit(i_7,i_8);
				i_8 = null;
				Output.record("CholeskyDecomposition", "solve", 179, "i_9", i_9.value);
	           X[k_14.value][Phi.Entry(j_9,j_10).value] = X[k_14.value][Phi.Entry(j_9,j_10).value] / L[k_14.value][k_14.value];
	        	j_10 = new Var<Integer>((Phi.Entry(j_9,j_10).value + 1));
				Output.record("CholeskyDecomposition", "solve", 183, "j_10", j_10.value);
			}
			j_11 = Phi.Exit(j_9,j_10);
			j_10 = null;
			Output.record("CholeskyDecomposition", "solve", 180, "j_11", j_11.value);
			k_15 = Phi.Exit(k_13,k_14);
			k_14 = null;
			Output.record("CholeskyDecomposition", "solve", 180, "k_15", k_15.value);
	      	k_16 = new Var<Integer>((Phi.Entry(k_13,k_16).value + 1));
			Output.record("CholeskyDecomposition", "solve", 184, "k_16", k_16.value);
		}
		nx_2 = Phi.Exit(nx_0,nx_1);
		nx_1 = null;
		Output.record("CholeskyDecomposition", "solve", 179, "nx_2", nx_2.value);
		k_17 = Phi.Exit(k_13,k_16);
		k_16 = null;
		Output.record("CholeskyDecomposition", "solve", 179, "k_17", k_17.value);
	
	      // Solve L'*X = Y;
	      k_18 = new Var<Integer>((n-1));
		Output.record("CholeskyDecomposition", "solve", 188, "k_18", k_18.value);
		k_19 = new Var<Integer>((k_18.value));
		Output.record("CholeskyDecomposition", "solve", 188, "k_19", k_19.value);
		k_20 = new Var<Integer>((k_19.value));
		Output.record("CholeskyDecomposition", "solve", 188, "k_20", k_20.value);
		while(Phi.Entry(k_20,k_23).value >= 0) {
	        j_12 = new Var<Integer>((0));
			Output.record("CholeskyDecomposition", "solve", 189, "j_12", j_12.value);
			j_13 = new Var<Integer>((j_12.value));
			Output.record("CholeskyDecomposition", "solve", 189, "j_13", j_13.value);
			nx_3 = new Var<Integer>((Phi.Entry(nx_2,nx_3).value));
			Output.record("CholeskyDecomposition", "solve", 189, "nx_3", nx_3.value);
			j_14 = new Var<Integer>((j_13.value));
			Output.record("CholeskyDecomposition", "solve", 190, "j_14", j_14.value);
			while(Phi.Entry(j_14,j_15).value < Phi.Entry(nx_3,nx_3).value) {
	           i_10 = new Var<Integer>((Phi.Entry(k_20,k_21).value+1));
				Output.record("CholeskyDecomposition", "solve", 190, "i_10", i_10.value);
				i_11 = new Var<Integer>((i_10.value));
				Output.record("CholeskyDecomposition", "solve", 189, "i_11", i_11.value);
				i_12 = new Var<Integer>((i_11.value));
				Output.record("CholeskyDecomposition", "solve", 189, "i_12", i_12.value);
				k_21 = new Var<Integer>((Phi.Entry(k_20,k_21).value));
				Output.record("CholeskyDecomposition", "solve", 189, "k_21", k_21.value);
				while(Phi.Entry(i_12,i_13).value < n) {
	               X[Phi.Entry(k_21,k_23).value][Phi.Entry(j_14,j_15).value] = X[Phi.Entry(k_21,k_23).value][Phi.Entry(j_14,j_15).value] - X[Phi.Entry(i_12,i_13).value][Phi.Entry(j_14,j_15).value]*L[Phi.Entry(i_12,i_13).value][Phi.Entry(k_21,k_23).value];
	           	i_13 = new Var<Integer>((Phi.Entry(i_12,i_13).value + 1));
					Output.record("CholeskyDecomposition", "solve", 191, "i_13", i_13.value);
				}
				i_14 = Phi.Exit(i_12,i_13);
				i_13 = null;
				Output.record("CholeskyDecomposition", "solve", 189, "i_14", i_14.value);
	           X[k_21.value][Phi.Entry(j_14,j_15).value] = X[k_21.value][Phi.Entry(j_14,j_15).value] / L[k_21.value][k_21.value];
	        	j_15 = new Var<Integer>(Fluky.flukyInt((Phi.Entry(j_14,j_15).value + 1), 0.99));
				Output.record("CholeskyDecomposition", "solve", 193, "j_15", j_15.value);
			}
			j_16 = Phi.Exit(j_14,j_15);
			j_15 = null;
			Output.record("CholeskyDecomposition", "solve", 190, "j_16", j_16.value);
			k_22 = Phi.Exit(k_20,k_21);
			k_21 = null;
			Output.record("CholeskyDecomposition", "solve", 190, "k_22", k_22.value);
	      	k_23 = new Var<Integer>((Phi.Entry(k_20,k_23).value - 1));
			Output.record("CholeskyDecomposition", "solve", 194, "k_23", k_23.value);
		}
		nx_4 = Phi.Exit(nx_2,nx_3);
		nx_3 = null;
		Output.record("CholeskyDecomposition", "solve", 189, "nx_4", nx_4.value);
		k_24 = Phi.Exit(k_20,k_23);
		k_23 = null;
		Output.record("CholeskyDecomposition", "solve", 189, "k_24", k_24.value);
      
		Output.recordProgramOutput("CholeskyDecomposition", X[n-1][nx_4.value-1], true);
      return new Matrix(X,n,nx_4.value);
   }
  private static final long serialVersionUID = 1;

}

