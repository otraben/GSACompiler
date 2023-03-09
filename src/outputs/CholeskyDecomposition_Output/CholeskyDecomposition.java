package outputs.CholeskyDecomposition_Output;
import Jama.Matrix;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


   /** Cholesky Decomposition.
   <P>
   For a symmetric, positive definite matrix A, the Cholesky decomposition
   is an lower triangular matrix L so that A = L*L'.
   <P>
   If the matrix is not symmetric or positive definite, the constructor
   returns a partial decomposition and sets an internal flag that may
   be queried by the isSPD() method.
   */

public class CholeskyDecomposition implements java.io.Serializable {

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

   public CholeskyDecomposition (Matrix Arg) {
		// formal parameters
		Var<Matrix> Arg_0 = new Var<Matrix>(Arg);
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 43, "Arg_0", Arg_0.value);

		// all variables are declared to null
		Var<Integer> j_0 = null;
		Var<Double> d_0 = null;
		Var<Integer> k_0 = null;
		Var<Double> s_0 = null;
		Var<Integer> i_0 = null;
		Var<Double> s_1 = null;
		Var<Integer> i_1 = null;
		Var<Double> s_2 = null;
		Var<Integer> i_2 = null;
		Var<Double> s_3 = null;
		Var<Double> d_1 = null;
		Var<Integer> k_1 = null;
		Var<Double> d_2 = null;
		Var<Integer> k_2 = null;
		Var<Double> d_3 = null;
		Var<Integer> k_3 = null;
		Var<Integer> k_4 = null;
		Var<Integer> k_5 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;


     // Initialize.
      
		/* PROGRAM STARTS */
		double A[][] = Arg_0.value.getArray();
      n = Arg_0.value.getRowDimension();
      L = new double[n][n];
      isspd = (Arg_0.value.getColumnDimension() == n);
      // Main loop.
      j_0 = new Var<Integer>(0);
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 52, "j_0", j_0.value);
		while(Phi.Entry(j_0,j_1).value < n) {
         double Lrowj[] = L[Phi.Entry(j_0,j_1).value];
         d_0 = new Var<Double>((double)0.0);
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 55, "d_0", d_0.value);
         k_0 = new Var<Integer>(0);
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 56, "k_0", k_0.value);
			while(Phi.Entry(k_0,k_1).value < Phi.Entry(j_0,j_1).value) {
            double Lrowk[] = L[Phi.Entry(k_0,k_1).value];
            s_0 = new Var<Double>((double)0.0);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 56, "s_0", s_0.value);
            i_0 = new Var<Integer>(0);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "i_0", i_0.value);
				while(Phi.Entry(i_0,i_1).value < Phi.Entry(k_0,k_1).value) {
               s_1 = new Var<Double>((double)Phi.Entry(s_0,s_1).value + Lrowk[Phi.Entry(i_0,i_1).value]*Lrowj[Phi.Entry(i_0,i_1).value]);
					Output.record("CholeskyDecomposition", "CholeskyDecomposition", 58, "s_1", s_1.value);
            	i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
					Output.record("CholeskyDecomposition", "CholeskyDecomposition", 59, "i_1", i_1.value);
				}
				s_2 = Phi.Exit(s_0,s_1);
				s_1 = null;
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "s_2", s_2.value);
				i_2 = Phi.Exit(i_0,i_1);
				i_1 = null;
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "i_2", i_2.value);
            s_3 = new Var<Double>((double)(A[Phi.Entry(j_0,j_1).value][Phi.Entry(k_0,k_1).value]-s_2.value)/L[Phi.Entry(k_0,k_1).value][Phi.Entry(k_0,k_1).value]);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 60, "s_3", s_3.value);
				Lrowj[Phi.Entry(k_0,k_1).value] = s_3.value;
            d_1 = new Var<Double>((double)Phi.Entry(d_0,d_1).value + s_3.value*s_3.value);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 62, "d_1", d_1.value);
            isspd = isspd & (A[Phi.Entry(k_0,k_1).value][Phi.Entry(j_0,j_1).value] == A[Phi.Entry(j_0,j_1).value][Phi.Entry(k_0,k_1).value]); 
         	k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value + 1);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 63, "k_1", k_1.value);
			}
			d_2 = Phi.Exit(d_0,d_1);
			d_1 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "d_2", d_2.value);
			k_2 = Phi.Exit(k_0,k_1);
			k_1 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 57, "k_2", k_2.value);
         d_3 = new Var<Double>((double)A[Phi.Entry(j_0,j_1).value][Phi.Entry(j_0,j_1).value] - d_2.value);
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 65, "d_3", d_3.value);
         isspd = isspd & (d_3.value > 0.0);
         L[Phi.Entry(j_0,j_1).value][Phi.Entry(j_0,j_1).value] = Math.sqrt(Math.max(d_3.value,0.0));
         k_3 = new Var<Integer>(Phi.Entry(j_0,j_1).value+1);
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 67, "k_3", k_3.value);
			while(Phi.Entry(k_3,k_4).value < n) {
            L[Phi.Entry(j_0,j_1).value][Phi.Entry(k_3,k_4).value] = 0.0;
         	k_4 = new Var<Integer>(Phi.Entry(k_3,k_4).value + 1);
				Output.record("CholeskyDecomposition", "CholeskyDecomposition", 69, "k_4", k_4.value);
			}
			k_5 = Phi.Exit(k_3,k_4);
			k_4 = null;
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 68, "k_5", k_5.value);
      	j_1 = new Var<Integer>(Phi.Entry(j_0,j_1).value + 1);
			Output.record("CholeskyDecomposition", "CholeskyDecomposition", 70, "j_1", j_1.value);
		}
		j_2 = Phi.Exit(j_0,j_1);
		Output.record("CholeskyDecomposition", "CholeskyDecomposition", 53, "j_2", j_2.value);
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
		Output.record("CholeskyDecomposition", "solve", 163, "B_0", B_0.value);

		// all variables are declared to null
		Var<Matrix> B_1 = null;
		Var<Integer> nx_0 = null;
		Var<Integer> k_6 = null;
		Var<Integer> j_3 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Integer> j_4 = null;
		Var<Integer> j_5 = null;
		Var<Integer> k_7 = null;
		Var<Integer> k_8 = null;
		Var<Integer> k_9 = null;
		Var<Integer> j_6 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> i_8 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> k_10 = null;
		Var<Integer> k_11 = null;
      
		/* PROGRAM STARTS */
		n = n;
B_1 = new Var<Matrix>(B_0.value);
		Output.record("CholeskyDecomposition", "solve", 164, "B_1", B_1.value);
if (B_1.value.getRowDimension() != n) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      isspd = isspd;
if (!isspd) {
         throw new RuntimeException("Matrix is not symmetric positive definite.");
      }

      // Copy right hand side.
      double X[][] = B_1.value.getArrayCopy();
      nx_0 = new Var<Integer>(B_1.value.getColumnDimension());
		Output.record("CholeskyDecomposition", "solve", 173, "nx_0", nx_0.value);

	      // Solve L*Y = B;
	      k_6 = new Var<Integer>(0);
		Output.record("CholeskyDecomposition", "solve", 176, "k_6", k_6.value);
		while(Phi.Entry(k_6,k_7).value < n) {
	        j_3 = new Var<Integer>(0);
			Output.record("CholeskyDecomposition", "solve", 177, "j_3", j_3.value);
			while(Phi.Entry(j_3,j_4).value < Phi.Entry(nx_0,nx_0).value) {
	           i_3 = new Var<Integer>(0);
				Output.record("CholeskyDecomposition", "solve", 177, "i_3", i_3.value);
				while(Phi.Entry(i_3,i_4).value < Phi.Entry(k_6,k_7).value) {
	               X[Phi.Entry(k_6,k_7).value][Phi.Entry(j_3,j_4).value] = X[Phi.Entry(k_6,k_7).value][Phi.Entry(j_3,j_4).value] - X[Phi.Entry(i_3,i_4).value][Phi.Entry(j_3,j_4).value]*L[Phi.Entry(k_6,k_7).value][Phi.Entry(i_3,i_4).value];
	           	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
					Output.record("CholeskyDecomposition", "solve", 179, "i_4", i_4.value);
				}
				i_5 = Phi.Exit(i_3,i_4);
				i_4 = null;
				Output.record("CholeskyDecomposition", "solve", 177, "i_5", i_5.value);
	           X[Phi.Entry(k_6,k_7).value][Phi.Entry(j_3,j_4).value] = X[Phi.Entry(k_6,k_7).value][Phi.Entry(j_3,j_4).value] / L[Phi.Entry(k_6,k_7).value][Phi.Entry(k_6,k_7).value];
	        	j_4 = new Var<Integer>(Phi.Entry(j_3,j_4).value + 1);
				Output.record("CholeskyDecomposition", "solve", 181, "j_4", j_4.value);
			}
			j_5 = Phi.Exit(j_3,j_4);
			j_4 = null;
			Output.record("CholeskyDecomposition", "solve", 177, "j_5", j_5.value);
	      	k_7 = new Var<Integer>(Phi.Entry(k_6,k_7).value + 1);
			Output.record("CholeskyDecomposition", "solve", 182, "k_7", k_7.value);
		}
		k_8 = Phi.Exit(k_6,k_7);
		Output.record("CholeskyDecomposition", "solve", 177, "k_8", k_8.value);
	
	      // Solve L'*X = Y;
	      k_9 = new Var<Integer>(n-1);
		Output.record("CholeskyDecomposition", "solve", 186, "k_9", k_9.value);
		while(Phi.Entry(k_9,k_10).value >= 0) {
	        j_6 = new Var<Integer>(0);
			Output.record("CholeskyDecomposition", "solve", 187, "j_6", j_6.value);
			while(Phi.Entry(j_6,j_7).value < Phi.Entry(nx_0,nx_0).value) {
	           i_6 = new Var<Integer>(Phi.Entry(k_9,k_10).value+1);
				Output.record("CholeskyDecomposition", "solve", 187, "i_6", i_6.value);
				while(Phi.Entry(i_6,i_7).value < n) {
	               X[Phi.Entry(k_9,k_10).value][Phi.Entry(j_6,j_7).value] = X[Phi.Entry(k_9,k_10).value][Phi.Entry(j_6,j_7).value] - X[Phi.Entry(i_6,i_7).value][Phi.Entry(j_6,j_7).value]*L[Phi.Entry(i_6,i_7).value][Phi.Entry(k_9,k_10).value];
	           	i_7 = new Var<Integer>(Phi.Entry(i_6,i_7).value + 1);
					Output.record("CholeskyDecomposition", "solve", 189, "i_7", i_7.value);
				}
				i_8 = Phi.Exit(i_6,i_7);
				i_7 = null;
				Output.record("CholeskyDecomposition", "solve", 187, "i_8", i_8.value);
	           X[Phi.Entry(k_9,k_10).value][Phi.Entry(j_6,j_7).value] = X[Phi.Entry(k_9,k_10).value][Phi.Entry(j_6,j_7).value] / L[Phi.Entry(k_9,k_10).value][Phi.Entry(k_9,k_10).value];
	        	j_7 = new Var<Integer>(Phi.Entry(j_6,j_7).value + 1);
				Output.record("CholeskyDecomposition", "solve", 191, "j_7", j_7.value);
			}
			j_8 = Phi.Exit(j_6,j_7);
			j_7 = null;
			Output.record("CholeskyDecomposition", "solve", 187, "j_8", j_8.value);
	      	k_10 = new Var<Integer>(Phi.Entry(k_9,k_10).value - 1);
			Output.record("CholeskyDecomposition", "solve", 192, "k_10", k_10.value);
		}
		k_11 = Phi.Exit(k_9,k_10);
		Output.record("CholeskyDecomposition", "solve", 187, "k_11", k_11.value);
      
      Output.recordProgramOutput("CholeskyDecomposition", X[0][0], false);
      return new Matrix(X,n,nx_0.value);
   }
  private static final long serialVersionUID = 1;

}

