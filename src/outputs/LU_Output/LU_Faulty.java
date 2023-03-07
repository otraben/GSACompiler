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
public class LU_Faulty {
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

        Nd_0 = new Var<Double>((double)(double) N_0.value);
		Output.record("LU", "num_flops", 31, "Nd_0", Nd_0.value);

        return (2.0 * Nd_0.value * Nd_0.value * Nd_0.value / 3.0);
    }

    protected static double[] new_copy(double[] x) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> N_1 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy");
        N_1 = new Var<Integer>(x.length);
		Output.record("LU", "new_copy", 38, "N_1", N_1.value);
        double T[] = new double[N_1.value];
        i_0 = new Var<Integer>(0);
		Output.record("LU", "new_copy", 39, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value < Phi.Entry(N_1,N_1).value)
            {
			T[Phi.Entry(i_0,i_1).value] = x[Phi.Entry(i_0,i_1).value];
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("LU", "new_copy", 40, "i_1", i_1.value);
		}
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("LU", "new_copy", 40, "i_2", i_2.value);
        return T;
    }


    protected static double[][] new_copy(double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_0 = null;
		Var<Integer> N_2 = null;
		Var<Integer> i_3 = null;
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
    	
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy2");
        M_0 = new Var<Integer>(A.length);
		Output.record("LU", "new_copy", 49, "M_0", M_0.value);
        N_2 = new Var<Integer>(A[0].length);
		Output.record("LU", "new_copy", 50, "N_2", N_2.value);

        double T[][] = new double[M_0.value][N_2.value];

        i_3 = new Var<Integer>(0);
		Output.record("LU", "new_copy", 53, "i_3", i_3.value);
		while(Phi.Entry(i_3,i_4).value < Phi.Entry(M_0,M_0).value) {
            double Ti[] = T[Phi.Entry(i_3,i_4).value];
            double Ai[] = A[Phi.Entry(i_3,i_4).value];
            j_0 = new Var<Integer>(0);
			Output.record("LU", "new_copy", 53, "j_0", j_0.value);
			while(Phi.Entry(j_0,j_1).value < Phi.Entry(N_2,N_2).value)
                {
				Ti[Phi.Entry(j_0,j_1).value] = Ai[Phi.Entry(j_0,j_1).value];
				j_1 = new Var<Integer>(Phi.Entry(j_0,j_1).value + 1);
				Output.record("LU", "new_copy", 56, "j_1", j_1.value);
			}
			j_2 = Phi.Exit(j_0,j_1);
			j_1 = null;
			Output.record("LU", "new_copy", 54, "j_2", j_2.value);
        	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
			Output.record("LU", "new_copy", 58, "i_4", i_4.value);
		}
		i_5 = Phi.Exit(i_3,i_4);
		Output.record("LU", "new_copy", 53, "i_5", i_5.value);

        return T;
    }


    public static int[] new_copy(int[] x) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> N_3 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> i_8 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside new_copy 3");
        N_3 = new Var<Integer>(x.length);
		Output.record("LU", "new_copy", 63, "N_3", N_3.value);
        int T[] = new int[N_3.value];
        i_6 = new Var<Integer>(0);
		Output.record("LU", "new_copy", 65, "i_6", i_6.value);
		while(Phi.Entry(i_6,i_7).value < Phi.Entry(N_3,N_3).value)
            {
			T[Phi.Entry(i_6,i_7).value] = x[Phi.Entry(i_6,i_7).value];
			i_7 = new Var<Integer>(Phi.Entry(i_6,i_7).value + 1);
			Output.record("LU", "new_copy", 69, "i_7", i_7.value);
		}
		i_8 = Phi.Exit(i_6,i_7);
		Output.record("LU", "new_copy", 66, "i_8", i_8.value);
        return T;
    }

    protected static final void insert_copy(double[][] B, double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_1 = null;
		Var<Integer> N_4 = null;
		Var<Integer> remainder_0 = null;
		Var<Integer> i_9 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> j_5 = null;
		Var<Integer> j_6 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside insert_copy");
        M_1 = new Var<Integer>(A.length);
		Output.record("LU", "insert_copy", 76, "M_1", M_1.value);
        N_4 = new Var<Integer>(A[0].length);
		Output.record("LU", "insert_copy", 77, "N_4", N_4.value);

        remainder_0 = new Var<Integer>(N_4.value & 3);
		Output.record("LU", "insert_copy", 77, "remainder_0", remainder_0.value);         // N mod 4;

        i_9 = new Var<Integer>(0);
		Output.record("LU", "insert_copy", 76, "i_9", i_9.value);
		while(Phi.Entry(i_9,i_10).value < Phi.Entry(M_1,M_1).value) {
            double Bi[] = B[Phi.Entry(i_9,i_10).value];
            double Ai[] = A[Phi.Entry(i_9,i_10).value];
            j_3 = new Var<Integer>(0);
			Output.record("LU", "insert_copy", 79, "j_3", j_3.value);
			while(Phi.Entry(j_3,j_4).value < Phi.Entry(remainder_0,remainder_0).value)
                {
				Bi[Phi.Entry(j_3,j_4).value] = Ai[Phi.Entry(j_3,j_4).value];
				j_4 = new Var<Integer>(Phi.Entry(j_3,j_4).value + 1);
				Output.record("LU", "insert_copy", 82, "j_4", j_4.value);
			}
			j_5 = Phi.Exit(j_3,j_4);
			j_4 = null;
			Output.record("LU", "insert_copy", 80, "j_5", j_5.value);
            j_6 = new Var<Integer>(Phi.Entry(remainder_0,remainder_0).value);
			Output.record("LU", "insert_copy", 83, "j_6", j_6.value);
			while(Phi.Entry(j_6,j_7).value < Phi.Entry(N_4,N_4).value) {
                Bi[Phi.Entry(j_6,j_7).value] = Ai[Phi.Entry(j_6,j_7).value];
                Bi[Phi.Entry(j_6,j_7).value + 1] = Ai[Phi.Entry(j_6,j_7).value + 1];
                Bi[Phi.Entry(j_6,j_7).value + 2] = Ai[Phi.Entry(j_6,j_7).value + 2];
                Bi[Phi.Entry(j_6,j_7).value + 3] = Ai[Phi.Entry(j_6,j_7).value + 3];
            	j_7 = new Var<Integer>(Phi.Entry(j_6,j_7).value + 4);
				Output.record("LU", "insert_copy", 89, "j_7", j_7.value);
			}
			j_8 = Phi.Exit(j_6,j_7);
			j_7 = null;
			Output.record("LU", "insert_copy", 84, "j_8", j_8.value);
        	i_10 = new Var<Integer>(Phi.Entry(i_9,i_10).value + 1);
			Output.record("LU", "insert_copy", 91, "i_10", i_10.value);
		}
		i_11 = Phi.Exit(i_9,i_10);
		Output.record("LU", "insert_copy", 76, "i_11", i_11.value);

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
    public LU_Faulty(double[][] A) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> M_2 = null;
		Var<Integer> N_5 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside LU");
        M_2 = new Var<Integer>(A.length);
		Output.record("LU", "LU", 121, "M_2", M_2.value);
        N_5 = new Var<Integer>(A[0].length);
		Output.record("LU", "LU", 122, "N_5", N_5.value);

        //if ( LU_ == null || LU_.length != M || LU_[0].length != N)
        LU_ = new double[M_2.value][N_5.value];

        insert_copy(LU_, A);

        //if (pivot_.length != M)
        pivot_ = new int[M_2.value];

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
		Var<Integer> N_6 = null;
		Var<Integer> M_3 = null;
		Var<Integer> minMN_0 = null;
		Var<Integer> j_9 = null;
		Var<Integer> jp_0 = null;
		Var<Double> t_0 = null;
		Var<Integer> i_12 = null;
		Var<Double> ab_0 = null;
		Var<Double> t_1 = null;
		Var<Double> ab_1 = null;
		Var<Integer> jp_1 = null;
		Var<Double> t_2 = null;
		Var<Double> t_3 = null;
		Var<Integer> i_13 = null;
		Var<Double> t_4 = null;
		Var<Integer> jp_2 = null;
		Var<Integer> i_14 = null;
		Var<Integer> j_10 = null;
		Var<Integer> jp_3 = null;
		Var<Integer> j_11 = null;
		Var<Integer> jp_4 = null;
		Var<Integer> M_4 = null;
		Var<Integer> j_12 = null;
		Var<Double> recp_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> k_1 = null;
		Var<Integer> k_2 = null;
		Var<Integer> minMN_1 = null;
		Var<Integer> j_13 = null;
		Var<Integer> ii_0 = null;
		Var<Double> AiiJ_0 = null;
		Var<Integer> jj_0 = null;
		Var<Integer> jj_1 = null;
		Var<Integer> jj_2 = null;
		Var<Integer> ii_1 = null;
		Var<Integer> ii_2 = null;
		Var<Integer> j_14 = null;
		Var<Integer> minMN_2 = null;
		Var<Integer> j_15 = null;
		Var<Integer> M_5 = null;

        
		/* PROGRAM STARTS */
		System.out.println("inside factor");
        N_6 = new Var<Integer>(A.length);
		Output.record("LU", "factor", 164, "N_6", N_6.value);
        M_3 = new Var<Integer>(A[0].length);
		Output.record("LU", "factor", 165, "M_3", M_3.value);

        minMN_0 = new Var<Integer>(Math.min(M_3.value, N_6.value));
		Output.record("LU", "factor", 167, "minMN_0", minMN_0.value);

        j_9 = new Var<Integer>(0);
		Output.record("LU", "factor", 168, "j_9", j_9.value);
		while(Phi.Entry(j_9,j_14).value < Phi.Entry(minMN_0,minMN_1).value) {
            // find pivot in column j and  input.test for singularity.

            jp_0 = new Var<Integer>(Phi.Entry(j_9,j_14).value);
			Output.record("LU", "factor", 170, "jp_0", jp_0.value);

            t_0 = new Var<Double>((double)Math.abs(A[Phi.Entry(j_9,j_14).value][Phi.Entry(j_9,j_14).value]));
			Output.record("LU", "factor", 172, "t_0", t_0.value);
            i_12 = new Var<Integer>(Phi.Entry(j_9,j_14).value + 1);
			Output.record("LU", "factor", 172, "i_12", i_12.value);
			while(Phi.Entry(i_12,i_13).value < Phi.Entry(M_3,M_4).value) {
                ab_0 = new Var<Double>((double)Math.abs(A[Phi.Entry(i_12,i_13).value][Phi.Entry(j_9,j_14).value]));
				Output.record("LU", "factor", 174, "ab_0", ab_0.value);
                t_1 = new Var<Double>((double)Phi.Entry(t_0,t_3).value);
				Output.record("LU", "factor", 174, "t_1", t_1.value);
ab_1 = new Var<Double>((double)ab_0.value);
				Output.record("LU", "factor", 175, "ab_1", ab_1.value);
if (ab_1.value > t_1.value) {
                    jp_1 = new Var<Integer>(Phi.Entry(i_12,i_13).value);
					Output.record("LU", "factor", 177, "jp_1", jp_1.value);
                    t_2 = new Var<Double>((double)ab_1.value);
					Output.record("LU", "factor", 178, "t_2", t_2.value);
                }
				t_3 = Phi.If((ab_1.value > t_1.value),t_2,t_1);
				Output.record("LU", "factor", 176, "t_3", t_3.value);
            	i_13 = new Var<Integer>(Phi.Entry(i_12,i_13).value + 1);
				Output.record("LU", "factor", 179, "i_13", i_13.value);
			}
			t_4 = Phi.Exit(t_0,t_3);
			t_3 = null;
			Output.record("LU", "factor", 173, "t_4", t_4.value);
			jp_2 = Phi.Exit(jp_0,jp_1);
			jp_1 = null;
			Output.record("LU", "factor", 173, "jp_2", jp_2.value);
			i_14 = Phi.Exit(i_12,i_13);
			i_13 = null;
			Output.record("LU", "factor", 173, "i_14", i_14.value);

            pivot[Phi.Entry(j_9,j_14).value] = jp_2.value;

            // jp now has the index of maximum element
            // of column j, below the diagonal

            j_10 = new Var<Integer>(Phi.Entry(j_9,j_14).value);
			Output.record("LU", "factor", 182, "j_10", j_10.value);
jp_3 = new Var<Integer>(jp_2.value);
			Output.record("LU", "factor", 183, "jp_3", jp_3.value);
if (A[jp_3.value][j_10.value] == 0)
                {
				return 1;
			}       // factorization failed because of zero pivot


            j_11 = new Var<Integer>(j_10.value);
			Output.record("LU", "factor", 188, "j_11", j_11.value);
jp_4 = new Var<Integer>(jp_3.value);
			Output.record("LU", "factor", 189, "jp_4", jp_4.value);
if (jp_4.value != j_11.value) {
                // swap rows j and jp
                double tA[] = A[j_11.value];
                A[j_11.value] = A[jp_4.value];
                A[jp_4.value] = tA;
            }

            M_4 = new Var<Integer>(Phi.Entry(M_3,M_4).value);
			Output.record("LU", "factor", 193, "M_4", M_4.value);
j_12 = new Var<Integer>(j_11.value);
			Output.record("LU", "factor", 194, "j_12", j_12.value);
if (j_12.value < M_4.value - 1)                // compute elements j+1:M of jth column
            {
                // note A(j,j), was A(jp,p) previously which was
                // guarranteed not to be zero (Label #1)
                //
                recp_0 = new Var<Double>((double)1.0 / A[j_12.value][j_12.value]);
				Output.record("LU", "factor", 198, "recp_0", recp_0.value);

                k_0 = new Var<Integer>(j_12.value + 1);
				Output.record("LU", "factor", 200, "k_0", k_0.value);
				while(Phi.Entry(k_0,k_1).value < Phi.Entry(M_4,M_4).value)
                    {
					A[Phi.Entry(k_0,k_1).value][Phi.Entry(j_12,j_14).value] = A[Phi.Entry(k_0,k_1).value][Phi.Entry(j_12,j_14).value] * Phi.Entry(recp_0,recp_0).value;
					k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value + 1);
					Output.record("LU", "factor", 204, "k_1", k_1.value);
				}
				k_2 = Phi.Exit(k_0,k_1);
				k_1 = null;
				Output.record("LU", "factor", 201, "k_2", k_2.value);
            }


            minMN_1 = new Var<Integer>(Phi.Entry(minMN_0,minMN_1).value);
			Output.record("LU", "factor", 208, "minMN_1", minMN_1.value);
j_13 = new Var<Integer>(j_12.value);
			Output.record("LU", "factor", 208, "j_13", j_13.value);
if (j_13.value < minMN_1.value - 1) {
                // rank-1 update to trailing submatrix:   E = E - x*y;
                //
                // E is the region A(j+1:M, j+1:N)
                // x is the column vector A(j+1:M,j)
                // y is row vector A(j,j+1:N)


                ii_0 = new Var<Integer>(j_13.value + 1);
				Output.record("LU", "factor", 213, "ii_0", ii_0.value);
				while(Phi.Entry(ii_0,ii_1).value < Phi.Entry(M_4,M_4).value) {
                    double Aii[] = A[Phi.Entry(ii_0,ii_1).value];
                    double Aj[] = A[Phi.Entry(j_13,j_14).value];
                    AiiJ_0 = new Var<Double>((double)Aii[Phi.Entry(j_13,j_14).value]);
					Output.record("LU", "factor", 216, "AiiJ_0", AiiJ_0.value);
                    jj_0 = new Var<Integer>(Phi.Entry(j_13,j_14).value + 1);
					Output.record("LU", "factor", 217, "jj_0", jj_0.value);
					while(Phi.Entry(jj_0,jj_1).value < Phi.Entry(N_6,N_6).value)
                        {
						Aii[Phi.Entry(jj_0,jj_1).value] = Aii[Phi.Entry(jj_0,jj_1).value] - Phi.Entry(AiiJ_0,AiiJ_0).value * Aj[Phi.Entry(jj_0,jj_1).value];
						jj_1 = new Var<Integer>(Phi.Entry(jj_0,jj_1).value + 1);
						Output.record("LU", "factor", 221, "jj_1", jj_1.value);
					}
					jj_2 = Phi.Exit(jj_0,jj_1);
					jj_1 = null;
					Output.record("LU", "factor", 218, "jj_2", jj_2.value);

                	ii_1 = new Var<Integer>(Phi.Entry(ii_0,ii_1).value + 1);
					Output.record("LU", "factor", 224, "ii_1", ii_1.value);
				}
				ii_2 = Phi.Exit(ii_0,ii_1);
				ii_1 = null;
				Output.record("LU", "factor", 213, "ii_2", ii_2.value);
            }
        	j_14 = new Var<Integer>(j_13.value + 1);
			Output.record("LU", "factor", 227, "j_14", j_14.value);
		}
		minMN_2 = Phi.Exit(minMN_0,minMN_1);
		Output.record("LU", "factor", 168, "minMN_2", minMN_2.value);
		j_15 = Phi.Exit(j_9,j_14);
		Output.record("LU", "factor", 168, "j_15", j_15.value);
		M_5 = Phi.Exit(M_3,M_4);
		Output.record("LU", "factor", 168, "M_5", M_5.value);

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
		Var<Integer> M_6 = null;
		Var<Integer> N_7 = null;
		Var<Integer> ii_3 = null;
		Var<Integer> i_15 = null;
		Var<Integer> ip_0 = null;
		Var<Double> sum_0 = null;
		Var<Double> sum_1 = null;
		Var<Integer> ii_4 = null;
		Var<Integer> j_16 = null;
		Var<Double> sum_2 = null;
		Var<Integer> j_17 = null;
		Var<Integer> j_18 = null;
		Var<Double> sum_3 = null;
		Var<Integer> ii_5 = null;
		Var<Integer> ii_6 = null;
		Var<Double> sum_4 = null;
		Var<Integer> i_16 = null;
		Var<Integer> ii_7 = null;
		Var<Integer> i_17 = null;
		Var<Integer> i_18 = null;
		Var<Double> sum_5 = null;
		Var<Integer> j_19 = null;
		Var<Double> sum_6 = null;
		Var<Integer> j_20 = null;
		Var<Integer> j_21 = null;
		Var<Double> sum_7 = null;
		Var<Integer> i_19 = null;
		Var<Integer> i_20 = null;
        
		/* PROGRAM STARTS */
		System.out.println("inside solve 2");
        M_6 = new Var<Integer>(LU.length);
		Output.record("LU", "solve", 241, "M_6", M_6.value);
        N_7 = new Var<Integer>(LU[0].length);
		Output.record("LU", "solve", 241, "N_7", N_7.value);
        ii_3 = new Var<Integer>(0);
		Output.record("LU", "solve", 240, "ii_3", ii_3.value);

        i_15 = new Var<Integer>(0);
		Output.record("LU", "solve", 240, "i_15", i_15.value);
		while(Phi.Entry(i_15,i_16).value < Phi.Entry(M_6,M_6).value) {
            ip_0 = new Var<Integer>(pvt[Phi.Entry(i_15,i_16).value]);
			Output.record("LU", "solve", 241, "ip_0", ip_0.value);
            sum_0 = new Var<Double>((double)b[ip_0.value]);
			Output.record("LU", "solve", 242, "sum_0", sum_0.value);

            b[ip_0.value] = b[Phi.Entry(i_15,i_16).value];
            sum_1 = new Var<Double>((double)sum_0.value);
			Output.record("LU", "solve", 245, "sum_1", sum_1.value);
ii_4 = new Var<Integer>(Phi.Entry(ii_3,ii_6).value);
			Output.record("LU", "solve", 244, "ii_4", ii_4.value);
if (ii_4.value == 0)
                {
				j_16 = new Var<Integer>(ii_4.value);
				Output.record("LU", "solve", 244, "j_16", j_16.value);
			while(Phi.Entry(j_16,j_17).value < Phi.Entry(i_15,i_16).value)
                    {
				sum_2 = new Var<Double>((double)Phi.Entry(sum_1,sum_2).value - LU[Phi.Entry(i_15,i_16).value][Phi.Entry(j_16,j_17).value] * b[Phi.Entry(j_16,j_17).value]);
					Output.record("LU", "solve", 246, "sum_2", sum_2.value);
				j_17 = new Var<Integer>(Phi.Entry(j_16,j_17).value + 1);
					Output.record("LU", "solve", 247, "j_17", j_17.value);
			}
				j_18 = Phi.Exit(j_16,j_17);
				j_17 = null;
				Output.record("LU", "solve", 245, "j_18", j_18.value);
				sum_3 = Phi.Exit(sum_1,sum_2);
				Output.record("LU", "solve", 245, "sum_3", sum_3.value);
			}
            else if (sum_1.value == 0.0)
                {
				ii_5 = new Var<Integer>(Phi.Entry(i_15,i_16).value);
				Output.record("LU", "solve", 252, "ii_5", ii_5.value);
			}
			ii_6 = Phi.If((ii_4.value == 0),ii_4,Phi.If((sum_1.value == 0.0),ii_5,ii_4));
			Output.record("LU", "solve", 251, "ii_6", ii_6.value);
			sum_4 = Phi.If((ii_4.value == 0),sum_3,Phi.If((sum_1.value == 0.0),sum_1,sum_1));
			Output.record("LU", "solve", 251, "sum_4", sum_4.value);
            b[Phi.Entry(i_15,i_16).value] = sum_4.value;
        	i_16 = new Var<Integer>(Phi.Entry(i_15,i_16).value + 1);
			Output.record("LU", "solve", 255, "i_16", i_16.value);
		}
		ii_7 = Phi.Exit(ii_3,ii_6);
		Output.record("LU", "solve", 241, "ii_7", ii_7.value);
		i_17 = Phi.Exit(i_15,i_16);
		Output.record("LU", "solve", 241, "i_17", i_17.value);

        i_18 = new Var<Integer>(N_7.value - 1);
		Output.record("LU", "solve", 258, "i_18", i_18.value);
		while(Phi.Entry(i_18,i_19).value >= 0) {
            sum_5 = new Var<Double>((double)b[Phi.Entry(i_18,i_19).value]);
			Output.record("LU", "solve", 260, "sum_5", sum_5.value);
            j_19 = new Var<Integer>(Phi.Entry(i_18,i_19).value + 1);
			Output.record("LU", "solve", 261, "j_19", j_19.value);
			while(Phi.Entry(j_19,j_20).value < Phi.Entry(N_7,N_7).value)
                {
				sum_6 = new Var<Double>((double)Phi.Entry(sum_5,sum_6).value - LU[Phi.Entry(i_18,i_19).value][Phi.Entry(j_19,j_20).value] * b[Phi.Entry(j_19,j_20).value]);
				Output.record("LU", "solve", 262, "sum_6", sum_6.value);
				j_20 = new Var<Integer>(Phi.Entry(j_19,j_20).value + 1);
				Output.record("LU", "solve", 262, "j_20", j_20.value);
			}
			j_21 = Phi.Exit(j_19,j_20);
			j_20 = null;
			Output.record("LU", "solve", 261, "j_21", j_21.value);
			sum_7 = Phi.Exit(sum_5,sum_6);
			sum_6 = null;
			Output.record("LU", "solve", 261, "sum_7", sum_7.value);
            b[Phi.Entry(i_18,i_19).value] = sum_7.value / LU[Phi.Entry(i_18,i_19).value][Phi.Entry(i_18,i_19).value];
        	i_19 = new Var<Integer>(Phi.Entry(i_18,i_19).value - 1);
			Output.record("LU", "solve", 264, "i_19", i_19.value);
		}
		i_20 = Phi.Exit(i_18,i_19);
		Output.record("LU", "solve", 259, "i_20", i_20.value);
    }


    private double LU_[][];
    private int pivot_[];

    public static void main(String[] args) {
		Output.newExecution("LU");

		// formal parameters

		// all variables are declared to null
		Var<LU> lu_0 = null;
		Var<Integer> i_21 = null;
		Var<Integer> j_22 = null;
		Var<Integer> j_23 = null;
		Var<Integer> j_24 = null;
		Var<Integer> i_22 = null;
		Var<Integer> i_23 = null;
		Var<Integer> i_24 = null;
		Var<Integer> j_25 = null;
		Var<Integer> j_26 = null;
		Var<Integer> j_27 = null;
		Var<Integer> i_25 = null;
		Var<Integer> i_26 = null;
        
		/* PROGRAM STARTS */
		double temp[][] = {{1, 2, 3}, {2, 5, 7}, {3, 5, 3}};
//        double[][] temp = {{4, 3}, {6, 3}};
        lu_0 = new Var<LU>(new LU(temp));
		Output.record("LU", "main", 272, "lu_0", lu_0.value);

        double getlu[][] = lu_0.value.getLU();

        i_21 = new Var<Integer>(0);
		Output.record("LU", "main", 275, "i_21", i_21.value);
		while(Phi.Entry(i_21,i_22).value < 2){
            j_22 = new Var<Integer>(0);
			Output.record("LU", "main", 277, "j_22", j_22.value);
			while(Phi.Entry(j_22,j_23).value < 2){
                System.out.println(getlu[Phi.Entry(i_21,i_22).value][Phi.Entry(j_22,j_23).value]);
            	j_23 = new Var<Integer>(Phi.Entry(j_22,j_23).value + 1);
				Output.record("LU", "main", 280, "j_23", j_23.value);
			}
			j_24 = Phi.Exit(j_22,j_23);
			j_23 = null;
			Output.record("LU", "main", 278, "j_24", j_24.value);
        	i_22 = new Var<Integer>(Phi.Entry(i_21,i_22).value + 1);
			Output.record("LU", "main", 282, "i_22", i_22.value);
		}
		i_23 = Phi.Exit(i_21,i_22);
		Output.record("LU", "main", 276, "i_23", i_23.value);

        System.out.println("\n\n\n");

        double forCopy[][] = {{1, 2}, {3, 4}};
        double afterCopy[][] = new_copy(forCopy);
        i_24 = new Var<Integer>(0);
		Output.record("LU", "main", 289, "i_24", i_24.value);
		while(Phi.Entry(i_24,i_25).value < 2){
            j_25 = new Var<Integer>(0);
			Output.record("LU", "main", 291, "j_25", j_25.value);
			while(Phi.Entry(j_25,j_26).value < 2){
                System.out.println(afterCopy[Phi.Entry(i_24,i_25).value][Phi.Entry(j_25,j_26).value]);
            	j_26 = new Var<Integer>(Phi.Entry(j_25,j_26).value + 1);
				Output.record("LU", "main", 294, "j_26", j_26.value);
			}
			j_27 = Phi.Exit(j_25,j_26);
			j_26 = null;
			Output.record("LU", "main", 292, "j_27", j_27.value);
        	i_25 = new Var<Integer>(Phi.Entry(i_24,i_25).value + 1);
			Output.record("LU", "main", 296, "i_25", i_25.value);
		}
		i_26 = Phi.Exit(i_24,i_25);
		Output.record("LU", "main", 290, "i_26", i_26.value);

        int pivot[] = lu_0.value.getPivot();
        lu_0.value.solve(new double[]{1, 2, 3});
    }
}
