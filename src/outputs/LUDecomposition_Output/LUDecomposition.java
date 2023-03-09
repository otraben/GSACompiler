/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package outputs.LUDecomposition_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.util.FastMath;

/**
 * Calculates the LUP-decomposition of a square matrix.
 * <p>The LUP-decomposition of a matrix A consists of three matrices L, U and
 * P that satisfy: P&times;A = L&times;U. L is lower triangular (with unit
 * diagonal terms), U is upper triangular and P is a permutation matrix. All
 * matrices are m&times;m.</p>
 * <p>As shown by the presence of the P matrix, this decomposition is
 * implemented using partial pivoting.</p>
 * <p>This class is based on the class with similar name from the
 * <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library.</p>
 * <ul>
 *   <li>a {@link #getP() getP} method has been added,</li>
 *   <li>the {@code det} method has been renamed as {@link #getDeterminant()
 *   getDeterminant},</li>
 *   <li>the {@code getDoublePivot} method has been removed (but the int based
 *   {@link #getPivot() getPivot} method has been kept),</li>
 *   <li>the {@code solve} and {@code isNonSingular} methods have been replaced
 *   by a {@link #getSolver() getSolver} method and the equivalent methods
 *   provided by the returned {@link DecompositionSolver}.</li>
 * </ul>
 *
 * @see <a href="http://mathworld.wolfram.com/LUDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/LU_decomposition">Wikipedia</a>
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class LUDecomposition {
    /** Default bound to determine effective singularity in LU decomposition. */
    private static final double DEFAULT_TOO_SMALL = 1e-11;
    /** Entries of LU decomposition. */
    private final double[][] lu;
    /** Pivot permutation associated with LU decomposition. */
    private final int[] pivot;
    /** Parity of the permutation associated with the LU decomposition. */
    private boolean even;
    /** Singularity indicator. */
    private boolean singular;
    /** Cached value of L. */
    private RealMatrix cachedL;
    /** Cached value of U. */
    private RealMatrix cachedU;
    /** Cached value of P. */
    private RealMatrix cachedP;

    /**
     * Calculates the LU-decomposition of the given matrix.
     * This constructor uses 1e-11 as default value for the singularity
     * threshold.
     *
     * @param matrix Matrix to decompose.
     * @throws NonSquareMatrixException if matrix is not square.
     */
    public LUDecomposition(RealMatrix matrix) {
		this(matrix,DEFAULT_TOO_SMALL);
		// formal parameters
		Var<RealMatrix> matrix_0 = new Var<RealMatrix>(matrix);
		Output.record("LUDecomposition", "LUDecomposition", 82, "matrix_0", matrix_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		;
    }

    /**
     * Calculates the LU-decomposition of the given matrix.
     * @param matrix The matrix to decompose.
     * @param singularityThreshold threshold (based on partial row norm)
     * under which a matrix is considered singular
     * @throws NonSquareMatrixException if matrix is not square
     */
    public LUDecomposition(RealMatrix matrix, double singularityThreshold) {
		// formal parameters
		Var<Double> singularityThreshold_0 = new Var<Double>(singularityThreshold);
		Output.record("LUDecomposition", "LUDecomposition", 93, "singularityThreshold_0", singularityThreshold_0.value);
		Var<RealMatrix> matrix_1 = new Var<RealMatrix>(matrix);
		Output.record("LUDecomposition", "LUDecomposition", 93, "matrix_1", matrix_1.value);

		// all variables are declared to null
		Var<Integer> m_0 = null;
		Var<Integer> row_0 = null;
		Var<Integer> row_1 = null;
		Var<Integer> row_2 = null;
		Var<Integer> col_0 = null;
		Var<Integer> row_3 = null;
		Var<Double> sum_0 = null;
		Var<Integer> i_0 = null;
		Var<Double> sum_1 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Double> sum_2 = null;
		Var<Integer> row_4 = null;
		Var<Integer> row_5 = null;
		Var<Integer> max_0 = null;
		Var<Double> largest_0 = null;
		Var<Integer> row_6 = null;
		Var<Double> sum_3 = null;
		Var<Integer> i_3 = null;
		Var<Double> sum_4 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Double> sum_5 = null;
		Var<Double> largest_1 = null;
		Var<Double> sum_6 = null;
		Var<Double> largest_2 = null;
		Var<Integer> max_1 = null;
		Var<Double> largest_3 = null;
		Var<Integer> max_2 = null;
		Var<Integer> row_7 = null;
		Var<Double> largest_4 = null;
		Var<Integer> max_3 = null;
		Var<Integer> row_8 = null;
		Var<Integer> col_1 = null;
		Var<Integer> max_4 = null;
		Var<Integer> col_2 = null;
		Var<Integer> max_5 = null;
		Var<Double> tmp_0 = null;
		Var<Integer> i_6 = null;
		Var<Double> tmp_1 = null;
		Var<Integer> i_7 = null;
		Var<Double> tmp_2 = null;
		Var<Integer> i_8 = null;
		Var<Integer> temp_0 = null;
		Var<Double> luDiag_0 = null;
		Var<Integer> row_9 = null;
		Var<Integer> row_10 = null;
		Var<Integer> row_11 = null;
		Var<Integer> col_3 = null;
		Var<Integer> col_4 = null;
		Var<Integer> row_12 = null;
        
		/* PROGRAM STARTS */
		if (!matrix_1.value.isSquare()) {
            throw new NonSquareMatrixException(matrix_1.value.getRowDimension(),
                                               matrix_1.value.getColumnDimension());
        }

        m_0 = new Var<Integer>((matrix_1.value.getColumnDimension()));
		Output.record("LUDecomposition", "LUDecomposition", 99, "m_0", m_0.value);
        lu = matrix_1.value.getData();
        pivot = new int[m_0.value];
        cachedL = null;
        cachedU = null;
        cachedP = null;

        // Initialize permutation array and parity
        row_0 = new Var<Integer>((0));
		Output.record("LUDecomposition", "LUDecomposition", 106, "row_0", row_0.value);
		while(Phi.Entry(row_0,row_1).value < Phi.Entry(m_0,m_0).value) {
            pivot[Phi.Entry(row_0,row_1).value] = Phi.Entry(row_0,row_1).value;
        	row_1 = new Var<Integer>((Phi.Entry(row_0,row_1).value + 1));
			Output.record("LUDecomposition", "LUDecomposition", 108, "row_1", row_1.value);
		}
		row_2 = Phi.Exit(row_0,row_1);
		Output.record("LUDecomposition", "LUDecomposition", 107, "row_2", row_2.value);
        even     = true;
        singular = false;

        // Loop over columns
        col_0 = new Var<Integer>((0));
		Output.record("LUDecomposition", "LUDecomposition", 114, "col_0", col_0.value);
		while(Phi.Entry(col_0,col_3).value < Phi.Entry(m_0,m_0).value) {

            // upper
            row_3 = new Var<Integer>((0));
			Output.record("LUDecomposition", "LUDecomposition", 118, "row_3", row_3.value);
			while(Phi.Entry(row_3,row_4).value < Phi.Entry(col_0,col_3).value) {
                final double luRow[] = lu[Phi.Entry(row_3,row_4).value];
                sum_0 = new Var<Double>((double)(luRow[Phi.Entry(col_0,col_3).value]));
				Output.record("LUDecomposition", "LUDecomposition", 119, "sum_0", sum_0.value);
                i_0 = new Var<Integer>((0));
				Output.record("LUDecomposition", "LUDecomposition", 120, "i_0", i_0.value);
				while(Phi.Entry(i_0,i_1).value < Phi.Entry(row_3,row_4).value) {
                    sum_1 = new Var<Double>((double)(Phi.Entry(sum_0,sum_1).value - luRow[Phi.Entry(i_0,i_1).value] * lu[Phi.Entry(i_0,i_1).value][Phi.Entry(col_0,col_3).value]));
					Output.record("LUDecomposition", "LUDecomposition", 121, "sum_1", sum_1.value);
                	i_1 = new Var<Integer>((Phi.Entry(i_0,i_1).value + 1));
					Output.record("LUDecomposition", "LUDecomposition", 122, "i_1", i_1.value);
				}
				i_2 = Phi.Exit(i_0,i_1);
				i_1 = null;
				Output.record("LUDecomposition", "LUDecomposition", 120, "i_2", i_2.value);
				sum_2 = Phi.Exit(sum_0,sum_1);
				sum_1 = null;
				Output.record("LUDecomposition", "LUDecomposition", 120, "sum_2", sum_2.value);
                luRow[Phi.Entry(col_0,col_3).value] = sum_2.value;
            	row_4 = new Var<Integer>((Phi.Entry(row_3,row_4).value + 1));
				Output.record("LUDecomposition", "LUDecomposition", 124, "row_4", row_4.value);
			}
			row_5 = Phi.Exit(row_3,row_4);
			row_4 = null;
			Output.record("LUDecomposition", "LUDecomposition", 118, "row_5", row_5.value);

            // lower
            max_0 = new Var<Integer>((Phi.Entry(col_0,col_3).value));
			Output.record("LUDecomposition", "LUDecomposition", 127, "max_0", max_0.value); // permutation row
            largest_0 = new Var<Double>((double)(Double.NEGATIVE_INFINITY));
			Output.record("LUDecomposition", "LUDecomposition", 128, "largest_0", largest_0.value);
            row_6 = new Var<Integer>((Phi.Entry(col_0,col_3).value));
			Output.record("LUDecomposition", "LUDecomposition", 129, "row_6", row_6.value);
			while(Phi.Entry(row_6,row_7).value < Phi.Entry(m_0,m_0).value) {
                final double luRow[] = lu[Phi.Entry(row_6,row_7).value];
                sum_3 = new Var<Double>((double)(luRow[Phi.Entry(col_0,col_3).value]));
				Output.record("LUDecomposition", "LUDecomposition", 130, "sum_3", sum_3.value);
                i_3 = new Var<Integer>((0));
				Output.record("LUDecomposition", "LUDecomposition", 131, "i_3", i_3.value);
				while(Phi.Entry(i_3,i_4).value < Phi.Entry(col_0,col_3).value) {
                    sum_4 = new Var<Double>((double)(Phi.Entry(sum_3,sum_4).value - luRow[Phi.Entry(i_3,i_4).value] * lu[Phi.Entry(i_3,i_4).value][Phi.Entry(col_0,col_3).value]));
					Output.record("LUDecomposition", "LUDecomposition", 132, "sum_4", sum_4.value);
                	i_4 = new Var<Integer>((Phi.Entry(i_3,i_4).value + 1));
					Output.record("LUDecomposition", "LUDecomposition", 133, "i_4", i_4.value);
				}
				i_5 = Phi.Exit(i_3,i_4);
				i_4 = null;
				Output.record("LUDecomposition", "LUDecomposition", 131, "i_5", i_5.value);
				sum_5 = Phi.Exit(sum_3,sum_4);
				sum_4 = null;
				Output.record("LUDecomposition", "LUDecomposition", 131, "sum_5", sum_5.value);
                luRow[Phi.Entry(col_0,col_3).value] = sum_5.value;

                // maintain best permutation choice
                largest_1 = new Var<Double>((double)(Phi.Entry(largest_0,largest_3).value));
				Output.record("LUDecomposition", "LUDecomposition", 136, "largest_1", largest_1.value);
sum_6 = new Var<Double>((double)(sum_5.value));
				Output.record("LUDecomposition", "LUDecomposition", 137, "sum_6", sum_6.value);
if (FastMath.abs(sum_6.value) > largest_1.value) {
                    largest_2 = new Var<Double>((double)(FastMath.abs(sum_6.value)));
					Output.record("LUDecomposition", "LUDecomposition", 139, "largest_2", largest_2.value);
                    max_1 = new Var<Integer>((Phi.Entry(row_6,row_7).value));
					Output.record("LUDecomposition", "LUDecomposition", 140, "max_1", max_1.value);
                }
				largest_3 = Phi.If((FastMath.abs(sum_6.value) > largest_1.value),largest_2,largest_1);
				Output.record("LUDecomposition", "LUDecomposition", 138, "largest_3", largest_3.value);
				max_2 = Phi.If((FastMath.abs(sum_6.value) > largest_1.value),max_1,max_0);
				Output.record("LUDecomposition", "LUDecomposition", 138, "max_2", max_2.value);
            	row_7 = new Var<Integer>((Phi.Entry(row_6,row_7).value + 1));
				Output.record("LUDecomposition", "LUDecomposition", 141, "row_7", row_7.value);
			}
			largest_4 = Phi.Exit(largest_0,largest_3);
			largest_3 = null;
			Output.record("LUDecomposition", "LUDecomposition", 130, "largest_4", largest_4.value);
			max_3 = Phi.Exit(max_0,max_2);
			max_2 = null;
			Output.record("LUDecomposition", "LUDecomposition", 130, "max_3", max_3.value);
			row_8 = Phi.Exit(row_6,row_7);
			row_7 = null;
			Output.record("LUDecomposition", "LUDecomposition", 130, "row_8", row_8.value);

            // Singularity check
            col_1 = new Var<Integer>((Phi.Entry(col_0,col_3).value));
			Output.record("LUDecomposition", "LUDecomposition", 144, "col_1", col_1.value);
max_4 = new Var<Integer>((max_3.value));
			Output.record("LUDecomposition", "LUDecomposition", 144, "max_4", max_4.value);
if (FastMath.abs(lu[max_4.value][col_1.value]) < Phi.Entry(singularityThreshold_0,singularityThreshold_0).value) {
                singular = true;
                return;
            }

            // Pivot if necessary
            col_2 = new Var<Integer>((col_1.value));
			Output.record("LUDecomposition", "LUDecomposition", 150, "col_2", col_2.value);
max_5 = new Var<Integer>((max_4.value));
			Output.record("LUDecomposition", "LUDecomposition", 150, "max_5", max_5.value);
if (max_5.value != col_2.value) {
                tmp_0 = new Var<Double>((double)(0));
				Output.record("LUDecomposition", "LUDecomposition", 152, "tmp_0", tmp_0.value);
                final double luMax[] = lu[max_5.value];
                final double luCol[] = lu[col_2.value];
                i_6 = new Var<Integer>((0));
				Output.record("LUDecomposition", "LUDecomposition", 154, "i_6", i_6.value);
				while(Phi.Entry(i_6,i_7).value < Phi.Entry(m_0,m_0).value) {
                    tmp_1 = new Var<Double>((double)(luMax[Phi.Entry(i_6,i_7).value]));
					Output.record("LUDecomposition", "LUDecomposition", 156, "tmp_1", tmp_1.value);
                    luMax[Phi.Entry(i_6,i_7).value] = luCol[Phi.Entry(i_6,i_7).value];
                    luCol[Phi.Entry(i_6,i_7).value] = tmp_1.value;
                	i_7 = new Var<Integer>((Phi.Entry(i_6,i_7).value + 1));
					Output.record("LUDecomposition", "LUDecomposition", 158, "i_7", i_7.value);
				}
				tmp_2 = Phi.Exit(tmp_0,tmp_1);
				tmp_1 = null;
				Output.record("LUDecomposition", "LUDecomposition", 155, "tmp_2", tmp_2.value);
				i_8 = Phi.Exit(i_6,i_7);
				i_7 = null;
				Output.record("LUDecomposition", "LUDecomposition", 155, "i_8", i_8.value);
                temp_0 = new Var<Integer>((pivot[max_5.value]));
				Output.record("LUDecomposition", "LUDecomposition", 160, "temp_0", temp_0.value);
                pivot[max_5.value] = pivot[col_2.value];
                pivot[col_2.value] = temp_0.value;
                even = !even;
            }

            // Divide the lower elements by the "winning" diagonal elt.
            luDiag_0 = new Var<Double>((double)(lu[col_2.value][col_2.value]));
			Output.record("LUDecomposition", "LUDecomposition", 166, "luDiag_0", luDiag_0.value);
            row_9 = new Var<Integer>((col_2.value + 1));
			Output.record("LUDecomposition", "LUDecomposition", 167, "row_9", row_9.value);
			while(Phi.Entry(row_9,row_10).value < Phi.Entry(m_0,m_0).value) {
                lu[Phi.Entry(row_9,row_10).value][Phi.Entry(col_2,col_3).value] = lu[Phi.Entry(row_9,row_10).value][Phi.Entry(col_2,col_3).value] / Phi.Entry(luDiag_0,luDiag_0).value;
            	row_10 = new Var<Integer>((Phi.Entry(row_9,row_10).value + 1));
				Output.record("LUDecomposition", "LUDecomposition", 169, "row_10", row_10.value);
			}
			row_11 = Phi.Exit(row_9,row_10);
			row_10 = null;
			Output.record("LUDecomposition", "LUDecomposition", 168, "row_11", row_11.value);
        	col_3 = new Var<Integer>((col_2.value + 1));
			Output.record("LUDecomposition", "LUDecomposition", 170, "col_3", col_3.value);
		}
		col_4 = Phi.Exit(col_0,col_3);
		Output.record("LUDecomposition", "LUDecomposition", 115, "col_4", col_4.value);
		row_12 = Phi.Exit(row_2,row_11);
		Output.record("LUDecomposition", "LUDecomposition", 115, "row_12", row_12.value);
    }

    /**
     * Returns the matrix L of the decomposition.
     * <p>L is a lower-triangular matrix</p>
     * @return the L matrix (or null if decomposed matrix is singular)
     */
    public RealMatrix getL() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> m_1 = null;
		Var<Integer> i_9 = null;
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
        
		/* PROGRAM STARTS */
		if ((cachedL == null) && !singular) {
            m_1 = new Var<Integer>((pivot.length));
			Output.record("LUDecomposition", "getL", 181, "m_1", m_1.value);
            cachedL = MatrixUtils.createRealMatrix(m_1.value, m_1.value);
            i_9 = new Var<Integer>((0));
			Output.record("LUDecomposition", "getL", 183, "i_9", i_9.value);
			while(Phi.Entry(i_9,i_10).value < Phi.Entry(m_1,m_1).value) {
                final double luI[] = lu[Phi.Entry(i_9,i_10).value];
                j_0 = new Var<Integer>((0));
				Output.record("LUDecomposition", "getL", 184, "j_0", j_0.value);
				while(Phi.Entry(j_0,j_1).value < Phi.Entry(i_9,i_10).value) {
                    cachedL.setEntry(Phi.Entry(i_9,i_10).value, Phi.Entry(j_0,j_1).value, luI[Phi.Entry(j_0,j_1).value]);
                	j_1 = new Var<Integer>((Phi.Entry(j_0,j_1).value + 1));
					Output.record("LUDecomposition", "getL", 186, "j_1", j_1.value);
				}
				j_2 = Phi.Exit(j_0,j_1);
				j_1 = null;
				Output.record("LUDecomposition", "getL", 185, "j_2", j_2.value);
                cachedL.setEntry(Phi.Entry(i_9,i_10).value, Phi.Entry(i_9,i_10).value, 1.0);
            	i_10 = new Var<Integer>((Phi.Entry(i_9,i_10).value + 1));
				Output.record("LUDecomposition", "getL", 188, "i_10", i_10.value);
			}
			i_11 = Phi.Exit(i_9,i_10);
			Output.record("LUDecomposition", "getL", 184, "i_11", i_11.value);
        }
        return cachedL;
    }

    /**
     * Returns the matrix U of the decomposition.
     * <p>U is an upper-triangular matrix</p>
     * @return the U matrix (or null if decomposed matrix is singular)
     */
    public RealMatrix getU() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> m_2 = null;
		Var<Integer> i_12 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> j_5 = null;
		Var<Integer> i_13 = null;
		Var<Integer> i_14 = null;
        
		/* PROGRAM STARTS */
		if ((cachedU == null) && !singular) {
            m_2 = new Var<Integer>((pivot.length));
			Output.record("LUDecomposition", "getU", 201, "m_2", m_2.value);
            cachedU = MatrixUtils.createRealMatrix(m_2.value, m_2.value);
            i_12 = new Var<Integer>((0));
			Output.record("LUDecomposition", "getU", 203, "i_12", i_12.value);
			while(Phi.Entry(i_12,i_13).value < Phi.Entry(m_2,m_2).value) {
                final double luI[] = lu[Phi.Entry(i_12,i_13).value];
                j_3 = new Var<Integer>((Phi.Entry(i_12,i_13).value));
				Output.record("LUDecomposition", "getU", 204, "j_3", j_3.value);
				while(Phi.Entry(j_3,j_4).value < Phi.Entry(m_2,m_2).value) {
                    cachedU.setEntry(Phi.Entry(i_12,i_13).value, Phi.Entry(j_3,j_4).value, luI[Phi.Entry(j_3,j_4).value]);
                	j_4 = new Var<Integer>((Phi.Entry(j_3,j_4).value + 1));
					Output.record("LUDecomposition", "getU", 206, "j_4", j_4.value);
				}
				j_5 = Phi.Exit(j_3,j_4);
				j_4 = null;
				Output.record("LUDecomposition", "getU", 205, "j_5", j_5.value);
            	i_13 = new Var<Integer>((Phi.Entry(i_12,i_13).value + 1));
				Output.record("LUDecomposition", "getU", 207, "i_13", i_13.value);
			}
			i_14 = Phi.Exit(i_12,i_13);
			Output.record("LUDecomposition", "getU", 204, "i_14", i_14.value);
        }
        return cachedU;
    }

    /**
     * Returns the P rows permutation matrix.
     * <p>P is a sparse matrix with exactly one element set to 1.0 in
     * each row and each column, all other elements being set to 0.0.</p>
     * <p>The positions of the 1 elements are given by the {@link #getPivot()
     * pivot permutation vector}.</p>
     * @return the P rows permutation matrix (or null if decomposed matrix is singular)
     * @see #getPivot()
     */
    public RealMatrix getP() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> m_3 = null;
		Var<Integer> i_15 = null;
		Var<Integer> i_16 = null;
		Var<Integer> i_17 = null;
        
		/* PROGRAM STARTS */
		if ((cachedP == null) && !singular) {
            m_3 = new Var<Integer>((pivot.length));
			Output.record("LUDecomposition", "getP", 224, "m_3", m_3.value);
            cachedP = MatrixUtils.createRealMatrix(m_3.value, m_3.value);
            i_15 = new Var<Integer>((0));
			Output.record("LUDecomposition", "getP", 225, "i_15", i_15.value);
			while(Phi.Entry(i_15,i_16).value < Phi.Entry(m_3,m_3).value) {
                cachedP.setEntry(Phi.Entry(i_15,i_16).value, pivot[Phi.Entry(i_15,i_16).value], 1.0);
            	i_16 = new Var<Integer>((Phi.Entry(i_15,i_16).value + 1));
				Output.record("LUDecomposition", "getP", 227, "i_16", i_16.value);
			}
			i_17 = Phi.Exit(i_15,i_16);
			Output.record("LUDecomposition", "getP", 226, "i_17", i_17.value);
        }
        return cachedP;
    }

    /**
     * Returns the pivot permutation vector.
     * @return the pivot permutation vector
     * @see #getP()
     */
    public int[] getPivot() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return pivot.clone();
    }

    /**
     * Return the determinant of the matrix
     * @return determinant of the matrix
     */
    public double getDeterminant() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> m_4 = null;
		Var<Double> determinant_0 = null;
		Var<Integer> i_18 = null;
		Var<Double> determinant_1 = null;
		Var<Integer> i_19 = null;
		Var<Integer> i_20 = null;
		Var<Double> determinant_2 = null;
        
		/* PROGRAM STARTS */
		if (singular) {
            return 0;
        } else {
            m_4 = new Var<Integer>((pivot.length));
			Output.record("LUDecomposition", "getDeterminant", 250, "m_4", m_4.value);
            determinant_0 = new Var<Double>((double)(even ? 1 : -1));
			Output.record("LUDecomposition", "getDeterminant", 251, "determinant_0", determinant_0.value);
            i_18 = new Var<Integer>((0));
			Output.record("LUDecomposition", "getDeterminant", 251, "i_18", i_18.value);
			while(Phi.Entry(i_18,i_19).value < Phi.Entry(m_4,m_4).value) {
                determinant_1 = new Var<Double>((double)(Phi.Entry(determinant_0,determinant_1).value * lu[Phi.Entry(i_18,i_19).value][Phi.Entry(i_18,i_19).value]));
				Output.record("LUDecomposition", "getDeterminant", 253, "determinant_1", determinant_1.value);
            	i_19 = new Var<Integer>((Phi.Entry(i_18,i_19).value + 1));
				Output.record("LUDecomposition", "getDeterminant", 253, "i_19", i_19.value);
			}
			i_20 = Phi.Exit(i_18,i_19);
			Output.record("LUDecomposition", "getDeterminant", 252, "i_20", i_20.value);
			determinant_2 = Phi.Exit(determinant_0,determinant_1);
			Output.record("LUDecomposition", "getDeterminant", 252, "determinant_2", determinant_2.value);
            return determinant_2.value;
        }
    }

    /**
     * Get a solver for finding the A &times; X = B solution in exact linear
     * sense.
     * @return a solver
     */
    public DecompositionSolver getSolver() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return new Solver(lu, pivot, singular);
    }

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {

        /** Entries of LU decomposition. */
        private final double[][] lu;

        /** Pivot permutation associated with LU decomposition. */
        private final int[] pivot;

        /** Singularity indicator. */
        private final boolean singular;

        /**
         * Build a solver from decomposed matrix.
         * @param lu entries of LU decomposition
         * @param pivot pivot permutation associated with LU decomposition
         * @param singular singularity indicator
         */
        private Solver(final double[][] lu, final int[] pivot, final boolean singular) {
		// formal parameters
		Var<Boolean> singular_0 = new Var<Boolean>(singular);
		Output.record("LUDecomposition", "Solver", 286, "singular_0", singular_0.value);

		// all variables are declared to null
            
		/* PROGRAM STARTS */
		this.lu       = lu;
            this.pivot    = pivot;
            this.singular = singular;
        }

        /** {@inheritDoc} */
        public boolean isNonSingular() {
		// formal parameters

		// all variables are declared to null
            
		/* PROGRAM STARTS */
		return !singular;
        }

        /** {@inheritDoc} */
        public RealVector solve(RealVector b) {
		// formal parameters
		Var<RealVector> b_0 = new Var<RealVector>(b);
		Output.record("LUDecomposition", "solve", 298, "b_0", b_0.value);

		// all variables are declared to null
		Var<Integer> m_5 = null;
		Var<Integer> m_6 = null;
		Var<Integer> row_13 = null;
		Var<Integer> row_14 = null;
		Var<Integer> row_15 = null;
		Var<Integer> col_5 = null;
		Var<Double> bpCol_0 = null;
		Var<Integer> i_21 = null;
		Var<Integer> i_22 = null;
		Var<Integer> i_23 = null;
		Var<Integer> col_6 = null;
		Var<Integer> col_7 = null;
		Var<Integer> col_8 = null;
		Var<Double> bpCol_1 = null;
		Var<Integer> i_24 = null;
		Var<Integer> i_25 = null;
		Var<Integer> i_26 = null;
		Var<Integer> col_9 = null;
		Var<Integer> col_10 = null;
            
		/* PROGRAM STARTS */
		m_5 = new Var<Integer>((pivot.length));
		Output.record("LUDecomposition", "solve", 299, "m_5", m_5.value);
            m_6 = new Var<Integer>((m_5.value));
		Output.record("LUDecomposition", "solve", 300, "m_6", m_6.value);
if (b_0.value.getDimension() != m_6.value) {
                throw new DimensionMismatchException(b_0.value.getDimension(), m_6.value);
            }
            if (singular) {
                throw new SingularMatrixException();
            }

            final double bp[] = new double[m_6.value];

            // Apply permutations to b
            row_13 = new Var<Integer>((0));
		Output.record("LUDecomposition", "solve", 309, "row_13", row_13.value);
		while(Phi.Entry(row_13,row_14).value < Phi.Entry(m_6,m_6).value) {
                bp[Phi.Entry(row_13,row_14).value] = Phi.Entry(b_0,b_0).value.getEntry(pivot[Phi.Entry(row_13,row_14).value]);
            	row_14 = new Var<Integer>((Phi.Entry(row_13,row_14).value + 1));
			Output.record("LUDecomposition", "solve", 311, "row_14", row_14.value);
		}
		row_15 = Phi.Exit(row_13,row_14);
		Output.record("LUDecomposition", "solve", 310, "row_15", row_15.value);

            // Solve LY = b
            col_5 = new Var<Integer>((0));
		Output.record("LUDecomposition", "solve", 315, "col_5", col_5.value);
		while(Phi.Entry(col_5,col_6).value < Phi.Entry(m_6,m_6).value) {
                bpCol_0 = new Var<Double>((double)(bp[Phi.Entry(col_5,col_6).value]));
			Output.record("LUDecomposition", "solve", 315, "bpCol_0", bpCol_0.value);
                i_21 = new Var<Integer>((Phi.Entry(col_5,col_6).value + 1));
			Output.record("LUDecomposition", "solve", 316, "i_21", i_21.value);
			while(Phi.Entry(i_21,i_22).value < Phi.Entry(m_6,m_6).value) {
                    bp[Phi.Entry(i_21,i_22).value] = bp[Phi.Entry(i_21,i_22).value] - Phi.Entry(bpCol_0,bpCol_0).value * lu[Phi.Entry(i_21,i_22).value][Phi.Entry(col_5,col_6).value];
                	i_22 = new Var<Integer>((Phi.Entry(i_21,i_22).value + 1));
				Output.record("LUDecomposition", "solve", 318, "i_22", i_22.value);
			}
			i_23 = Phi.Exit(i_21,i_22);
			i_22 = null;
			Output.record("LUDecomposition", "solve", 317, "i_23", i_23.value);
            	col_6 = new Var<Integer>((Phi.Entry(col_5,col_6).value + 1));
			Output.record("LUDecomposition", "solve", 319, "col_6", col_6.value);
		}
		col_7 = Phi.Exit(col_5,col_6);
		Output.record("LUDecomposition", "solve", 316, "col_7", col_7.value);

            // Solve UX = Y
            col_8 = new Var<Integer>((m_6.value - 1));
		Output.record("LUDecomposition", "solve", 323, "col_8", col_8.value);
		while(Phi.Entry(col_8,col_9).value >= 0) {
                bp[Phi.Entry(col_8,col_9).value] = bp[Phi.Entry(col_8,col_9).value] / lu[Phi.Entry(col_8,col_9).value][Phi.Entry(col_8,col_9).value];
                bpCol_1 = new Var<Double>((double)(bp[Phi.Entry(col_8,col_9).value]));
			Output.record("LUDecomposition", "solve", 324, "bpCol_1", bpCol_1.value);
                i_24 = new Var<Integer>((0));
			Output.record("LUDecomposition", "solve", 325, "i_24", i_24.value);
			while(Phi.Entry(i_24,i_25).value < Phi.Entry(col_8,col_9).value) {
                    bp[Phi.Entry(i_24,i_25).value] = bp[Phi.Entry(i_24,i_25).value] - Phi.Entry(bpCol_1,bpCol_1).value * lu[Phi.Entry(i_24,i_25).value][Phi.Entry(col_8,col_9).value];
                	i_25 = new Var<Integer>((Phi.Entry(i_24,i_25).value + 1));
				Output.record("LUDecomposition", "solve", 327, "i_25", i_25.value);
			}
			i_26 = Phi.Exit(i_24,i_25);
			i_25 = null;
			Output.record("LUDecomposition", "solve", 326, "i_26", i_26.value);
            	col_9 = new Var<Integer>((Phi.Entry(col_8,col_9).value - 1));
			Output.record("LUDecomposition", "solve", 328, "col_9", col_9.value);
		}
		col_10 = Phi.Exit(col_8,col_9);
		Output.record("LUDecomposition", "solve", 324, "col_10", col_10.value);

            return new ArrayRealVector(bp, false);
        }

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b2) {
		// formal parameters
		Var<RealMatrix> b2_0 = new Var<RealMatrix>(b2);
		Output.record("LUDecomposition", "solve", 335, "b2_0", b2_0.value);

		// all variables are declared to null
		Var<Integer> m_7 = null;
		Var<Integer> m_8 = null;
		Var<Integer> nColB_0 = null;
		Var<Integer> row_16 = null;
		Var<Integer> pRow_0 = null;
		Var<Integer> col_11 = null;
		Var<Integer> col_12 = null;
		Var<Integer> col_13 = null;
		Var<Integer> row_17 = null;
		Var<Integer> row_18 = null;
		Var<Integer> col_14 = null;
		Var<Integer> i_27 = null;
		Var<Double> luICol_0 = null;
		Var<Integer> j_6 = null;
		Var<Integer> j_7 = null;
		Var<Integer> j_8 = null;
		Var<Integer> i_28 = null;
		Var<Integer> i_29 = null;
		Var<Integer> col_15 = null;
		Var<Integer> col_16 = null;
		Var<Integer> col_17 = null;
		Var<Double> luDiag_1 = null;
		Var<Integer> j_9 = null;
		Var<Integer> j_10 = null;
		Var<Integer> j_11 = null;
		Var<Integer> i_30 = null;
		Var<Double> luICol_1 = null;
		Var<Integer> j_12 = null;
		Var<Integer> j_13 = null;
		Var<Integer> j_14 = null;
		Var<Integer> i_31 = null;
		Var<Integer> i_32 = null;
		Var<Integer> j_15 = null;
		Var<Integer> col_18 = null;
		Var<Integer> col_19 = null;

            
		/* PROGRAM STARTS */
		m_7 = new Var<Integer>((pivot.length));
		Output.record("LUDecomposition", "solve", 337, "m_7", m_7.value);
            m_8 = new Var<Integer>((m_7.value));
		Output.record("LUDecomposition", "solve", 338, "m_8", m_8.value);
if (b2_0.value.getRowDimension() != m_8.value) {
                throw new DimensionMismatchException(b2_0.value.getRowDimension(), m_8.value);
            }
            if (singular) {
                throw new SingularMatrixException();
            }

            nColB_0 = new Var<Integer>((b2_0.value.getColumnDimension()));
		Output.record("LUDecomposition", "solve", 345, "nColB_0", nColB_0.value);

            // Apply permutations to b
            final double bp[][] = new double[m_8.value][nColB_0.value];
            row_16 = new Var<Integer>((0));
		Output.record("LUDecomposition", "solve", 349, "row_16", row_16.value);
		while(Phi.Entry(row_16,row_17).value < Phi.Entry(m_8,m_8).value) {
                final double bpRow[] = bp[Phi.Entry(row_16,row_17).value];
                pRow_0 = new Var<Integer>((pivot[Phi.Entry(row_16,row_17).value]));
			Output.record("LUDecomposition", "solve", 350, "pRow_0", pRow_0.value);
                col_11 = new Var<Integer>((0));
			Output.record("LUDecomposition", "solve", 351, "col_11", col_11.value);
			while(Phi.Entry(col_11,col_12).value < Phi.Entry(nColB_0,nColB_0).value) {
                    bpRow[Phi.Entry(col_11,col_12).value] = Phi.Entry(b2_0,b2_0).value.getEntry(Phi.Entry(pRow_0,pRow_0).value, Phi.Entry(col_11,col_12).value);
                	col_12 = new Var<Integer>((Phi.Entry(col_11,col_12).value + 1));
				Output.record("LUDecomposition", "solve", 353, "col_12", col_12.value);
			}
			col_13 = Phi.Exit(col_11,col_12);
			col_12 = null;
			Output.record("LUDecomposition", "solve", 352, "col_13", col_13.value);
            	row_17 = new Var<Integer>((Phi.Entry(row_16,row_17).value + 1));
			Output.record("LUDecomposition", "solve", 354, "row_17", row_17.value);
		}
		row_18 = Phi.Exit(row_16,row_17);
		Output.record("LUDecomposition", "solve", 350, "row_18", row_18.value);

            // Solve LY = b
            col_14 = new Var<Integer>((0));
		Output.record("LUDecomposition", "solve", 358, "col_14", col_14.value);
		while(Phi.Entry(col_14,col_15).value < Phi.Entry(m_8,m_8).value) {
                final double bpCol[] = bp[Phi.Entry(col_14,col_15).value];
                i_27 = new Var<Integer>((Phi.Entry(col_14,col_15).value + 1));
			Output.record("LUDecomposition", "solve", 361, "i_27", i_27.value);
			while(Phi.Entry(i_27,i_28).value < Phi.Entry(m_8,m_8).value) {
                    final double bpI[] = bp[Phi.Entry(i_27,i_28).value];
                    luICol_0 = new Var<Double>((double)(lu[Phi.Entry(i_27,i_28).value][Phi.Entry(col_14,col_15).value]));
				Output.record("LUDecomposition", "solve", 361, "luICol_0", luICol_0.value);
                    j_6 = new Var<Integer>((0));
				Output.record("LUDecomposition", "solve", 362, "j_6", j_6.value);
				while(Phi.Entry(j_6,j_7).value < Phi.Entry(nColB_0,nColB_0).value) {
                        bpI[Phi.Entry(j_6,j_7).value] = bpI[Phi.Entry(j_6,j_7).value] - bpCol[Phi.Entry(j_6,j_7).value] * Phi.Entry(luICol_0,luICol_0).value;
                    	j_7 = new Var<Integer>((Phi.Entry(j_6,j_7).value + 1));
					Output.record("LUDecomposition", "solve", 364, "j_7", j_7.value);
				}
				j_8 = Phi.Exit(j_6,j_7);
				j_7 = null;
				Output.record("LUDecomposition", "solve", 362, "j_8", j_8.value);
                	i_28 = new Var<Integer>((Phi.Entry(i_27,i_28).value + 1));
				Output.record("LUDecomposition", "solve", 365, "i_28", i_28.value);
			}
			i_29 = Phi.Exit(i_27,i_28);
			i_28 = null;
			Output.record("LUDecomposition", "solve", 360, "i_29", i_29.value);
            	col_15 = new Var<Integer>((Phi.Entry(col_14,col_15).value + 1));
			Output.record("LUDecomposition", "solve", 366, "col_15", col_15.value);
		}
		col_16 = Phi.Exit(col_14,col_15);
		Output.record("LUDecomposition", "solve", 359, "col_16", col_16.value);

            // Solve UX = Y
            col_17 = new Var<Integer>((m_8.value - 1));
		Output.record("LUDecomposition", "solve", 370, "col_17", col_17.value);
		while(Phi.Entry(col_17,col_18).value >= 0) {
                final double bpCol[] = bp[Phi.Entry(col_17,col_18).value];
                luDiag_1 = new Var<Double>((double)(lu[Phi.Entry(col_17,col_18).value][Phi.Entry(col_17,col_18).value]));
			Output.record("LUDecomposition", "solve", 372, "luDiag_1", luDiag_1.value);
                j_9 = new Var<Integer>((0));
			Output.record("LUDecomposition", "solve", 373, "j_9", j_9.value);
			while(Phi.Entry(j_9,j_10).value < Phi.Entry(nColB_0,nColB_0).value) {
                    bpCol[Phi.Entry(j_9,j_10).value] = bpCol[Phi.Entry(j_9,j_10).value] / Phi.Entry(luDiag_1,luDiag_1).value;
                	j_10 = new Var<Integer>((Phi.Entry(j_9,j_10).value + 1));
				Output.record("LUDecomposition", "solve", 374, "j_10", j_10.value);
			}
			j_11 = Phi.Exit(j_9,j_10);
			j_10 = null;
			Output.record("LUDecomposition", "solve", 374, "j_11", j_11.value);
                i_30 = new Var<Integer>((0));
			Output.record("LUDecomposition", "solve", 376, "i_30", i_30.value);
			while(Phi.Entry(i_30,i_31).value < Phi.Entry(col_17,col_18).value) {
                    final double bpI[] = bp[Phi.Entry(i_30,i_31).value];
                    luICol_1 = new Var<Double>((double)(lu[Phi.Entry(i_30,i_31).value][Phi.Entry(col_17,col_18).value]));
				Output.record("LUDecomposition", "solve", 377, "luICol_1", luICol_1.value);
                    j_12 = new Var<Integer>((0));
				Output.record("LUDecomposition", "solve", 378, "j_12", j_12.value);
				while(Phi.Entry(j_12,j_13).value < Phi.Entry(nColB_0,nColB_0).value) {
                        bpI[Phi.Entry(j_12,j_13).value] = bpI[Phi.Entry(j_12,j_13).value] - bpCol[Phi.Entry(j_12,j_13).value] * Phi.Entry(luICol_1,luICol_1).value;
                    	j_13 = new Var<Integer>((Phi.Entry(j_12,j_13).value + 1));
					Output.record("LUDecomposition", "solve", 380, "j_13", j_13.value);
				}
				j_14 = Phi.Exit(j_12,j_13);
				j_13 = null;
				Output.record("LUDecomposition", "solve", 378, "j_14", j_14.value);
                	i_31 = new Var<Integer>((Phi.Entry(i_30,i_31).value + 1));
				Output.record("LUDecomposition", "solve", 381, "i_31", i_31.value);
			}
			i_32 = Phi.Exit(i_30,i_31);
			i_31 = null;
			Output.record("LUDecomposition", "solve", 376, "i_32", i_32.value);
			j_15 = Phi.Exit(j_11,j_14);
			j_14 = null;
			Output.record("LUDecomposition", "solve", 376, "j_15", j_15.value);
            	col_18 = new Var<Integer>((Phi.Entry(col_17,col_18).value - 1));
			Output.record("LUDecomposition", "solve", 382, "col_18", col_18.value);
		}
		col_19 = Phi.Exit(col_17,col_18);
		Output.record("LUDecomposition", "solve", 371, "col_19", col_19.value);

			Output.recordProgramOutput("LUDecomposition", bp[0][0], false);
            return new Array2DRowRealMatrix(bp, false);
        }

        /**
         * Get the inverse of the decomposed matrix.
         *
         * @return the inverse matrix.
         * @throws SingularMatrixException if the decomposed matrix is singular.
         */
        public RealMatrix getInverse() {
		// formal parameters

		// all variables are declared to null
            
		/* PROGRAM STARTS */
		return solve(MatrixUtils.createRealIdentityMatrix(pivot.length));
        }
    }
}
