package outputs.SingularValueDecomposition_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;

import Jama.Matrix;
import Jama.util.*;

   /** Singular Value Decomposition.
   <P>
   For an m-by-n matrix A with m >= n, the singular value decomposition is
   an m-by-n orthogonal matrix U, an n-by-n diagonal matrix S, and
   an n-by-n orthogonal matrix V so that A = U*S*V'.
   <P>
   The singular values, sigma[k] = S[k][k], are ordered so that
   sigma[0] >= sigma[1] >= ... >= sigma[n-1].
   <P>
   The singular value decompostion always exists, so the constructor will
   never fail.  The matrix condition number and the effective numerical
   rank can be computed from this decomposition.
   */

public class SingularValueDecomposition_Faulty implements java.io.Serializable {

/* ------------------------
   Class variables
 * ------------------------ */

   /** Arrays for internal storage of U and V.
   @serial internal storage of U.
   @serial internal storage of V.
   */
   private double[][] U;
	double[][]  V;

   /** Array for internal storage of singular values.
   @serial internal storage of singular values.
   */
   private double[] s;

   /** Row and column dimensions.
   @serial row dimension.
   @serial column dimension.
   */
   private int m;
	int  n;

/* ------------------------
   Constructor
 * ------------------------ */

   /** Construct the singular value decomposition
       Structure to access U, S and V.
   @param Arg    Rectangular matrix
   */

   public SingularValueDecomposition_Faulty (Matrix Arg) {
		// formal parameters
		Var<Matrix> Arg_0 = new Var<Matrix>(Arg);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 51, "Arg_0", Arg_0.value);

		// all variables are declared to null
		Var<Integer> nu_0 = null;
		Var<Boolean> wantu_0 = null;
		Var<Boolean> wantv_0 = null;
		Var<Integer> nct_0 = null;
		Var<Integer> nrt_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> nct_1 = null;
		Var<Integer> k_1 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> k_2 = null;
		Var<Integer> k_3 = null;
		Var<Integer> k_4 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> k_5 = null;
		Var<Integer> k_6 = null;
		Var<Integer> j_0 = null;
		Var<Integer> k_7 = null;
		Var<Integer> nct_2 = null;
		Var<Integer> k_8 = null;
		Var<Double> t_0 = null;
		Var<Integer> i_7 = null;
		Var<Double> t_1 = null;
		Var<Integer> i_8 = null;
		Var<Double> t_2 = null;
		Var<Integer> i_9 = null;
		Var<Double> t_3 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Integer> i_12 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> k_9 = null;
		Var<Integer> nct_3 = null;
		Var<Integer> nct_4 = null;
		Var<Integer> k_10 = null;
		Var<Boolean> wantu_1 = null;
		Var<Integer> i_13 = null;
		Var<Integer> i_14 = null;
		Var<Integer> i_15 = null;
		Var<Integer> nrt_1 = null;
		Var<Integer> k_11 = null;
		Var<Integer> i_16 = null;
		Var<Integer> i_17 = null;
		Var<Integer> i_18 = null;
		Var<Integer> k_12 = null;
		Var<Integer> k_13 = null;
		Var<Integer> i_19 = null;
		Var<Integer> i_20 = null;
		Var<Integer> i_21 = null;
		Var<Integer> i_22 = null;
		Var<Integer> k_14 = null;
		Var<Integer> k_15 = null;
		Var<Integer> k_16 = null;
		Var<Integer> i_23 = null;
		Var<Integer> i_24 = null;
		Var<Integer> i_25 = null;
		Var<Integer> j_3 = null;
		Var<Integer> i_26 = null;
		Var<Integer> i_27 = null;
		Var<Integer> i_28 = null;
		Var<Integer> j_4 = null;
		Var<Integer> i_29 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;
		Var<Double> t_4 = null;
		Var<Integer> i_30 = null;
		Var<Integer> i_31 = null;
		Var<Integer> i_32 = null;
		Var<Integer> j_7 = null;
		Var<Integer> i_33 = null;
		Var<Integer> j_8 = null;
		Var<Integer> i_34 = null;
		Var<Integer> j_9 = null;
		Var<Boolean> wantv_1 = null;
		Var<Integer> i_35 = null;
		Var<Integer> i_36 = null;
		Var<Integer> i_37 = null;
		Var<Integer> i_38 = null;
		Var<Integer> j_10 = null;
		Var<Integer> k_17 = null;
		Var<Boolean> wantv_2 = null;
		Var<Integer> k_18 = null;
		Var<Integer> nrt_2 = null;
		Var<Integer> k_19 = null;
		Var<Boolean> wantv_3 = null;
		Var<Integer> nct_5 = null;
		Var<Boolean> wantu_2 = null;
		Var<Integer> p_0 = null;
		Var<Integer> nct_6 = null;
		Var<Integer> p_1 = null;
		Var<Integer> p_2 = null;
		Var<Integer> nrt_3 = null;
		Var<Boolean> wantu_3 = null;
		Var<Integer> j_11 = null;
		Var<Integer> i_39 = null;
		Var<Integer> i_40 = null;
		Var<Integer> i_41 = null;
		Var<Integer> j_12 = null;
		Var<Integer> j_13 = null;
		Var<Integer> k_20 = null;
		Var<Integer> k_21 = null;
		Var<Integer> j_14 = null;
		Var<Double> t_5 = null;
		Var<Integer> i_42 = null;
		Var<Double> t_6 = null;
		Var<Integer> i_43 = null;
		Var<Double> t_7 = null;
		Var<Integer> i_44 = null;
		Var<Double> t_8 = null;
		Var<Integer> i_45 = null;
		Var<Integer> i_46 = null;
		Var<Integer> i_47 = null;
		Var<Integer> j_15 = null;
		Var<Integer> j_16 = null;
		Var<Integer> i_48 = null;
		Var<Integer> i_49 = null;
		Var<Integer> i_50 = null;
		Var<Integer> i_51 = null;
		Var<Integer> i_52 = null;
		Var<Integer> i_53 = null;
		Var<Integer> i_54 = null;
		Var<Integer> i_55 = null;
		Var<Integer> i_56 = null;
		Var<Integer> j_17 = null;
		Var<Integer> k_22 = null;
		Var<Integer> j_18 = null;
		Var<Integer> k_23 = null;
		Var<Integer> k_24 = null;
		Var<Boolean> wantv_4 = null;
		Var<Integer> k_25 = null;
		Var<Integer> k_26 = null;
		Var<Integer> nrt_4 = null;
		Var<Integer> k_27 = null;
		Var<Integer> j_19 = null;
		Var<Double> t_9 = null;
		Var<Integer> i_57 = null;
		Var<Double> t_10 = null;
		Var<Integer> i_58 = null;
		Var<Double> t_11 = null;
		Var<Integer> i_59 = null;
		Var<Double> t_12 = null;
		Var<Integer> i_60 = null;
		Var<Integer> i_61 = null;
		Var<Integer> i_62 = null;
		Var<Integer> j_20 = null;
		Var<Integer> j_21 = null;
		Var<Integer> i_63 = null;
		Var<Integer> i_64 = null;
		Var<Integer> i_65 = null;
		Var<Integer> k_28 = null;
		Var<Integer> nrt_5 = null;
		Var<Integer> k_29 = null;
		Var<Integer> nrt_6 = null;
		Var<Integer> k_30 = null;
		Var<Integer> pp_0 = null;
		Var<Integer> iter_0 = null;
		Var<Double> eps_0 = null;
		Var<Double> tiny_0 = null;
		Var<Integer> k_31 = null;
		Var<Integer> kase_0 = null;
		Var<Integer> k_32 = null;
		Var<Integer> k_33 = null;
		Var<Integer> k_34 = null;
		Var<Integer> k_35 = null;
		Var<Double> eps_1 = null;
		Var<Double> tiny_1 = null;
		Var<Integer> k_36 = null;
		Var<Integer> k_37 = null;
		Var<Double> eps_2 = null;
		Var<Integer> k_38 = null;
		Var<Double> tiny_2 = null;
		Var<Integer> p_3 = null;
		Var<Integer> k_39 = null;
		Var<Integer> kase_1 = null;
		Var<Integer> ks_0 = null;
		Var<Integer> ks_1 = null;
		Var<Integer> k_40 = null;
		Var<Integer> ks_2 = null;
		Var<Double> t_13 = null;
		Var<Double> t_14 = null;
		Var<Double> eps_3 = null;
		Var<Double> tiny_3 = null;
		Var<Integer> ks_3 = null;
		Var<Integer> ks_4 = null;
		Var<Integer> ks_5 = null;
		Var<Double> eps_4 = null;
		Var<Integer> k_41 = null;
		Var<Double> tiny_4 = null;
		Var<Integer> p_4 = null;
		Var<Integer> ks_6 = null;
		Var<Integer> k_42 = null;
		Var<Integer> ks_7 = null;
		Var<Integer> kase_2 = null;
		Var<Integer> kase_3 = null;
		Var<Integer> kase_4 = null;
		Var<Integer> k_43 = null;
		Var<Integer> k_44 = null;
		Var<Integer> kase_5 = null;
		Var<Double> eps_5 = null;
		Var<Integer> k_45 = null;
		Var<Integer> p_5 = null;
		Var<Double> tiny_5 = null;
		Var<Integer> kase_6 = null;
		Var<Integer> k_46 = null;
		Var<Double> f_0 = null;
		Var<Integer> j_22 = null;
		Var<Double> t_15 = null;
		Var<Double> cs_0 = null;
		Var<Double> sn_0 = null;
		Var<Integer> k_47 = null;
		Var<Integer> j_23 = null;
		Var<Double> f_1 = null;
		Var<Double> f_2 = null;
		Var<Boolean> wantv_5 = null;
		Var<Integer> i_66 = null;
		Var<Double> t_16 = null;
		Var<Integer> i_67 = null;
		Var<Integer> i_68 = null;
		Var<Double> t_17 = null;
		Var<Double> t_18 = null;
		Var<Integer> j_24 = null;
		Var<Double> f_3 = null;
		Var<Integer> j_25 = null;
		Var<Integer> k_48 = null;
		Var<Boolean> wantv_6 = null;
		Var<Double> f_4 = null;
		Var<Integer> j_26 = null;
		Var<Double> t_19 = null;
		Var<Double> cs_1 = null;
		Var<Double> sn_1 = null;
		Var<Double> f_5 = null;
		Var<Boolean> wantu_4 = null;
		Var<Integer> i_69 = null;
		Var<Double> t_20 = null;
		Var<Integer> i_70 = null;
		Var<Integer> i_71 = null;
		Var<Double> t_21 = null;
		Var<Double> t_22 = null;
		Var<Integer> j_27 = null;
		Var<Double> f_6 = null;
		Var<Integer> j_28 = null;
		Var<Boolean> wantu_5 = null;
		Var<Double> scale_0 = null;
		Var<Double> sp_0 = null;
		Var<Double> spm1_0 = null;
		Var<Double> epm1_0 = null;
		Var<Double> sk_0 = null;
		Var<Double> ek_0 = null;
		Var<Double> b_0 = null;
		Var<Double> c_0 = null;
		Var<Double> shift_0 = null;
		Var<Double> c_1 = null;
		Var<Double> b_1 = null;
		Var<Double> shift_1 = null;
		Var<Double> b_2 = null;
		Var<Double> shift_2 = null;
		Var<Double> shift_3 = null;
		Var<Double> shift_4 = null;
		Var<Double> shift_5 = null;
		Var<Double> b_3 = null;
		Var<Double> f_7 = null;
		Var<Double> g_0 = null;
		Var<Integer> j_29 = null;
		Var<Double> t_23 = null;
		Var<Double> cs_2 = null;
		Var<Double> sn_2 = null;
		Var<Integer> k_49 = null;
		Var<Integer> j_30 = null;
		Var<Double> f_8 = null;
		Var<Double> g_1 = null;
		Var<Boolean> wantv_7 = null;
		Var<Integer> i_72 = null;
		Var<Double> t_24 = null;
		Var<Integer> i_73 = null;
		Var<Integer> i_74 = null;
		Var<Double> t_25 = null;
		Var<Double> t_26 = null;
		Var<Double> t_27 = null;
		Var<Double> cs_3 = null;
		Var<Double> sn_3 = null;
		Var<Double> f_9 = null;
		Var<Double> g_2 = null;
		Var<Integer> j_31 = null;
		Var<Boolean> wantu_6 = null;
		Var<Integer> i_75 = null;
		Var<Double> t_28 = null;
		Var<Integer> i_76 = null;
		Var<Integer> i_77 = null;
		Var<Double> t_29 = null;
		Var<Double> t_30 = null;
		Var<Integer> j_32 = null;
		Var<Boolean> wantv_8 = null;
		Var<Boolean> wantu_7 = null;
		Var<Double> f_10 = null;
		Var<Double> g_3 = null;
		Var<Integer> j_33 = null;
		Var<Integer> k_50 = null;
		Var<Integer> iter_1 = null;
		Var<Integer> k_51 = null;
		Var<Boolean> wantv_9 = null;
		Var<Integer> i_78 = null;
		Var<Integer> i_79 = null;
		Var<Integer> i_80 = null;
		Var<Boolean> wantv_10 = null;
		Var<Integer> k_52 = null;
		Var<Integer> k_53 = null;
		Var<Double> t_31 = null;
		Var<Integer> k_54 = null;
		Var<Boolean> wantv_11 = null;
		Var<Integer> i_81 = null;
		Var<Double> t_32 = null;
		Var<Integer> i_82 = null;
		Var<Integer> i_83 = null;
		Var<Double> t_33 = null;
		Var<Double> t_34 = null;
		Var<Integer> k_55 = null;
		Var<Boolean> wantu_8 = null;
		Var<Integer> i_84 = null;
		Var<Double> t_35 = null;
		Var<Integer> i_85 = null;
		Var<Integer> i_86 = null;
		Var<Double> t_36 = null;
		Var<Double> t_37 = null;
		Var<Integer> k_56 = null;
		Var<Boolean> wantv_12 = null;
		Var<Boolean> wantu_9 = null;
		Var<Integer> k_57 = null;
		Var<Integer> iter_2 = null;
		Var<Integer> p_6 = null;
		Var<Boolean> wantv_13 = null;
		Var<Boolean> wantu_10 = null;
		Var<Integer> iter_3 = null;
		Var<Integer> k_58 = null;
		Var<Integer> p_7 = null;
		Var<Boolean> wantv_14 = null;
		Var<Boolean> wantu_11 = null;
		Var<Integer> iter_4 = null;
		Var<Integer> k_59 = null;
		Var<Integer> p_8 = null;

      // Derived from LINPACK code.
      // Initialize.
      
		/* PROGRAM STARTS */
		double A[][] = Arg_0.value.getArrayCopy();
      m = Arg_0.value.getRowDimension();
      n = Arg_0.value.getColumnDimension();

      /* Apparently the failing cases are only a proper subset of (m<n), 
	 so let's not throw error.  Correct fix to come later?
      if (m<n) {
	  throw new IllegalArgumentException("Jama SVD only works for m >= n"); }
      */
      nu_0 = new Var<Integer>((Math.min(m,n)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 64, "nu_0", nu_0.value);
      s = new double [Math.min(m+1,n)];
      U = new double [m][nu_0.value];
      V = new double [n][n];
      double e[] = new double [n];
      double work[] = new double [m];
      wantu_0 = new Var<Boolean>((true));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 70, "wantu_0", wantu_0.value);
      wantv_0 = new Var<Boolean>((true));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 71, "wantv_0", wantv_0.value);

      // Reduce A to bidiagonal form, storing the diagonal elements
      // in s and the super-diagonal elements in e.

      nct_0 = new Var<Integer>((Math.min(m-1,n)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 76, "nct_0", nct_0.value);
      nrt_0 = new Var<Integer>((Math.max(0,Math.min(n-2,m))));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 77, "nrt_0", nrt_0.value);
      k_0 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 78, "k_0", k_0.value);
		while(Phi.Entry(k_0,k_18).value < Math.max(Phi.Entry(nct_0,nct_4).value,Phi.Entry(nrt_0,nrt_1).value)) {
         nct_1 = new Var<Integer>((Phi.Entry(nct_0,nct_4).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nct_1", nct_1.value);
k_1 = new Var<Integer>((Phi.Entry(k_0,k_18).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "k_1", k_1.value);
if (k_1.value < nct_1.value) {

            // Compute the transformation for the k-th column and
            // place the k-th diagonal in s[k].
            // Compute 2-norm of k-th column without under/overflow.
            s[k_1.value] = 0;
            i_0 = new Var<Integer>((k_1.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 85, "i_0", i_0.value);
				while(Phi.Entry(i_0,i_1).value < m) {
               s[Phi.Entry(k_1,k_18).value] = Maths.hypot(s[Phi.Entry(k_1,k_18).value],A[Phi.Entry(i_0,i_1).value][Phi.Entry(k_1,k_18).value]);
            	i_1 = new Var<Integer>((Phi.Entry(i_0,i_1).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 87, "i_1", i_1.value);
				}
				i_2 = Phi.Exit(i_0,i_1);
				i_1 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 86, "i_2", i_2.value);
            k_2 = new Var<Integer>((k_1.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 88, "k_2", k_2.value);
if (s[k_2.value] != 0.0) {
               k_3 = new Var<Integer>((k_2.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_3", k_3.value);
k_4 = new Var<Integer>((k_3.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_4", k_4.value);
if (A[k_4.value][k_4.value] < 0.0) {
                  s[k_4.value] = -s[k_4.value];
               }
               i_3 = new Var<Integer>((k_4.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 92, "i_3", i_3.value);
					while(Phi.Entry(i_3,i_4).value < m) {
                  A[Phi.Entry(i_3,i_4).value][Phi.Entry(k_1,k_4).value] = A[Phi.Entry(i_3,i_4).value][Phi.Entry(k_1,k_4).value] / s[Phi.Entry(k_1,k_4).value];
               	i_4 = new Var<Integer>((Phi.Entry(i_3,i_4).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 94, "i_4", i_4.value);
					}
					i_5 = Phi.Exit(i_3,i_4);
					i_4 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 93, "i_5", i_5.value);
               A[k_4.value][k_4.value] = A[k_4.value][k_4.value] + 1.0;
            }
				i_6 = Phi.If((s[k_2.value] != 0.0),i_5,i_2);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "i_6", i_6.value);
				k_5 = Phi.If((s[k_2.value] != 0.0),k_4,k_2);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_5", k_5.value);
            s[k_5.value] = -s[k_5.value];
         }
			k_6 = Phi.If((k_1.value < nct_1.value),k_5,k_1);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 80, "k_6", k_6.value);
         j_0 = new Var<Integer>((k_6.value+1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "j_0", j_0.value);
			while(Phi.Entry(j_0,j_1).value < n) {
            k_7 = new Var<Integer>((Phi.Entry(k_6,k_8).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "k_7", k_7.value);
nct_2 = new Var<Integer>((Phi.Entry(nct_1,nct_2).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "nct_2", nct_2.value);
k_8 = new Var<Integer>((k_7.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 101, "k_8", k_8.value);
if ((k_8.value < nct_2.value) & (s[k_8.value] != 0.0))  {

            // Apply the transformation.

               t_0 = new Var<Double>((double)(0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 104, "t_0", t_0.value);
               i_7 = new Var<Integer>((k_8.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "i_7", i_7.value);
					while(Phi.Entry(i_6,i_8).value < m) {
                  t_1 = new Var<Double>((double)(Phi.Entry(t_0,t_1).value + A[Phi.Entry(i_6,i_8).value][Phi.Entry(k_8,k_18).value]*A[Phi.Entry(i_6,i_8).value][Phi.Entry(j_0,j_1).value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 106, "t_1", t_1.value);
               	i_8 = new Var<Integer>((Phi.Entry(i_6,i_8).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 107, "i_8", i_8.value);
					}
					t_2 = Phi.Exit(t_0,t_1);
					t_1 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "t_2", t_2.value);
					i_9 = Phi.Exit(i_7,i_8);
					i_8 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "i_9", i_9.value);
               t_3 = new Var<Double>((double)(-t_2.value/A[k_8.value][k_8.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 107, "t_3", t_3.value);
               i_10 = new Var<Integer>((k_8.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 108, "i_10", i_10.value);
					while(Phi.Entry(i_6,i_11).value < m) {
                  A[Phi.Entry(i_6,i_11).value][Phi.Entry(j_0,j_1).value] = A[Phi.Entry(i_6,i_11).value][Phi.Entry(j_0,j_1).value] + Phi.Entry(t_3,t_4).value*A[Phi.Entry(i_6,i_11).value][Phi.Entry(k_8,k_18).value];
               	i_11 = new Var<Integer>((Phi.Entry(i_6,i_11).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 110, "i_11", i_11.value);
					}
					i_12 = Phi.Exit(i_10,i_11);
					i_11 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 108, "i_12", i_12.value);
            }

            // Place the k-th row of A into e for the
            // subsequent calculation of the row transformation.

            e[Phi.Entry(j_0,j_1).value] = A[k_8.value][Phi.Entry(j_0,j_1).value];
         	j_1 = new Var<Integer>((Phi.Entry(j_0,j_1).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 117, "j_1", j_1.value);
			}
			j_2 = Phi.Exit(j_0,j_1);
			j_1 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "j_2", j_2.value);
			k_9 = Phi.Exit(k_6,k_8);
			k_8 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "k_9", k_9.value);
			nct_3 = Phi.Exit(nct_1,nct_2);
			nct_2 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "nct_3", nct_3.value);
         nct_4 = new Var<Integer>((nct_3.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 118, "nct_4", nct_4.value);
k_10 = new Var<Integer>((k_9.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 118, "k_10", k_10.value);
wantu_1 = new Var<Boolean>((Phi.Entry(wantu_0,wantu_1).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 118, "wantu_1", wantu_1.value);
if (wantu_1.value & (k_10.value < nct_4.value)) {

            // Place the transformation in U for subsequent back
            // multiplication.

            i_13 = new Var<Integer>((k_10.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 123, "i_13", i_13.value);
				while(Phi.Entry(i_12,i_14).value < m) {
               U[Phi.Entry(i_12,i_14).value][Phi.Entry(k_10,k_18).value] = A[Phi.Entry(i_12,i_14).value][Phi.Entry(k_10,k_18).value];
            	i_14 = new Var<Integer>((Phi.Entry(i_12,i_14).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 125, "i_14", i_14.value);
				}
				i_15 = Phi.Exit(i_13,i_14);
				i_14 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 124, "i_15", i_15.value);
         }
         nrt_1 = new Var<Integer>((Phi.Entry(nrt_0,nrt_1).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 127, "nrt_1", nrt_1.value);
k_11 = new Var<Integer>((k_10.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 127, "k_11", k_11.value);
if (k_11.value < nrt_1.value) {

            // Compute the k-th row transformation and place the
            // k-th super-diagonal in e[k].
            // Compute 2-norm without under/overflow.
            e[k_11.value] = 0;
            i_16 = new Var<Integer>((k_11.value+1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 133, "i_16", i_16.value);
				while(Phi.Entry(i_15,i_17).value < n) {
               e[Phi.Entry(k_11,k_18).value] = Maths.hypot(e[Phi.Entry(k_11,k_18).value],e[Phi.Entry(i_15,i_17).value]);
            	i_17 = new Var<Integer>((Phi.Entry(i_15,i_17).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 135, "i_17", i_17.value);
				}
				i_18 = Phi.Exit(i_16,i_17);
				i_17 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 134, "i_18", i_18.value);
            k_12 = new Var<Integer>((k_11.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 136, "k_12", k_12.value);
if (e[k_12.value] != 0.0) {
               k_13 = new Var<Integer>((k_12.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "k_13", k_13.value);
if (e[k_13.value+1] < 0.0) {
                  e[k_13.value] = -e[k_13.value];
               }
               i_19 = new Var<Integer>((k_13.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 140, "i_19", i_19.value);
					while(Phi.Entry(i_15,i_20).value < n) {
                  e[Phi.Entry(i_15,i_20).value] = e[Phi.Entry(i_15,i_20).value] / e[Phi.Entry(k_11,k_13).value];
               	i_20 = new Var<Integer>((Phi.Entry(i_15,i_20).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 142, "i_20", i_20.value);
					}
					i_21 = Phi.Exit(i_19,i_20);
					i_20 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 141, "i_21", i_21.value);
               e[k_13.value+1] = e[k_13.value+1] + 1.0;
            }
				i_22 = Phi.If((e[k_12.value] != 0.0),i_21,i_18);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "i_22", i_22.value);
				k_14 = Phi.If((e[k_12.value] != 0.0),k_13,k_12);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "k_14", k_14.value);
            e[k_14.value] = -e[k_14.value];
            k_15 = new Var<Integer>((k_14.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 146, "k_15", k_15.value);
k_16 = new Var<Integer>((k_15.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 146, "k_16", k_16.value);
if ((k_16.value+1 < m) & (e[k_16.value] != 0.0)) {

            // Apply the transformation.

               i_23 = new Var<Integer>((k_16.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 150, "i_23", i_23.value);
					while(Phi.Entry(i_15,i_24).value < m) {
                  work[Phi.Entry(i_15,i_24).value] = 0.0;
               	i_24 = new Var<Integer>((Phi.Entry(i_15,i_24).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 152, "i_24", i_24.value);
					}
					i_25 = Phi.Exit(i_23,i_24);
					i_24 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 151, "i_25", i_25.value);
               j_3 = new Var<Integer>((k_16.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "j_3", j_3.value);
					while(Phi.Entry(j_2,j_4).value < n) {
                  i_26 = new Var<Integer>((Phi.Entry(k_11,k_16).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "i_26", i_26.value);
						while(Phi.Entry(i_15,i_27).value < m) {
                     work[Phi.Entry(i_15,i_27).value] = work[Phi.Entry(i_15,i_27).value] + e[Phi.Entry(j_2,j_3).value]*A[Phi.Entry(i_15,i_27).value][Phi.Entry(j_2,j_3).value];
                  	i_27 = new Var<Integer>((Phi.Entry(i_15,i_27).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 156, "i_27", i_27.value);
						}
						i_28 = Phi.Exit(i_26,i_27);
						i_27 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "i_28", i_28.value);
               	j_4 = new Var<Integer>((Phi.Entry(j_2,j_4).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 157, "j_4", j_4.value);
					}
					i_29 = Phi.Exit(i_25,i_28);
					i_28 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "i_29", i_29.value);
					j_5 = Phi.Exit(j_3,j_4);
					j_4 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "j_5", j_5.value);
               j_6 = new Var<Integer>((k_16.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 159, "j_6", j_6.value);
					while(Phi.Entry(j_2,j_7).value < n) {
                  t_4 = new Var<Double>((double)(-e[Phi.Entry(j_2,j_7).value]/e[Phi.Entry(k_11,k_16).value+1]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 159, "t_4", t_4.value);
                  i_30 = new Var<Integer>((Phi.Entry(k_11,k_16).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "i_30", i_30.value);
						while(Phi.Entry(i_15,i_31).value < m) {
                     A[Phi.Entry(i_15,i_31).value][Phi.Entry(j_2,j_6).value] = A[Phi.Entry(i_15,i_31).value][Phi.Entry(j_2,j_6).value] + Phi.Entry(t_3,t_4).value*work[Phi.Entry(i_15,i_31).value];
                  	i_31 = new Var<Integer>((Phi.Entry(i_15,i_31).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 162, "i_31", i_31.value);
						}
						i_32 = Phi.Exit(i_30,i_31);
						i_31 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "i_32", i_32.value);
               	j_7 = new Var<Integer>((Phi.Entry(j_2,j_7).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 163, "j_7", j_7.value);
					}
					i_33 = Phi.Exit(i_29,i_32);
					i_32 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "i_33", i_33.value);
					j_8 = Phi.Exit(j_6,j_7);
					j_7 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "j_8", j_8.value);
            }
				i_34 = Phi.If(((k_16.value+1 < m) & (e[k_16.value] != 0.0)),i_33,i_22);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 147, "i_34", i_34.value);
				j_9 = Phi.If(((k_16.value+1 < m) & (e[k_16.value] != 0.0)),j_8,j_2);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 147, "j_9", j_9.value);
            wantv_1 = new Var<Boolean>((Phi.Entry(wantv_0,wantv_2).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 165, "wantv_1", wantv_1.value);
if (wantv_1.value) {

            // Place the transformation in V for subsequent
            // back multiplication.

               i_35 = new Var<Integer>((k_16.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 170, "i_35", i_35.value);
					while(Phi.Entry(i_15,i_36).value < n) {
                  V[Phi.Entry(i_15,i_36).value][Phi.Entry(k_11,k_16).value] = e[Phi.Entry(i_15,i_36).value];
               	i_36 = new Var<Integer>((Phi.Entry(i_15,i_36).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 172, "i_36", i_36.value);
					}
					i_37 = Phi.Exit(i_35,i_36);
					i_36 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 171, "i_37", i_37.value);
            }
				i_38 = Phi.If((wantv_1.value),i_37,i_34);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 166, "i_38", i_38.value);
         }
			j_10 = Phi.If((k_11.value < nrt_1.value),j_9,j_2);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "j_10", j_10.value);
			k_17 = Phi.If((k_11.value < nrt_1.value),k_16,k_11);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "k_17", k_17.value);
			wantv_2 = Phi.If((k_11.value < nrt_1.value),wantv_1,wantv_0);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "wantv_2", wantv_2.value);
      	k_18 = new Var<Integer>((k_17.value + 1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 175, "k_18", k_18.value);
		}
		nrt_2 = Phi.Exit(nrt_0,nrt_1);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nrt_2", nrt_2.value);
		k_19 = Phi.Exit(k_0,k_18);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "k_19", k_19.value);
		wantv_3 = Phi.Exit(wantv_0,wantv_2);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "wantv_3", wantv_3.value);
		nct_5 = Phi.Exit(nct_0,nct_4);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nct_5", nct_5.value);
		wantu_2 = Phi.Exit(wantu_0,wantu_1);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "wantu_2", wantu_2.value);

      // Set up the final bidiagonal matrix or order p.

      p_0 = new Var<Integer>((Math.min(n,m+1)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 180, "p_0", p_0.value);
      nct_6 = new Var<Integer>((nct_5.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 181, "nct_6", nct_6.value);
if (nct_6.value < n) {
         s[nct_6.value] = A[nct_6.value][nct_6.value];
      }
      p_1 = new Var<Integer>((p_0.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 184, "p_1", p_1.value);
if (m < p_1.value) {
         s[p_1.value-1] = 0.0;
      }
      p_2 = new Var<Integer>((p_1.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 187, "p_2", p_2.value);
nrt_3 = new Var<Integer>((nrt_2.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 187, "nrt_3", nrt_3.value);
if (nrt_3.value+1 < p_2.value) {
         e[nrt_3.value] = A[nrt_3.value][p_2.value-1];
      }
      e[p_2.value-1] = 0.0;

      // If required, generate U.

      wantu_3 = new Var<Boolean>((wantu_2.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "wantu_3", wantu_3.value);
if (wantu_3.value) {
         j_11 = new Var<Integer>((nct_6.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "j_11", j_11.value);
			while(Phi.Entry(j_10,j_12).value < Phi.Entry(nu_0,nu_0).value) {
            i_39 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "i_39", i_39.value);
				while(Phi.Entry(i_38,i_40).value < m) {
               U[Phi.Entry(i_38,i_40).value][Phi.Entry(j_10,j_11).value] = 0.0;
            	i_40 = new Var<Integer>((Phi.Entry(i_38,i_40).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 197, "i_40", i_40.value);
				}
				i_41 = Phi.Exit(i_39,i_40);
				i_40 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 196, "i_41", i_41.value);
            U[Phi.Entry(j_10,j_12).value][Phi.Entry(j_10,j_12).value] = 1.0;
         	j_12 = new Var<Integer>((Phi.Entry(j_10,j_12).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 199, "j_12", j_12.value);
			}
			j_13 = Phi.Exit(j_11,j_12);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "j_13", j_13.value);
         k_20 = new Var<Integer>((nct_6.value-1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 201, "k_20", k_20.value);
			while(Phi.Entry(k_19,k_22).value >= 0) {
            k_21 = new Var<Integer>((Phi.Entry(k_19,k_22).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "k_21", k_21.value);
if (s[k_21.value] != 0.0) {
               j_14 = new Var<Integer>((k_21.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 204, "j_14", j_14.value);
					while(Phi.Entry(j_10,j_15).value < Phi.Entry(nu_0,nu_0).value) {
                  t_5 = new Var<Double>((double)(0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "t_5", t_5.value);
                  i_42 = new Var<Integer>((Phi.Entry(k_19,k_21).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "i_42", i_42.value);
						while(Phi.Entry(i_38,i_43).value < m) {
                     t_6 = new Var<Double>((double)(Phi.Entry(t_4,t_6).value + U[Phi.Entry(i_38,i_43).value][Phi.Entry(k_19,k_21).value]*U[Phi.Entry(i_38,i_43).value][Phi.Entry(j_10,j_14).value]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 206, "t_6", t_6.value);
                  	i_43 = new Var<Integer>((Phi.Entry(i_38,i_43).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 207, "i_43", i_43.value);
						}
						t_7 = Phi.Exit(t_5,t_6);
						t_6 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "t_7", t_7.value);
						i_44 = Phi.Exit(i_42,i_43);
						i_43 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "i_44", i_44.value);
                  t_8 = new Var<Double>((double)(-t_7.value/U[Phi.Entry(k_19,k_21).value][Phi.Entry(k_19,k_21).value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "t_8", t_8.value);
                  i_45 = new Var<Integer>((Phi.Entry(k_19,k_21).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "i_45", i_45.value);
						while(Phi.Entry(i_38,i_46).value < m) {
                     U[Phi.Entry(i_38,i_46).value][Phi.Entry(j_10,j_14).value] = U[Phi.Entry(i_38,i_46).value][Phi.Entry(j_10,j_14).value] + Phi.Entry(t_4,t_8).value*U[Phi.Entry(i_38,i_46).value][Phi.Entry(k_19,k_21).value];
                  	i_46 = new Var<Integer>((Phi.Entry(i_38,i_46).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 210, "i_46", i_46.value);
						}
						i_47 = Phi.Exit(i_45,i_46);
						i_46 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "i_47", i_47.value);
               	j_15 = new Var<Integer>((Phi.Entry(j_10,j_15).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 211, "j_15", j_15.value);
					}
					j_16 = Phi.Exit(j_14,j_15);
					j_15 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 204, "j_16", j_16.value);
               i_48 = new Var<Integer>((k_21.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 212, "i_48", i_48.value);
					while(Phi.Entry(i_38,i_49).value < m) {
                  U[Phi.Entry(i_38,i_49).value][Phi.Entry(k_19,k_21).value] = -U[Phi.Entry(i_38,i_49).value][Phi.Entry(k_19,k_21).value];
               	i_49 = new Var<Integer>((Phi.Entry(i_38,i_49).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 214, "i_49", i_49.value);
					}
					i_50 = Phi.Exit(i_48,i_49);
					i_49 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 213, "i_50", i_50.value);
               U[k_21.value][k_21.value] = 1.0 + U[k_21.value][k_21.value];
               i_51 = new Var<Integer>((0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 216, "i_51", i_51.value);
					while(Phi.Entry(i_38,i_52).value < Phi.Entry(k_19,k_21).value-1) {
                  U[Phi.Entry(i_38,i_52).value][Phi.Entry(k_19,k_21).value] = 0.0;
               	i_52 = new Var<Integer>((Phi.Entry(i_38,i_52).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 218, "i_52", i_52.value);
					}
					i_53 = Phi.Exit(i_51,i_52);
					i_52 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 217, "i_53", i_53.value);
            } else {
               i_54 = new Var<Integer>((0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "i_54", i_54.value);
					while(Phi.Entry(i_38,i_55).value < m) {
                  U[Phi.Entry(i_38,i_55).value][Phi.Entry(k_19,k_21).value] = 0.0;
               	i_55 = new Var<Integer>((Phi.Entry(i_38,i_55).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 222, "i_55", i_55.value);
					}
					i_56 = Phi.Exit(i_54,i_55);
					i_55 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 221, "i_56", i_56.value);
               U[k_21.value][k_21.value] = 1.0;
            }
				j_17 = Phi.If((s[k_21.value] != 0.0),j_16,j_13);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 219, "j_17", j_17.value);
         	k_22 = new Var<Integer>((k_21.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 225, "k_22", k_22.value);
			}
			j_18 = Phi.Exit(j_13,j_17);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "j_18", j_18.value);
			k_23 = Phi.Exit(k_20,k_22);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "k_23", k_23.value);
      }
		k_24 = Phi.If((wantu_3.value),k_23,k_19);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "k_24", k_24.value);

      // If required, generate V.

      wantv_4 = new Var<Boolean>((wantv_3.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "wantv_4", wantv_4.value);
if (wantv_4.value) {
         k_25 = new Var<Integer>((n-1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 232, "k_25", k_25.value);
			while(Phi.Entry(k_24,k_28).value >= 0) {
            k_26 = new Var<Integer>((Phi.Entry(k_24,k_28).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_26", k_26.value);
nrt_4 = new Var<Integer>((Phi.Entry(nrt_3,nrt_4).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "nrt_4", nrt_4.value);
k_27 = new Var<Integer>((k_26.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_27", k_27.value);
if ((k_27.value < nrt_4.value) & (e[k_27.value] != 0.0)) {
               j_19 = new Var<Integer>((k_27.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 235, "j_19", j_19.value);
					while(Phi.Entry(j_18,j_20).value < Phi.Entry(nu_0,nu_0).value) {
                  t_9 = new Var<Double>((double)(0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "t_9", t_9.value);
                  i_57 = new Var<Integer>((Phi.Entry(k_24,k_27).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "i_57", i_57.value);
						while(Phi.Entry(i_56,i_58).value < n) {
                     t_10 = new Var<Double>((double)(Phi.Entry(t_8,t_10).value + V[Phi.Entry(i_56,i_58).value][Phi.Entry(k_24,k_27).value]*V[Phi.Entry(i_56,i_58).value][Phi.Entry(j_18,j_19).value]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "t_10", t_10.value);
                  	i_58 = new Var<Integer>((Phi.Entry(i_56,i_58).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 237, "i_58", i_58.value);
						}
						t_11 = Phi.Exit(t_9,t_10);
						t_10 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "t_11", t_11.value);
						i_59 = Phi.Exit(i_57,i_58);
						i_58 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "i_59", i_59.value);
                  t_12 = new Var<Double>((double)(-t_11.value/V[Phi.Entry(k_24,k_27).value+1][Phi.Entry(k_24,k_27).value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 238, "t_12", t_12.value);
                  i_60 = new Var<Integer>((Phi.Entry(k_24,k_27).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "i_60", i_60.value);
						while(Phi.Entry(i_56,i_61).value < n) {
                     V[Phi.Entry(i_56,i_61).value][Phi.Entry(j_18,j_19).value] = V[Phi.Entry(i_56,i_61).value][Phi.Entry(j_18,j_19).value] + Phi.Entry(t_8,t_12).value*V[Phi.Entry(i_56,i_61).value][Phi.Entry(k_24,k_27).value];
                  	i_61 = new Var<Integer>((Phi.Entry(i_56,i_61).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 241, "i_61", i_61.value);
						}
						i_62 = Phi.Exit(i_60,i_61);
						i_61 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "i_62", i_62.value);
               	j_20 = new Var<Integer>((Phi.Entry(j_18,j_20).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 242, "j_20", j_20.value);
					}
					j_21 = Phi.Exit(j_19,j_20);
					j_20 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 235, "j_21", j_21.value);
            }
            i_63 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 244, "i_63", i_63.value);
				while(Phi.Entry(i_56,i_64).value < n) {
               V[Phi.Entry(i_56,i_64).value][Phi.Entry(k_24,k_27).value] = 0.0;
            	i_64 = new Var<Integer>((Phi.Entry(i_56,i_64).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 246, "i_64", i_64.value);
				}
				i_65 = Phi.Exit(i_63,i_64);
				i_64 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 245, "i_65", i_65.value);
            V[k_27.value][k_27.value] = 1.0;
         	k_28 = new Var<Integer>((k_27.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 248, "k_28", k_28.value);
			}
			nrt_5 = Phi.Exit(nrt_3,nrt_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "nrt_5", nrt_5.value);
			k_29 = Phi.Exit(k_25,k_28);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_29", k_29.value);
      }
		nrt_6 = Phi.If((wantv_4.value),nrt_5,nrt_3);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "nrt_6", nrt_6.value);
		k_30 = Phi.If((wantv_4.value),k_29,k_24);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "k_30", k_30.value);

      // Main iteration loop for the singular values.

      pp_0 = new Var<Integer>((p_2.value-1));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 254, "pp_0", pp_0.value);
      iter_0 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 255, "iter_0", iter_0.value);
      eps_0 = new Var<Double>((double)(Math.pow(2.0,-52.0)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 256, "eps_0", eps_0.value);
      tiny_0 = new Var<Double>((double)(Math.pow(2.0,-966.0)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 257, "tiny_0", tiny_0.value);
      while (Phi.Entry(p_2,p_7).value > 0) {
         //;
			//;

         // Here is where a test for too many iterations would go.

         // This section of the program inspects for
         // negligible elements in the s and e arrays.  On
         // completion the variables kase and k are set as follows.

         // kase = 1     if s(p) and e[k-1] are negligible and k<p
         // kase = 2     if s(k) is negligible and k<p
         // kase = 3     if e[k-1] is negligible, k<p, and
         //              s(k), ..., s(p) are not negligible (qr step).
         // kase = 4     if e(p-1) is negligible (convergence).

         k_32 = new Var<Integer>((Phi.Entry(p_2,p_7).value-2));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "k_32", k_32.value);
			while(Phi.Entry(k_32,k_37).value >= -1) {
            k_33 = new Var<Integer>((Phi.Entry(k_32,k_37).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "k_33", k_33.value);
if (k_33.value == -1) {
               break;
            }
            k_34 = new Var<Integer>((k_33.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 276, "k_34", k_34.value);
k_35 = new Var<Integer>((k_34.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "k_35", k_35.value);
eps_1 = new Var<Double>((double)(Phi.Entry(eps_0,eps_1).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "eps_1", eps_1.value);
tiny_1 = new Var<Double>((double)(Phi.Entry(tiny_0,tiny_1).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "tiny_1", tiny_1.value);
k_36 = new Var<Integer>((k_35.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "k_36", k_36.value);
if (Math.abs(e[k_36.value]) <=
                  tiny_1.value + eps_1.value*(Math.abs(s[k_36.value]) + Math.abs(s[k_36.value+1]))) {
               e[k_36.value] = 0.0;
               break;
            }
         	k_37 = new Var<Integer>((k_36.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 281, "k_37", k_37.value);
			}
			eps_2 = Phi.Exit(eps_0,eps_1);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "eps_2", eps_2.value);
			k_38 = Phi.Exit(k_32,k_37);
			k_37 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "k_38", k_38.value);
			tiny_2 = Phi.Exit(tiny_0,tiny_1);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "tiny_2", tiny_2.value);
         p_3 = new Var<Integer>((Phi.Entry(p_2,p_7).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 283, "p_3", p_3.value);
k_39 = new Var<Integer>((k_38.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 283, "k_39", k_39.value);
if (k_39.value == p_3.value-2) {
            kase_1 = new Var<Integer>((4));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 284, "kase_1", kase_1.value);
         } else {
            //;
            ks_1 = new Var<Integer>((p_3.value-1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "ks_1", ks_1.value);
				while(Phi.Entry(ks_1,ks_4).value >= Phi.Entry(k_39,k_40).value) {
               k_40 = new Var<Integer>((Phi.Entry(k_39,k_40).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "k_40", k_40.value);
ks_2 = new Var<Integer>((Phi.Entry(ks_1,ks_4).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "ks_2", ks_2.value);
if (ks_2.value == k_40.value) {
                  break;
               }
               t_13 = new Var<Double>((double)((ks_2.value != Phi.Entry(p_3,p_7).value ? Math.abs(e[ks_2.value]) : 0.) + 
                          (ks_2.value != k_40.value+1 ? Math.abs(e[ks_2.value-1]) : 0.)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 291, "t_13", t_13.value);
               t_14 = new Var<Double>((double)(t_13.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "t_14", t_14.value);
eps_3 = new Var<Double>((double)(Phi.Entry(eps_2,eps_3).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "eps_3", eps_3.value);
tiny_3 = new Var<Double>((double)(Phi.Entry(tiny_2,tiny_3).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "tiny_3", tiny_3.value);
ks_3 = new Var<Integer>((ks_2.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "ks_3", ks_3.value);
if (Math.abs(s[ks_3.value]) <= tiny_3.value + eps_3.value*t_14.value)  {
                  s[ks_3.value] = 0.0;
                  break;
               }
            	ks_4 = new Var<Integer>((ks_3.value - 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 296, "ks_4", ks_4.value);
				}
				ks_5 = Phi.Exit(ks_1,ks_4);
				ks_4 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "ks_5", ks_5.value);
				eps_4 = Phi.Exit(eps_2,eps_3);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "eps_4", eps_4.value);
				k_41 = Phi.Exit(k_39,k_40);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "k_41", k_41.value);
				tiny_4 = Phi.Exit(tiny_2,tiny_3);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "tiny_4", tiny_4.value);
            p_4 = new Var<Integer>((p_3.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "p_4", p_4.value);
ks_6 = new Var<Integer>((ks_5.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "ks_6", ks_6.value);
k_42 = new Var<Integer>((k_41.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "k_42", k_42.value);
ks_7 = new Var<Integer>((ks_6.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 299, "ks_7", ks_7.value);
if (ks_7.value == k_42.value) {
               kase_2 = new Var<Integer>((3));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 300, "kase_2", kase_2.value);
            } else if (ks_7.value == p_4.value-1) {
               kase_3 = new Var<Integer>((1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 301, "kase_3", kase_3.value);
            } else {
               kase_4 = new Var<Integer>((2));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 303, "kase_4", kase_4.value);
               k_43 = new Var<Integer>((ks_7.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 304, "k_43", k_43.value);
            }
				k_44 = Phi.If((ks_7.value == k_42.value),k_42,Phi.If((ks_7.value == p_4.value-1),k_42,k_43));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 302, "k_44", k_44.value);
				kase_5 = Phi.If((ks_7.value == k_42.value),kase_2,Phi.If((ks_7.value == p_4.value-1),kase_3,kase_4));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 302, "kase_5", kase_5.value);
         }
			eps_5 = Phi.If((k_39.value == p_3.value-2),eps_2,eps_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "eps_5", eps_5.value);
			k_45 = Phi.If((k_39.value == p_3.value-2),k_39,k_44);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "k_45", k_45.value);
			p_5 = Phi.If((k_39.value == p_3.value-2),p_3,p_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "p_5", p_5.value);
			tiny_5 = Phi.If((k_39.value == p_3.value-2),tiny_2,tiny_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "tiny_5", tiny_5.value);
			kase_6 = Phi.If((k_39.value == p_3.value-2),kase_1,kase_5);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "kase_6", kase_6.value);
         k_46 = new Var<Integer>((k_45.value + 1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 307, "k_46", k_46.value);

         // Perform the task indicated by kase.

         

            // Deflate negligible s(p).

            if ((kase_6.value).equals(1)) {
 
               f_0 = new Var<Double>((double)(e[p_5.value-2]));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 317, "f_0", f_0.value);
               e[p_5.value-2] = 0.0;
               j_22 = new Var<Integer>((p_5.value-2));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 319, "j_22", j_22.value);
				while(Phi.Entry(j_21,j_24).value >= Phi.Entry(k_46,k_47).value) {
                  t_15 = new Var<Double>((double)(Maths.hypot(s[Phi.Entry(j_21,j_24).value],Phi.Entry(f_0,f_2).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 321, "t_15", t_15.value);
                  cs_0 = new Var<Double>((double)(s[Phi.Entry(j_21,j_24).value]/t_15.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 322, "cs_0", cs_0.value);
                  sn_0 = new Var<Double>((double)(Phi.Entry(f_0,f_2).value/t_15.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 322, "sn_0", sn_0.value);
                  s[Phi.Entry(j_21,j_24).value] = t_15.value;
                  k_47 = new Var<Integer>((Phi.Entry(k_46,k_47).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 322, "k_47", k_47.value);
j_23 = new Var<Integer>((Phi.Entry(j_21,j_24).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 323, "j_23", j_23.value);
if (j_23.value != k_47.value) {
                     f_1 = new Var<Double>((double)(-sn_0.value*e[j_23.value-1]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 325, "f_1", f_1.value);
                     e[j_23.value-1] = cs_0.value*e[j_23.value-1];
                  }
					f_2 = Phi.If((j_23.value != k_47.value),f_1,f_0);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 324, "f_2", f_2.value);
                  wantv_5 = new Var<Boolean>((Phi.Entry(wantv_4,wantv_5).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 326, "wantv_5", wantv_5.value);
if (wantv_5.value) {
                     i_66 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 328, "i_66", i_66.value);
						while(Phi.Entry(i_65,i_67).value < n) {
                        t_16 = new Var<Double>((double)(Phi.Entry(cs_0,cs_3).value*V[Phi.Entry(i_65,i_67).value][Phi.Entry(j_21,j_23).value] + Phi.Entry(sn_0,sn_3).value*V[Phi.Entry(i_65,i_67).value][Phi.Entry(p_5,p_7).value-1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 330, "t_16", t_16.value);
                        V[Phi.Entry(i_65,i_67).value][Phi.Entry(p_5,p_7).value-1] = -Phi.Entry(sn_0,sn_3).value*V[Phi.Entry(i_65,i_67).value][Phi.Entry(j_21,j_23).value] + Phi.Entry(cs_0,cs_3).value*V[Phi.Entry(i_65,i_67).value][Phi.Entry(p_5,p_7).value-1];
                        V[Phi.Entry(i_65,i_67).value][Phi.Entry(j_21,j_23).value] = t_16.value;
                     	i_67 = new Var<Integer>((Phi.Entry(i_65,i_67).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 332, "i_67", i_67.value);
						}
						i_68 = Phi.Exit(i_66,i_67);
						i_67 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 329, "i_68", i_68.value);
						t_17 = Phi.Exit(t_15,t_16);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 329, "t_17", t_17.value);
                  }
					t_18 = Phi.If((wantv_5.value),t_17,t_15);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 327, "t_18", t_18.value);
               	j_24 = new Var<Integer>((j_23.value - 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 334, "j_24", j_24.value);
				}
				f_3 = Phi.Exit(f_0,f_2);
				f_2 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "f_3", f_3.value);
				j_25 = Phi.Exit(j_22,j_24);
				j_24 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "j_25", j_25.value);
				k_48 = Phi.Exit(k_46,k_47);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "k_48", k_48.value);
				wantv_6 = Phi.Exit(wantv_4,wantv_5);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "wantv_6", wantv_6.value);
            
            ;}

            // Split at negligible s(k).

            else if ((kase_6.value).equals(2)) {
 
               f_4 = new Var<Double>((double)(e[k_46.value-1]));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 343, "f_4", f_4.value);
               e[k_48.value-1] = 0.0;
               j_26 = new Var<Integer>((k_46.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 345, "j_26", j_26.value);
				while(Phi.Entry(j_21,j_27).value < Phi.Entry(p_5,p_7).value) {
                  t_19 = new Var<Double>((double)(Maths.hypot(s[Phi.Entry(j_21,j_27).value],Phi.Entry(f_4,f_5).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 346, "t_19", t_19.value);
                  cs_1 = new Var<Double>((double)(s[Phi.Entry(j_21,j_27).value]/t_19.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 347, "cs_1", cs_1.value);
                  sn_1 = new Var<Double>((double)(Phi.Entry(f_4,f_5).value/t_19.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 348, "sn_1", sn_1.value);
                  s[Phi.Entry(j_21,j_27).value] = t_19.value;
                  f_5 = new Var<Double>((double)(-sn_1.value*e[Phi.Entry(j_21,j_27).value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 349, "f_5", f_5.value);
                  e[Phi.Entry(j_21,j_27).value] = cs_1.value*e[Phi.Entry(j_21,j_27).value];
                  wantu_4 = new Var<Boolean>((Phi.Entry(wantu_3,wantu_4).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 350, "wantu_4", wantu_4.value);
if (wantu_4.value) {
                     i_69 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 352, "i_69", i_69.value);
						while(Phi.Entry(i_65,i_70).value < m) {
                        t_20 = new Var<Double>((double)(Phi.Entry(cs_1,cs_3).value*U[Phi.Entry(i_65,i_70).value][Phi.Entry(j_21,j_26).value] + Phi.Entry(sn_1,sn_3).value*U[Phi.Entry(i_65,i_70).value][Phi.Entry(k_46,k_48).value-1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "t_20", t_20.value);
                        U[Phi.Entry(i_65,i_70).value][Phi.Entry(k_46,k_48).value-1] = -Phi.Entry(sn_1,sn_3).value*U[Phi.Entry(i_65,i_70).value][Phi.Entry(j_21,j_26).value] + Phi.Entry(cs_1,cs_3).value*U[Phi.Entry(i_65,i_70).value][Phi.Entry(k_46,k_48).value-1];
                        U[Phi.Entry(i_65,i_70).value][Phi.Entry(j_21,j_26).value] = t_20.value;
                     	i_70 = new Var<Integer>((Phi.Entry(i_65,i_70).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 356, "i_70", i_70.value);
						}
						i_71 = Phi.Exit(i_69,i_70);
						i_70 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "i_71", i_71.value);
						t_21 = Phi.Exit(t_19,t_20);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "t_21", t_21.value);
                  }
					t_22 = Phi.If((wantu_4.value),t_21,t_19);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 351, "t_22", t_22.value);
               	j_27 = new Var<Integer>((Phi.Entry(j_21,j_27).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 358, "j_27", j_27.value);
				}
				f_6 = Phi.Exit(f_4,f_5);
				f_5 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 345, "f_6", f_6.value);
				j_28 = Phi.Exit(j_26,j_27);
				j_27 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 345, "j_28", j_28.value);
				wantu_5 = Phi.Exit(wantu_3,wantu_4);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 345, "wantu_5", wantu_5.value);
            
            ;}

            // Perform one qr step.

            else if ((kase_6.value).equals(3)) {
 

               // Calculate the shift.
   
               scale_0 = new Var<Double>((double)(Math.max(Math.max(Math.max(Math.max(
                       Math.abs(s[p_5.value-1]),Math.abs(s[p_5.value-2])),Math.abs(e[p_5.value-2])), 
                       Math.abs(s[k_46.value])),Math.abs(e[k_46.value]))));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 370, "scale_0", scale_0.value);
               sp_0 = new Var<Double>((double)(s[p_5.value-1]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 373, "sp_0", sp_0.value);
               spm1_0 = new Var<Double>((double)(s[p_5.value-2]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 374, "spm1_0", spm1_0.value);
               epm1_0 = new Var<Double>((double)(e[p_5.value-2]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 375, "epm1_0", epm1_0.value);
               sk_0 = new Var<Double>((double)(s[k_46.value]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 376, "sk_0", sk_0.value);
               ek_0 = new Var<Double>((double)(e[k_46.value]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 377, "ek_0", ek_0.value);
               b_0 = new Var<Double>((double)(((spm1_0.value + sp_0.value)*(spm1_0.value - sp_0.value) + epm1_0.value*epm1_0.value)/2.0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 378, "b_0", b_0.value);
               c_0 = new Var<Double>((double)((sp_0.value*epm1_0.value)*(sp_0.value*epm1_0.value)));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 378, "c_0", c_0.value);
               shift_0 = new Var<Double>((double)(0.0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 378, "shift_0", shift_0.value);
               c_1 = new Var<Double>((double)(c_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 379, "c_1", c_1.value);
b_1 = new Var<Double>((double)(b_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 380, "b_1", b_1.value);
if ((b_1.value != 0.0) | (c_1.value != 0.0)) {
                  shift_1 = new Var<Double>((double)(Math.sqrt(b_1.value*b_1.value + c_1.value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 381, "shift_1", shift_1.value);
                  b_2 = new Var<Double>((double)(b_1.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 382, "b_2", b_2.value);
if (b_2.value < 0.0) {
                     shift_2 = new Var<Double>((double)(-shift_1.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 384, "shift_2", shift_2.value);
                  }
					shift_3 = Phi.If((b_2.value < 0.0),shift_2,shift_1);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 383, "shift_3", shift_3.value);
                  shift_4 = new Var<Double>((double)(c_1.value/(b_2.value + shift_3.value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 386, "shift_4", shift_4.value);
               }
				shift_5 = Phi.If(((b_1.value != 0.0) | (c_1.value != 0.0)),shift_4,shift_0);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 380, "shift_5", shift_5.value);
				b_3 = Phi.If(((b_1.value != 0.0) | (c_1.value != 0.0)),b_2,b_1);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 380, "b_3", b_3.value);
               f_7 = new Var<Double>((double)((sk_0.value + sp_0.value)*(sk_0.value - sp_0.value) + shift_5.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 388, "f_7", f_7.value);
               g_0 = new Var<Double>((double)(sk_0.value*ek_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 389, "g_0", g_0.value);
   
               // Chase zeros.
   
               j_29 = new Var<Integer>((k_46.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 393, "j_29", j_29.value);
				while(Phi.Entry(j_21,j_32).value < Phi.Entry(p_5,p_7).value-1) {
                  t_23 = new Var<Double>((double)(Maths.hypot(Phi.Entry(f_7,f_9).value,Phi.Entry(g_0,g_2).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "t_23", t_23.value);
                  cs_2 = new Var<Double>((double)(Phi.Entry(f_7,f_9).value/t_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "cs_2", cs_2.value);
                  sn_2 = new Var<Double>((double)(Phi.Entry(g_0,g_2).value/t_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 395, "sn_2", sn_2.value);
                  k_49 = new Var<Integer>((Phi.Entry(k_46,k_49).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 396, "k_49", k_49.value);
j_30 = new Var<Integer>((Phi.Entry(j_21,j_32).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 396, "j_30", j_30.value);
if (j_30.value != k_49.value) {
                     e[j_30.value-1] = t_23.value;
                  }
                  f_8 = new Var<Double>((double)(cs_2.value*s[j_30.value] + sn_2.value*e[j_30.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 400, "f_8", f_8.value);
                  e[j_30.value] = cs_2.value*e[j_30.value] - sn_2.value*s[j_30.value];
                  g_1 = new Var<Double>((double)(sn_2.value*s[j_30.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 400, "g_1", g_1.value);
                  s[j_30.value+1] = cs_2.value*s[j_30.value+1];
                  wantv_7 = new Var<Boolean>((Phi.Entry(wantv_6,wantv_7).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 402, "wantv_7", wantv_7.value);
if (wantv_7.value) {
                     i_72 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "i_72", i_72.value);
						while(Phi.Entry(i_65,i_73).value < n) {
                        t_24 = new Var<Double>((double)(Phi.Entry(cs_2,cs_3).value*V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value] + Phi.Entry(sn_2,sn_3).value*V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 405, "t_24", t_24.value);
                        V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value+1] = -Phi.Entry(sn_2,sn_3).value*V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value] + Phi.Entry(cs_2,cs_3).value*V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value+1];
                        V[Phi.Entry(i_65,i_73).value][Phi.Entry(j_21,j_30).value] = t_24.value;
                     	i_73 = new Var<Integer>((Phi.Entry(i_65,i_73).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 408, "i_73", i_73.value);
						}
						i_74 = Phi.Exit(i_72,i_73);
						i_73 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "i_74", i_74.value);
						t_25 = Phi.Exit(t_23,t_24);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "t_25", t_25.value);
                  }
					t_26 = Phi.If((wantv_7.value),t_25,t_23);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 403, "t_26", t_26.value);
                  t_27 = new Var<Double>((double)(Maths.hypot(f_8.value,g_1.value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 411, "t_27", t_27.value);
                  cs_3 = new Var<Double>((double)(f_8.value/t_27.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 412, "cs_3", cs_3.value);
                  sn_3 = new Var<Double>((double)(g_1.value/t_27.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 413, "sn_3", sn_3.value);
                  s[j_30.value] = t_27.value;
                  f_9 = new Var<Double>((double)(cs_3.value*e[j_30.value] + sn_3.value*s[j_30.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 415, "f_9", f_9.value);
                  s[j_30.value+1] = -sn_3.value*e[j_30.value] + cs_3.value*s[j_30.value+1];
                  g_2 = new Var<Double>((double)(sn_3.value*e[j_30.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 415, "g_2", g_2.value);
                  e[j_30.value+1] = cs_3.value*e[j_30.value+1];
                  j_31 = new Var<Integer>((j_30.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 416, "j_31", j_31.value);
wantu_6 = new Var<Boolean>((Phi.Entry(wantu_5,wantu_6).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 417, "wantu_6", wantu_6.value);
if (wantu_6.value && (j_31.value < m-1)) {
                     i_75 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "i_75", i_75.value);
						while(Phi.Entry(i_65,i_76).value < m) {
                        t_28 = new Var<Double>((double)(Phi.Entry(cs_3,cs_3).value*U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value] + Phi.Entry(sn_3,sn_3).value*U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 420, "t_28", t_28.value);
                        U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value+1] = -Phi.Entry(sn_3,sn_3).value*U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value] + Phi.Entry(cs_3,cs_3).value*U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value+1];
                        U[Phi.Entry(i_65,i_76).value][Phi.Entry(j_21,j_31).value] = t_28.value;
                     	i_76 = new Var<Integer>((Phi.Entry(i_65,i_76).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 422, "i_76", i_76.value);
						}
						i_77 = Phi.Exit(i_75,i_76);
						i_76 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "i_77", i_77.value);
						t_29 = Phi.Exit(t_27,t_28);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "t_29", t_29.value);
                  }
					t_30 = Phi.If((wantu_6.value && (j_31.value < m-1)),t_29,t_27);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 418, "t_30", t_30.value);
               	j_32 = new Var<Integer>((j_31.value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 425, "j_32", j_32.value);
				}
				wantv_8 = Phi.Exit(wantv_6,wantv_7);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "wantv_8", wantv_8.value);
				wantu_7 = Phi.Exit(wantu_5,wantu_6);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "wantu_7", wantu_7.value);
				f_10 = Phi.Exit(f_7,f_9);
				f_9 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "f_10", f_10.value);
				g_3 = Phi.Exit(g_0,g_2);
				g_2 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "g_3", g_3.value);
				j_33 = Phi.Exit(j_29,j_32);
				j_32 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "j_33", j_33.value);
				k_50 = Phi.Exit(k_48,k_49);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "k_50", k_50.value);
               e[p_5.value-2] = f_10.value;
               iter_1 = new Var<Integer>((Phi.Entry(iter_0,iter_3).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 428, "iter_1", iter_1.value);
            
            ;}

            // Convergence.

            else if ((kase_6.value).equals(4)) {
 

               // Make the singular values positive.
   
               k_51 = new Var<Integer>((k_46.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 437, "k_51", k_51.value);
if (s[k_51.value] <= 0.0) {
                  s[k_51.value] = (s[k_51.value] < 0.0 ? -s[k_51.value] : 0.0);
                  wantv_9 = new Var<Boolean>((Phi.Entry(wantv_8,wantv_13).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 439, "wantv_9", wantv_9.value);
if (wantv_9.value) {
                     i_78 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 440, "i_78", i_78.value);
						while(Phi.Entry(i_65,i_79).value <= Phi.Entry(pp_0,pp_0).value) {
                        V[Phi.Entry(i_65,i_79).value][Phi.Entry(k_46,k_51).value] = -V[Phi.Entry(i_65,i_79).value][Phi.Entry(k_46,k_51).value];
                     	i_79 = new Var<Integer>((Phi.Entry(i_65,i_79).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 443, "i_79", i_79.value);
						}
						i_80 = Phi.Exit(i_78,i_79);
						i_79 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 441, "i_80", i_80.value);
                  }
               }
				wantv_10 = Phi.If((s[k_51.value] <= 0.0),wantv_9,wantv_8);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 437, "wantv_10", wantv_10.value);
   
               // Order the singular values.
   
               while (Phi.Entry(k_46,k_56).value < Phi.Entry(pp_0,pp_0).value) {
                  k_52 = new Var<Integer>((Phi.Entry(k_46,k_56).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 449, "k_52", k_52.value);
k_53 = new Var<Integer>((k_52.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 450, "k_53", k_53.value);
if (s[k_53.value] >= s[k_53.value+1]) {
                     ;
                  }
                  t_31 = new Var<Double>((double)(s[k_53.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 453, "t_31", t_31.value);
                  s[k_53.value] = s[k_53.value+1];
                  s[k_53.value+1] = t_31.value;
                  k_54 = new Var<Integer>((k_53.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 454, "k_54", k_54.value);
wantv_11 = new Var<Boolean>((Phi.Entry(wantv_10,wantv_11).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 455, "wantv_11", wantv_11.value);
if (wantv_11.value && (k_54.value < n-1)) {
                     i_81 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 456, "i_81", i_81.value);
						while(Phi.Entry(i_65,i_82).value < n) {
                        t_32 = new Var<Double>((double)(V[Phi.Entry(i_65,i_82).value][Phi.Entry(k_46,k_54).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 458, "t_32", t_32.value); V[Phi.Entry(i_65,i_82).value][Phi.Entry(k_46,k_54).value+1] = V[Phi.Entry(i_65,i_82).value][Phi.Entry(k_46,k_54).value]; V[Phi.Entry(i_65,i_82).value][Phi.Entry(k_46,k_54).value] = t_32.value;
                     	i_82 = new Var<Integer>((Phi.Entry(i_65,i_82).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 458, "i_82", i_82.value);
						}
						i_83 = Phi.Exit(i_81,i_82);
						i_82 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 457, "i_83", i_83.value);
						t_33 = Phi.Exit(t_31,t_32);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 457, "t_33", t_33.value);
                  }
					t_34 = Phi.If((wantv_11.value && (k_54.value < n-1)),t_33,t_31);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 455, "t_34", t_34.value);
                  k_55 = new Var<Integer>((k_54.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 459, "k_55", k_55.value);
wantu_8 = new Var<Boolean>((Phi.Entry(wantu_7,wantu_8).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 460, "wantu_8", wantu_8.value);
if (wantu_8.value && (k_55.value < m-1)) {
                     i_84 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 461, "i_84", i_84.value);
						while(Phi.Entry(i_65,i_85).value < m) {
                        t_35 = new Var<Double>((double)(U[Phi.Entry(i_65,i_85).value][Phi.Entry(k_46,k_55).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 463, "t_35", t_35.value); U[Phi.Entry(i_65,i_85).value][Phi.Entry(k_46,k_55).value+1] = U[Phi.Entry(i_65,i_85).value][Phi.Entry(k_46,k_55).value]; U[Phi.Entry(i_65,i_85).value][Phi.Entry(k_46,k_55).value] = t_35.value;
                     	i_85 = new Var<Integer>((Phi.Entry(i_65,i_85).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 464, "i_85", i_85.value);
						}
						i_86 = Phi.Exit(i_84,i_85);
						i_85 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 462, "i_86", i_86.value);
						t_36 = Phi.Exit(t_34,t_35);
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 462, "t_36", t_36.value);
                  }
					t_37 = Phi.If((wantu_8.value && (k_55.value < m-1)),t_36,t_34);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 460, "t_37", t_37.value);
                  k_56 = new Var<Integer>((k_55.value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 467, "k_56", k_56.value);
               }
				wantv_12 = Phi.Exit(wantv_10,wantv_11);
				wantv_11 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "wantv_12", wantv_12.value);
				wantu_9 = Phi.Exit(wantu_7,wantu_8);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "wantu_9", wantu_9.value);
				k_57 = Phi.Exit(k_51,k_56);
				k_56 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "k_57", k_57.value);
               iter_2 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 469, "iter_2", iter_2.value);
               p_6 = new Var<Integer>((p_5.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 470, "p_6", p_6.value);
            
            ;}
			wantv_13 = Phi.If(((kase_6.value).equals(3)),wantv_8,Phi.If(((kase_6.value).equals(4)),wantv_12,wantv_6));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "wantv_13", wantv_13.value);
			wantu_10 = Phi.If(((kase_6.value).equals(3)),wantu_7,Phi.If(((kase_6.value).equals(4)),wantu_9,wantu_5));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "wantu_10", wantu_10.value);
			iter_3 = Phi.If(((kase_6.value).equals(3)),iter_1,Phi.If(((kase_6.value).equals(4)),iter_2,iter_0));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "iter_3", iter_3.value);
			k_58 = Phi.If(((kase_6.value).equals(3)),k_50,Phi.If(((kase_6.value).equals(4)),k_57,k_48));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "k_58", k_58.value);
			p_7 = Phi.If(((kase_6.value).equals(3)),p_5,Phi.If(((kase_6.value).equals(4)),p_6,p_5));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "p_7", p_7.value);
         
      }
		wantv_14 = Phi.Exit(wantv_6,wantv_13);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "wantv_14", wantv_14.value);
		wantu_11 = Phi.Exit(wantu_5,wantu_10);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "wantu_11", wantu_11.value);
		iter_4 = Phi.Exit(iter_0,iter_3);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "iter_4", iter_4.value);
		k_59 = Phi.Exit(k_48,k_58);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "k_59", k_59.value);
		p_8 = Phi.Exit(p_5,p_7);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "p_8", p_8.value);
   }

/* ------------------------
   Public Methods
 * ------------------------ */

   /** Return the left singular vectors
   @return     U
   */

   public Matrix getU () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return new Matrix(U,m,Math.min(m+1,n));
   }

   /** Return the right singular vectors
   @return     V
   */

   public Matrix getV () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return new Matrix(V,n,n);
   }

   /** Return the one-dimensional array of singular values
   @return     diagonal of S.
   */

   public double[] getSingularValues () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return s;
   }

   /** Return the diagonal matrix of singular values
   @return     S
   */

   public Matrix getS () {
		// formal parameters

		// all variables are declared to null
		Var<Matrix> X_0 = null;
		Var<Integer> i_87 = null;
		Var<Integer> j_34 = null;
		Var<Integer> j_35 = null;
		Var<Integer> j_36 = null;
		Var<Integer> i_88 = null;
		Var<Integer> i_89 = null;
      
		/* PROGRAM STARTS */
		X_0 = new Var<Matrix>((new Matrix(n,n)));
		Output.record("SingularValueDecomposition", "getS", 508, "X_0", X_0.value);
      double S[][] = X_0.value.getArray();
      i_87 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "getS", 509, "i_87", i_87.value);
		while(Phi.Entry(i_87,i_88).value < n) {
         j_34 = new Var<Integer>((0));
			Output.record("SingularValueDecomposition", "getS", 511, "j_34", j_34.value);
			while(Phi.Entry(j_34,j_35).value < n) {
            S[Phi.Entry(i_87,i_88).value][Phi.Entry(j_34,j_35).value] = 0.0;
         	j_35 = new Var<Integer>((Phi.Entry(j_34,j_35).value + 1));
				Output.record("SingularValueDecomposition", "getS", 513, "j_35", j_35.value);
			}
			j_36 = Phi.Exit(j_34,j_35);
			j_35 = null;
			Output.record("SingularValueDecomposition", "getS", 512, "j_36", j_36.value);
         S[Phi.Entry(i_87,i_88).value][Phi.Entry(i_87,i_88).value] = this.s[Phi.Entry(i_87,i_88).value];
      	i_88 = new Var<Integer>((Phi.Entry(i_87,i_88).value + 1));
			Output.record("SingularValueDecomposition", "getS", 516, "i_88", i_88.value);
		}
		i_89 = Phi.Exit(i_87,i_88);
		Output.record("SingularValueDecomposition", "getS", 510, "i_89", i_89.value);
      return X_0.value;
   }

   /** Two norm
   @return     max(S)
   */

   public double norm2 () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return s[0];
   }

   /** Two norm condition number
   @return     max(S)/min(S)
   */

   public double cond () {
		// formal parameters

		// all variables are declared to null
      
		/* PROGRAM STARTS */
		return s[0]/s[Math.min(m,n)-1];
   }

   /** Effective numerical matrix rank
   @return     Number of nonnegligible singular values.
   */

   public int rank () {
		// formal parameters

		// all variables are declared to null
		Var<Double> eps_6 = null;
		Var<Double> tol_0 = null;
		Var<Integer> r_0 = null;
		Var<Integer> i_90 = null;
		Var<Double> tol_1 = null;
		Var<Integer> i_91 = null;
		Var<Integer> r_1 = null;
		Var<Integer> r_2 = null;
		Var<Integer> i_92 = null;
		Var<Double> tol_2 = null;
		Var<Integer> i_93 = null;
		Var<Integer> r_3 = null;
      
		/* PROGRAM STARTS */
		eps_6 = new Var<Double>((double)(Math.pow(2.0,-52.0)));
		Output.record("SingularValueDecomposition", "rank", 542, "eps_6", eps_6.value);
      tol_0 = new Var<Double>((double)(Math.max(m,n)*s[0]*eps_6.value));
		Output.record("SingularValueDecomposition", "rank", 541, "tol_0", tol_0.value);
      r_0 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "rank", 541, "r_0", r_0.value);
      i_90 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "rank", 542, "i_90", i_90.value);
		while(Phi.Entry(i_90,i_92).value < s.length) {
         tol_1 = new Var<Double>((double)(Phi.Entry(tol_0,tol_1).value));
			Output.record("SingularValueDecomposition", "rank", 544, "tol_1", tol_1.value);
i_91 = new Var<Integer>((Phi.Entry(i_90,i_92).value));
			Output.record("SingularValueDecomposition", "rank", 544, "i_91", i_91.value);
if (s[i_91.value] > tol_1.value) {
            r_1 = new Var<Integer>((Phi.Entry(r_0,r_2).value + 1));
				Output.record("SingularValueDecomposition", "rank", 546, "r_1", r_1.value);
         }
			r_2 = Phi.If((s[i_91.value] > tol_1.value),r_1,r_0);
			Output.record("SingularValueDecomposition", "rank", 545, "r_2", r_2.value);
      	i_92 = new Var<Integer>((i_91.value + 1));
			Output.record("SingularValueDecomposition", "rank", 548, "i_92", i_92.value);
		}
		tol_2 = Phi.Exit(tol_0,tol_1);
		Output.record("SingularValueDecomposition", "rank", 543, "tol_2", tol_2.value);
		i_93 = Phi.Exit(i_90,i_92);
		Output.record("SingularValueDecomposition", "rank", 543, "i_93", i_93.value);
		r_3 = Phi.Exit(r_0,r_2);
		Output.record("SingularValueDecomposition", "rank", 543, "r_3", r_3.value);
      return r_3.value;
   }
  private static final long serialVersionUID = 1;
}
