package outputs.LU_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;

//package ScMark;

import gsa.Output;

/**
 * LU matrix factorization. (Based on TNT implementation.)
 * Decomposes a matrix A  into a triangular lower triangular
 * factor (L) and an upper triangular factor (U) such that
 * A = L*U.  By convnetion, the main diagonal of L consists
 * of 1's so that L and U can be stored compactly in
 * a NxN matrix.
 */
public class LU {
    /**
     * Returns a <em>copy</em> of the compact LU factorization.
     * (useful mainly for debugging.)
     *
     * @return the compact LU factorization.  The U factor
     * is stored in the upper triangular portion, and the L
     * factor is stored in the lower triangular portion.
     * The main diagonal of L consists (by convention) of
     * ones, and is not explicitly stored.
     */


    public static final double num_flops(int N) {
		// formal parameters
		Var<Integer> N_0 = new Var<Integer>(N);
		Output.record("LU", "num_flops", 27, "N_0", N_0.value);

		// all variables are declared to null
		Var<Double> Nd_0 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside num_flops");
        // rougly 2/3*N^3

        Nd_0 = new Var<Double>((double)((double) N_0.value));
		Output.record("LU", "num_flops", 31, "Nd_0", Nd_0.value);

        return (2.0 * Nd_0.value * Nd_0.value * Nd_0.value / 3.0);
    }

    protected static double[] new_copy(double[] x) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> N_1 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> N_2 = null;
		Var<Integer> i_2 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy");
        N_1 = new Var<Integer>((x.length));
		Output.record("LU", "new_copy", 38, "N_1", N_1.value);
        double T[] = new double[N_1.value];
        i_0 = new Var<Integer>((0));
		Output.record("LU", "new_copy", 40, "i_0", i_0.value);
		i_1 = new Var<Integer>((i_0.value));
		Output.record("LU", "new_copy", 40, "i_1", i_1.value);
		N_2 = new Var<Integer>((N_1.value));
		Output.record("LU", "new_copy", 40, "N_2", N_2.value);
		i_2 = new Var<Integer>((i_1.value));
		Output.record("LU", "new_copy", 39, "i_2", i_2.value);
		while(Phi.Entry(i_2,i_3).value < Phi.Entry(N_2,N_2).value)
            {
			T[Phi.Entry(i_2,i_3).value] = x[Phi.Entry(i_2,i_3).value];
			i_3 = new Var<Integer>((Phi.Entry(i_2,i_3).value + 1));
			Output.record("LU", "new_copy", 40, "i_3", i_3.value);
		}
		i_4 = Phi.Exit(i_2,i_3);
		i_3 = null;
		Output.record("LU", "new_copy", 40, "i_4", i_4.value);
        return T;
    }


    protected static double[][] new_copy(double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_0 = null;
		Var<Integer> N_3 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> M_1 = null;
		Var<Integer> i_7 = null;
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> N_4 = null;
		Var<Integer> j_2 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> i_8 = null;
		Var<Integer> i_9 = null;
		Var<Integer> N_5 = null;
    	
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy2");
        M_0 = new Var<Integer>((A.length));
		Output.record("LU", "new_copy", 49, "M_0", M_0.value);
        N_3 = new Var<Integer>((A[0].length));
		Output.record("LU", "new_copy", 50, "N_3", N_3.value);

        double T[][] = new double[M_0.value][N_3.value];

        i_5 = new Var<Integer>((0));
		Output.record("LU", "new_copy", 52, "i_5", i_5.value);
		i_6 = new Var<Integer>((i_5.value));
		Output.record("LU", "new_copy", 52, "i_6", i_6.value);
		M_1 = new Var<Integer>((M_0.value));
		Output.record("LU", "new_copy", 53, "M_1", M_1.value);
		i_7 = new Var<Integer>((i_6.value));
		Output.record("LU", "new_copy", 54, "i_7", i_7.value);
		while(Phi.Entry(i_7,i_8).value < Phi.Entry(M_1,M_1).value) {
            double Ti[] = T[Phi.Entry(i_7,i_8).value];
            double Ai[] = A[Phi.Entry(i_7,i_8).value];
            j_0 = new Var<Integer>((0));
			Output.record("LU", "new_copy", 53, "j_0", j_0.value);
			j_1 = new Var<Integer>((j_0.value));
			Output.record("LU", "new_copy", 54, "j_1", j_1.value);
			N_4 = new Var<Integer>((Phi.Entry(N_3,N_4).value));
			Output.record("LU", "new_copy", 52, "N_4", N_4.value);
			j_2 = new Var<Integer>((j_1.value));
			Output.record("LU", "new_copy", 53, "j_2", j_2.value);
			while(Phi.Entry(j_2,j_3).value < Phi.Entry(N_4,N_4).value)
                {
				Ti[Phi.Entry(j_2,j_3).value] = Ai[Phi.Entry(j_2,j_3).value];
				j_3 = new Var<Integer>((Phi.Entry(j_2,j_3).value + 1));
				Output.record("LU", "new_copy", 56, "j_3", j_3.value);
			}
			j_4 = Phi.Exit(j_2,j_3);
			j_3 = null;
			Output.record("LU", "new_copy", 54, "j_4", j_4.value);
        	i_8 = new Var<Integer>((Phi.Entry(i_7,i_8).value + 1));
			Output.record("LU", "new_copy", 58, "i_8", i_8.value);
		}
		i_9 = Phi.Exit(i_7,i_8);
		i_8 = null;
		Output.record("LU", "new_copy", 55, "i_9", i_9.value);
		N_5 = Phi.Exit(N_3,N_4);
		N_4 = null;
		Output.record("LU", "new_copy", 55, "N_5", N_5.value);

        return T;
    }


    public static int[] new_copy(int[] x) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> N_6 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Integer> N_7 = null;
		Var<Integer> i_12 = null;
		Var<Integer> i_13 = null;
		Var<Integer> i_14 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy 3");
        N_6 = new Var<Integer>((x.length));
		Output.record("LU", "new_copy", 65, "N_6", N_6.value);
        int T[] = new int[N_6.value];
        i_10 = new Var<Integer>((0));
		Output.record("LU", "new_copy", 65, "i_10", i_10.value);
		i_11 = new Var<Integer>((i_10.value));
		Output.record("LU", "new_copy", 63, "i_11", i_11.value);
		N_7 = new Var<Integer>((N_6.value));
		Output.record("LU", "new_copy", 64, "N_7", N_7.value);
		i_12 = new Var<Integer>((i_11.value));
		Output.record("LU", "new_copy", 65, "i_12", i_12.value);
		while(Phi.Entry(i_12,i_13).value < Phi.Entry(N_7,N_7).value)
            {
			T[Phi.Entry(i_12,i_13).value] = x[Phi.Entry(i_12,i_13).value];
			i_13 = new Var<Integer>((Phi.Entry(i_12,i_13).value + 1));
			Output.record("LU", "new_copy", 69, "i_13", i_13.value);
		}
		i_14 = Phi.Exit(i_12,i_13);
		i_13 = null;
		Output.record("LU", "new_copy", 66, "i_14", i_14.value);
        return T;
    }

    protected static final void insert_copy(double[][] B, double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_2 = null;
		Var<Integer> N_8 = null;
		Var<Integer> remainder_0 = null;
		Var<Integer> i_15 = null;
		Var<Integer> i_16 = null;
		Var<Integer> M_3 = null;
		Var<Integer> i_17 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;
		Var<Integer> remainder_1 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> j_9 = null;
		Var<Integer> j_10 = null;
		Var<Integer> j_11 = null;
		Var<Integer> N_9 = null;
		Var<Integer> j_12 = null;
		Var<Integer> remainder_2 = null;
		Var<Integer> j_13 = null;
		Var<Integer> j_14 = null;
		Var<Integer> i_18 = null;
		Var<Integer> i_19 = null;
		Var<Integer> remainder_3 = null;
		Var<Integer> N_10 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside insert_copy");
        M_2 = new Var<Integer>((A.length));
		Output.record("LU", "insert_copy", 75, "M_2", M_2.value);
        N_8 = new Var<Integer>((A[0].length));
		Output.record("LU", "insert_copy", 75, "N_8", N_8.value);

        remainder_0 = new Var<Integer>((N_8.value & 3));
		Output.record("LU", "insert_copy", 76, "remainder_0", remainder_0.value);         // N mod 4;

        i_15 = new Var<Integer>((0));
		Output.record("LU", "insert_copy", 78, "i_15", i_15.value);
		i_16 = new Var<Integer>((i_15.value));
		Output.record("LU", "insert_copy", 78, "i_16", i_16.value);
		M_3 = new Var<Integer>((M_2.value));
		Output.record("LU", "insert_copy", 78, "M_3", M_3.value);
		i_17 = new Var<Integer>((i_16.value));
		Output.record("LU", "insert_copy", 77, "i_17", i_17.value);
		while(Phi.Entry(i_17,i_18).value < Phi.Entry(M_3,M_3).value) {
            double Bi[] = B[Phi.Entry(i_17,i_18).value];
            double Ai[] = A[Phi.Entry(i_17,i_18).value];
            j_5 = new Var<Integer>((0));
			Output.record("LU", "insert_copy", 78, "j_5", j_5.value);
			j_6 = new Var<Integer>((j_5.value));
			Output.record("LU", "insert_copy", 77, "j_6", j_6.value);
			remainder_1 = new Var<Integer>((Phi.Entry(remainder_0,remainder_2).value));
			Output.record("LU", "insert_copy", 77, "remainder_1", remainder_1.value);
			j_7 = new Var<Integer>((j_6.value));
			Output.record("LU", "insert_copy", 77, "j_7", j_7.value);
			while(Phi.Entry(j_7,j_8).value < Phi.Entry(remainder_1,remainder_2).value)
                {
				Bi[Phi.Entry(j_7,j_8).value] = Ai[Phi.Entry(j_7,j_8).value];
				j_8 = new Var<Integer>((Phi.Entry(j_7,j_8).value + 1));
				Output.record("LU", "insert_copy", 79, "j_8", j_8.value);
			}
			j_9 = Phi.Exit(j_7,j_8);
			j_8 = null;
			Output.record("LU", "insert_copy", 76, "j_9", j_9.value);
            j_10 = new Var<Integer>((remainder_1.value));
			Output.record("LU", "insert_copy", 81, "j_10", j_10.value);
			j_11 = new Var<Integer>((j_10.value));
			Output.record("LU", "insert_copy", 81, "j_11", j_11.value);
			N_9 = new Var<Integer>((Phi.Entry(N_8,N_9).value));
			Output.record("LU", "insert_copy", 82, "N_9", N_9.value);
			j_12 = new Var<Integer>((j_11.value));
			Output.record("LU", "insert_copy", 83, "j_12", j_12.value);
			remainder_2 = new Var<Integer>((remainder_1.value));
			Output.record("LU", "insert_copy", 83, "remainder_2", remainder_2.value);
			while(Phi.Entry(j_12,j_13).value < Phi.Entry(N_9,N_9).value) {
                Bi[Phi.Entry(j_12,j_13).value] = Ai[Phi.Entry(j_12,j_13).value];
                Bi[Phi.Entry(j_12,j_13).value + 1] = Ai[Phi.Entry(j_12,j_13).value + 1];
                Bi[Phi.Entry(j_12,j_13).value + 2] = Ai[Phi.Entry(j_12,j_13).value + 2];
                Bi[Phi.Entry(j_12,j_13).value + 3] = Ai[Phi.Entry(j_12,j_13).value + 3];
            	j_13 = new Var<Integer>((Phi.Entry(j_12,j_13).value + 4));
				Output.record("LU", "insert_copy", 89, "j_13", j_13.value);
			}
			j_14 = Phi.Exit(j_12,j_13);
			j_13 = null;
			Output.record("LU", "insert_copy", 84, "j_14", j_14.value);
        	i_18 = new Var<Integer>((Phi.Entry(i_17,i_18).value + 1));
			Output.record("LU", "insert_copy", 91, "i_18", i_18.value);
		}
		i_19 = Phi.Exit(i_17,i_18);
		i_18 = null;
		Output.record("LU", "insert_copy", 78, "i_19", i_19.value);
		remainder_3 = Phi.Exit(remainder_0,remainder_2);
		remainder_2 = null;
		Output.record("LU", "insert_copy", 78, "remainder_3", remainder_3.value);
		N_10 = Phi.Exit(N_8,N_9);
		N_9 = null;
		Output.record("LU", "insert_copy", 78, "N_10", N_10.value);

    }

    public double[][] getLU() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		System.out.println("inside getLU");
        return new_copy(LU_);
    }

    /**
     * Returns a <em>copy</em> of the pivot vector.
     *
     * @return the pivot vector used in obtaining the
     * LU factorzation.  Subsequent solutions must
     * permute the right-hand side by this vector.
     */
    public int[] getPivot() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		System.out.println("inside getPivot");
        return new_copy(pivot_);
    }

    /**
     * Initalize LU factorization from matrix.
     *
     * @param A (in) the matrix to associate with this
     *          factorization.
     */
    public LU(double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_4 = null;
		Var<Integer> N_11 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside LU");
        M_4 = new Var<Integer>((A.length));
		Output.record("LU", "LU", 121, "M_4", M_4.value);
        N_11 = new Var<Integer>((A[0].length));
		Output.record("LU", "LU", 122, "N_11", N_11.value);

        //if ( LU_ == null || LU_.length != M || LU_[0].length != N)
        LU_ = new double[M_4.value][N_11.value];

        insert_copy(LU_, A);

        //if (pivot_.length != M)
        pivot_ = new int[M_4.value];

        factor(LU_, pivot_);
        
    }

    /**
     * Solve a linear system, with pre-computed factorization.
     *
     * @param b (in) the right-hand side.
     * @return solution vector.
     */
    public double[] solve(double[] b) {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		System.out.println("inside solve");

        double x[] = new_copy(b);

        solve(LU_, pivot_, x);
        Output.recordProgramOutput("LU", x[x.length-1], false);
        return x;
    }


    /**
     * LU factorization (in place).
     *
     * @param A     (in/out) On input, the matrix to be factored.
     *              On output, the compact LU factorization.
     * @param pivit (out) The pivot vector records the
     *              reordering of the rows of A during factorization.
     * @return 0, if OK, nozero value, othewise.
     */
    public static int factor(double[][] A, int[] pivot) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> N_12 = null;
		Var<Integer> M_5 = null;
		Var<Integer> minMN_0 = null;
		Var<Integer> j_15 = null;
		Var<Integer> j_16 = null;
		Var<Integer> minMN_1 = null;
		Var<Integer> j_17 = null;
		Var<Integer> jp_0 = null;
		Var<Double> t_0 = null;
		Var<Integer> i_20 = null;
		Var<Integer> i_21 = null;
		Var<Integer> M_6 = null;
		Var<Integer> i_22 = null;
		Var<Integer> j_18 = null;
		Var<Double> ab_0 = null;
		Var<Double> t_1 = null;
		Var<Double> ab_1 = null;
		Var<Integer> jp_1 = null;
		Var<Double> t_2 = null;
		Var<Double> t_3 = null;
		Var<Integer> jp_2 = null;
		Var<Integer> i_23 = null;
		Var<Double> t_4 = null;
		Var<Integer> jp_3 = null;
		Var<Integer> i_24 = null;
		Var<Integer> j_19 = null;
		Var<Integer> jp_4 = null;
		Var<Integer> j_20 = null;
		Var<Integer> jp_5 = null;
		Var<Integer> M_7 = null;
		Var<Integer> j_21 = null;
		Var<Double> recp_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> k_1 = null;
		Var<Integer> M_8 = null;
		Var<Integer> k_2 = null;
		Var<Integer> j_22 = null;
		Var<Integer> k_3 = null;
		Var<Integer> k_4 = null;
		Var<Integer> j_23 = null;
		Var<Integer> M_9 = null;
		Var<Integer> minMN_2 = null;
		Var<Integer> j_24 = null;
		Var<Integer> ii_0 = null;
		Var<Integer> ii_1 = null;
		Var<Integer> M_10 = null;
		Var<Integer> ii_2 = null;
		Var<Integer> j_25 = null;
		Var<Double> AiiJ_0 = null;
		Var<Integer> jj_0 = null;
		Var<Integer> jj_1 = null;
		Var<Integer> N_13 = null;
		Var<Integer> jj_2 = null;
		Var<Integer> j_26 = null;
		Var<Integer> jj_3 = null;
		Var<Integer> jj_4 = null;
		Var<Integer> ii_3 = null;
		Var<Integer> ii_4 = null;
		Var<Integer> j_27 = null;
		Var<Integer> N_14 = null;
		Var<Integer> j_28 = null;
		Var<Integer> M_11 = null;
		Var<Integer> N_15 = null;
		Var<Integer> j_29 = null;
		Var<Integer> minMN_3 = null;
		Var<Integer> j_30 = null;
		Var<Integer> M_12 = null;
		Var<Integer> N_16 = null;

        
		/* PROGRAM STARTS */
		System.out.println("inside factor");
        N_12 = new Var<Integer>((A.length));
		Output.record("LU", "factor", 161, "N_12", N_12.value);
        M_5 = new Var<Integer>((A[0].length));
		Output.record("LU", "factor", 162, "M_5", M_5.value);

        minMN_0 = new Var<Integer>((Math.min(M_5.value, N_12.value)));
		Output.record("LU", "factor", 164, "minMN_0", minMN_0.value);

        j_15 = new Var<Integer>((0));
		Output.record("LU", "factor", 166, "j_15", j_15.value);
		j_16 = new Var<Integer>((j_15.value));
		Output.record("LU", "factor", 167, "j_16", j_16.value);
		minMN_1 = new Var<Integer>((minMN_0.value));
		Output.record("LU", "factor", 167, "minMN_1", minMN_1.value);
		j_17 = new Var<Integer>((j_16.value));
		Output.record("LU", "factor", 167, "j_17", j_17.value);
		while(Phi.Entry(j_17,j_29).value < Phi.Entry(minMN_1,minMN_2).value) {
            // find pivot in column j and  input.test for singularity.

            jp_0 = new Var<Integer>((Phi.Entry(j_17,j_29).value));
			Output.record("LU", "factor", 168, "jp_0", jp_0.value);

            t_0 = new Var<Double>((double)(Math.abs(A[Phi.Entry(j_17,j_29).value][Phi.Entry(j_17,j_29).value])));
			Output.record("LU", "factor", 168, "t_0", t_0.value);
            i_20 = new Var<Integer>((Phi.Entry(j_17,j_29).value + 1));
			Output.record("LU", "factor", 169, "i_20", i_20.value);
			i_21 = new Var<Integer>((i_20.value));
			Output.record("LU", "factor", 170, "i_21", i_21.value);
			M_6 = new Var<Integer>((Phi.Entry(M_5,M_11).value));
			Output.record("LU", "factor", 171, "M_6", M_6.value);
			i_22 = new Var<Integer>((i_21.value));
			Output.record("LU", "factor", 172, "i_22", i_22.value);
			j_18 = new Var<Integer>((Phi.Entry(j_17,j_29).value));
			Output.record("LU", "factor", 172, "j_18", j_18.value);
			while(Phi.Entry(i_22,i_23).value < Phi.Entry(M_6,M_11).value) {
                ab_0 = new Var<Double>((double)(Math.abs(A[Phi.Entry(i_22,i_23).value][Phi.Entry(j_18,j_29).value])));
				Output.record("LU", "factor", 174, "ab_0", ab_0.value);
                t_1 = new Var<Double>((double)(Phi.Entry(t_0,t_3).value));
				Output.record("LU", "factor", 175, "t_1", t_1.value);
				ab_1 = new Var<Double>((double)(ab_0.value));
				Output.record("LU", "factor", 176, "ab_1", ab_1.value);
				if (ab_1.value > t_1.value) {
                    jp_1 = new Var<Integer>((Phi.Entry(i_22,i_23).value));
					Output.record("LU", "factor", 178, "jp_1", jp_1.value);
                    t_2 = new Var<Double>((double)(ab_1.value));
					Output.record("LU", "factor", 179, "t_2", t_2.value);
                }
				t_3 = Phi.If((ab_1.value > t_1.value),t_2,t_1);
				Output.record("LU", "factor", 177, "t_3", t_3.value);
				jp_2 = Phi.If((ab_1.value > t_1.value),jp_1,jp_0);
				Output.record("LU", "factor", 177, "jp_2", jp_2.value);
            	i_23 = new Var<Integer>((Phi.Entry(i_22,i_23).value + 1));
				Output.record("LU", "factor", 180, "i_23", i_23.value);
			}
			t_4 = Phi.Exit(t_0,t_3);
			t_3 = null;
			Output.record("LU", "factor", 173, "t_4", t_4.value);
			jp_3 = Phi.Exit(jp_0,jp_2);
			jp_2 = null;
			Output.record("LU", "factor", 173, "jp_3", jp_3.value);
			i_24 = Phi.Exit(i_22,i_23);
			i_23 = null;
			Output.record("LU", "factor", 173, "i_24", i_24.value);

            pivot[j_18.value] = jp_3.value;

            // jp now has the index of maximum element
            // of column j, below the diagonal

            j_19 = new Var<Integer>((j_18.value));
			Output.record("LU", "factor", 182, "j_19", j_19.value);
			jp_4 = new Var<Integer>((jp_3.value));
			Output.record("LU", "factor", 183, "jp_4", jp_4.value);
			if (A[jp_4.value][j_19.value] == 0)
                {
				return 1;
			}       // factorization failed because of zero pivot


            j_20 = new Var<Integer>((j_19.value));
			Output.record("LU", "factor", 188, "j_20", j_20.value);
			jp_5 = new Var<Integer>((jp_4.value));
			Output.record("LU", "factor", 189, "jp_5", jp_5.value);
			if (jp_5.value != j_20.value) {
                // swap rows j and jp
                double tA[] = A[j_20.value];
                A[j_20.value] = A[jp_5.value];
                A[jp_5.value] = tA;
            }

            M_7 = new Var<Integer>((M_6.value));
			Output.record("LU", "factor", 195, "M_7", M_7.value);
			j_21 = new Var<Integer>((j_20.value));
			Output.record("LU", "factor", 195, "j_21", j_21.value);
			if (j_21.value < M_7.value - 1)                // compute elements j+1:M of jth column
            {
                // note A(j,j), was A(jp,p) previously which was
                // guarranteed not to be zero (Label #1)
                //
                recp_0 = new Var<Double>((double)(1.0 / A[j_21.value][j_21.value]));
				Output.record("LU", "factor", 196, "recp_0", recp_0.value);

                k_0 = new Var<Integer>((j_21.value + 1));
				Output.record("LU", "factor", 198, "k_0", k_0.value);
				k_1 = new Var<Integer>((k_0.value));
				Output.record("LU", "factor", 198, "k_1", k_1.value);
				M_8 = new Var<Integer>((M_7.value));
				Output.record("LU", "factor", 198, "M_8", M_8.value);
				k_2 = new Var<Integer>((k_1.value));
				Output.record("LU", "factor", 199, "k_2", k_2.value);
				j_22 = new Var<Integer>((j_21.value));
				Output.record("LU", "factor", 200, "j_22", j_22.value);
				while(Phi.Entry(k_2,k_3).value < Phi.Entry(M_8,M_11).value)
                    {
					A[Phi.Entry(k_2,k_3).value][Phi.Entry(j_22,j_29).value] = A[Phi.Entry(k_2,k_3).value][Phi.Entry(j_22,j_29).value] * Phi.Entry(recp_0,recp_0).value;
					k_3 = new Var<Integer>((Phi.Entry(k_2,k_3).value + 1));
					Output.record("LU", "factor", 204, "k_3", k_3.value);
				}
				k_4 = Phi.Exit(k_2,k_3);
				k_3 = null;
				Output.record("LU", "factor", 201, "k_4", k_4.value);
            }
			j_23 = Phi.If((j_21.value < M_7.value - 1),j_22,j_21);
			Output.record("LU", "factor", 195, "j_23", j_23.value);
			M_9 = Phi.If((j_21.value < M_7.value - 1),M_8,M_7);
			Output.record("LU", "factor", 195, "M_9", M_9.value);


            minMN_2 = new Var<Integer>((Phi.Entry(minMN_1,minMN_2).value));
			Output.record("LU", "factor", 206, "minMN_2", minMN_2.value);
			j_24 = new Var<Integer>((j_23.value));
			Output.record("LU", "factor", 206, "j_24", j_24.value);
			if (j_24.value < minMN_2.value - 1) {
                // rank-1 update to trailing submatrix:   E = E - x*y;
                //
                // E is the region A(j+1:M, j+1:N)
                // x is the column vector A(j+1:M,j)
                // y is row vector A(j,j+1:N)


                ii_0 = new Var<Integer>((j_24.value + 1));
				Output.record("LU", "factor", 209, "ii_0", ii_0.value);
				ii_1 = new Var<Integer>((ii_0.value));
				Output.record("LU", "factor", 207, "ii_1", ii_1.value);
				M_10 = new Var<Integer>((M_9.value));
				Output.record("LU", "factor", 208, "M_10", M_10.value);
				ii_2 = new Var<Integer>((ii_1.value));
				Output.record("LU", "factor", 209, "ii_2", ii_2.value);
				j_25 = new Var<Integer>((j_24.value));
				Output.record("LU", "factor", 210, "j_25", j_25.value);
				while(Phi.Entry(ii_2,ii_3).value < Phi.Entry(M_10,M_11).value) {
                    double Aii[] = A[Phi.Entry(ii_2,ii_3).value];
                    double Aj[] = A[Phi.Entry(j_25,j_26).value];
                    AiiJ_0 = new Var<Double>((double)(Aii[Phi.Entry(j_25,j_26).value]));
					Output.record("LU", "factor", 213, "AiiJ_0", AiiJ_0.value);
                    jj_0 = new Var<Integer>((Phi.Entry(j_25,j_26).value + 1));
					Output.record("LU", "factor", 213, "jj_0", jj_0.value);
					jj_1 = new Var<Integer>((jj_0.value));
					Output.record("LU", "factor", 214, "jj_1", jj_1.value);
					N_13 = new Var<Integer>((Phi.Entry(N_12,N_13).value));
					Output.record("LU", "factor", 215, "N_13", N_13.value);
					jj_2 = new Var<Integer>((jj_1.value));
					Output.record("LU", "factor", 216, "jj_2", jj_2.value);
					j_26 = new Var<Integer>((Phi.Entry(j_25,j_26).value));
					Output.record("LU", "factor", 217, "j_26", j_26.value);
					while(Phi.Entry(jj_2,jj_3).value < Phi.Entry(N_13,N_15).value)
                        {
						Aii[Phi.Entry(jj_2,jj_3).value] = Aii[Phi.Entry(jj_2,jj_3).value] - Phi.Entry(AiiJ_0,AiiJ_0).value * Aj[Phi.Entry(jj_2,jj_3).value];
						jj_3 = new Var<Integer>((Phi.Entry(jj_2,jj_3).value + 1));
						Output.record("LU", "factor", 221, "jj_3", jj_3.value);
					}
					jj_4 = Phi.Exit(jj_2,jj_3);
					jj_3 = null;
					Output.record("LU", "factor", 218, "jj_4", jj_4.value);

                	ii_3 = new Var<Integer>((Phi.Entry(ii_2,ii_3).value + 1));
					Output.record("LU", "factor", 224, "ii_3", ii_3.value);
				}
				ii_4 = Phi.Exit(ii_2,ii_3);
				ii_3 = null;
				Output.record("LU", "factor", 210, "ii_4", ii_4.value);
				j_27 = Phi.Exit(j_25,j_26);
				j_26 = null;
				Output.record("LU", "factor", 210, "j_27", j_27.value);
				N_14 = Phi.Exit(N_12,N_13);
				N_13 = null;
				Output.record("LU", "factor", 210, "N_14", N_14.value);
            }
			j_28 = Phi.If((j_24.value < minMN_2.value - 1),j_27,j_24);
			Output.record("LU", "factor", 207, "j_28", j_28.value);
			M_11 = Phi.If((j_24.value < minMN_2.value - 1),M_10,M_9);
			Output.record("LU", "factor", 207, "M_11", M_11.value);
			N_15 = Phi.If((j_24.value < minMN_2.value - 1),N_14,N_12);
			Output.record("LU", "factor", 207, "N_15", N_15.value);
        	j_29 = new Var<Integer>((j_28.value + 1));
			Output.record("LU", "factor", 227, "j_29", j_29.value);
		}
		minMN_3 = Phi.Exit(minMN_1,minMN_2);
		minMN_2 = null;
		Output.record("LU", "factor", 167, "minMN_3", minMN_3.value);
		j_30 = Phi.Exit(j_17,j_29);
		j_29 = null;
		Output.record("LU", "factor", 167, "j_30", j_30.value);
		M_12 = Phi.Exit(M_5,M_11);
		M_11 = null;
		Output.record("LU", "factor", 167, "M_12", M_12.value);
		N_16 = Phi.Exit(N_12,N_15);
		N_15 = null;
		Output.record("LU", "factor", 167, "N_16", N_16.value);

        return 0;
    }


    /**
     * Solve a linear system, using a prefactored matrix
     * in LU form.
     *
     * @param LU    (in) the factored matrix in LU form.
     * @param pivot (in) the pivot vector which lists
     *              the reordering used during the factorization
     *              stage.
     * @param b     (in/out) On input, the right-hand side.
     *              On output, the solution vector.
     */
    public static void solve(double[][] LU, int[] pvt, double[] b) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_13 = null;
		Var<Integer> N_17 = null;
		Var<Integer> ii_5 = null;
		Var<Integer> i_25 = null;
		Var<Integer> i_26 = null;
		Var<Integer> M_14 = null;
		Var<Integer> i_27 = null;
		Var<Integer> ip_0 = null;
		Var<Double> sum_0 = null;
		Var<Double> sum_1 = null;
		Var<Integer> ii_6 = null;
		Var<Integer> j_31 = null;
		Var<Integer> j_32 = null;
		Var<Integer> i_28 = null;
		Var<Integer> j_33 = null;
		Var<Integer> ii_7 = null;
		Var<Double> sum_2 = null;
		Var<Integer> j_34 = null;
		Var<Integer> j_35 = null;
		Var<Double> sum_3 = null;
		Var<Integer> ii_8 = null;
		Var<Integer> ii_9 = null;
		Var<Integer> i_29 = null;
		Var<Double> sum_4 = null;
		Var<Integer> i_30 = null;
		Var<Integer> ii_10 = null;
		Var<Integer> i_31 = null;
		Var<Integer> i_32 = null;
		Var<Integer> i_33 = null;
		Var<Integer> i_34 = null;
		Var<Integer> N_18 = null;
		Var<Double> sum_5 = null;
		Var<Integer> j_36 = null;
		Var<Integer> j_37 = null;
		Var<Integer> N_19 = null;
		Var<Integer> j_38 = null;
		Var<Integer> i_35 = null;
		Var<Double> sum_6 = null;
		Var<Integer> j_39 = null;
		Var<Integer> j_40 = null;
		Var<Double> sum_7 = null;
		Var<Integer> i_36 = null;
		Var<Integer> i_37 = null;
		Var<Integer> N_20 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside solve 2");
        M_13 = new Var<Integer>((LU.length));
		Output.record("LU", "solve", 243, "M_13", M_13.value);
        N_17 = new Var<Integer>((LU[0].length));
		Output.record("LU", "solve", 242, "N_17", N_17.value);
        ii_5 = new Var<Integer>((0));
		Output.record("LU", "solve", 242, "ii_5", ii_5.value);

        i_25 = new Var<Integer>((0));
		Output.record("LU", "solve", 241, "i_25", i_25.value);
		i_26 = new Var<Integer>((i_25.value));
		Output.record("LU", "solve", 242, "i_26", i_26.value);
		M_14 = new Var<Integer>((M_13.value));
		Output.record("LU", "solve", 240, "M_14", M_14.value);
		i_27 = new Var<Integer>((i_26.value));
		Output.record("LU", "solve", 241, "i_27", i_27.value);
		while(Phi.Entry(i_27,i_30).value < Phi.Entry(M_14,M_14).value) {
            ip_0 = new Var<Integer>((pvt[Phi.Entry(i_27,i_30).value]));
			Output.record("LU", "solve", 240, "ip_0", ip_0.value);
            sum_0 = new Var<Double>((double)(b[ip_0.value]));
			Output.record("LU", "solve", 241, "sum_0", sum_0.value);

            b[ip_0.value] = b[Phi.Entry(i_27,i_30).value];
            sum_1 = new Var<Double>((double)(sum_0.value));
			Output.record("LU", "solve", 241, "sum_1", sum_1.value);
			ii_6 = new Var<Integer>((Phi.Entry(ii_5,ii_9).value));
			Output.record("LU", "solve", 242, "ii_6", ii_6.value);
			if (ii_6.value == 0)
                {
				j_31 = new Var<Integer>((ii_6.value));
				Output.record("LU", "solve", 244, "j_31", j_31.value);
			j_32 = new Var<Integer>((j_31.value));
				Output.record("LU", "solve", 244, "j_32", j_32.value);
			i_28 = new Var<Integer>((Phi.Entry(i_27,i_30).value));
				Output.record("LU", "solve", 244, "i_28", i_28.value);
			j_33 = new Var<Integer>((j_32.value));
				Output.record("LU", "solve", 245, "j_33", j_33.value);
			ii_7 = new Var<Integer>((ii_6.value));
				Output.record("LU", "solve", 246, "ii_7", ii_7.value);
			while(Phi.Entry(j_33,j_34).value < Phi.Entry(i_28,i_30).value)
                    {
				sum_2 = new Var<Double>((double)(Phi.Entry(sum_1,sum_2).value - LU[Phi.Entry(i_28,i_30).value][Phi.Entry(j_33,j_34).value] * b[Phi.Entry(j_33,j_34).value]));
					Output.record("LU", "solve", 246, "sum_2", sum_2.value);
				j_34 = new Var<Integer>((Phi.Entry(j_33,j_34).value + 1));
					Output.record("LU", "solve", 244, "j_34", j_34.value);
			}
				j_35 = Phi.Exit(j_33,j_34);
				j_34 = null;
				Output.record("LU", "solve", 246, "j_35", j_35.value);
				sum_3 = Phi.Exit(sum_1,sum_2);
				sum_2 = null;
				Output.record("LU", "solve", 246, "sum_3", sum_3.value);
			}
            else if (sum_1.value == 0.0)
                {
				ii_8 = new Var<Integer>((Phi.Entry(i_27,i_30).value));
				Output.record("LU", "solve", 246, "ii_8", ii_8.value);
			}
			ii_9 = Phi.If((ii_6.value == 0),ii_7,Phi.If((sum_1.value == 0.0),ii_8,ii_6));
			Output.record("LU", "solve", 245, "ii_9", ii_9.value);
			i_29 = Phi.If((ii_6.value == 0),i_28,Phi.If((sum_1.value == 0.0),i_27,i_27));
			Output.record("LU", "solve", 245, "i_29", i_29.value);
			sum_4 = Phi.If((ii_6.value == 0),sum_3,Phi.If((sum_1.value == 0.0),sum_1,sum_1));
			Output.record("LU", "solve", 245, "sum_4", sum_4.value);
            b[Phi.Entry(i_29,i_30).value] = sum_4.value;
        	i_30 = new Var<Integer>((Phi.Entry(i_27,i_30).value + 1));
			Output.record("LU", "solve", 248, "i_30", i_30.value);
		}
		ii_10 = Phi.Exit(ii_5,ii_9);
		ii_9 = null;
		Output.record("LU", "solve", 241, "ii_10", ii_10.value);
		i_31 = Phi.Exit(i_27,i_30);
		i_30 = null;
		Output.record("LU", "solve", 241, "i_31", i_31.value);

        i_32 = new Var<Integer>((N_17.value - 1));
		Output.record("LU", "solve", 251, "i_32", i_32.value);
		i_33 = new Var<Integer>((i_32.value));
		Output.record("LU", "solve", 252, "i_33", i_33.value);
		i_34 = new Var<Integer>((i_33.value));
		Output.record("LU", "solve", 253, "i_34", i_34.value);
		N_18 = new Var<Integer>((N_17.value));
		Output.record("LU", "solve", 254, "N_18", N_18.value);
		while(Phi.Entry(i_34,i_36).value >= 0) {
            sum_5 = new Var<Double>((double)(b[Phi.Entry(i_34,i_36).value]));
			Output.record("LU", "solve", 256, "sum_5", sum_5.value);
            j_36 = new Var<Integer>((Phi.Entry(i_34,i_36).value + 1));
			Output.record("LU", "solve", 257, "j_36", j_36.value);
			j_37 = new Var<Integer>((j_36.value));
			Output.record("LU", "solve", 258, "j_37", j_37.value);
			N_19 = new Var<Integer>((Phi.Entry(N_18,N_19).value));
			Output.record("LU", "solve", 259, "N_19", N_19.value);
			j_38 = new Var<Integer>((j_37.value));
			Output.record("LU", "solve", 260, "j_38", j_38.value);
			i_35 = new Var<Integer>((Phi.Entry(i_34,i_36).value));
			Output.record("LU", "solve", 261, "i_35", i_35.value);
			while(Phi.Entry(j_38,j_39).value < Phi.Entry(N_19,N_19).value)
                {
				sum_6 = new Var<Double>((double)(Phi.Entry(sum_5,sum_6).value - LU[Phi.Entry(i_35,i_36).value][Phi.Entry(j_38,j_39).value] * b[Phi.Entry(j_38,j_39).value]));
				Output.record("LU", "solve", 262, "sum_6", sum_6.value);
				j_39 = new Var<Integer>((Phi.Entry(j_38,j_39).value + 1));
				Output.record("LU", "solve", 262, "j_39", j_39.value);
			}
			j_40 = Phi.Exit(j_38,j_39);
			j_39 = null;
			Output.record("LU", "solve", 261, "j_40", j_40.value);
			sum_7 = Phi.Exit(sum_5,sum_6);
			sum_6 = null;
			Output.record("LU", "solve", 261, "sum_7", sum_7.value);
            b[i_35.value] = sum_7.value / LU[i_35.value][i_35.value];
        	i_36 = new Var<Integer>((i_35.value - 1));
			Output.record("LU", "solve", 262, "i_36", i_36.value);
		}
		i_37 = Phi.Exit(i_34,i_36);
		i_36 = null;
		Output.record("LU", "solve", 255, "i_37", i_37.value);
		N_20 = Phi.Exit(N_18,N_19);
		N_19 = null;
		Output.record("LU", "solve", 255, "N_20", N_20.value);
    }


    private double LU_[][];
    private int pivot_[];

    public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<LU> lu_0 = null;
		Var<Integer> i_38 = null;
		Var<Integer> i_39 = null;
		Var<Integer> i_40 = null;
		Var<Integer> j_41 = null;
		Var<Integer> j_42 = null;
		Var<Integer> j_43 = null;
		Var<Integer> j_44 = null;
		Var<Integer> j_45 = null;
		Var<Integer> i_41 = null;
		Var<Integer> i_42 = null;
		Var<Integer> i_43 = null;
		Var<Integer> i_44 = null;
		Var<Integer> i_45 = null;
		Var<Integer> j_46 = null;
		Var<Integer> j_47 = null;
		Var<Integer> j_48 = null;
		Var<Integer> j_49 = null;
		Var<Integer> j_50 = null;
		Var<Integer> i_46 = null;
		Var<Integer> i_47 = null;
        
		/* PROGRAM STARTS */
		double temp[][] = {{1, 2, 3}, {2, 5, 7}, {3, 5, 3}};
//        double[][] temp = {{4, 3}, {6, 3}};
        lu_0 = new Var<LU>((new LU(temp)));
		Output.record("LU", "main", 271, "lu_0", lu_0.value);

        double getlu[][] = lu_0.value.getLU();

        i_38 = new Var<Integer>((0));
		Output.record("LU", "main", 272, "i_38", i_38.value);
		i_39 = new Var<Integer>((i_38.value));
		Output.record("LU", "main", 271, "i_39", i_39.value);
		i_40 = new Var<Integer>((i_39.value));
		Output.record("LU", "main", 271, "i_40", i_40.value);
		while(Phi.Entry(i_40,i_41).value < 2){
            j_41 = new Var<Integer>((0));
			Output.record("LU", "main", 272, "j_41", j_41.value);
			j_42 = new Var<Integer>((j_41.value));
			Output.record("LU", "main", 273, "j_42", j_42.value);
			j_43 = new Var<Integer>((j_42.value));
			Output.record("LU", "main", 274, "j_43", j_43.value);
			while(Phi.Entry(j_43,j_44).value < 2){
                System.out.println(getlu[Phi.Entry(i_40,i_41).value][Phi.Entry(j_43,j_44).value]);
            	j_44 = new Var<Integer>((Phi.Entry(j_43,j_44).value + 1));
				Output.record("LU", "main", 276, "j_44", j_44.value);
			}
			j_45 = Phi.Exit(j_43,j_44);
			j_44 = null;
			Output.record("LU", "main", 274, "j_45", j_45.value);
        	i_41 = new Var<Integer>((Phi.Entry(i_40,i_41).value + 1));
			Output.record("LU", "main", 278, "i_41", i_41.value);
		}
		i_42 = Phi.Exit(i_40,i_41);
		i_41 = null;
		Output.record("LU", "main", 272, "i_42", i_42.value);

        System.out.println("\n\n\n");

        double forCopy[][] = {{1, 2}, {3, 4}};
        double afterCopy[][] = new_copy(forCopy);
        i_43 = new Var<Integer>((0));
		Output.record("LU", "main", 285, "i_43", i_43.value);
		i_44 = new Var<Integer>((i_43.value));
		Output.record("LU", "main", 286, "i_44", i_44.value);
		i_45 = new Var<Integer>((i_44.value));
		Output.record("LU", "main", 287, "i_45", i_45.value);
		while(Phi.Entry(i_45,i_46).value < 2){
            j_46 = new Var<Integer>((0));
			Output.record("LU", "main", 289, "j_46", j_46.value);
			j_47 = new Var<Integer>((j_46.value));
			Output.record("LU", "main", 290, "j_47", j_47.value);
			j_48 = new Var<Integer>((j_47.value));
			Output.record("LU", "main", 291, "j_48", j_48.value);
			while(Phi.Entry(j_48,j_49).value < 2){
                System.out.println(afterCopy[Phi.Entry(i_45,i_46).value][Phi.Entry(j_48,j_49).value]);
            	j_49 = new Var<Integer>((Phi.Entry(j_48,j_49).value + 1));
				Output.record("LU", "main", 294, "j_49", j_49.value);
			}
			j_50 = Phi.Exit(j_48,j_49);
			j_49 = null;
			Output.record("LU", "main", 292, "j_50", j_50.value);
        	i_46 = new Var<Integer>((Phi.Entry(i_45,i_46).value + 1));
			Output.record("LU", "main", 296, "i_46", i_46.value);
		}
		i_47 = Phi.Exit(i_45,i_46);
		i_46 = null;
		Output.record("LU", "main", 288, "i_47", i_47.value);

        int pivot[] = lu_0.value.getPivot();
        lu_0.value.solve(new double[]{1, 2, 3});
    }
}
