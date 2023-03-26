package outputs.SingularValueDecomposition_Output;
import gsa.Fluky;
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
		Var<Integer> k_1 = null;
		Var<Integer> nrt_1 = null;
		Var<Integer> nct_1 = null;
		Var<Integer> k_2 = null;
		Var<Integer> nct_2 = null;
		Var<Integer> k_3 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> k_4 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> k_5 = null;
		Var<Integer> k_6 = null;
		Var<Integer> k_7 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> k_8 = null;
		Var<Integer> i_8 = null;
		Var<Integer> i_9 = null;
		Var<Integer> i_10 = null;
		Var<Integer> k_9 = null;
		Var<Integer> k_10 = null;
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> k_11 = null;
		Var<Integer> k_12 = null;
		Var<Integer> nct_3 = null;
		Var<Integer> k_13 = null;
		Var<Double> t_0 = null;
		Var<Integer> i_11 = null;
		Var<Integer> i_12 = null;
		Var<Integer> i_13 = null;
		Var<Integer> k_14 = null;
		Var<Double> t_1 = null;
		Var<Integer> i_14 = null;
		Var<Double> t_2 = null;
		Var<Integer> i_15 = null;
		Var<Double> t_3 = null;
		Var<Integer> i_16 = null;
		Var<Integer> i_17 = null;
		Var<Integer> i_18 = null;
		Var<Integer> k_15 = null;
		Var<Integer> i_19 = null;
		Var<Integer> i_20 = null;
		Var<Integer> k_16 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> k_17 = null;
		Var<Integer> nct_4 = null;
		Var<Integer> nct_5 = null;
		Var<Integer> k_18 = null;
		Var<Boolean> wantu_1 = null;
		Var<Integer> i_21 = null;
		Var<Integer> i_22 = null;
		Var<Integer> i_23 = null;
		Var<Integer> k_19 = null;
		Var<Integer> i_24 = null;
		Var<Integer> i_25 = null;
		Var<Integer> k_20 = null;
		Var<Integer> nrt_2 = null;
		Var<Integer> k_21 = null;
		Var<Integer> i_26 = null;
		Var<Integer> i_27 = null;
		Var<Integer> i_28 = null;
		Var<Integer> k_22 = null;
		Var<Integer> i_29 = null;
		Var<Integer> i_30 = null;
		Var<Integer> k_23 = null;
		Var<Integer> k_24 = null;
		Var<Integer> i_31 = null;
		Var<Integer> i_32 = null;
		Var<Integer> i_33 = null;
		Var<Integer> k_25 = null;
		Var<Integer> i_34 = null;
		Var<Integer> i_35 = null;
		Var<Integer> i_36 = null;
		Var<Integer> k_26 = null;
		Var<Integer> k_27 = null;
		Var<Integer> k_28 = null;
		Var<Integer> i_37 = null;
		Var<Integer> i_38 = null;
		Var<Integer> i_39 = null;
		Var<Integer> k_29 = null;
		Var<Integer> i_40 = null;
		Var<Integer> i_41 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;
		Var<Integer> j_7 = null;
		Var<Integer> k_30 = null;
		Var<Integer> i_42 = null;
		Var<Integer> i_43 = null;
		Var<Integer> i_44 = null;
		Var<Integer> k_31 = null;
		Var<Integer> i_45 = null;
		Var<Integer> i_46 = null;
		Var<Integer> j_8 = null;
		Var<Integer> i_47 = null;
		Var<Integer> j_9 = null;
		Var<Integer> k_32 = null;
		Var<Integer> j_10 = null;
		Var<Integer> j_11 = null;
		Var<Integer> j_12 = null;
		Var<Integer> k_33 = null;
		Var<Double> t_4 = null;
		Var<Integer> i_48 = null;
		Var<Integer> i_49 = null;
		Var<Integer> i_50 = null;
		Var<Integer> k_34 = null;
		Var<Integer> i_51 = null;
		Var<Integer> i_52 = null;
		Var<Integer> j_13 = null;
		Var<Integer> i_53 = null;
		Var<Integer> j_14 = null;
		Var<Integer> k_35 = null;
		Var<Integer> i_54 = null;
		Var<Integer> j_15 = null;
		Var<Integer> k_36 = null;
		Var<Boolean> wantv_1 = null;
		Var<Integer> i_55 = null;
		Var<Integer> i_56 = null;
		Var<Integer> i_57 = null;
		Var<Integer> k_37 = null;
		Var<Integer> i_58 = null;
		Var<Integer> i_59 = null;
		Var<Integer> i_60 = null;
		Var<Integer> k_38 = null;
		Var<Integer> j_16 = null;
		Var<Integer> k_39 = null;
		Var<Boolean> wantv_2 = null;
		Var<Integer> k_40 = null;
		Var<Integer> nrt_3 = null;
		Var<Integer> k_41 = null;
		Var<Boolean> wantv_3 = null;
		Var<Integer> nct_6 = null;
		Var<Boolean> wantu_2 = null;
		Var<Integer> p_0 = null;
		Var<Integer> nct_7 = null;
		Var<Integer> p_1 = null;
		Var<Integer> p_2 = null;
		Var<Integer> nrt_4 = null;
		Var<Boolean> wantu_3 = null;
		Var<Integer> j_17 = null;
		Var<Integer> j_18 = null;
		Var<Integer> nu_1 = null;
		Var<Integer> j_19 = null;
		Var<Integer> nct_8 = null;
		Var<Integer> i_61 = null;
		Var<Integer> i_62 = null;
		Var<Integer> i_63 = null;
		Var<Integer> i_64 = null;
		Var<Integer> i_65 = null;
		Var<Integer> j_20 = null;
		Var<Integer> j_21 = null;
		Var<Integer> k_42 = null;
		Var<Integer> k_43 = null;
		Var<Integer> k_44 = null;
		Var<Integer> nct_9 = null;
		Var<Integer> k_45 = null;
		Var<Integer> j_22 = null;
		Var<Integer> j_23 = null;
		Var<Integer> nu_2 = null;
		Var<Integer> j_24 = null;
		Var<Integer> k_46 = null;
		Var<Double> t_5 = null;
		Var<Integer> i_66 = null;
		Var<Integer> i_67 = null;
		Var<Integer> i_68 = null;
		Var<Integer> k_47 = null;
		Var<Double> t_6 = null;
		Var<Integer> i_69 = null;
		Var<Double> t_7 = null;
		Var<Integer> i_70 = null;
		Var<Double> t_8 = null;
		Var<Integer> i_71 = null;
		Var<Integer> i_72 = null;
		Var<Integer> i_73 = null;
		Var<Integer> k_48 = null;
		Var<Integer> i_74 = null;
		Var<Integer> i_75 = null;
		Var<Integer> j_25 = null;
		Var<Integer> j_26 = null;
		Var<Integer> k_49 = null;
		Var<Integer> i_76 = null;
		Var<Integer> i_77 = null;
		Var<Integer> i_78 = null;
		Var<Integer> k_50 = null;
		Var<Integer> i_79 = null;
		Var<Integer> i_80 = null;
		Var<Integer> i_81 = null;
		Var<Integer> i_82 = null;
		Var<Integer> k_51 = null;
		Var<Integer> i_83 = null;
		Var<Integer> i_84 = null;
		Var<Integer> i_85 = null;
		Var<Integer> i_86 = null;
		Var<Integer> i_87 = null;
		Var<Integer> i_88 = null;
		Var<Integer> i_89 = null;
		Var<Integer> i_90 = null;
		Var<Integer> nu_3 = null;
		Var<Integer> j_27 = null;
		Var<Integer> k_52 = null;
		Var<Integer> k_53 = null;
		Var<Integer> nu_4 = null;
		Var<Integer> j_28 = null;
		Var<Integer> k_54 = null;
		Var<Integer> nu_5 = null;
		Var<Integer> k_55 = null;
		Var<Integer> nct_10 = null;
		Var<Boolean> wantv_4 = null;
		Var<Integer> k_56 = null;
		Var<Integer> k_57 = null;
		Var<Integer> k_58 = null;
		Var<Integer> k_59 = null;
		Var<Integer> nrt_5 = null;
		Var<Integer> k_60 = null;
		Var<Integer> j_29 = null;
		Var<Integer> j_30 = null;
		Var<Integer> nu_6 = null;
		Var<Integer> j_31 = null;
		Var<Integer> k_61 = null;
		Var<Double> t_9 = null;
		Var<Integer> i_91 = null;
		Var<Integer> i_92 = null;
		Var<Integer> i_93 = null;
		Var<Integer> k_62 = null;
		Var<Double> t_10 = null;
		Var<Integer> i_94 = null;
		Var<Double> t_11 = null;
		Var<Integer> i_95 = null;
		Var<Double> t_12 = null;
		Var<Integer> i_96 = null;
		Var<Integer> i_97 = null;
		Var<Integer> i_98 = null;
		Var<Integer> k_63 = null;
		Var<Integer> i_99 = null;
		Var<Integer> i_100 = null;
		Var<Integer> j_32 = null;
		Var<Integer> j_33 = null;
		Var<Integer> k_64 = null;
		Var<Integer> nu_7 = null;
		Var<Integer> k_65 = null;
		Var<Integer> i_101 = null;
		Var<Integer> i_102 = null;
		Var<Integer> i_103 = null;
		Var<Integer> i_104 = null;
		Var<Integer> i_105 = null;
		Var<Integer> k_66 = null;
		Var<Integer> nrt_6 = null;
		Var<Integer> nu_8 = null;
		Var<Integer> k_67 = null;
		Var<Integer> nrt_7 = null;
		Var<Integer> nu_9 = null;
		Var<Integer> k_68 = null;
		Var<Integer> pp_0 = null;
		Var<Integer> iter_0 = null;
		Var<Double> eps_0 = null;
		Var<Double> tiny_0 = null;
		Var<Integer> p_3 = null;
		Var<Integer> k_69 = null;
		Var<Integer> kase_0 = null;
		Var<Integer> k_70 = null;
		Var<Integer> k_71 = null;
		Var<Integer> k_72 = null;
		Var<Integer> p_4 = null;
		Var<Integer> k_73 = null;
		Var<Integer> k_74 = null;
		Var<Integer> k_75 = null;
		Var<Integer> k_76 = null;
		Var<Double> eps_1 = null;
		Var<Double> tiny_1 = null;
		Var<Integer> k_77 = null;
		Var<Integer> k_78 = null;
		Var<Double> eps_2 = null;
		Var<Integer> k_79 = null;
		Var<Double> tiny_2 = null;
		Var<Integer> p_5 = null;
		Var<Integer> k_80 = null;
		Var<Integer> kase_1 = null;
		Var<Integer> ks_0 = null;
		Var<Integer> ks_1 = null;
		Var<Integer> ks_2 = null;
		Var<Integer> k_81 = null;
		Var<Integer> ks_3 = null;
		Var<Integer> p_6 = null;
		Var<Integer> ks_4 = null;
		Var<Integer> k_82 = null;
		Var<Integer> ks_5 = null;
		Var<Double> t_13 = null;
		Var<Double> t_14 = null;
		Var<Double> eps_3 = null;
		Var<Double> tiny_3 = null;
		Var<Integer> ks_6 = null;
		Var<Integer> ks_7 = null;
		Var<Integer> ks_8 = null;
		Var<Double> eps_4 = null;
		Var<Integer> k_83 = null;
		Var<Double> tiny_4 = null;
		Var<Integer> p_7 = null;
		Var<Integer> ks_9 = null;
		Var<Integer> k_84 = null;
		Var<Integer> ks_10 = null;
		Var<Integer> kase_2 = null;
		Var<Integer> kase_3 = null;
		Var<Integer> kase_4 = null;
		Var<Integer> k_85 = null;
		Var<Integer> k_86 = null;
		Var<Integer> kase_5 = null;
		Var<Double> eps_5 = null;
		Var<Integer> k_87 = null;
		Var<Integer> p_8 = null;
		Var<Double> tiny_5 = null;
		Var<Integer> kase_6 = null;
		Var<Integer> k_88 = null;
		Var<Double> f_0 = null;
		Var<Integer> j_34 = null;
		Var<Integer> j_35 = null;
		Var<Integer> k_89 = null;
		Var<Integer> j_36 = null;
		Var<Integer> p_9 = null;
		Var<Double> t_15 = null;
		Var<Double> cs_0 = null;
		Var<Double> sn_0 = null;
		Var<Integer> k_90 = null;
		Var<Integer> j_37 = null;
		Var<Double> f_1 = null;
		Var<Double> f_2 = null;
		Var<Boolean> wantv_5 = null;
		Var<Integer> i_106 = null;
		Var<Integer> i_107 = null;
		Var<Integer> i_108 = null;
		Var<Double> t_16 = null;
		Var<Integer> i_109 = null;
		Var<Integer> i_110 = null;
		Var<Double> t_17 = null;
		Var<Double> t_18 = null;
		Var<Integer> j_38 = null;
		Var<Double> f_3 = null;
		Var<Integer> j_39 = null;
		Var<Integer> k_91 = null;
		Var<Boolean> wantv_6 = null;
		Var<Double> f_4 = null;
		Var<Integer> j_40 = null;
		Var<Integer> j_41 = null;
		Var<Integer> p_10 = null;
		Var<Integer> j_42 = null;
		Var<Integer> k_92 = null;
		Var<Double> t_19 = null;
		Var<Double> cs_1 = null;
		Var<Double> sn_1 = null;
		Var<Double> f_5 = null;
		Var<Boolean> wantu_4 = null;
		Var<Integer> i_111 = null;
		Var<Integer> i_112 = null;
		Var<Integer> i_113 = null;
		Var<Double> t_20 = null;
		Var<Integer> i_114 = null;
		Var<Integer> i_115 = null;
		Var<Double> t_21 = null;
		Var<Double> t_22 = null;
		Var<Integer> j_43 = null;
		Var<Double> f_6 = null;
		Var<Integer> j_44 = null;
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
		Var<Integer> j_45 = null;
		Var<Integer> j_46 = null;
		Var<Integer> p_11 = null;
		Var<Integer> j_47 = null;
		Var<Integer> k_93 = null;
		Var<Double> t_23 = null;
		Var<Double> cs_2 = null;
		Var<Double> sn_2 = null;
		Var<Integer> k_94 = null;
		Var<Integer> j_48 = null;
		Var<Double> f_8 = null;
		Var<Double> g_1 = null;
		Var<Boolean> wantv_7 = null;
		Var<Integer> i_116 = null;
		Var<Integer> i_117 = null;
		Var<Integer> i_118 = null;
		Var<Double> t_24 = null;
		Var<Integer> i_119 = null;
		Var<Integer> i_120 = null;
		Var<Double> t_25 = null;
		Var<Double> t_26 = null;
		Var<Double> t_27 = null;
		Var<Double> cs_3 = null;
		Var<Double> sn_3 = null;
		Var<Double> f_9 = null;
		Var<Double> g_2 = null;
		Var<Integer> j_49 = null;
		Var<Boolean> wantu_6 = null;
		Var<Integer> i_121 = null;
		Var<Integer> i_122 = null;
		Var<Integer> i_123 = null;
		Var<Double> t_28 = null;
		Var<Integer> i_124 = null;
		Var<Integer> i_125 = null;
		Var<Double> t_29 = null;
		Var<Double> t_30 = null;
		Var<Integer> j_50 = null;
		Var<Boolean> wantv_8 = null;
		Var<Boolean> wantu_7 = null;
		Var<Double> f_10 = null;
		Var<Double> g_3 = null;
		Var<Integer> j_51 = null;
		Var<Integer> k_95 = null;
		Var<Integer> iter_1 = null;
		Var<Integer> k_96 = null;
		Var<Boolean> wantv_9 = null;
		Var<Integer> i_126 = null;
		Var<Integer> i_127 = null;
		Var<Integer> pp_1 = null;
		Var<Integer> i_128 = null;
		Var<Integer> i_129 = null;
		Var<Integer> i_130 = null;
		Var<Integer> pp_2 = null;
		Var<Integer> pp_3 = null;
		Var<Boolean> wantv_10 = null;
		Var<Integer> pp_4 = null;
		Var<Integer> k_97 = null;
		Var<Integer> k_98 = null;
		Var<Integer> k_99 = null;
		Var<Double> t_31 = null;
		Var<Integer> k_100 = null;
		Var<Boolean> wantv_11 = null;
		Var<Integer> i_131 = null;
		Var<Integer> i_132 = null;
		Var<Integer> i_133 = null;
		Var<Double> t_32 = null;
		Var<Integer> i_134 = null;
		Var<Integer> i_135 = null;
		Var<Double> t_33 = null;
		Var<Double> t_34 = null;
		Var<Integer> k_101 = null;
		Var<Boolean> wantu_8 = null;
		Var<Integer> i_136 = null;
		Var<Integer> i_137 = null;
		Var<Integer> i_138 = null;
		Var<Double> t_35 = null;
		Var<Integer> i_139 = null;
		Var<Integer> i_140 = null;
		Var<Double> t_36 = null;
		Var<Double> t_37 = null;
		Var<Integer> k_102 = null;
		Var<Boolean> wantv_12 = null;
		Var<Boolean> wantu_9 = null;
		Var<Integer> k_103 = null;
		Var<Integer> iter_2 = null;
		Var<Integer> p_12 = null;
		Var<Integer> pp_5 = null;
		Var<Boolean> wantv_13 = null;
		Var<Boolean> wantu_10 = null;
		Var<Integer> iter_3 = null;
		Var<Integer> k_104 = null;
		Var<Integer> p_13 = null;
		Var<Integer> pp_6 = null;
		Var<Boolean> wantv_14 = null;
		Var<Boolean> wantu_11 = null;
		Var<Integer> iter_4 = null;
		Var<Integer> k_105 = null;
		Var<Integer> p_14 = null;

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
		k_1 = new Var<Integer>((k_0.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 78, "k_1", k_1.value);
		nrt_1 = new Var<Integer>((nrt_0.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 78, "nrt_1", nrt_1.value);
		nct_1 = new Var<Integer>((nct_0.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 78, "nct_1", nct_1.value);
		k_2 = new Var<Integer>((k_1.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 78, "k_2", k_2.value);
		while(Phi.Entry(k_2,k_40).value < Math.max(Phi.Entry(nct_1,nct_5).value,Phi.Entry(nrt_1,nrt_2).value)) {
         nct_2 = new Var<Integer>((Phi.Entry(nct_1,nct_5).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nct_2", nct_2.value);
			k_3 = new Var<Integer>((Phi.Entry(k_2,k_40).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "k_3", k_3.value);
			if (k_3.value < nct_2.value) {

            // Compute the transformation for the k-th column and
            // place the k-th diagonal in s[k].
            // Compute 2-norm of k-th column without under/overflow.
            s[k_3.value] = 0;
            i_0 = new Var<Integer>((k_3.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 85, "i_0", i_0.value);
				i_1 = new Var<Integer>((i_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 85, "i_1", i_1.value);
				i_2 = new Var<Integer>((i_1.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 84, "i_2", i_2.value);
				k_4 = new Var<Integer>((k_3.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 85, "k_4", k_4.value);
				while(Phi.Entry(i_2,i_3).value < m) {
               s[Phi.Entry(k_4,k_40).value] = Maths.hypot(s[Phi.Entry(k_4,k_40).value],A[Phi.Entry(i_2,i_3).value][Phi.Entry(k_4,k_40).value]);
            	i_3 = new Var<Integer>((Phi.Entry(i_2,i_3).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 87, "i_3", i_3.value);
				}
				i_4 = Phi.Exit(i_2,i_3);
				i_3 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 86, "i_4", i_4.value);
            k_5 = new Var<Integer>((k_4.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 88, "k_5", k_5.value);
				if (s[k_5.value] != 0.0) {
               k_6 = new Var<Integer>((k_5.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_6", k_6.value);
					k_7 = new Var<Integer>((k_6.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_7", k_7.value);
					if (A[k_7.value][k_7.value] < 0.0) {
                  s[k_7.value] = -s[k_7.value];
               }
               i_5 = new Var<Integer>((k_7.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 92, "i_5", i_5.value);
					i_6 = new Var<Integer>((i_5.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 92, "i_6", i_6.value);
					i_7 = new Var<Integer>((i_6.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 91, "i_7", i_7.value);
					k_8 = new Var<Integer>((k_7.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 92, "k_8", k_8.value);
					while(Phi.Entry(i_7,i_8).value < m) {
                  A[Phi.Entry(i_7,i_8).value][Phi.Entry(k_8,k_40).value] = A[Phi.Entry(i_7,i_8).value][Phi.Entry(k_8,k_40).value] / s[Phi.Entry(k_8,k_40).value];
               	i_8 = new Var<Integer>((Phi.Entry(i_7,i_8).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 94, "i_8", i_8.value);
					}
					i_9 = Phi.Exit(i_7,i_8);
					i_8 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 93, "i_9", i_9.value);
               A[k_8.value][k_8.value] = A[k_8.value][k_8.value] + 1.0;
            }
				i_10 = Phi.If((s[k_5.value] != 0.0),i_9,i_4);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "i_10", i_10.value);
				k_9 = Phi.If((s[k_5.value] != 0.0),k_8,k_5);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 89, "k_9", k_9.value);
            s[k_9.value] = -s[k_9.value];
         }
			k_10 = Phi.If((k_3.value < nct_2.value),k_9,k_3);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 80, "k_10", k_10.value);
         j_0 = new Var<Integer>((k_10.value+1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 99, "j_0", j_0.value);
			j_1 = new Var<Integer>((j_0.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 99, "j_1", j_1.value);
			j_2 = new Var<Integer>((j_1.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 99, "j_2", j_2.value);
			k_11 = new Var<Integer>((k_10.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "k_11", k_11.value);
			while(Phi.Entry(j_2,j_3).value < n) {
            k_12 = new Var<Integer>((Phi.Entry(k_11,k_16).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "k_12", k_12.value);
				nct_3 = new Var<Integer>((Phi.Entry(nct_2,nct_3).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "nct_3", nct_3.value);
				k_13 = new Var<Integer>((k_12.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 101, "k_13", k_13.value);
				if ((k_13.value < nct_3.value) & (s[k_13.value] != 0.0))  {

            // Apply the transformation.

               t_0 = new Var<Double>((double)(0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "t_0", t_0.value);
               i_11 = new Var<Integer>((k_13.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "i_11", i_11.value);
					i_12 = new Var<Integer>((i_11.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 104, "i_12", i_12.value);
					i_13 = new Var<Integer>((i_12.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 104, "i_13", i_13.value);
					k_14 = new Var<Integer>((k_13.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "k_14", k_14.value);
					while(Phi.Entry(i_13,i_14).value < m) {
                  t_1 = new Var<Double>((double)(Phi.Entry(t_0,t_1).value + A[Phi.Entry(i_13,i_14).value][Phi.Entry(k_14,k_16).value]*A[Phi.Entry(i_13,i_14).value][Phi.Entry(j_2,j_3).value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 106, "t_1", t_1.value);
               	i_14 = new Var<Integer>((Phi.Entry(i_13,i_14).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 107, "i_14", i_14.value);
					}
					t_2 = Phi.Exit(t_0,t_1);
					t_1 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "t_2", t_2.value);
					i_15 = Phi.Exit(i_13,i_14);
					i_14 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 105, "i_15", i_15.value);
               t_3 = new Var<Double>((double)(-t_2.value/A[k_14.value][k_14.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 108, "t_3", t_3.value);
               i_16 = new Var<Integer>((k_14.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 108, "i_16", i_16.value);
					i_17 = new Var<Integer>((i_16.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 107, "i_17", i_17.value);
					i_18 = new Var<Integer>((i_17.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 108, "i_18", i_18.value);
					k_15 = new Var<Integer>((k_14.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 109, "k_15", k_15.value);
					while(Phi.Entry(i_18,i_19).value < m) {
                  A[Phi.Entry(i_18,i_19).value][Phi.Entry(j_2,j_3).value] = A[Phi.Entry(i_18,i_19).value][Phi.Entry(j_2,j_3).value] + Phi.Entry(t_3,t_4).value*A[Phi.Entry(i_18,i_19).value][Phi.Entry(k_15,k_16).value];
               	i_19 = new Var<Integer>((Phi.Entry(i_18,i_19).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 111, "i_19", i_19.value);
					}
					i_20 = Phi.Exit(i_18,i_19);
					i_19 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 109, "i_20", i_20.value);
            }
				k_16 = Phi.If(((k_13.value < nct_3.value) & (s[k_13.value] != 0.0)),k_15,k_13);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 102, "k_16", k_16.value);

            // Place the k-th row of A into e for the
            // subsequent calculation of the row transformation.

            e[Phi.Entry(j_2,j_3).value] = A[k_16.value][Phi.Entry(j_2,j_3).value];
         	j_3 = new Var<Integer>((Phi.Entry(j_2,j_3).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 118, "j_3", j_3.value);
			}
			j_4 = Phi.Exit(j_2,j_3);
			j_3 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "j_4", j_4.value);
			k_17 = Phi.Exit(k_11,k_16);
			k_16 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "k_17", k_17.value);
			nct_4 = Phi.Exit(nct_2,nct_3);
			nct_3 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 100, "nct_4", nct_4.value);
         nct_5 = new Var<Integer>((nct_4.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 119, "nct_5", nct_5.value);
			k_18 = new Var<Integer>((k_17.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 119, "k_18", k_18.value);
			wantu_1 = new Var<Boolean>((Phi.Entry(wantu_0,wantu_1).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 119, "wantu_1", wantu_1.value);
			if (wantu_1.value & (k_18.value < nct_5.value)) {

            // Place the transformation in U for subsequent back
            // multiplication.

            i_21 = new Var<Integer>((k_18.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 124, "i_21", i_21.value);
				i_22 = new Var<Integer>((i_21.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 124, "i_22", i_22.value);
				i_23 = new Var<Integer>((i_22.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 123, "i_23", i_23.value);
				k_19 = new Var<Integer>((k_18.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 124, "k_19", k_19.value);
				while(Phi.Entry(i_23,i_24).value < m) {
               U[Phi.Entry(i_23,i_24).value][Phi.Entry(k_19,k_40).value] = A[Phi.Entry(i_23,i_24).value][Phi.Entry(k_19,k_40).value];
            	i_24 = new Var<Integer>((Phi.Entry(i_23,i_24).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 125, "i_24", i_24.value);
				}
				i_25 = Phi.Exit(i_23,i_24);
				i_24 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 125, "i_25", i_25.value);
         }
			k_20 = Phi.If((wantu_1.value & (k_18.value < nct_5.value)),k_19,k_18);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 120, "k_20", k_20.value);
         nrt_2 = new Var<Integer>((Phi.Entry(nrt_1,nrt_2).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 127, "nrt_2", nrt_2.value);
			k_21 = new Var<Integer>((k_20.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 127, "k_21", k_21.value);
			if (k_21.value < nrt_2.value) {

            // Compute the k-th row transformation and place the
            // k-th super-diagonal in e[k].
            // Compute 2-norm without under/overflow.
            e[k_21.value] = 0;
            i_26 = new Var<Integer>((k_21.value+1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 133, "i_26", i_26.value);
				i_27 = new Var<Integer>((i_26.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 133, "i_27", i_27.value);
				i_28 = new Var<Integer>((i_27.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 132, "i_28", i_28.value);
				k_22 = new Var<Integer>((k_21.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 133, "k_22", k_22.value);
				while(Phi.Entry(i_28,i_29).value < n) {
               e[Phi.Entry(k_22,k_40).value] = Maths.hypot(e[Phi.Entry(k_22,k_40).value],e[Phi.Entry(i_28,i_29).value]);
            	i_29 = new Var<Integer>((Phi.Entry(i_28,i_29).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 135, "i_29", i_29.value);
				}
				i_30 = Phi.Exit(i_28,i_29);
				i_29 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 134, "i_30", i_30.value);
            k_23 = new Var<Integer>((k_22.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 136, "k_23", k_23.value);
				if (e[k_23.value] != 0.0) {
               k_24 = new Var<Integer>((k_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "k_24", k_24.value);
					if (e[k_24.value+1] < 0.0) {
                  e[k_24.value] = -e[k_24.value];
               }
               i_31 = new Var<Integer>((k_24.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 140, "i_31", i_31.value);
					i_32 = new Var<Integer>((i_31.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 140, "i_32", i_32.value);
					i_33 = new Var<Integer>((i_32.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 139, "i_33", i_33.value);
					k_25 = new Var<Integer>((k_24.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 140, "k_25", k_25.value);
					while(Phi.Entry(i_33,i_34).value < n) {
                  e[Phi.Entry(i_33,i_34).value] = e[Phi.Entry(i_33,i_34).value] / e[Phi.Entry(k_25,k_40).value];
               	i_34 = new Var<Integer>((Phi.Entry(i_33,i_34).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 142, "i_34", i_34.value);
					}
					i_35 = Phi.Exit(i_33,i_34);
					i_34 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 141, "i_35", i_35.value);
               e[k_25.value+1] = e[k_25.value+1] + 1.0;
            }
				i_36 = Phi.If((e[k_23.value] != 0.0),i_35,i_30);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "i_36", i_36.value);
				k_26 = Phi.If((e[k_23.value] != 0.0),k_25,k_23);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 137, "k_26", k_26.value);
            e[k_26.value] = -e[k_26.value];
            k_27 = new Var<Integer>((k_26.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 146, "k_27", k_27.value);
				k_28 = new Var<Integer>((k_27.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 146, "k_28", k_28.value);
				if ((k_28.value+1 < m) & (e[k_28.value] != 0.0)) {

            // Apply the transformation.

               i_37 = new Var<Integer>((k_28.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 150, "i_37", i_37.value);
					i_38 = new Var<Integer>((i_37.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 150, "i_38", i_38.value);
					i_39 = new Var<Integer>((i_38.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 149, "i_39", i_39.value);
					k_29 = new Var<Integer>((k_28.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 150, "k_29", k_29.value);
					while(Phi.Entry(i_39,i_40).value < m) {
                  work[Phi.Entry(i_39,i_40).value] = 0.0;
               	i_40 = new Var<Integer>((Phi.Entry(i_39,i_40).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 152, "i_40", i_40.value);
					}
					i_41 = Phi.Exit(i_39,i_40);
					i_40 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 151, "i_41", i_41.value);
               j_5 = new Var<Integer>((k_29.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "j_5", j_5.value);
					j_6 = new Var<Integer>((j_5.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "j_6", j_6.value);
					j_7 = new Var<Integer>((j_6.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "j_7", j_7.value);
					k_30 = new Var<Integer>((k_29.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "k_30", k_30.value);
					while(Phi.Entry(j_7,j_8).value < n) {
                  i_42 = new Var<Integer>((Phi.Entry(k_30,k_31).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "i_42", i_42.value);
						i_43 = new Var<Integer>((i_42.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "i_43", i_43.value);
						i_44 = new Var<Integer>((i_43.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 153, "i_44", i_44.value);
						k_31 = new Var<Integer>((Phi.Entry(k_30,k_31).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "k_31", k_31.value);
						while(Phi.Entry(i_44,i_45).value < m) {
                     work[Phi.Entry(i_44,i_45).value] = work[Phi.Entry(i_44,i_45).value] + e[Phi.Entry(j_7,j_8).value]*A[Phi.Entry(i_44,i_45).value][Phi.Entry(j_7,j_8).value];
                  	i_45 = new Var<Integer>((Phi.Entry(i_44,i_45).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 156, "i_45", i_45.value);
						}
						i_46 = Phi.Exit(i_44,i_45);
						i_45 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "i_46", i_46.value);
               	j_8 = new Var<Integer>((Phi.Entry(j_7,j_8).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 157, "j_8", j_8.value);
					}
					i_47 = Phi.Exit(i_41,i_46);
					i_46 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "i_47", i_47.value);
					j_9 = Phi.Exit(j_7,j_8);
					j_8 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "j_9", j_9.value);
					k_32 = Phi.Exit(k_30,k_31);
					k_31 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 154, "k_32", k_32.value);
               j_10 = new Var<Integer>((k_32.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "j_10", j_10.value);
					j_11 = new Var<Integer>((j_10.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "j_11", j_11.value);
					j_12 = new Var<Integer>((j_11.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "j_12", j_12.value);
					k_33 = new Var<Integer>((k_32.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 159, "k_33", k_33.value);
					while(Phi.Entry(j_12,j_13).value < n) {
                  t_4 = new Var<Double>((double)(-e[Phi.Entry(j_12,j_13).value]/e[Phi.Entry(k_33,k_34).value+1]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "t_4", t_4.value);
                  i_48 = new Var<Integer>((Phi.Entry(k_33,k_34).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "i_48", i_48.value);
						i_49 = new Var<Integer>((i_48.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 158, "i_49", i_49.value);
						i_50 = new Var<Integer>((i_49.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 159, "i_50", i_50.value);
						k_34 = new Var<Integer>((Phi.Entry(k_33,k_34).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "k_34", k_34.value);
						while(Phi.Entry(i_50,i_51).value < m) {
                     A[Phi.Entry(i_50,i_51).value][Phi.Entry(j_12,j_13).value] = A[Phi.Entry(i_50,i_51).value][Phi.Entry(j_12,j_13).value] + Phi.Entry(t_4,t_4).value*work[Phi.Entry(i_50,i_51).value];
                  	i_51 = new Var<Integer>((Phi.Entry(i_50,i_51).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 162, "i_51", i_51.value);
						}
						i_52 = Phi.Exit(i_50,i_51);
						i_51 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "i_52", i_52.value);
               	j_13 = new Var<Integer>((Phi.Entry(j_12,j_13).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 163, "j_13", j_13.value);
					}
					i_53 = Phi.Exit(i_47,i_52);
					i_52 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "i_53", i_53.value);
					j_14 = Phi.Exit(j_12,j_13);
					j_13 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "j_14", j_14.value);
					k_35 = Phi.Exit(k_33,k_34);
					k_34 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 160, "k_35", k_35.value);
            }
				i_54 = Phi.If(((k_28.value+1 < m) & (e[k_28.value] != 0.0)),i_53,i_36);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 147, "i_54", i_54.value);
				j_15 = Phi.If(((k_28.value+1 < m) & (e[k_28.value] != 0.0)),j_14,j_4);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 147, "j_15", j_15.value);
				k_36 = Phi.If(((k_28.value+1 < m) & (e[k_28.value] != 0.0)),k_35,k_28);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 147, "k_36", k_36.value);
            wantv_1 = new Var<Boolean>((Phi.Entry(wantv_0,wantv_2).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 165, "wantv_1", wantv_1.value);
				if (wantv_1.value) {

            // Place the transformation in V for subsequent
            // back multiplication.

               i_55 = new Var<Integer>((k_36.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 170, "i_55", i_55.value);
					i_56 = new Var<Integer>((i_55.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 170, "i_56", i_56.value);
					i_57 = new Var<Integer>((i_56.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 169, "i_57", i_57.value);
					k_37 = new Var<Integer>((k_36.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 170, "k_37", k_37.value);
					while(Phi.Entry(i_57,i_58).value < n) {
                  V[Phi.Entry(i_57,i_58).value][Phi.Entry(k_37,k_40).value] = e[Phi.Entry(i_57,i_58).value];
               	i_58 = new Var<Integer>((Phi.Entry(i_57,i_58).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 172, "i_58", i_58.value);
					}
					i_59 = Phi.Exit(i_57,i_58);
					i_58 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 171, "i_59", i_59.value);
            }
				i_60 = Phi.If((wantv_1.value),i_59,i_54);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 166, "i_60", i_60.value);
				k_38 = Phi.If((wantv_1.value),k_37,k_36);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 166, "k_38", k_38.value);
         }
			j_16 = Phi.If((k_21.value < nrt_2.value),j_15,j_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "j_16", j_16.value);
			k_39 = Phi.If((k_21.value < nrt_2.value),k_38,k_21);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "k_39", k_39.value);
			wantv_2 = Phi.If((k_21.value < nrt_2.value),wantv_1,wantv_0);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 128, "wantv_2", wantv_2.value);
      	k_40 = new Var<Integer>((k_39.value + 1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 175, "k_40", k_40.value);
		}
		nrt_3 = Phi.Exit(nrt_1,nrt_2);
		nrt_2 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nrt_3", nrt_3.value);
		k_41 = Phi.Exit(k_2,k_40);
		k_40 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "k_41", k_41.value);
		wantv_3 = Phi.Exit(wantv_0,wantv_2);
		wantv_2 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "wantv_3", wantv_3.value);
		nct_6 = Phi.Exit(nct_1,nct_5);
		nct_5 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "nct_6", nct_6.value);
		wantu_2 = Phi.Exit(wantu_0,wantu_1);
		wantu_1 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 79, "wantu_2", wantu_2.value);

      // Set up the final bidiagonal matrix or order p.

      p_0 = new Var<Integer>((Math.min(n,m+1)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 180, "p_0", p_0.value);
      nct_7 = new Var<Integer>((nct_6.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 181, "nct_7", nct_7.value);
		if (nct_7.value < n) {
         s[nct_7.value] = A[nct_7.value][nct_7.value];
      }
      p_1 = new Var<Integer>((p_0.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 184, "p_1", p_1.value);
		if (m < p_1.value) {
         s[p_1.value-1] = 0.0;
      }
      p_2 = new Var<Integer>((p_1.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 187, "p_2", p_2.value);
		nrt_4 = new Var<Integer>((nrt_3.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 187, "nrt_4", nrt_4.value);
		if (nrt_4.value+1 < p_2.value) {
         e[nrt_4.value] = A[nrt_4.value][p_2.value-1];
      }
      e[p_2.value-1] = 0.0;

      // If required, generate U.

      wantu_3 = new Var<Boolean>((wantu_2.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "wantu_3", wantu_3.value);
		if (wantu_3.value) {
         j_17 = new Var<Integer>((nct_7.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "j_17", j_17.value);
			j_18 = new Var<Integer>((j_17.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "j_18", j_18.value);
			nu_1 = new Var<Integer>((nu_0.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "nu_1", nu_1.value);
			j_19 = new Var<Integer>((j_18.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "j_19", j_19.value);
			nct_8 = new Var<Integer>((nct_7.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "nct_8", nct_8.value);
			while(Phi.Entry(j_19,j_20).value < Phi.Entry(nu_1,nu_1).value) {
            i_61 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 196, "i_61", i_61.value);
				i_62 = new Var<Integer>((i_61.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "i_62", i_62.value);
				i_63 = new Var<Integer>((i_62.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 195, "i_63", i_63.value);
				while(Phi.Entry(i_63,i_64).value < m) {
               U[Phi.Entry(i_63,i_64).value][Phi.Entry(j_19,j_20).value] = 0.0;
            	i_64 = new Var<Integer>((Phi.Entry(i_63,i_64).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 197, "i_64", i_64.value);
				}
				i_65 = Phi.Exit(i_63,i_64);
				i_64 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 196, "i_65", i_65.value);
            U[Phi.Entry(j_19,j_20).value][Phi.Entry(j_19,j_20).value] = 1.0;
         	j_20 = new Var<Integer>((Phi.Entry(j_19,j_20).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 199, "j_20", j_20.value);
			}
			j_21 = Phi.Exit(j_19,j_20);
			j_20 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 196, "j_21", j_21.value);
         k_42 = new Var<Integer>((nct_8.value-1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 201, "k_42", k_42.value);
			k_43 = new Var<Integer>((k_42.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 201, "k_43", k_43.value);
			k_44 = new Var<Integer>((k_43.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 201, "k_44", k_44.value);
			nct_9 = new Var<Integer>((nct_8.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 201, "nct_9", nct_9.value);
			while(Phi.Entry(k_44,k_53).value >= 0) {
            k_45 = new Var<Integer>((Phi.Entry(k_44,k_53).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "k_45", k_45.value);
				if (s[k_45.value] != 0.0) {
               j_22 = new Var<Integer>((k_45.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 203, "j_22", j_22.value);
					j_23 = new Var<Integer>((j_22.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 203, "j_23", j_23.value);
					nu_2 = new Var<Integer>((Phi.Entry(nu_1,nu_3).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 203, "nu_2", nu_2.value);
					j_24 = new Var<Integer>((j_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 203, "j_24", j_24.value);
					k_46 = new Var<Integer>((k_45.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 204, "k_46", k_46.value);
					while(Phi.Entry(j_24,j_25).value < Phi.Entry(nu_2,nu_3).value) {
                  t_5 = new Var<Double>((double)(0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "t_5", t_5.value);
                  i_66 = new Var<Integer>((Phi.Entry(k_46,k_48).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "i_66", i_66.value);
						i_67 = new Var<Integer>((i_66.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 204, "i_67", i_67.value);
						i_68 = new Var<Integer>((i_67.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "i_68", i_68.value);
						k_47 = new Var<Integer>((Phi.Entry(k_46,k_48).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 206, "k_47", k_47.value);
						while(Phi.Entry(i_68,i_69).value < m) {
                     t_6 = new Var<Double>((double)(Phi.Entry(t_5,t_6).value + U[Phi.Entry(i_68,i_69).value][Phi.Entry(k_47,k_48).value]*U[Phi.Entry(i_68,i_69).value][Phi.Entry(j_24,j_25).value]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 207, "t_6", t_6.value);
                  	i_69 = new Var<Integer>((Phi.Entry(i_68,i_69).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 207, "i_69", i_69.value);
						}
						t_7 = Phi.Exit(t_5,t_6);
						t_6 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 206, "t_7", t_7.value);
						i_70 = Phi.Exit(i_68,i_69);
						i_69 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 206, "i_70", i_70.value);
                  t_8 = new Var<Double>((double)(-t_7.value/U[k_47.value][k_47.value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "t_8", t_8.value);
                  i_71 = new Var<Integer>((k_47.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "i_71", i_71.value);
						i_72 = new Var<Integer>((i_71.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 207, "i_72", i_72.value);
						i_73 = new Var<Integer>((i_72.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 208, "i_73", i_73.value);
						k_48 = new Var<Integer>((k_47.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 209, "k_48", k_48.value);
						while(Phi.Entry(i_73,i_74).value < m) {
                     U[Phi.Entry(i_73,i_74).value][Phi.Entry(j_24,j_25).value] = U[Phi.Entry(i_73,i_74).value][Phi.Entry(j_24,j_25).value] + Phi.Entry(t_8,t_8).value*U[Phi.Entry(i_73,i_74).value][Phi.Entry(k_48,k_53).value];
                  	i_74 = new Var<Integer>((Phi.Entry(i_73,i_74).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 211, "i_74", i_74.value);
						}
						i_75 = Phi.Exit(i_73,i_74);
						i_74 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 209, "i_75", i_75.value);
               	j_25 = new Var<Integer>((Phi.Entry(j_24,j_25).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 212, "j_25", j_25.value);
					}
					j_26 = Phi.Exit(j_24,j_25);
					j_25 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "j_26", j_26.value);
					k_49 = Phi.Exit(k_46,k_48);
					k_48 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 205, "k_49", k_49.value);
               i_76 = new Var<Integer>((k_49.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 213, "i_76", i_76.value);
					i_77 = new Var<Integer>((i_76.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 212, "i_77", i_77.value);
					i_78 = new Var<Integer>((i_77.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 211, "i_78", i_78.value);
					k_50 = new Var<Integer>((k_49.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 212, "k_50", k_50.value);
					while(Phi.Entry(i_78,i_79).value < m) {
                  U[Phi.Entry(i_78,i_79).value][Phi.Entry(k_50,k_53).value] = -U[Phi.Entry(i_78,i_79).value][Phi.Entry(k_50,k_53).value];
               	i_79 = new Var<Integer>((Phi.Entry(i_78,i_79).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 214, "i_79", i_79.value);
					}
					i_80 = Phi.Exit(i_78,i_79);
					i_79 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 213, "i_80", i_80.value);
               U[k_50.value][k_50.value] = 1.0 + U[k_50.value][k_50.value];
               i_81 = new Var<Integer>((0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 216, "i_81", i_81.value);
					i_82 = new Var<Integer>((i_81.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 216, "i_82", i_82.value);
					k_51 = new Var<Integer>((k_50.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 215, "k_51", k_51.value);
					i_83 = new Var<Integer>((i_82.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 216, "i_83", i_83.value);
					while(Phi.Entry(i_83,i_84).value < Phi.Entry(k_51,k_53).value-1) {
                  U[Phi.Entry(i_83,i_84).value][Phi.Entry(k_51,k_53).value] = 0.0;
               	i_84 = new Var<Integer>((Phi.Entry(i_83,i_84).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 218, "i_84", i_84.value);
					}
					i_85 = Phi.Exit(i_83,i_84);
					i_84 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 217, "i_85", i_85.value);
            } else {
               i_86 = new Var<Integer>((0));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "i_86", i_86.value);
					i_87 = new Var<Integer>((i_86.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 219, "i_87", i_87.value);
					i_88 = new Var<Integer>((i_87.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "i_88", i_88.value);
					while(Phi.Entry(i_88,i_89).value < m) {
                  U[Phi.Entry(i_88,i_89).value][Phi.Entry(k_45,k_51).value] = 0.0;
               	i_89 = new Var<Integer>((Phi.Entry(i_88,i_89).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 222, "i_89", i_89.value);
					}
					i_90 = Phi.Exit(i_88,i_89);
					i_89 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 221, "i_90", i_90.value);
               U[k_45.value][k_45.value] = 1.0;
            }
				nu_3 = Phi.If((s[k_45.value] != 0.0),nu_2,nu_1);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "nu_3", nu_3.value);
				j_27 = Phi.If((s[k_45.value] != 0.0),j_26,j_21);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "j_27", j_27.value);
				k_52 = Phi.If((s[k_45.value] != 0.0),k_51,k_45);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 220, "k_52", k_52.value);
         	k_53 = new Var<Integer>((k_52.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 225, "k_53", k_53.value);
			}
			nu_4 = Phi.Exit(nu_1,nu_3);
			nu_3 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "nu_4", nu_4.value);
			j_28 = Phi.Exit(j_21,j_27);
			j_27 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "j_28", j_28.value);
			k_54 = Phi.Exit(k_44,k_53);
			k_53 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 202, "k_54", k_54.value);
      }
		nu_5 = Phi.If((wantu_3.value),nu_4,nu_0);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "nu_5", nu_5.value);
		k_55 = Phi.If((wantu_3.value),k_54,k_41);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "k_55", k_55.value);
		nct_10 = Phi.If((wantu_3.value),nct_9,nct_7);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 194, "nct_10", nct_10.value);

      // If required, generate V.

      wantv_4 = new Var<Boolean>((wantv_3.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "wantv_4", wantv_4.value);
		if (wantv_4.value) {
         k_56 = new Var<Integer>((n-1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 232, "k_56", k_56.value);
			k_57 = new Var<Integer>((k_56.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 232, "k_57", k_57.value);
			k_58 = new Var<Integer>((k_57.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 232, "k_58", k_58.value);
			while(Phi.Entry(k_58,k_66).value >= 0) {
            k_59 = new Var<Integer>((Phi.Entry(k_58,k_66).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_59", k_59.value);
				nrt_5 = new Var<Integer>((Phi.Entry(nrt_4,nrt_5).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "nrt_5", nrt_5.value);
				k_60 = new Var<Integer>((k_59.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_60", k_60.value);
				if ((k_60.value < nrt_5.value) & (e[k_60.value] != 0.0)) {
               j_29 = new Var<Integer>((k_60.value+1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "j_29", j_29.value);
					j_30 = new Var<Integer>((j_29.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "j_30", j_30.value);
					nu_6 = new Var<Integer>((Phi.Entry(nu_5,nu_7).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "nu_6", nu_6.value);
					j_31 = new Var<Integer>((j_30.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "j_31", j_31.value);
					k_61 = new Var<Integer>((k_60.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 235, "k_61", k_61.value);
					while(Phi.Entry(j_31,j_32).value < Phi.Entry(nu_6,nu_7).value) {
                  t_9 = new Var<Double>((double)(0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "t_9", t_9.value);
                  i_91 = new Var<Integer>((Phi.Entry(k_61,k_63).value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "i_91", i_91.value);
						i_92 = new Var<Integer>((i_91.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 235, "i_92", i_92.value);
						i_93 = new Var<Integer>((i_92.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "i_93", i_93.value);
						k_62 = new Var<Integer>((Phi.Entry(k_61,k_63).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 237, "k_62", k_62.value);
						while(Phi.Entry(i_93,i_94).value < n) {
                     t_10 = new Var<Double>((double)(Phi.Entry(t_9,t_10).value + V[Phi.Entry(i_93,i_94).value][Phi.Entry(k_62,k_63).value]*V[Phi.Entry(i_93,i_94).value][Phi.Entry(j_31,j_32).value]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 238, "t_10", t_10.value);
                  	i_94 = new Var<Integer>((Phi.Entry(i_93,i_94).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 238, "i_94", i_94.value);
						}
						t_11 = Phi.Exit(t_9,t_10);
						t_10 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 237, "t_11", t_11.value);
						i_95 = Phi.Exit(i_93,i_94);
						i_94 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 237, "i_95", i_95.value);
                  t_12 = new Var<Double>((double)(-t_11.value/V[k_62.value+1][k_62.value]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "t_12", t_12.value);
                  i_96 = new Var<Integer>((k_62.value+1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "i_96", i_96.value);
						i_97 = new Var<Integer>((i_96.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 237, "i_97", i_97.value);
						i_98 = new Var<Integer>((i_97.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 238, "i_98", i_98.value);
						k_63 = new Var<Integer>((k_62.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "k_63", k_63.value);
						while(Phi.Entry(i_98,i_99).value < n) {
                     V[Phi.Entry(i_98,i_99).value][Phi.Entry(j_31,j_32).value] = V[Phi.Entry(i_98,i_99).value][Phi.Entry(j_31,j_32).value] + Phi.Entry(t_12,t_12).value*V[Phi.Entry(i_98,i_99).value][Phi.Entry(k_63,k_66).value];
                  	i_99 = new Var<Integer>((Phi.Entry(i_98,i_99).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 241, "i_99", i_99.value);
						}
						i_100 = Phi.Exit(i_98,i_99);
						i_99 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 239, "i_100", i_100.value);
               	j_32 = new Var<Integer>((Phi.Entry(j_31,j_32).value + 1));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 242, "j_32", j_32.value);
					}
					j_33 = Phi.Exit(j_31,j_32);
					j_32 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "j_33", j_33.value);
					k_64 = Phi.Exit(k_61,k_63);
					k_63 = null;
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 236, "k_64", k_64.value);
            }
				nu_7 = Phi.If(((k_60.value < nrt_5.value) & (e[k_60.value] != 0.0)),nu_6,nu_5);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "nu_7", nu_7.value);
				k_65 = Phi.If(((k_60.value < nrt_5.value) & (e[k_60.value] != 0.0)),k_64,k_60);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 234, "k_65", k_65.value);
            i_101 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 244, "i_101", i_101.value);
				i_102 = new Var<Integer>((i_101.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 243, "i_102", i_102.value);
				i_103 = new Var<Integer>((i_102.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 244, "i_103", i_103.value);
				while(Phi.Entry(i_103,i_104).value < n) {
               V[Phi.Entry(i_103,i_104).value][Phi.Entry(k_65,k_66).value] = 0.0;
            	i_104 = new Var<Integer>((Phi.Entry(i_103,i_104).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 246, "i_104", i_104.value);
				}
				i_105 = Phi.Exit(i_103,i_104);
				i_104 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 245, "i_105", i_105.value);
            V[k_65.value][k_65.value] = 1.0;
         	k_66 = new Var<Integer>((k_65.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 248, "k_66", k_66.value);
			}
			nrt_6 = Phi.Exit(nrt_4,nrt_5);
			nrt_5 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "nrt_6", nrt_6.value);
			nu_8 = Phi.Exit(nu_5,nu_7);
			nu_7 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "nu_8", nu_8.value);
			k_67 = Phi.Exit(k_58,k_66);
			k_66 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 233, "k_67", k_67.value);
      }
		nrt_7 = Phi.If((wantv_4.value),nrt_6,nrt_4);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "nrt_7", nrt_7.value);
		nu_9 = Phi.If((wantv_4.value),nu_8,nu_5);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "nu_9", nu_9.value);
		k_68 = Phi.If((wantv_4.value),k_67,k_55);
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 231, "k_68", k_68.value);

      // Main iteration loop for the singular values.

      pp_0 = new Var<Integer>((p_2.value-1));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 254, "pp_0", pp_0.value);
      iter_0 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 255, "iter_0", iter_0.value);
      eps_0 = new Var<Double>((double)(Math.pow(2.0,-52.0)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 256, "eps_0", eps_0.value);
      tiny_0 = new Var<Double>((double)(Math.pow(2.0,-966.0)));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 257, "tiny_0", tiny_0.value);
      p_3 = new Var<Integer>((p_2.value));
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "p_3", p_3.value);
		while (Phi.Entry(p_3,p_13).value > 0) {
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

         k_70 = new Var<Integer>((Phi.Entry(p_3,p_13).value-2));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "k_70", k_70.value);
			k_71 = new Var<Integer>((k_70.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "k_71", k_71.value);
			k_72 = new Var<Integer>((k_71.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "k_72", k_72.value);
			p_4 = new Var<Integer>((Phi.Entry(p_3,p_13).value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "p_4", p_4.value);
			k_73 = new Var<Integer>((k_72.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 273, "k_73", k_73.value);
			while(Phi.Entry(k_73,k_78).value >= -1) {
            k_74 = new Var<Integer>((Phi.Entry(k_73,k_78).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "k_74", k_74.value);
				if (k_74.value == -1) {
               break;
            }
            k_75 = new Var<Integer>((k_74.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 276, "k_75", k_75.value);
				k_76 = new Var<Integer>((k_75.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "k_76", k_76.value);
				eps_1 = new Var<Double>((double)(Phi.Entry(eps_0,eps_1).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "eps_1", eps_1.value);
				tiny_1 = new Var<Double>((double)(Phi.Entry(tiny_0,tiny_1).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "tiny_1", tiny_1.value);
				k_77 = new Var<Integer>((k_76.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 277, "k_77", k_77.value);
				if (Math.abs(e[k_77.value]) <=
                  tiny_1.value + eps_1.value*(Math.abs(s[k_77.value]) + Math.abs(s[k_77.value+1]))) {
               e[k_77.value] = 0.0;
               break;
            }
         	k_78 = new Var<Integer>((k_77.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 281, "k_78", k_78.value);
			}
			eps_2 = Phi.Exit(eps_0,eps_1);
			eps_1 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "eps_2", eps_2.value);
			k_79 = Phi.Exit(k_73,k_78);
			k_78 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "k_79", k_79.value);
			tiny_2 = Phi.Exit(tiny_0,tiny_1);
			tiny_1 = null;
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 274, "tiny_2", tiny_2.value);
         p_5 = new Var<Integer>((p_4.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 283, "p_5", p_5.value);
			k_80 = new Var<Integer>((k_79.value));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 283, "k_80", k_80.value);
			if (k_80.value == p_5.value-2) {
            kase_1 = new Var<Integer>(4);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 284, "kase_1", kase_1.value);
         } else {
            //;
            ks_1 = new Var<Integer>((p_5.value-1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "ks_1", ks_1.value);
				ks_2 = new Var<Integer>((ks_1.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "ks_2", ks_2.value);
				k_81 = new Var<Integer>((k_80.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "k_81", k_81.value);
				ks_3 = new Var<Integer>((ks_2.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "ks_3", ks_3.value);
				p_6 = new Var<Integer>((p_5.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "p_6", p_6.value);
				ks_4 = new Var<Integer>((ks_3.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 287, "ks_4", ks_4.value);
				while(Phi.Entry(ks_4,ks_7).value >= Phi.Entry(k_81,k_82).value) {
               k_82 = new Var<Integer>((Phi.Entry(k_81,k_82).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "k_82", k_82.value);
					ks_5 = new Var<Integer>((Phi.Entry(ks_4,ks_7).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "ks_5", ks_5.value);
					if (ks_5.value == k_82.value) {
                  break;
               }
               t_13 = new Var<Double>((double)((ks_5.value != Phi.Entry(p_6,p_13).value ? Math.abs(e[ks_5.value]) : 0.) + 
                          (ks_5.value != k_82.value+1 ? Math.abs(e[ks_5.value-1]) : 0.)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 291, "t_13", t_13.value);
               t_14 = new Var<Double>((double)(t_13.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "t_14", t_14.value);
					eps_3 = new Var<Double>((double)(Phi.Entry(eps_2,eps_3).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "eps_3", eps_3.value);
					tiny_3 = new Var<Double>((double)(Phi.Entry(tiny_2,tiny_3).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "tiny_3", tiny_3.value);
					ks_6 = new Var<Integer>((ks_5.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 292, "ks_6", ks_6.value);
					if (Math.abs(s[ks_6.value]) <= tiny_3.value + eps_3.value*t_14.value)  {
                  s[ks_6.value] = 0.0;
                  break;
               }
            	ks_7 = new Var<Integer>((ks_6.value - 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 296, "ks_7", ks_7.value);
				}
				ks_8 = Phi.Exit(ks_4,ks_7);
				ks_7 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "ks_8", ks_8.value);
				eps_4 = Phi.Exit(eps_2,eps_3);
				eps_3 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "eps_4", eps_4.value);
				k_83 = Phi.Exit(k_81,k_82);
				k_82 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "k_83", k_83.value);
				tiny_4 = Phi.Exit(tiny_2,tiny_3);
				tiny_3 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 288, "tiny_4", tiny_4.value);
            p_7 = new Var<Integer>((p_6.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "p_7", p_7.value);
				ks_9 = new Var<Integer>((ks_8.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "ks_9", ks_9.value);
				k_84 = new Var<Integer>((k_83.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 298, "k_84", k_84.value);
				ks_10 = new Var<Integer>((ks_9.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 299, "ks_10", ks_10.value);
				if (ks_10.value == k_84.value) {
               kase_2 = new Var<Integer>((3));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 300, "kase_2", kase_2.value);
            } else if (ks_10.value == p_7.value-1) {
               kase_3 = new Var<Integer>((1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 301, "kase_3", kase_3.value);
            } else {
               kase_4 = new Var<Integer>((2));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 303, "kase_4", kase_4.value);
               k_85 = new Var<Integer>((ks_10.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 304, "k_85", k_85.value);
            }
				k_86 = Phi.If((ks_10.value == k_84.value),k_84,Phi.If((ks_10.value == p_7.value-1),k_84,k_85));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 302, "k_86", k_86.value);
				kase_5 = Phi.If((ks_10.value == k_84.value),kase_2,Phi.If((ks_10.value == p_7.value-1),kase_3,kase_4));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 302, "kase_5", kase_5.value);
         }
			eps_5 = Phi.If((k_80.value == p_5.value-2),eps_2,eps_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "eps_5", eps_5.value);
			k_87 = Phi.If((k_80.value == p_5.value-2),k_80,k_86);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "k_87", k_87.value);
			p_8 = Phi.If((k_80.value == p_5.value-2),p_5,p_7);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "p_8", p_8.value);
			tiny_5 = Phi.If((k_80.value == p_5.value-2),tiny_2,tiny_4);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "tiny_5", tiny_5.value);
			kase_6 = Phi.If((k_80.value == p_5.value-2),kase_1,kase_5);
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 285, "kase_6", kase_6.value);
         k_88 = new Var<Integer>((k_87.value + 1));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 307, "k_88", k_88.value);

         // Perform the task indicated by kase.

         

            // Deflate negligible s(p).

            if ((kase_6.value).equals(1)) {
 
               f_0 = new Var<Double>((double)(e[p_8.value-2]));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 317, "f_0", f_0.value);
               e[p_8.value-2] = 0.0;
               j_34 = new Var<Integer>((p_8.value-2));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 318, "j_34", j_34.value);
				j_35 = new Var<Integer>((j_34.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 318, "j_35", j_35.value);
				k_89 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 318, "k_89", k_89.value);
				j_36 = new Var<Integer>((j_35.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 318, "j_36", j_36.value);
				p_9 = new Var<Integer>((p_8.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 319, "p_9", p_9.value);
				while(Phi.Entry(j_36,j_38).value >= Phi.Entry(k_89,k_90).value) {
                  t_15 = new Var<Double>((double)(Maths.hypot(s[Phi.Entry(j_36,j_38).value],Phi.Entry(f_0,f_2).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 321, "t_15", t_15.value);
                  cs_0 = new Var<Double>((double)(s[Phi.Entry(j_36,j_38).value]/t_15.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 322, "cs_0", cs_0.value);
                  sn_0 = new Var<Double>((double)(Phi.Entry(f_0,f_2).value/t_15.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 323, "sn_0", sn_0.value);
                  s[Phi.Entry(j_36,j_38).value] = t_15.value;
                  k_90 = new Var<Integer>((Phi.Entry(k_89,k_90).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 322, "k_90", k_90.value);
					j_37 = new Var<Integer>((Phi.Entry(j_36,j_38).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 323, "j_37", j_37.value);
					if (j_37.value != k_90.value) {
                     f_1 = new Var<Double>((double)(-sn_0.value*e[j_37.value-1]));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 325, "f_1", f_1.value);
                     e[j_37.value-1] = cs_0.value*e[j_37.value-1];
                  }
					f_2 = Phi.If((j_37.value != k_90.value),f_1,f_0);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 324, "f_2", f_2.value);
                  wantv_5 = new Var<Boolean>((Phi.Entry(wantv_4,wantv_5).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 327, "wantv_5", wantv_5.value);
					if (wantv_5.value) {
                     i_106 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 326, "i_106", i_106.value);
						i_107 = new Var<Integer>((i_106.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 327, "i_107", i_107.value);
						i_108 = new Var<Integer>((i_107.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 328, "i_108", i_108.value);
						while(Phi.Entry(i_108,i_109).value < n) {
                        t_16 = new Var<Double>((double)(Phi.Entry(cs_0,cs_3).value*V[Phi.Entry(i_108,i_109).value][Phi.Entry(j_37,j_38).value] + Phi.Entry(sn_0,sn_3).value*V[Phi.Entry(i_108,i_109).value][Phi.Entry(p_9,p_13).value-1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 330, "t_16", t_16.value);
                        V[Phi.Entry(i_108,i_109).value][Phi.Entry(p_9,p_13).value-1] = -Phi.Entry(sn_0,sn_3).value*V[Phi.Entry(i_108,i_109).value][Phi.Entry(j_37,j_38).value] + Phi.Entry(cs_0,cs_3).value*V[Phi.Entry(i_108,i_109).value][Phi.Entry(p_9,p_13).value-1];
                        V[Phi.Entry(i_108,i_109).value][Phi.Entry(j_37,j_38).value] = t_16.value;
                     	i_109 = new Var<Integer>((Phi.Entry(i_108,i_109).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 332, "i_109", i_109.value);
						}
						i_110 = Phi.Exit(i_108,i_109);
						i_109 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 329, "i_110", i_110.value);
						t_17 = Phi.Exit(t_15,t_16);
						t_16 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 329, "t_17", t_17.value);
                  }
					t_18 = Phi.If((wantv_5.value),t_17,t_15);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 327, "t_18", t_18.value);
               	j_38 = new Var<Integer>((j_37.value - 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 334, "j_38", j_38.value);
				}
				f_3 = Phi.Exit(f_0,f_2);
				f_2 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "f_3", f_3.value);
				j_39 = Phi.Exit(j_36,j_38);
				j_38 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "j_39", j_39.value);
				k_91 = Phi.Exit(k_89,k_90);
				k_90 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "k_91", k_91.value);
				wantv_6 = Phi.Exit(wantv_4,wantv_5);
				wantv_5 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 320, "wantv_6", wantv_6.value);
            
            ;}

            // Split at negligible s(k).

            else if ((kase_6.value).equals(2)) {
 
               f_4 = new Var<Double>((double)(e[k_88.value-1]));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 343, "f_4", f_4.value);
               e[k_91.value-1] = 0.0;
               j_40 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 343, "j_40", j_40.value);
				j_41 = new Var<Integer>((j_40.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 343, "j_41", j_41.value);
				p_10 = new Var<Integer>((p_8.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 343, "p_10", p_10.value);
				j_42 = new Var<Integer>((j_41.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 344, "j_42", j_42.value);
				k_92 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 345, "k_92", k_92.value);
				while(Phi.Entry(j_42,j_43).value < Phi.Entry(p_10,p_13).value) {
                  t_19 = new Var<Double>((double)(Maths.hypot(s[Phi.Entry(j_42,j_43).value],Phi.Entry(f_4,f_5).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 347, "t_19", t_19.value);
                  cs_1 = new Var<Double>((double)(s[Phi.Entry(j_42,j_43).value]/t_19.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 347, "cs_1", cs_1.value);
                  sn_1 = new Var<Double>((double)(Phi.Entry(f_4,f_5).value/t_19.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 348, "sn_1", sn_1.value);
                  s[Phi.Entry(j_42,j_43).value] = t_19.value;
                  f_5 = new Var<Double>((double)(-sn_1.value*e[Phi.Entry(j_42,j_43).value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 349, "f_5", f_5.value);
                  e[Phi.Entry(j_42,j_43).value] = cs_1.value*e[Phi.Entry(j_42,j_43).value];
                  wantu_4 = new Var<Boolean>((Phi.Entry(wantu_3,wantu_4).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 350, "wantu_4", wantu_4.value);
					if (wantu_4.value) {
                     i_111 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 350, "i_111", i_111.value);
						i_112 = new Var<Integer>((i_111.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 351, "i_112", i_112.value);
						i_113 = new Var<Integer>((i_112.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 352, "i_113", i_113.value);
						while(Phi.Entry(i_113,i_114).value < m) {
                        t_20 = new Var<Double>((double)(Phi.Entry(cs_1,cs_3).value*U[Phi.Entry(i_113,i_114).value][Phi.Entry(j_42,j_43).value] + Phi.Entry(sn_1,sn_3).value*U[Phi.Entry(i_113,i_114).value][Phi.Entry(k_92,k_104).value-1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "t_20", t_20.value);
                        U[Phi.Entry(i_113,i_114).value][Phi.Entry(k_92,k_104).value-1] = -Phi.Entry(sn_1,sn_3).value*U[Phi.Entry(i_113,i_114).value][Phi.Entry(j_42,j_43).value] + Phi.Entry(cs_1,cs_3).value*U[Phi.Entry(i_113,i_114).value][Phi.Entry(k_92,k_104).value-1];
                        U[Phi.Entry(i_113,i_114).value][Phi.Entry(j_42,j_43).value] = t_20.value;
                     	i_114 = new Var<Integer>((Phi.Entry(i_113,i_114).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 356, "i_114", i_114.value);
						}
						i_115 = Phi.Exit(i_113,i_114);
						i_114 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "i_115", i_115.value);
						t_21 = Phi.Exit(t_19,t_20);
						t_20 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 353, "t_21", t_21.value);
                  }
					t_22 = Phi.If((wantu_4.value),t_21,t_19);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 349, "t_22", t_22.value);
               	j_43 = new Var<Integer>((Phi.Entry(j_42,j_43).value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 358, "j_43", j_43.value);
				}
				f_6 = Phi.Exit(f_4,f_5);
				f_5 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 346, "f_6", f_6.value);
				j_44 = Phi.Exit(j_42,j_43);
				j_43 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 346, "j_44", j_44.value);
				wantu_5 = Phi.Exit(wantu_3,wantu_4);
				wantu_4 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 346, "wantu_5", wantu_5.value);
            
            ;}

            // Perform one qr step.

            else if ((kase_6.value).equals(3)) {
 

               // Calculate the shift.
   
               scale_0 = new Var<Double>((double)(Math.max(Math.max(Math.max(Math.max(
                       Math.abs(s[p_8.value-1]),Math.abs(s[p_8.value-2])),Math.abs(e[p_8.value-2])), 
                       Math.abs(s[k_88.value])),Math.abs(e[k_88.value]))));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 370, "scale_0", scale_0.value);
               sp_0 = new Var<Double>((double)(s[p_8.value-1]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 373, "sp_0", sp_0.value);
               spm1_0 = new Var<Double>((double)(s[p_8.value-2]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 374, "spm1_0", spm1_0.value);
               epm1_0 = new Var<Double>((double)(e[p_8.value-2]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 375, "epm1_0", epm1_0.value);
               sk_0 = new Var<Double>((double)(s[k_88.value]/scale_0.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 376, "sk_0", sk_0.value);
               ek_0 = new Var<Double>((double)(e[k_88.value]/scale_0.value));
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
   
               j_45 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 390, "j_45", j_45.value);
				j_46 = new Var<Integer>((j_45.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 390, "j_46", j_46.value);
				p_11 = new Var<Integer>((p_8.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 391, "p_11", p_11.value);
				j_47 = new Var<Integer>((j_46.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 392, "j_47", j_47.value);
				k_93 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 393, "k_93", k_93.value);
				while(Phi.Entry(j_47,j_50).value < Phi.Entry(p_11,p_13).value-1) {
                  t_23 = new Var<Double>((double)(Maths.hypot(Phi.Entry(f_7,f_9).value,Phi.Entry(g_0,g_2).value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "t_23", t_23.value);
                  cs_2 = new Var<Double>((double)(Phi.Entry(f_7,f_9).value/t_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "cs_2", cs_2.value);
                  sn_2 = new Var<Double>((double)(Phi.Entry(g_0,g_2).value/t_23.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 395, "sn_2", sn_2.value);
                  k_94 = new Var<Integer>((Phi.Entry(k_93,k_94).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 396, "k_94", k_94.value);
					j_48 = new Var<Integer>((Phi.Entry(j_47,j_50).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 397, "j_48", j_48.value);
					if (j_48.value != k_94.value) {
                     e[j_48.value-1] = t_23.value;
                  }
                  f_8 = new Var<Double>((double)(cs_2.value*s[j_48.value] + sn_2.value*e[j_48.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 400, "f_8", f_8.value);
                  e[j_48.value] = cs_2.value*e[j_48.value] - sn_2.value*s[j_48.value];
                  g_1 = new Var<Double>((double)(sn_2.value*s[j_48.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 401, "g_1", g_1.value);
                  s[j_48.value+1] = cs_2.value*s[j_48.value+1];
                  wantv_7 = new Var<Boolean>((Phi.Entry(wantv_4,wantv_7).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 400, "wantv_7", wantv_7.value);
					if (wantv_7.value) {
                     i_116 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 402, "i_116", i_116.value);
						i_117 = new Var<Integer>((i_116.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 403, "i_117", i_117.value);
						i_118 = new Var<Integer>((i_117.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "i_118", i_118.value);
						while(Phi.Entry(i_118,i_119).value < n) {
                        t_24 = new Var<Double>((double)(Phi.Entry(cs_2,cs_3).value*V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value] + Phi.Entry(sn_2,sn_3).value*V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 405, "t_24", t_24.value);
                        V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value+1] = -Phi.Entry(sn_2,sn_3).value*V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value] + Phi.Entry(cs_2,cs_3).value*V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value+1];
                        V[Phi.Entry(i_118,i_119).value][Phi.Entry(j_48,j_50).value] = t_24.value;
                     	i_119 = new Var<Integer>((Phi.Entry(i_118,i_119).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 408, "i_119", i_119.value);
						}
						i_120 = Phi.Exit(i_118,i_119);
						i_119 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "i_120", i_120.value);
						t_25 = Phi.Exit(t_23,t_24);
						t_24 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 404, "t_25", t_25.value);
                  }
					t_26 = Phi.If((wantv_7.value),t_25,t_23);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 401, "t_26", t_26.value);
                  t_27 = new Var<Double>((double)(Maths.hypot(f_8.value,g_1.value)));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 411, "t_27", t_27.value);
                  cs_3 = new Var<Double>((double)(f_8.value/t_27.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 412, "cs_3", cs_3.value);
                  sn_3 = new Var<Double>((double)(g_1.value/t_27.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 413, "sn_3", sn_3.value);
                  s[j_48.value] = t_27.value;
                  f_9 = new Var<Double>((double)(cs_3.value*e[j_48.value] + sn_3.value*s[j_48.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 415, "f_9", f_9.value);
                  s[j_48.value+1] = -sn_3.value*e[j_48.value] + cs_3.value*s[j_48.value+1];
                  g_2 = new Var<Double>((double)(sn_3.value*e[j_48.value+1]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 415, "g_2", g_2.value);
                  e[j_48.value+1] = cs_3.value*e[j_48.value+1];
                  j_49 = new Var<Integer>((j_48.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 416, "j_49", j_49.value);
					wantu_6 = new Var<Boolean>((Phi.Entry(wantu_3,wantu_6).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 415, "wantu_6", wantu_6.value);
					if (wantu_6.value && (j_49.value < m-1)) {
                     i_121 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 417, "i_121", i_121.value);
						i_122 = new Var<Integer>((i_121.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 418, "i_122", i_122.value);
						i_123 = new Var<Integer>((i_122.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "i_123", i_123.value);
						while(Phi.Entry(i_123,i_124).value < m) {
                        t_28 = new Var<Double>((double)(Phi.Entry(cs_3,cs_3).value*U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value] + Phi.Entry(sn_3,sn_3).value*U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 420, "t_28", t_28.value);
                        U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value+1] = -Phi.Entry(sn_3,sn_3).value*U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value] + Phi.Entry(cs_3,cs_3).value*U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value+1];
                        U[Phi.Entry(i_123,i_124).value][Phi.Entry(j_49,j_50).value] = t_28.value;
                     	i_124 = new Var<Integer>((Phi.Entry(i_123,i_124).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 422, "i_124", i_124.value);
						}
						i_125 = Phi.Exit(i_123,i_124);
						i_124 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "i_125", i_125.value);
						t_29 = Phi.Exit(t_27,t_28);
						t_28 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 419, "t_29", t_29.value);
                  }
					t_30 = Phi.If((wantu_6.value && (j_49.value < m-1)),t_29,t_27);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 416, "t_30", t_30.value);
               	j_50 = new Var<Integer>((j_49.value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 425, "j_50", j_50.value);
				}
				wantv_8 = Phi.Exit(wantv_6,wantv_7);
				wantv_7 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "wantv_8", wantv_8.value);
				wantu_7 = Phi.Exit(wantu_5,wantu_6);
				wantu_6 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "wantu_7", wantu_7.value);
				f_10 = Phi.Exit(f_7,f_9);
				f_9 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "f_10", f_10.value);
				g_3 = Phi.Exit(g_0,g_2);
				g_2 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "g_3", g_3.value);
				j_51 = Phi.Exit(j_47,j_50);
				j_50 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "j_51", j_51.value);
				k_95 = Phi.Exit(k_93,k_94);
				k_94 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 394, "k_95", k_95.value);
               e[p_11.value-2] = f_10.value;
               iter_1 = new Var<Integer>((Phi.Entry(iter_0,iter_3).value + 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 428, "iter_1", iter_1.value);
            
            ;}

            // Convergence.

            else if ((kase_6.value).equals(4)) {
 

               // Make the singular values positive.
   
               k_96 = new Var<Integer>((k_88.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 437, "k_96", k_96.value);
				if (s[k_96.value] <= 0.0) {
                  s[k_96.value] = (s[k_96.value] < 0.0 ? -s[k_96.value] : 0.0);
                  wantv_9 = new Var<Boolean>((Phi.Entry(wantv_4,wantv_13).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 438, "wantv_9", wantv_9.value);
					if (wantv_9.value) {
                     i_126 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 438, "i_126", i_126.value);
						i_127 = new Var<Integer>((i_126.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 439, "i_127", i_127.value);
						pp_1 = new Var<Integer>((Phi.Entry(pp_0,pp_5).value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 439, "pp_1", pp_1.value);
						i_128 = new Var<Integer>((i_127.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 440, "i_128", i_128.value);
						while(Phi.Entry(i_128,i_129).value <= Phi.Entry(pp_1,pp_5).value) {
                        V[Phi.Entry(i_128,i_129).value][Phi.Entry(k_96,k_104).value] = -V[Phi.Entry(i_128,i_129).value][Phi.Entry(k_96,k_104).value];
                     	i_129 = new Var<Integer>((Phi.Entry(i_128,i_129).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 443, "i_129", i_129.value);
						}
						i_130 = Phi.Exit(i_128,i_129);
						i_129 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 441, "i_130", i_130.value);
                  }
					pp_2 = Phi.If((wantv_9.value),pp_1,pp_0);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 437, "pp_2", pp_2.value);
               }
				pp_3 = Phi.If((s[k_96.value] <= 0.0),pp_2,pp_0);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 438, "pp_3", pp_3.value);
				wantv_10 = Phi.If((s[k_96.value] <= 0.0),wantv_9,wantv_8);
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 438, "wantv_10", wantv_10.value);
   
               // Order the singular values.
   
               pp_4 = new Var<Integer>((Phi.Entry(pp_0,pp_5).value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 447, "pp_4", pp_4.value);
				k_97 = new Var<Integer>((k_96.value));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 447, "k_97", k_97.value);
				while (Phi.Entry(k_97,k_102).value < Phi.Entry(pp_4,pp_5).value) {
                  k_98 = new Var<Integer>((Phi.Entry(k_97,k_102).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 449, "k_98", k_98.value);
					k_99 = new Var<Integer>((k_98.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 450, "k_99", k_99.value);
					if (s[k_99.value] >= s[k_99.value+1]) {
                     ;
                  }
                  t_31 = new Var<Double>((double)(s[k_99.value]));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 453, "t_31", t_31.value);
                  s[k_99.value] = s[k_99.value+1];
                  s[k_99.value+1] = t_31.value;
                  k_100 = new Var<Integer>((k_99.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 454, "k_100", k_100.value);
					wantv_11 = new Var<Boolean>((Phi.Entry(wantv_10,wantv_11).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 453, "wantv_11", wantv_11.value);
					if (wantv_11.value && (k_100.value < n-1)) {
                     i_131 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 455, "i_131", i_131.value);
						i_132 = new Var<Integer>((i_131.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 455, "i_132", i_132.value);
						i_133 = new Var<Integer>((i_132.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 456, "i_133", i_133.value);
						while(Phi.Entry(i_133,i_134).value < n) {
                        t_32 = new Var<Double>((double)(V[Phi.Entry(i_133,i_134).value][Phi.Entry(k_100,k_102).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 458, "t_32", t_32.value); V[Phi.Entry(i_133,i_134).value][Phi.Entry(k_100,k_102).value+1] = V[Phi.Entry(i_133,i_134).value][Phi.Entry(k_100,k_102).value]; V[Phi.Entry(i_133,i_134).value][Phi.Entry(k_100,k_102).value] = t_32.value;
                     	i_134 = new Var<Integer>((Phi.Entry(i_133,i_134).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 458, "i_134", i_134.value);
						}
						i_135 = Phi.Exit(i_133,i_134);
						i_134 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 457, "i_135", i_135.value);
						t_33 = Phi.Exit(t_31,t_32);
						t_32 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 457, "t_33", t_33.value);
                  }
					t_34 = Phi.If((wantv_11.value && (k_100.value < n-1)),t_33,t_31);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 454, "t_34", t_34.value);
                  k_101 = new Var<Integer>((k_100.value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 459, "k_101", k_101.value);
					wantu_8 = new Var<Boolean>((Phi.Entry(wantu_3,wantu_8).value));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 458, "wantu_8", wantu_8.value);
					if (wantu_8.value && (k_101.value < m-1)) {
                     i_136 = new Var<Integer>((0));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 460, "i_136", i_136.value);
						i_137 = new Var<Integer>((i_136.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 460, "i_137", i_137.value);
						i_138 = new Var<Integer>((i_137.value));
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 461, "i_138", i_138.value);
						while(Phi.Entry(i_138,i_139).value < m) {
                        t_35 = new Var<Double>((double)(U[Phi.Entry(i_138,i_139).value][Phi.Entry(k_101,k_102).value+1]));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 463, "t_35", t_35.value); U[Phi.Entry(i_138,i_139).value][Phi.Entry(k_101,k_102).value+1] = U[Phi.Entry(i_138,i_139).value][Phi.Entry(k_101,k_102).value]; U[Phi.Entry(i_138,i_139).value][Phi.Entry(k_101,k_102).value] = t_35.value;
                     	i_139 = new Var<Integer>((Phi.Entry(i_138,i_139).value + 1));
							Output.record("SingularValueDecomposition", "SingularValueDecomposition", 464, "i_139", i_139.value);
						}
						i_140 = Phi.Exit(i_138,i_139);
						i_139 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 462, "i_140", i_140.value);
						t_36 = Phi.Exit(t_34,t_35);
						t_35 = null;
						Output.record("SingularValueDecomposition", "SingularValueDecomposition", 462, "t_36", t_36.value);
                  }
					t_37 = Phi.If((wantu_8.value && (k_101.value < m-1)),t_36,t_34);
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 459, "t_37", t_37.value);
                  k_102 = new Var<Integer>((k_101.value + 1));
					Output.record("SingularValueDecomposition", "SingularValueDecomposition", 467, "k_102", k_102.value);
               }
				wantv_12 = Phi.Exit(wantv_10,wantv_11);
				wantv_11 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "wantv_12", wantv_12.value);
				wantu_9 = Phi.Exit(wantu_7,wantu_8);
				wantu_8 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "wantu_9", wantu_9.value);
				k_103 = Phi.Exit(k_97,k_102);
				k_102 = null;
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 448, "k_103", k_103.value);
               iter_2 = new Var<Integer>((0));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 469, "iter_2", iter_2.value);
               p_12 = new Var<Integer>((p_8.value - 1));
				Output.record("SingularValueDecomposition", "SingularValueDecomposition", 470, "p_12", p_12.value);
            
            ;}
			pp_5 = Phi.If(((kase_6.value).equals(3)),pp_0,Phi.If(((kase_6.value).equals(4)),pp_4,pp_0));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "pp_5", pp_5.value);
			wantv_13 = Phi.If(((kase_6.value).equals(3)),wantv_8,Phi.If(((kase_6.value).equals(4)),wantv_12,wantv_6));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "wantv_13", wantv_13.value);
			wantu_10 = Phi.If(((kase_6.value).equals(3)),wantu_7,Phi.If(((kase_6.value).equals(4)),wantu_9,wantu_5));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "wantu_10", wantu_10.value);
			iter_3 = Phi.If(((kase_6.value).equals(3)),iter_1,Phi.If(((kase_6.value).equals(4)),iter_2,iter_0));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "iter_3", iter_3.value);
			k_104 = Phi.If(((kase_6.value).equals(3)),k_95,Phi.If(((kase_6.value).equals(4)),k_103,k_92));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "k_104", k_104.value);
			p_13 = Phi.If(((kase_6.value).equals(3)),p_11,Phi.If(((kase_6.value).equals(4)),p_12,p_10));
			Output.record("SingularValueDecomposition", "SingularValueDecomposition", 434, "p_13", p_13.value);
         
      }
		pp_6 = Phi.Exit(pp_0,pp_5);
		pp_5 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "pp_6", pp_6.value);
		wantv_14 = Phi.Exit(wantv_6,wantv_13);
		wantv_13 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "wantv_14", wantv_14.value);
		wantu_11 = Phi.Exit(wantu_5,wantu_10);
		wantu_10 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "wantu_11", wantu_11.value);
		iter_4 = Phi.Exit(iter_0,iter_3);
		iter_3 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "iter_4", iter_4.value);
		k_105 = Phi.Exit(k_92,k_104);
		k_104 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "k_105", k_105.value);
		p_14 = Phi.Exit(p_10,p_13);
		p_13 = null;
		Output.record("SingularValueDecomposition", "SingularValueDecomposition", 258, "p_14", p_14.value);
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
		Var<Integer> i_141 = null;
		Var<Integer> i_142 = null;
		Var<Integer> i_143 = null;
		Var<Integer> j_52 = null;
		Var<Integer> j_53 = null;
		Var<Integer> j_54 = null;
		Var<Integer> j_55 = null;
		Var<Integer> j_56 = null;
		Var<Integer> i_144 = null;
		Var<Integer> i_145 = null;
      
		/* PROGRAM STARTS */
		X_0 = new Var<Matrix>((new Matrix(n,n)));
		Output.record("SingularValueDecomposition", "getS", 508, "X_0", X_0.value);
      double S[][] = X_0.value.getArray();
      i_141 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "getS", 509, "i_141", i_141.value);
		i_142 = new Var<Integer>((i_141.value));
		Output.record("SingularValueDecomposition", "getS", 508, "i_142", i_142.value);
		i_143 = new Var<Integer>((i_142.value));
		Output.record("SingularValueDecomposition", "getS", 508, "i_143", i_143.value);
		while(Phi.Entry(i_143,i_144).value < n) {
         j_52 = new Var<Integer>((0));
			Output.record("SingularValueDecomposition", "getS", 509, "j_52", j_52.value);
			j_53 = new Var<Integer>((j_52.value));
			Output.record("SingularValueDecomposition", "getS", 510, "j_53", j_53.value);
			j_54 = new Var<Integer>((j_53.value));
			Output.record("SingularValueDecomposition", "getS", 511, "j_54", j_54.value);
			while(Phi.Entry(j_54,j_55).value < n) {
            S[Phi.Entry(i_143,i_144).value][Phi.Entry(j_54,j_55).value] = 0.0;
         	j_55 = new Var<Integer>((Phi.Entry(j_54,j_55).value + 1));
				Output.record("SingularValueDecomposition", "getS", 513, "j_55", j_55.value);
			}
			j_56 = Phi.Exit(j_54,j_55);
			j_55 = null;
			Output.record("SingularValueDecomposition", "getS", 512, "j_56", j_56.value);
         S[Phi.Entry(i_143,i_144).value][Phi.Entry(i_143,i_144).value] = this.s[Phi.Entry(i_143,i_144).value];
      	i_144 = new Var<Integer>((Phi.Entry(i_143,i_144).value + 1));
			Output.record("SingularValueDecomposition", "getS", 516, "i_144", i_144.value);
		}
		i_145 = Phi.Exit(i_143,i_144);
		i_144 = null;
		Output.record("SingularValueDecomposition", "getS", 509, "i_145", i_145.value);
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
		Var<Integer> i_146 = null;
		Var<Integer> i_147 = null;
		Var<Integer> i_148 = null;
		Var<Double> tol_1 = null;
		Var<Integer> i_149 = null;
		Var<Integer> r_1 = null;
		Var<Integer> r_2 = null;
		Var<Integer> i_150 = null;
		Var<Double> tol_2 = null;
		Var<Integer> i_151 = null;
		Var<Integer> r_3 = null;
      
		/* PROGRAM STARTS */
		eps_6 = new Var<Double>((double)(Math.pow(2.0,-52.0)));
		Output.record("SingularValueDecomposition", "rank", 541, "eps_6", eps_6.value);
      tol_0 = new Var<Double>((double)(Math.max(m,n)*s[0]*eps_6.value));
		Output.record("SingularValueDecomposition", "rank", 541, "tol_0", tol_0.value);
      r_0 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "rank", 542, "r_0", r_0.value);
      i_146 = new Var<Integer>((0));
		Output.record("SingularValueDecomposition", "rank", 541, "i_146", i_146.value);
		i_147 = new Var<Integer>((i_146.value));
		Output.record("SingularValueDecomposition", "rank", 541, "i_147", i_147.value);
		i_148 = new Var<Integer>((i_147.value));
		Output.record("SingularValueDecomposition", "rank", 542, "i_148", i_148.value);
		while(Phi.Entry(i_148,i_150).value < s.length) {
         tol_1 = new Var<Double>((double)(Phi.Entry(tol_0,tol_1).value));
			Output.record("SingularValueDecomposition", "rank", 544, "tol_1", tol_1.value);
			i_149 = new Var<Integer>(Fluky.flukyInt((Phi.Entry(i_148,i_150).value), 0.99));
			Output.record("SingularValueDecomposition", "rank", 544, "i_149", i_149.value);
			if (s[i_149.value] > tol_1.value) {
            r_1 = new Var<Integer>((Phi.Entry(r_0,r_2).value + 1));
				Output.record("SingularValueDecomposition", "rank", 546, "r_1", r_1.value);
         }
			r_2 = Phi.If((s[i_149.value] > tol_1.value),r_1,r_0);
			Output.record("SingularValueDecomposition", "rank", 545, "r_2", r_2.value);
      	i_150 = new Var<Integer>((i_149.value + 1));
			Output.record("SingularValueDecomposition", "rank", 548, "i_150", i_150.value);
		}
		tol_2 = Phi.Exit(tol_0,tol_1);
		tol_1 = null;
		Output.record("SingularValueDecomposition", "rank", 543, "tol_2", tol_2.value);
		i_151 = Phi.Exit(i_148,i_150);
		i_150 = null;
		Output.record("SingularValueDecomposition", "rank", 543, "i_151", i_151.value);
		r_3 = Phi.Exit(r_0,r_2);
		r_2 = null;
		Output.record("SingularValueDecomposition", "rank", 543, "r_3", r_3.value);
		Output.recordProgramOutput("SingularValueDecomposition", r_3.value, true);
      return r_3.value;
   }
  private static final long serialVersionUID = 1;
}
