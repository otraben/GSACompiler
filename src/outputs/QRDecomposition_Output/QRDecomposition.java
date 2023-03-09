package outputs.QRDecomposition_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;
import Jama.Matrix;
import Jama.util.*;

/** QR Decomposition.
<P>
   For an m-by-n matrix A with m >= n, the QR decomposition is an m-by-n
   orthogonal matrix Q and an n-by-n upper triangular matrix R so that
   A = Q*R.
<P>
   The QR decompostion always exists, even if the matrix does not have
   full rank, so the constructor will never fail.  The primary use of the
   QR decomposition is in the least squares solution of nonsquare systems
   of simultaneous linear equations.  This will fail if isFullRank()
   returns false.
*/

public class QRDecomposition implements java.io.Serializable {

/* ------------------------
   Class variables
 * ------------------------ */

   /** Array for internal storage of decomposition.
   @serial internal array storage.
   */
   private double[][] QR;

   /** Row and column dimensions.
   @serial column dimension.
   @serial row dimension.
   */
   private int m;
	int  n;

   /** Array for internal storage of diagonal of R.
   @serial diagonal of R.
   */
   private double[] Rdiag;

/* ------------------------
   Constructor
 * ------------------------ */

   /** QR Decomposition, computed by Householder reflections.
       Structure to access R and the Householder vectors and compute Q.
   @param A    Rectangular matrix
   */

   public QRDecomposition (Matrix A) {
		// formal parameters
		Var<Matrix> A_0 = new Var<Matrix>(A);
		Output.record("QRDecomposition", "QRDecomposition", 48, "A_0", A_0.value);

		// all variables are declared to null
		Var<Integer> k_0 = null;
		Var<Double> nrm_0 = null;
		Var<Integer> i_0 = null;
		Var<Double> nrm_1 = null;
		Var<Integer> i_1 = null;
		Var<Double> nrm_2 = null;
		Var<Integer> i_2 = null;
		Var<Double> nrm_3 = null;
		Var<Integer> k_1 = null;
		Var<Integer> k_2 = null;
		Var<Double> nrm_4 = null;
		Var<Double> nrm_5 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Integer> j_0 = null;
		Var<Double> s_0 = null;
		Var<Integer> i_6 = null;
		Var<Double> s_1 = null;
		Var<Integer> i_7 = null;
		Var<Double> s_2 = null;
		Var<Integer> i_8 = null;
		Var<Double> s_3 = null;
		Var<Integer> i_9 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Integer> j_1 = null;
		Var<Integer> i_12 = null;
		Var<Integer> j_2 = null;
		Var<Double> nrm_6 = null;
		Var<Integer> i_13 = null;
		Var<Integer> k_3 = null;
		Var<Integer> k_4 = null;
		Var<Integer> k_5 = null;
      // Initialize.
      
		/* PROGRAM STARTS */
		QR = A_0.value.getArrayCopy();
      m = A_0.value.getRowDimension();
      n = A_0.value.getColumnDimension();
      Rdiag = new double[n];

      // Main loop.
      k_0 = new Var<Integer>(0);
		Output.record("QRDecomposition", "QRDecomposition", 56, "k_0", k_0.value);
		while(Phi.Entry(k_0,k_4).value < n) {
         // Compute 2-norm of k-th column without under/overflow.
         nrm_0 = new Var<Double>((double)0);
			Output.record("QRDecomposition", "QRDecomposition", 58, "nrm_0", nrm_0.value);
         i_0 = new Var<Integer>(Phi.Entry(k_0,k_4).value);
			Output.record("QRDecomposition", "QRDecomposition", 59, "i_0", i_0.value);
			while(Phi.Entry(i_0,i_1).value < m) {
            nrm_1 = new Var<Double>((double)Maths.hypot(Phi.Entry(nrm_0,nrm_1).value,QR[Phi.Entry(i_0,i_1).value][Phi.Entry(k_0,k_4).value]));
				Output.record("QRDecomposition", "QRDecomposition", 60, "nrm_1", nrm_1.value);
         	i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
				Output.record("QRDecomposition", "QRDecomposition", 61, "i_1", i_1.value);
			}
			nrm_2 = Phi.Exit(nrm_0,nrm_1);
			nrm_1 = null;
			Output.record("QRDecomposition", "QRDecomposition", 60, "nrm_2", nrm_2.value);
			i_2 = Phi.Exit(i_0,i_1);
			i_1 = null;
			Output.record("QRDecomposition", "QRDecomposition", 60, "i_2", i_2.value);

         nrm_3 = new Var<Double>((double)nrm_2.value);
			Output.record("QRDecomposition", "QRDecomposition", 63, "nrm_3", nrm_3.value);
if (nrm_3.value != 0.0) {
            // Form k-th Householder vector.
            k_1 = new Var<Integer>(Phi.Entry(k_0,k_4).value);
				Output.record("QRDecomposition", "QRDecomposition", 64, "k_1", k_1.value);
k_2 = new Var<Integer>(k_1.value);
				Output.record("QRDecomposition", "QRDecomposition", 64, "k_2", k_2.value);
if (QR[k_2.value][k_2.value] < 0) {
               nrm_4 = new Var<Double>((double)-nrm_3.value);
					Output.record("QRDecomposition", "QRDecomposition", 66, "nrm_4", nrm_4.value);
            }
				nrm_5 = Phi.If((QR[k_2.value][k_2.value] < 0),nrm_4,nrm_3);
				Output.record("QRDecomposition", "QRDecomposition", 65, "nrm_5", nrm_5.value);
            i_3 = new Var<Integer>(k_2.value);
				Output.record("QRDecomposition", "QRDecomposition", 67, "i_3", i_3.value);
				while(Phi.Entry(i_3,i_4).value < m) {
               QR[Phi.Entry(i_3,i_4).value][Phi.Entry(k_2,k_4).value] = QR[Phi.Entry(i_3,i_4).value][Phi.Entry(k_2,k_4).value] / Phi.Entry(nrm_5,nrm_6).value;
            	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
					Output.record("QRDecomposition", "QRDecomposition", 69, "i_4", i_4.value);
				}
				i_5 = Phi.Exit(i_3,i_4);
				i_4 = null;
				Output.record("QRDecomposition", "QRDecomposition", 68, "i_5", i_5.value);
            QR[k_2.value][k_2.value] = QR[k_2.value][k_2.value] + 1.0;

            // Apply transformation to remaining columns.
            j_0 = new Var<Integer>(k_2.value+1);
				Output.record("QRDecomposition", "QRDecomposition", 74, "j_0", j_0.value);
				while(Phi.Entry(j_0,j_1).value < n) {
               s_0 = new Var<Double>((double)0.0);
					Output.record("QRDecomposition", "QRDecomposition", 75, "s_0", s_0.value); 
               i_6 = new Var<Integer>(Phi.Entry(k_2,k_4).value);
					Output.record("QRDecomposition", "QRDecomposition", 75, "i_6", i_6.value);
					while(Phi.Entry(i_6,i_7).value < m) {
                  s_1 = new Var<Double>((double)Phi.Entry(s_0,s_1).value + QR[Phi.Entry(i_6,i_7).value][Phi.Entry(k_2,k_4).value]*QR[Phi.Entry(i_6,i_7).value][Phi.Entry(j_0,j_1).value]);
						Output.record("QRDecomposition", "QRDecomposition", 76, "s_1", s_1.value);
               	i_7 = new Var<Integer>(Phi.Entry(i_6,i_7).value + 1);
						Output.record("QRDecomposition", "QRDecomposition", 77, "i_7", i_7.value);
					}
					s_2 = Phi.Exit(s_0,s_1);
					s_1 = null;
					Output.record("QRDecomposition", "QRDecomposition", 75, "s_2", s_2.value);
					i_8 = Phi.Exit(i_6,i_7);
					i_7 = null;
					Output.record("QRDecomposition", "QRDecomposition", 75, "i_8", i_8.value);
               s_3 = new Var<Double>((double)-s_2.value/QR[Phi.Entry(k_2,k_4).value][Phi.Entry(k_2,k_4).value]);
					Output.record("QRDecomposition", "QRDecomposition", 78, "s_3", s_3.value);
               i_9 = new Var<Integer>(Phi.Entry(k_2,k_4).value);
					Output.record("QRDecomposition", "QRDecomposition", 79, "i_9", i_9.value);
					while(Phi.Entry(i_9,i_10).value < m) {
                  QR[Phi.Entry(i_9,i_10).value][Phi.Entry(j_0,j_1).value] = QR[Phi.Entry(i_9,i_10).value][Phi.Entry(j_0,j_1).value] + Phi.Entry(s_3,s_3).value*QR[Phi.Entry(i_9,i_10).value][Phi.Entry(k_2,k_4).value];
               	i_10 = new Var<Integer>(Phi.Entry(i_9,i_10).value + 1);
						Output.record("QRDecomposition", "QRDecomposition", 81, "i_10", i_10.value);
					}
					i_11 = Phi.Exit(i_9,i_10);
					i_10 = null;
					Output.record("QRDecomposition", "QRDecomposition", 79, "i_11", i_11.value);
            	j_1 = new Var<Integer>(Phi.Entry(j_0,j_1).value + 1);
					Output.record("QRDecomposition", "QRDecomposition", 82, "j_1", j_1.value);
				}
				i_12 = Phi.Exit(i_5,i_11);
				i_11 = null;
				Output.record("QRDecomposition", "QRDecomposition", 74, "i_12", i_12.value);
				j_2 = Phi.Exit(j_0,j_1);
				j_1 = null;
				Output.record("QRDecomposition", "QRDecomposition", 74, "j_2", j_2.value);
         }
			nrm_6 = Phi.If((nrm_3.value != 0.0),nrm_5,nrm_3);
			Output.record("QRDecomposition", "QRDecomposition", 64, "nrm_6", nrm_6.value);
			i_13 = Phi.If((nrm_3.value != 0.0),i_12,i_2);
			Output.record("QRDecomposition", "QRDecomposition", 64, "i_13", i_13.value);
			k_3 = Phi.If((nrm_3.value != 0.0),k_2,k_0);
			Output.record("QRDecomposition", "QRDecomposition", 64, "k_3", k_3.value);
         Rdiag[k_3.value] = -nrm_6.value;
      	k_4 = new Var<Integer>(k_3.value + 1);
			Output.record("QRDecomposition", "QRDecomposition", 85, "k_4", k_4.value);
		}
		k_5 = Phi.Exit(k_0,k_4);
		Output.record("QRDecomposition", "QRDecomposition", 57, "k_5", k_5.value);
   }

/* ------------------------
   Public Methods
 * ------------------------ */

   /** Is the matrix full rank?
   @return     true if R, and hence A, has full rank.
   */

   public boolean isFullRank () {
		// formal parameters

		// all variables are declared to null
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;
      
		/* PROGRAM STARTS */
		j_3 = new Var<Integer>(0);
		Output.record("QRDecomposition", "isFullRank", 98, "j_3", j_3.value);
		while(Phi.Entry(j_3,j_5).value < n) {
         j_4 = new Var<Integer>(Phi.Entry(j_3,j_5).value);
			Output.record("QRDecomposition", "isFullRank", 98, "j_4", j_4.value);
if (Rdiag[j_4.value] == 0)
            {
				return false;
			}
      	j_5 = new Var<Integer>(j_4.value + 1);
			Output.record("QRDecomposition", "isFullRank", 100, "j_5", j_5.value);
		}
		j_6 = Phi.Exit(j_3,j_5);
		Output.record("QRDecomposition", "isFullRank", 98, "j_6", j_6.value);
      return true;
   }

   /** Return the Householder vectors
   @return     Lower trapezoidal matrix whose columns define the reflections
   */

   public Matrix getH () {
		// formal parameters

		// all variables are declared to null
		Var<Matrix> X_0 = null;
		Var<Integer> i_14 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> i_15 = null;
		Var<Integer> j_9 = null;
		Var<Integer> i_16 = null;
		Var<Integer> j_10 = null;
		Var<Integer> i_17 = null;
		Var<Integer> i_18 = null;
      
		/* PROGRAM STARTS */
		X_0 = new Var<Matrix>(new Matrix(m,n));
		Output.record("QRDecomposition", "getH", 110, "X_0", X_0.value);
      double H[][] = X_0.value.getArray();
      i_14 = new Var<Integer>(0);
		Output.record("QRDecomposition", "getH", 112, "i_14", i_14.value);
		while(Phi.Entry(i_14,i_17).value < m) {
         j_7 = new Var<Integer>(0);
			Output.record("QRDecomposition", "getH", 110, "j_7", j_7.value);
			while(Phi.Entry(j_7,j_9).value < n) {
            j_8 = new Var<Integer>(Phi.Entry(j_7,j_9).value);
				Output.record("QRDecomposition", "getH", 112, "j_8", j_8.value);
i_15 = new Var<Integer>(Phi.Entry(i_14,i_15).value);
				Output.record("QRDecomposition", "getH", 113, "i_15", i_15.value);
if (i_15.value >= j_8.value) {
               H[i_15.value][j_8.value] = QR[i_15.value][j_8.value];
            } else {
               H[i_15.value][j_8.value] = 0.0;
            }
         	j_9 = new Var<Integer>(j_8.value + 1);
				Output.record("QRDecomposition", "getH", 117, "j_9", j_9.value);
			}
			i_16 = Phi.Exit(i_14,i_15);
			Output.record("QRDecomposition", "getH", 111, "i_16", i_16.value);
			j_10 = Phi.Exit(j_7,j_9);
			j_9 = null;
			Output.record("QRDecomposition", "getH", 111, "j_10", j_10.value);
      	i_17 = new Var<Integer>(Phi.Entry(i_16,i_17).value + 1);
			Output.record("QRDecomposition", "getH", 119, "i_17", i_17.value);
		}
		i_18 = Phi.Exit(i_14,i_17);
		Output.record("QRDecomposition", "getH", 111, "i_18", i_18.value);
		Output.recordProgramOutput("QRDecomposition", X_0.value.get(0,0), false);
      return X_0.value;
   }

   /** Return the upper triangular factor
   @return     R
   */

   public Matrix getR () {
		// formal parameters

		// all variables are declared to null
		Var<Matrix> X_1 = null;
		Var<Integer> i_19 = null;
		Var<Integer> j_11 = null;
		Var<Integer> j_12 = null;
		Var<Integer> i_20 = null;
		Var<Integer> j_13 = null;
		Var<Integer> i_21 = null;
		Var<Integer> j_14 = null;
		Var<Integer> i_22 = null;
		Var<Integer> j_15 = null;
		Var<Integer> i_23 = null;
		Var<Integer> i_24 = null;
      
		/* PROGRAM STARTS */
		X_1 = new Var<Matrix>(new Matrix(n,n));
		Output.record("QRDecomposition", "getR", 129, "X_1", X_1.value);
      double R[][] = X_1.value.getArray();
      i_19 = new Var<Integer>(0);
		Output.record("QRDecomposition", "getR", 131, "i_19", i_19.value);
		while(Phi.Entry(i_19,i_23).value < n) {
         j_11 = new Var<Integer>(0);
			Output.record("QRDecomposition", "getR", 131, "j_11", j_11.value);
			while(Phi.Entry(j_11,j_14).value < n) {
            j_12 = new Var<Integer>(Phi.Entry(j_11,j_14).value);
				Output.record("QRDecomposition", "getR", 131, "j_12", j_12.value);
i_20 = new Var<Integer>(Phi.Entry(i_19,i_21).value);
				Output.record("QRDecomposition", "getR", 131, "i_20", i_20.value);
j_13 = new Var<Integer>(j_12.value);
				Output.record("QRDecomposition", "getR", 131, "j_13", j_13.value);
i_21 = new Var<Integer>(i_20.value);
				Output.record("QRDecomposition", "getR", 132, "i_21", i_21.value);
if (i_21.value < j_13.value) {
               R[i_21.value][j_13.value] = QR[i_21.value][j_13.value];
            } else if (i_21.value == j_13.value) {
               R[i_21.value][j_13.value] = Rdiag[i_21.value];
            } else {
               R[i_21.value][j_13.value] = 0.0;
            }
         	j_14 = new Var<Integer>(j_13.value + 1);
				Output.record("QRDecomposition", "getR", 138, "j_14", j_14.value);
			}
			i_22 = Phi.Exit(i_19,i_21);
			Output.record("QRDecomposition", "getR", 131, "i_22", i_22.value);
			j_15 = Phi.Exit(j_11,j_14);
			j_14 = null;
			Output.record("QRDecomposition", "getR", 131, "j_15", j_15.value);
      	i_23 = new Var<Integer>(Phi.Entry(i_22,i_23).value + 1);
			Output.record("QRDecomposition", "getR", 140, "i_23", i_23.value);
		}
		i_24 = Phi.Exit(i_19,i_23);
		Output.record("QRDecomposition", "getR", 131, "i_24", i_24.value);
      return X_1.value;
   }

   /** Generate and return the (economy-sized) orthogonal factor
   @return     Q
   */

   public Matrix getQ () {
		// formal parameters

		// all variables are declared to null
		Var<Matrix> X_2 = null;
		Var<Integer> k_6 = null;
		Var<Integer> i_25 = null;
		Var<Integer> i_26 = null;
		Var<Integer> i_27 = null;
		Var<Integer> j_16 = null;
		Var<Integer> k_7 = null;
		Var<Integer> k_8 = null;
		Var<Double> s_4 = null;
		Var<Integer> i_28 = null;
		Var<Double> s_5 = null;
		Var<Integer> i_29 = null;
		Var<Double> s_6 = null;
		Var<Integer> i_30 = null;
		Var<Double> s_7 = null;
		Var<Integer> i_31 = null;
		Var<Integer> i_32 = null;
		Var<Integer> i_33 = null;
		Var<Integer> i_34 = null;
		Var<Integer> j_17 = null;
		Var<Integer> i_35 = null;
		Var<Integer> j_18 = null;
		Var<Integer> k_9 = null;
		Var<Integer> k_10 = null;
		Var<Integer> k_11 = null;
      
		/* PROGRAM STARTS */
		X_2 = new Var<Matrix>(new Matrix(m,n));
		Output.record("QRDecomposition", "getQ", 150, "X_2", X_2.value);
      double Q[][] = X_2.value.getArray();
      k_6 = new Var<Integer>(n-1);
		Output.record("QRDecomposition", "getQ", 151, "k_6", k_6.value);
		while(Phi.Entry(k_6,k_10).value >= 0) {
         i_25 = new Var<Integer>(0);
			Output.record("QRDecomposition", "getQ", 152, "i_25", i_25.value);
			while(Phi.Entry(i_25,i_26).value < m) {
            Q[Phi.Entry(i_25,i_26).value][Phi.Entry(k_6,k_10).value] = 0.0;
         	i_26 = new Var<Integer>(Phi.Entry(i_25,i_26).value + 1);
				Output.record("QRDecomposition", "getQ", 155, "i_26", i_26.value);
			}
			i_27 = Phi.Exit(i_25,i_26);
			i_26 = null;
			Output.record("QRDecomposition", "getQ", 153, "i_27", i_27.value);
         Q[Phi.Entry(k_6,k_10).value][Phi.Entry(k_6,k_10).value] = 1.0;
         j_16 = new Var<Integer>(Phi.Entry(k_6,k_10).value);
			Output.record("QRDecomposition", "getQ", 155, "j_16", j_16.value);
			while(Phi.Entry(j_16,j_17).value < n) {
            k_7 = new Var<Integer>(Phi.Entry(k_6,k_8).value);
				Output.record("QRDecomposition", "getQ", 156, "k_7", k_7.value);
k_8 = new Var<Integer>(k_7.value);
				Output.record("QRDecomposition", "getQ", 156, "k_8", k_8.value);
if (QR[k_8.value][k_8.value] != 0) {
               s_4 = new Var<Double>((double)0.0);
					Output.record("QRDecomposition", "getQ", 157, "s_4", s_4.value);
               i_28 = new Var<Integer>(k_8.value);
					Output.record("QRDecomposition", "getQ", 158, "i_28", i_28.value);
					while(Phi.Entry(i_28,i_29).value < m) {
                  s_5 = new Var<Double>((double)Phi.Entry(s_4,s_5).value + QR[Phi.Entry(i_28,i_29).value][Phi.Entry(k_8,k_10).value]*Q[Phi.Entry(i_28,i_29).value][Phi.Entry(j_16,j_17).value]);
						Output.record("QRDecomposition", "getQ", 159, "s_5", s_5.value);
               	i_29 = new Var<Integer>(Phi.Entry(i_28,i_29).value + 1);
						Output.record("QRDecomposition", "getQ", 160, "i_29", i_29.value);
					}
					s_6 = Phi.Exit(s_4,s_5);
					s_5 = null;
					Output.record("QRDecomposition", "getQ", 159, "s_6", s_6.value);
					i_30 = Phi.Exit(i_28,i_29);
					i_29 = null;
					Output.record("QRDecomposition", "getQ", 159, "i_30", i_30.value);
               s_7 = new Var<Double>((double)-s_6.value/QR[k_8.value][k_8.value]);
					Output.record("QRDecomposition", "getQ", 161, "s_7", s_7.value);
               i_31 = new Var<Integer>(k_8.value);
					Output.record("QRDecomposition", "getQ", 162, "i_31", i_31.value);
					while(Phi.Entry(i_31,i_32).value < m) {
                  Q[Phi.Entry(i_31,i_32).value][Phi.Entry(j_16,j_17).value] = Q[Phi.Entry(i_31,i_32).value][Phi.Entry(j_16,j_17).value] + Phi.Entry(s_7,s_7).value*QR[Phi.Entry(i_31,i_32).value][Phi.Entry(k_8,k_10).value];
               	i_32 = new Var<Integer>(Phi.Entry(i_31,i_32).value + 1);
						Output.record("QRDecomposition", "getQ", 164, "i_32", i_32.value);
					}
					i_33 = Phi.Exit(i_31,i_32);
					i_32 = null;
					Output.record("QRDecomposition", "getQ", 163, "i_33", i_33.value);
            }
				i_34 = Phi.If((QR[k_8.value][k_8.value] != 0),i_33,i_27);
				Output.record("QRDecomposition", "getQ", 157, "i_34", i_34.value);
         	j_17 = new Var<Integer>(Phi.Entry(j_16,j_17).value + 1);
				Output.record("QRDecomposition", "getQ", 166, "j_17", j_17.value);
			}
			i_35 = Phi.Exit(i_27,i_34);
			i_34 = null;
			Output.record("QRDecomposition", "getQ", 156, "i_35", i_35.value);
			j_18 = Phi.Exit(j_16,j_17);
			j_17 = null;
			Output.record("QRDecomposition", "getQ", 156, "j_18", j_18.value);
			k_9 = Phi.Exit(k_6,k_8);
			Output.record("QRDecomposition", "getQ", 156, "k_9", k_9.value);
      	k_10 = new Var<Integer>(Phi.Entry(k_9,k_10).value - 1);
			Output.record("QRDecomposition", "getQ", 168, "k_10", k_10.value);
		}
		k_11 = Phi.Exit(k_6,k_10);
		Output.record("QRDecomposition", "getQ", 152, "k_11", k_11.value);
      return X_2.value;
   }

   /** Least squares solution of A*X = B
   @param B    A Matrix with as many rows as A and any number of columns.
   @return     X that minimizes the two norm of Q*R*X-B.
   @exception  IllegalArgumentException  Matrix row dimensions must agree.
   @exception  RuntimeException  Matrix is rank deficient.
   */

   public Matrix solve (Matrix B) {
		// formal parameters
		Var<Matrix> B_0 = new Var<Matrix>(B);
		Output.record("QRDecomposition", "solve", 179, "B_0", B_0.value);

		// all variables are declared to null
		Var<Matrix> B_1 = null;
		Var<Integer> nx_0 = null;
		Var<Integer> k_12 = null;
		Var<Integer> j_19 = null;
		Var<Double> s_8 = null;
		Var<Integer> i_36 = null;
		Var<Double> s_9 = null;
		Var<Integer> i_37 = null;
		Var<Double> s_10 = null;
		Var<Integer> i_38 = null;
		Var<Double> s_11 = null;
		Var<Integer> i_39 = null;
		Var<Integer> i_40 = null;
		Var<Integer> i_41 = null;
		Var<Integer> j_20 = null;
		Var<Integer> j_21 = null;
		Var<Integer> k_13 = null;
		Var<Integer> k_14 = null;
		Var<Integer> k_15 = null;
		Var<Integer> j_22 = null;
		Var<Integer> j_23 = null;
		Var<Integer> j_24 = null;
		Var<Integer> i_42 = null;
		Var<Integer> j_25 = null;
		Var<Integer> j_26 = null;
		Var<Integer> j_27 = null;
		Var<Integer> i_43 = null;
		Var<Integer> i_44 = null;
		Var<Integer> j_28 = null;
		Var<Integer> k_16 = null;
		Var<Integer> k_17 = null;
      
		/* PROGRAM STARTS */
		m = m;
B_1 = new Var<Matrix>(B_0.value);
		Output.record("QRDecomposition", "solve", 180, "B_1", B_1.value);
if (B_1.value.getRowDimension() != m) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      if (!this.isFullRank()) {
         throw new RuntimeException("Matrix is rank deficient.");
      }
      
      // Copy right hand side
      nx_0 = new Var<Integer>(B_1.value.getColumnDimension());
		Output.record("QRDecomposition", "solve", 189, "nx_0", nx_0.value);
      double Xa[][] = B_1.value.getArrayCopy();

      // Compute Y = transpose(Q)*B
      k_12 = new Var<Integer>(0);
		Output.record("QRDecomposition", "solve", 193, "k_12", k_12.value);
		while(Phi.Entry(k_12,k_13).value < n) {
         j_19 = new Var<Integer>(0);
			Output.record("QRDecomposition", "solve", 194, "j_19", j_19.value);
			while(Phi.Entry(j_19,j_20).value < Phi.Entry(nx_0,nx_0).value) {
            s_8 = new Var<Double>((double)0.0);
				Output.record("QRDecomposition", "solve", 193, "s_8", s_8.value); 
            i_36 = new Var<Integer>(Phi.Entry(k_12,k_13).value);
				Output.record("QRDecomposition", "solve", 194, "i_36", i_36.value);
				while(Phi.Entry(i_36,i_37).value < m) {
               s_9 = new Var<Double>((double)Phi.Entry(s_8,s_9).value + QR[Phi.Entry(i_36,i_37).value][Phi.Entry(k_12,k_13).value]*Xa[Phi.Entry(i_36,i_37).value][Phi.Entry(j_19,j_20).value]);
					Output.record("QRDecomposition", "solve", 195, "s_9", s_9.value);
            	i_37 = new Var<Integer>(Phi.Entry(i_36,i_37).value + 1);
					Output.record("QRDecomposition", "solve", 196, "i_37", i_37.value);
				}
				s_10 = Phi.Exit(s_8,s_9);
				s_9 = null;
				Output.record("QRDecomposition", "solve", 195, "s_10", s_10.value);
				i_38 = Phi.Exit(i_36,i_37);
				i_37 = null;
				Output.record("QRDecomposition", "solve", 195, "i_38", i_38.value);
            s_11 = new Var<Double>((double)-s_10.value/QR[Phi.Entry(k_12,k_13).value][Phi.Entry(k_12,k_13).value]);
				Output.record("QRDecomposition", "solve", 197, "s_11", s_11.value);
            i_39 = new Var<Integer>(Phi.Entry(k_12,k_13).value);
				Output.record("QRDecomposition", "solve", 198, "i_39", i_39.value);
				while(Phi.Entry(i_39,i_40).value < m) {
               Xa[Phi.Entry(i_39,i_40).value][Phi.Entry(j_19,j_20).value] = Xa[Phi.Entry(i_39,i_40).value][Phi.Entry(j_19,j_20).value] + Phi.Entry(s_11,s_11).value*QR[Phi.Entry(i_39,i_40).value][Phi.Entry(k_12,k_13).value];
            	i_40 = new Var<Integer>(Phi.Entry(i_39,i_40).value + 1);
					Output.record("QRDecomposition", "solve", 200, "i_40", i_40.value);
				}
				i_41 = Phi.Exit(i_39,i_40);
				i_40 = null;
				Output.record("QRDecomposition", "solve", 199, "i_41", i_41.value);
         	j_20 = new Var<Integer>(Phi.Entry(j_19,j_20).value + 1);
				Output.record("QRDecomposition", "solve", 201, "j_20", j_20.value);
			}
			j_21 = Phi.Exit(j_19,j_20);
			j_20 = null;
			Output.record("QRDecomposition", "solve", 194, "j_21", j_21.value);
      	k_13 = new Var<Integer>(Phi.Entry(k_12,k_13).value + 1);
			Output.record("QRDecomposition", "solve", 203, "k_13", k_13.value);
		}
		k_14 = Phi.Exit(k_12,k_13);
		Output.record("QRDecomposition", "solve", 193, "k_14", k_14.value);
      // Solve R*X = Y;
      k_15 = new Var<Integer>(n-1);
		Output.record("QRDecomposition", "solve", 205, "k_15", k_15.value);
		while(Phi.Entry(k_15,k_16).value >= 0) {
         j_22 = new Var<Integer>(0);
			Output.record("QRDecomposition", "solve", 206, "j_22", j_22.value);
			while(Phi.Entry(j_22,j_23).value < Phi.Entry(nx_0,nx_0).value) {
            Xa[Phi.Entry(k_15,k_16).value][Phi.Entry(j_22,j_23).value] = Xa[Phi.Entry(k_15,k_16).value][Phi.Entry(j_22,j_23).value] / Rdiag[Phi.Entry(k_15,k_16).value];
         	j_23 = new Var<Integer>(Phi.Entry(j_22,j_23).value + 1);
				Output.record("QRDecomposition", "solve", 207, "j_23", j_23.value);
			}
			j_24 = Phi.Exit(j_22,j_23);
			j_23 = null;
			Output.record("QRDecomposition", "solve", 207, "j_24", j_24.value);
         i_42 = new Var<Integer>(0);
			Output.record("QRDecomposition", "solve", 208, "i_42", i_42.value);
			while(Phi.Entry(i_42,i_43).value < Phi.Entry(k_15,k_16).value) {
            j_25 = new Var<Integer>(0);
				Output.record("QRDecomposition", "solve", 209, "j_25", j_25.value);
				while(Phi.Entry(j_25,j_26).value < Phi.Entry(nx_0,nx_0).value) {
               Xa[Phi.Entry(i_42,i_43).value][Phi.Entry(j_25,j_26).value] = Xa[Phi.Entry(i_42,i_43).value][Phi.Entry(j_25,j_26).value] - Xa[Phi.Entry(k_15,k_16).value][Phi.Entry(j_25,j_26).value]*QR[Phi.Entry(i_42,i_43).value][Phi.Entry(k_15,k_16).value];
            	j_26 = new Var<Integer>(Phi.Entry(j_25,j_26).value + 1);
					Output.record("QRDecomposition", "solve", 211, "j_26", j_26.value);
				}
				j_27 = Phi.Exit(j_25,j_26);
				j_26 = null;
				Output.record("QRDecomposition", "solve", 210, "j_27", j_27.value);
         	i_43 = new Var<Integer>(Phi.Entry(i_42,i_43).value + 1);
				Output.record("QRDecomposition", "solve", 212, "i_43", i_43.value);
			}
			i_44 = Phi.Exit(i_42,i_43);
			i_43 = null;
			Output.record("QRDecomposition", "solve", 208, "i_44", i_44.value);
			j_28 = Phi.Exit(j_24,j_27);
			j_27 = null;
			Output.record("QRDecomposition", "solve", 208, "j_28", j_28.value);
      	k_16 = new Var<Integer>(Phi.Entry(k_15,k_16).value - 1);
			Output.record("QRDecomposition", "solve", 214, "k_16", k_16.value);
		}
		k_17 = Phi.Exit(k_15,k_16);
		Output.record("QRDecomposition", "solve", 206, "k_17", k_17.value);
      return (new Matrix(Xa,n,nx_0.value).getMatrix(0,n-1,0,nx_0.value-1));
   }
  private static final long serialVersionUID = 1;
}
