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
package outputs.FastSineTransformer_Output;
import gsa.Fluky;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import java.io.Serializable;

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.DstNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.RealTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.apache.commons.math3.transform.TransformUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the Fast Sine Transform for transformation of one-dimensional real
 * data sets. For reference, see James S. Walker, <em>Fast Fourier
 * Transforms</em>, chapter 3 (ISBN 0849371635).
 * <p>
 * There are several variants of the discrete sine transform. The present
 * implementation corresponds to DST-I, with various normalization conventions,
 * which are specified by the parameter {@link DstNormalization}.
 * <strong>It should be noted that regardless to the convention, the first
 * element of the dataset to be transformed must be zero.</strong>
 * <p>
 * DST-I is equivalent to DFT of an <em>odd extension</em> of the data series.
 * More precisely, if x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is the data set
 * to be sine transformed, the extended data set x<sub>0</sub><sup>&#35;</sup>,
 * &hellip;, x<sub>2N-1</sub><sup>&#35;</sup> is defined as follows
 * <ul>
 * <li>x<sub>0</sub><sup>&#35;</sup> = x<sub>0</sub> = 0,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>k</sub> if 1 &le; k &lt; N,</li>
 * <li>x<sub>N</sub><sup>&#35;</sup> = 0,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = -x<sub>2N-k</sub> if N + 1 &le; k &lt;
 * 2N.</li>
 * </ul>
 * <p>
 * Then, the standard DST-I y<sub>0</sub>, &hellip;, y<sub>N-1</sub> of the real
 * data set x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is equal to <em>half</em>
 * of i (the pure imaginary number) times the N first elements of the DFT of the
 * extended data set x<sub>0</sub><sup>&#35;</sup>, &hellip;,
 * x<sub>2N-1</sub><sup>&#35;</sup> <br />
 * y<sub>n</sub> = (i / 2) &sum;<sub>k=0</sub><sup>2N-1</sup>
 * x<sub>k</sub><sup>&#35;</sup> exp[-2&pi;i nk / (2N)]
 * &nbsp;&nbsp;&nbsp;&nbsp;k = 0, &hellip;, N-1.
 * <p>
 * The present implementation of the discrete sine transform as a fast sine
 * transform requires the length of the data to be a power of two. Besides,
 * it implicitly assumes that the sampled function is odd. In particular, the
 * first element of the data set must be 0, which is enforced in
 * {@link #transform(UnivariateFunction, double, double, int, TransformType)},
 * after sampling.
 *
 * @since 1.2
 */
public class FastSineTransformer_Faulty implements RealTransformer, Serializable {

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120211L;

    /** The type of DST to be performed. */
    private final DstNormalization normalization;

    /**
     * Creates a new instance of this class, with various normalization conventions.
     *
     * @param normalization the type of normalization to be applied to the transformed data
     */
    public FastSineTransformer_Faulty(final DstNormalization normalization) {
		// formal parameters
		Var<DstNormalization> normalization_0 = new Var<DstNormalization>(normalization);
		Output.record("FastSineTransformer", "FastSineTransformer", 83, "normalization_0", normalization_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		this.normalization = normalization;
    }

    /**
     * {@inheritDoc}
     *
     * The first element of the specified data set is required to be {@code 0}.
     *
     * @throws MathIllegalArgumentException if the length of the data array is
     *   not a power of two, or the first element of the data array is not zero
     */
    public double[] transform(final double[] f, final TransformType type) {
		// formal parameters
		Var<TransformType> type_0 = new Var<TransformType>(type);
		Output.record("FastSineTransformer", "transform", 95, "type_0", type_0.value);

		// all variables are declared to null
		Var<Double> s_0 = null;
		Var<Double> s_1 = null;
        
		/* PROGRAM STARTS */
		if (normalization == DstNormalization.ORTHOGONAL_DST_I) {
            s_0 = new Var<Double>((double)FastMath.sqrt(2.0 / f.length));
			Output.record("FastSineTransformer", "transform", 97, "s_0", s_0.value);
            return TransformUtils.scaleArray(fst(f), s_0.value);
        }
        if (type_0.value == TransformType.FORWARD) {
            return fst(f);
        }
        s_1 = new Var<Double>((double)2.0 / f.length);
		Output.record("FastSineTransformer", "transform", 103, "s_1", s_1.value);
        return TransformUtils.scaleArray(fst(f), s_1.value);
    }

    /**
     * {@inheritDoc}
     *
     * This implementation enforces {@code f(x) = 0.0} at {@code x = 0.0}.
     *
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     *   if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     *   if the number of sample points is negative
     * @throws MathIllegalArgumentException if the number of sample points is not a power of two
     */
    public double[] transform(final UnivariateFunction f,
        final double min, final double max, final int n,
        final TransformType type) {
		// formal parameters
		Var<Double> min_0 = new Var<Double>(min);
		Output.record("FastSineTransformer", "transform", 120, "min_0", min_0.value);
		Var<Double> max_0 = new Var<Double>(max);
		Output.record("FastSineTransformer", "transform", 120, "max_0", max_0.value);
		Var<UnivariateFunction> f_0 = new Var<UnivariateFunction>(f);
		Output.record("FastSineTransformer", "transform", 120, "f_0", f_0.value);
		Var<TransformType> type_1 = new Var<TransformType>(type);
		Output.record("FastSineTransformer", "transform", 120, "type_1", type_1.value);
		Var<Integer> n_0 = new Var<Integer>(n);
		Output.record("FastSineTransformer", "transform", 120, "n_0", n_0.value);

		// all variables are declared to null

        
		/* PROGRAM STARTS */
		final double data[] = FunctionUtils.sample(f, min_0.value, max_0.value, n_0.value);
        data[0] = 0.0;
        return transform(data, type_1.value);
    }

    /**
     * Perform the FST algorithm (including inverse). The first element of the
     * data set is required to be {@code 0}.
     *
     * @param f the real data array to be transformed
     * @return the real transformed array
     * @throws MathIllegalArgumentException if the length of the data array is
     *   not a power of two, or the first element of the data array is not zero
     */
    protected double[] fst(double[] f) throws MathIllegalArgumentException {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_1 = null;
		Var<Integer> n_2 = null;
		Var<Integer> i_0 = null;
		Var<Double> a_0 = null;
		Var<Double> b_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<FastFourierTransformer> transformer_0 = null;
		Var<FastFourierTransformer> transformer_1 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;

        
		/* PROGRAM STARTS */
		final double transformed[] = new double[f.length];

        if (!ArithmeticUtils.isPowerOfTwo(f.length)) {
            throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING,
                    Integer.valueOf(f.length));
        }
        if (f[0] != 0.0) {
            throw new MathIllegalArgumentException(
                    LocalizedFormats.FIRST_ELEMENT_NOT_ZERO,
                    Double.valueOf(f[0]));
        }
        n_1 = new Var<Integer>(f.length);
		Output.record("FastSineTransformer", "fst", 150, "n_1", n_1.value);
        n_2 = new Var<Integer>(n_1.value);
		Output.record("FastSineTransformer", "fst", 151, "n_2", n_2.value);
if (n_2.value == 1) {       // trivial case
            transformed[0] = 0.0;
            return transformed;
        }

        // construct a new array and perform FFT on it
        final double x[] = new double[n_2.value];
        x[0] = 0.0;
        x[n_2.value >> 1] = 2.0 * f[n_2.value >> 1];
        i_0 = new Var<Integer>(1);
		Output.record("FastSineTransformer", "fst", 159, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value < (Phi.Entry(n_2,n_2).value >> 1)) {
            a_0 = new Var<Double>((double)FastMath.sin(Phi.Entry(i_0,i_1).value * FastMath.PI / Phi.Entry(n_2,n_2).value) * (f[Phi.Entry(i_0,i_1).value] + f[Phi.Entry(n_2,n_2).value - Phi.Entry(i_0,i_1).value]));
			Output.record("FastSineTransformer", "fst", 161, "a_0", a_0.value);
            b_0 = new Var<Double>(Fluky.flukyDouble((double)0.5 * (f[Phi.Entry(i_0,i_1).value] - f[Phi.Entry(n_2,n_2).value - Phi.Entry(i_0,i_1).value]), 0.5));
			Output.record("FastSineTransformer", "fst", 162, "b_0", b_0.value);
            x[Phi.Entry(i_0,i_1).value]     = a_0.value + b_0.value;
            x[Phi.Entry(n_2,n_2).value - Phi.Entry(i_0,i_1).value] = a_0.value - b_0.value;
        	i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("FastSineTransformer", "fst", 164, "i_1", i_1.value);
		}
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("FastSineTransformer", "fst", 160, "i_2", i_2.value);
        //;
        transformer_1 = new Var<FastFourierTransformer>(new FastFourierTransformer(DftNormalization.STANDARD));
		Output.record("FastSineTransformer", "fst", 167, "transformer_1", transformer_1.value);
        Complex y[] = transformer_1.value.transform(x, TransformType.FORWARD);

        // reconstruct the FST result for the original array
        transformed[0] = 0.0;
        transformed[1] = 0.5 * y[0].getReal();
        i_3 = new Var<Integer>(1);
		Output.record("FastSineTransformer", "fst", 172, "i_3", i_3.value);
		while(Phi.Entry(i_3,i_4).value < (Phi.Entry(n_2,n_2).value >> 1)) {
            transformed[2 * Phi.Entry(i_3,i_4).value]     = -y[Phi.Entry(i_3,i_4).value].getImaginary();
            transformed[2 * Phi.Entry(i_3,i_4).value + 1] = y[Phi.Entry(i_3,i_4).value].getReal() + transformed[2 * Phi.Entry(i_3,i_4).value - 1];
        	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
			Output.record("FastSineTransformer", "fst", 175, "i_4", i_4.value);
		}
		i_5 = Phi.Exit(i_3,i_4);
		Output.record("FastSineTransformer", "fst", 173, "i_5", i_5.value);

		Output.recordProgramOutput("FastSineTransformer", transformed[i_5.value], true);
        return transformed;
    }
}
