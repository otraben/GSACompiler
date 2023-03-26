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
package outputs.SplineInterpolator_Output;
import gsa.Fluky;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;

/**
 * Computes a natural (also known as "free", "unclamped") cubic spline interpolation for the data set.
 * <p>
 * The {@link #interpolate(double[], double[])} method returns a {@link PolynomialSplineFunction}
 * consisting of n cubic polynomials, defined over the subintervals determined by the x values,
 * {@code x[0] < x[i] ... < x[n].}  The x values are referred to as "knot points."
 * <p>
 * The value of the PolynomialSplineFunction at a point x that is greater than or equal to the smallest
 * knot point and strictly less than the largest knot point is computed by finding the subinterval to which
 * x belongs and computing the value of the corresponding polynomial at <code>x - x[i] </code> where
 * <code>i</code> is the index of the subinterval.  See {@link PolynomialSplineFunction} for more details.
 * </p>
 * <p>
 * The interpolating polynomials satisfy: <ol>
 * <li>The value of the PolynomialSplineFunction at each of the input x values equals the
 *  corresponding y value.</li>
 * <li>Adjacent polynomials are equal through two derivatives at the knot points (i.e., adjacent polynomials
 *  "match up" at the knot points, as do their first and second derivatives).</li>
 * </ol>
 * <p>
 * The cubic spline interpolation algorithm implemented is as described in R.L. Burden, J.D. Faires,
 * <u>Numerical Analysis</u>, 4th Ed., 1989, PWS-Kent, ISBN 0-53491-585-X, pp 126-131.
 * </p>
 *
 */
public class SplineInterpolator_Faulty implements UnivariateInterpolator {
    /**
     * Computes an interpolating function for the data set.
     * @param x the arguments for the interpolation points
     * @param y the values for the interpolation points
     * @return a function which interpolates the data set
     * @throws DimensionMismatchException if {@code x} and {@code y}
     * have different sizes.
     * @throws NonMonotonicSequenceException if {@code x} is not sorted in
     * strict increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is smaller
     * than 3.
     */
    public PolynomialSplineFunction interpolate(double[] x, double[] y)
        throws DimensionMismatchException,
               NumberIsTooSmallException,
               NonMonotonicSequenceException {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> n_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Double> g_0 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> n_2 = null;
		Var<Integer> i_7 = null;
		Var<Double> g_1 = null;
		Var<Integer> i_8 = null;
		Var<Double> g_2 = null;
		Var<Integer> i_9 = null;
		Var<Integer> j_0 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> n_3 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Integer> n_4 = null;
		Var<Integer> i_12 = null;
		Var<Integer> i_13 = null;
		Var<Integer> i_14 = null;
        
		/* PROGRAM STARTS */
		if (x.length != y.length) {
            throw new DimensionMismatchException(x.length, y.length);
        }

        if (x.length < 3) {
            throw new NumberIsTooSmallException(LocalizedFormats.NUMBER_OF_POINTS,
                                                x.length, 3, true);
        }

        // Number of intervals.  The number of data points is n + 1.
        n_0 = new Var<Integer>((x.length - 1));
		Output.record("SplineInterpolator", "interpolate", 80, "n_0", n_0.value);

        MathArrays.checkOrder(x);

        // Differences between knot points
        final double h[] = new double[n_0.value];
        i_0 = new Var<Integer>((0));
		Output.record("SplineInterpolator", "interpolate", 86, "i_0", i_0.value);
		i_1 = new Var<Integer>((i_0.value));
		Output.record("SplineInterpolator", "interpolate", 86, "i_1", i_1.value);
		n_1 = new Var<Integer>((n_0.value));
		Output.record("SplineInterpolator", "interpolate", 86, "n_1", n_1.value);
		i_2 = new Var<Integer>((i_1.value));
		Output.record("SplineInterpolator", "interpolate", 85, "i_2", i_2.value);
		while(Phi.Entry(i_2,i_3).value < Phi.Entry(n_1,n_1).value) {
            h[Phi.Entry(i_2,i_3).value] = x[Phi.Entry(i_2,i_3).value + 1] - x[Phi.Entry(i_2,i_3).value];
        	i_3 = new Var<Integer>((Phi.Entry(i_2,i_3).value + 1));
			Output.record("SplineInterpolator", "interpolate", 87, "i_3", i_3.value);
		}
		i_4 = Phi.Exit(i_2,i_3);
		i_3 = null;
		Output.record("SplineInterpolator", "interpolate", 86, "i_4", i_4.value);

        final double mu[] = new double[n_1.value];
        final double z[] = new double[n_1.value + 1];
        mu[0] = 0d;
        z[0] = 0d;
        g_0 = new Var<Double>((double)(0));
		Output.record("SplineInterpolator", "interpolate", 94, "g_0", g_0.value);
        i_5 = new Var<Integer>((1));
		Output.record("SplineInterpolator", "interpolate", 95, "i_5", i_5.value);
		i_6 = new Var<Integer>((i_5.value));
		Output.record("SplineInterpolator", "interpolate", 95, "i_6", i_6.value);
		n_2 = new Var<Integer>((n_1.value));
		Output.record("SplineInterpolator", "interpolate", 95, "n_2", n_2.value);
		i_7 = new Var<Integer>((i_6.value));
		Output.record("SplineInterpolator", "interpolate", 94, "i_7", i_7.value);
		while(Phi.Entry(i_7,i_8).value < Phi.Entry(n_2,n_2).value) {
            g_1 = new Var<Double>((double)(2d * (x[Phi.Entry(i_7,i_8).value+1]  - x[Phi.Entry(i_7,i_8).value - 1]) - h[Phi.Entry(i_7,i_8).value - 1] * mu[Phi.Entry(i_7,i_8).value -1]));
			Output.record("SplineInterpolator", "interpolate", 96, "g_1", g_1.value);
            mu[Phi.Entry(i_7,i_8).value] = h[Phi.Entry(i_7,i_8).value] / g_1.value;
            z[Phi.Entry(i_7,i_8).value] = (3d * (y[Phi.Entry(i_7,i_8).value + 1] * h[Phi.Entry(i_7,i_8).value - 1] - y[Phi.Entry(i_7,i_8).value] * (x[Phi.Entry(i_7,i_8).value + 1] - x[Phi.Entry(i_7,i_8).value - 1])+ y[Phi.Entry(i_7,i_8).value - 1] * h[Phi.Entry(i_7,i_8).value]) /
                    (h[Phi.Entry(i_7,i_8).value - 1] * h[Phi.Entry(i_7,i_8).value]) - h[Phi.Entry(i_7,i_8).value - 1] * z[Phi.Entry(i_7,i_8).value - 1]) / g_1.value;
        	i_8 = new Var<Integer>(Fluky.flukyInt((Phi.Entry(i_7,i_8).value + 1), 0.99));
			Output.record("SplineInterpolator", "interpolate", 99, "i_8", i_8.value);
		}
		g_2 = Phi.Exit(g_0,g_1);
		g_1 = null;
		Output.record("SplineInterpolator", "interpolate", 95, "g_2", g_2.value);
		i_9 = Phi.Exit(i_7,i_8);
		i_8 = null;
		Output.record("SplineInterpolator", "interpolate", 95, "i_9", i_9.value);

        // cubic spline coefficients --  b is linear, c quadratic, d is cubic (original y's are constants)
        final double b[] = new double[n_2.value];
        final double c[] = new double[n_2.value + 1];
        final double d[] = new double[n_2.value];

        z[n_2.value] = 0d;
        c[n_2.value] = 0d;

        j_0 = new Var<Integer>((n_2.value -1));
		Output.record("SplineInterpolator", "interpolate", 110, "j_0", j_0.value);
		j_1 = new Var<Integer>((j_0.value));
		Output.record("SplineInterpolator", "interpolate", 110, "j_1", j_1.value);
		j_2 = new Var<Integer>((j_1.value));
		Output.record("SplineInterpolator", "interpolate", 110, "j_2", j_2.value);
		n_3 = new Var<Integer>((n_2.value));
		Output.record("SplineInterpolator", "interpolate", 109, "n_3", n_3.value);
		while(Phi.Entry(j_2,j_3).value >=0) {
            c[Phi.Entry(j_2,j_3).value] = z[Phi.Entry(j_2,j_3).value] - mu[Phi.Entry(j_2,j_3).value] * c[Phi.Entry(j_2,j_3).value + 1];
            b[Phi.Entry(j_2,j_3).value] = (y[Phi.Entry(j_2,j_3).value + 1] - y[Phi.Entry(j_2,j_3).value]) / h[Phi.Entry(j_2,j_3).value] - h[Phi.Entry(j_2,j_3).value] * (c[Phi.Entry(j_2,j_3).value + 1] + 2d * c[Phi.Entry(j_2,j_3).value]) / 3d;
            d[Phi.Entry(j_2,j_3).value] = (c[Phi.Entry(j_2,j_3).value + 1] - c[Phi.Entry(j_2,j_3).value]) / (3d * h[Phi.Entry(j_2,j_3).value]);
        	j_3 = new Var<Integer>((Phi.Entry(j_2,j_3).value - 1));
			Output.record("SplineInterpolator", "interpolate", 113, "j_3", j_3.value);
		}
		j_4 = Phi.Exit(j_2,j_3);
		j_3 = null;
		Output.record("SplineInterpolator", "interpolate", 110, "j_4", j_4.value);

        final PolynomialFunction polynomials[] = new PolynomialFunction[n_3.value];
        final double coefficients[] = new double[4];
        i_10 = new Var<Integer>((0));
		Output.record("SplineInterpolator", "interpolate", 118, "i_10", i_10.value);
		i_11 = new Var<Integer>((i_10.value));
		Output.record("SplineInterpolator", "interpolate", 118, "i_11", i_11.value);
		n_4 = new Var<Integer>((n_3.value));
		Output.record("SplineInterpolator", "interpolate", 118, "n_4", n_4.value);
		i_12 = new Var<Integer>((i_11.value));
		Output.record("SplineInterpolator", "interpolate", 117, "i_12", i_12.value);
		while(Phi.Entry(i_12,i_13).value < Phi.Entry(n_4,n_4).value) {
            coefficients[0] = y[Phi.Entry(i_12,i_13).value];
            coefficients[1] = b[Phi.Entry(i_12,i_13).value];
            coefficients[2] = c[Phi.Entry(i_12,i_13).value];
            coefficients[3] = d[Phi.Entry(i_12,i_13).value];
            polynomials[Phi.Entry(i_12,i_13).value] = new PolynomialFunction(coefficients);
        	i_13 = new Var<Integer>((Phi.Entry(i_12,i_13).value + 1));
			Output.record("SplineInterpolator", "interpolate", 123, "i_13", i_13.value);
		}
		i_14 = Phi.Exit(i_12,i_13);
		i_13 = null;
		Output.record("SplineInterpolator", "interpolate", 118, "i_14", i_14.value);

		Output.recordProgramOutput("SplineInterpolator", polynomials[i_14.value-1].getCoefficients()[0], true);
        return new PolynomialSplineFunction(x, polynomials);
    }
}
