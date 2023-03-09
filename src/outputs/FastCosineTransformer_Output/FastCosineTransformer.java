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
package outputs.FastCosineTransformer_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import java.io.Serializable;

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.transform.DctNormalization;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.RealTransformer;
import org.apache.commons.math3.transform.TransformType;
import org.apache.commons.math3.transform.TransformUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the Fast Cosine Transform for transformation of one-dimensional
 * real data sets. For reference, see James S. Walker, <em>Fast Fourier
 * Transforms</em>, chapter 3 (ISBN 0849371635).
 * <p>
 * There are several variants of the discrete cosine transform. The present
 * implementation corresponds to DCT-I, with various normalization conventions,
 * which are specified by the parameter {@link DctNormalization}.
 * <p>
 * DCT-I is equivalent to DFT of an <em>even extension</em> of the data series.
 * More precisely, if x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is the data set
 * to be cosine transformed, the extended data set
 * x<sub>0</sub><sup>&#35;</sup>, &hellip;, x<sub>2N-3</sub><sup>&#35;</sup>
 * is defined as follows
 * <ul>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>k</sub> if 0 &le; k &lt; N,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>2N-2-k</sub>
 * if N &le; k &lt; 2N - 2.</li>
 * </ul>
 * <p>
 * Then, the standard DCT-I y<sub>0</sub>, &hellip;, y<sub>N-1</sub> of the real
 * data set x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is equal to <em>half</em>
 * of the N first elements of the DFT of the extended data set
 * x<sub>0</sub><sup>&#35;</sup>, &hellip;, x<sub>2N-3</sub><sup>&#35;</sup>
 * <br/>
 * y<sub>n</sub> = (1 / 2) &sum;<sub>k=0</sub><sup>2N-3</sup>
 * x<sub>k</sub><sup>&#35;</sup> exp[-2&pi;i nk / (2N - 2)]
 * &nbsp;&nbsp;&nbsp;&nbsp;k = 0, &hellip;, N-1.
 * <p>
 * The present implementation of the discrete cosine transform as a fast cosine
 * transform requires the length of the data set to be a power of two plus one
 * (N&nbsp;=&nbsp;2<sup>n</sup>&nbsp;+&nbsp;1). Besides, it implicitly assumes
 * that the sampled function is even.
 *
 * @since 1.2
 */
public class FastCosineTransformer implements RealTransformer, Serializable {

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120212L;

    /** The type of DCT to be performed. */
    private final DctNormalization normalization;

    /**
     * Creates a new instance of this class, with various normalization
     * conventions.
     *
     * @param normalization the type of normalization to be applied to the
     * transformed data
     */
    public FastCosineTransformer(final DctNormalization normalization) {
		// formal parameters
		Var<DctNormalization> normalization_0 = new Var<DctNormalization>(normalization);
		Output.record("FastCosineTransformer", "FastCosineTransformer", 86, "normalization_0", normalization_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		this.normalization = normalization;
    }

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException if the length of the data array is
     * not a power of two plus one
     */
    public double[] transform(final double[] f, final TransformType type)
      throws MathIllegalArgumentException {
		// formal parameters
		Var<TransformType> type_0 = new Var<TransformType>(type);
		Output.record("FastCosineTransformer", "transform", 97, "type_0", type_0.value);

		// all variables are declared to null
		Var<Double> s_0 = null;
		Var<Double> s2_0 = null;
		Var<Double> s1_0 = null;
		Var<Double> s1_1 = null;
		Var<Double> s1_2 = null;
		Var<Double> s1_3 = null;
        
		/* PROGRAM STARTS */
		if (type_0.value == TransformType.FORWARD) {
            if (normalization == DctNormalization.ORTHOGONAL_DCT_I) {
                s_0 = new Var<Double>((double)FastMath.sqrt(2.0 / (f.length - 1)));
				Output.record("FastCosineTransformer", "transform", 100, "s_0", s_0.value);
                return TransformUtils.scaleArray(fct(f), s_0.value);
            }
            return fct(f);
        }
        s2_0 = new Var<Double>((double)2.0 / (f.length - 1));
		Output.record("FastCosineTransformer", "transform", 105, "s2_0", s2_0.value);
        //;
        if (normalization == DctNormalization.ORTHOGONAL_DCT_I) {
            s1_1 = new Var<Double>((double)FastMath.sqrt(s2_0.value));
			Output.record("FastCosineTransformer", "transform", 108, "s1_1", s1_1.value);
        } else {
            s1_2 = new Var<Double>((double)s2_0.value);
			Output.record("FastCosineTransformer", "transform", 110, "s1_2", s1_2.value);
        }
		s1_3 = Phi.If((normalization == DctNormalization.ORTHOGONAL_DCT_I),s1_1,s1_2);
		Output.record("FastCosineTransformer", "transform", 109, "s1_3", s1_3.value);
        return TransformUtils.scaleArray(fct(f), s1_3.value);
    }

    /**
     * {@inheritDoc}
     *
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     * if the number of sample points is negative
     * @throws MathIllegalArgumentException if the number of sample points is
     * not a power of two plus one
     */
    public double[] transform(final UnivariateFunction f,
        final double min, final double max, final int n,
        final TransformType type) throws MathIllegalArgumentException {
		// formal parameters
		Var<Double> min_0 = new Var<Double>(min);
		Output.record("FastCosineTransformer", "transform", 127, "min_0", min_0.value);
		Var<Double> max_0 = new Var<Double>(max);
		Output.record("FastCosineTransformer", "transform", 127, "max_0", max_0.value);
		Var<UnivariateFunction> f_0 = new Var<UnivariateFunction>(f);
		Output.record("FastCosineTransformer", "transform", 127, "f_0", f_0.value);
		Var<TransformType> type_1 = new Var<TransformType>(type);
		Output.record("FastCosineTransformer", "transform", 127, "type_1", type_1.value);
		Var<Integer> n_0 = new Var<Integer>(n);
		Output.record("FastCosineTransformer", "transform", 127, "n_0", n_0.value);

		// all variables are declared to null

        
		/* PROGRAM STARTS */
		final double data[] = FunctionUtils.sample(f, min_0.value, max_0.value, n_0.value);
        return transform(data, type_1.value);
    }

    /**
     * Perform the FCT algorithm (including inverse).
     *
     * @param f the real data array to be transformed
     * @return the real transformed array
     * @throws MathIllegalArgumentException if the length of the data array is
     * not a power of two plus one
     */
    protected double[] fct(double[] f)
        throws MathIllegalArgumentException {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_1 = null;
		Var<Integer> n_2 = null;
		Var<Integer> n_3 = null;
		Var<Double> t1_0 = null;
		Var<Integer> i_0 = null;
		Var<Double> a_0 = null;
		Var<Double> b_0 = null;
		Var<Double> c_0 = null;
		Var<Double> t1_1 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Double> t1_2 = null;
		Var<FastFourierTransformer> transformer_0 = null;
		Var<FastFourierTransformer> transformer_1 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;

        
		/* PROGRAM STARTS */
		final double transformed[] = new double[f.length];

        n_1 = new Var<Integer>(f.length - 1);
		Output.record("FastCosineTransformer", "fct", 146, "n_1", n_1.value);
        n_2 = new Var<Integer>(n_1.value);
		Output.record("FastCosineTransformer", "fct", 147, "n_2", n_2.value);
if (!ArithmeticUtils.isPowerOfTwo(n_2.value)) {
            throw new MathIllegalArgumentException(
                LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE,
                Integer.valueOf(f.length));
        }
        n_3 = new Var<Integer>(n_2.value);
		Output.record("FastCosineTransformer", "fct", 152, "n_3", n_3.value);
if (n_3.value == 1) {       // trivial case
            transformed[0] = 0.5 * (f[0] + f[1]);
            transformed[1] = 0.5 * (f[0] - f[1]);
            return transformed;
        }

        // construct a new array and perform FFT on it
        final double x[] = new double[n_3.value];
        x[0] = 0.5 * (f[0] + f[n_3.value]);
        x[n_3.value >> 1] = f[n_3.value >> 1];
        // temporary variable for transformed[1]
        t1_0 = new Var<Double>((double)0.5 * (f[0] - f[n_3.value]));
		Output.record("FastCosineTransformer", "fct", 163, "t1_0", t1_0.value);
        i_0 = new Var<Integer>(1);
		Output.record("FastCosineTransformer", "fct", 163, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value < (Phi.Entry(n_3,n_3).value >> 1)) {
            a_0 = new Var<Double>((double)0.5 * (f[Phi.Entry(i_0,i_1).value] + f[Phi.Entry(n_3,n_3).value - Phi.Entry(i_0,i_1).value]));
			Output.record("FastCosineTransformer", "fct", 165, "a_0", a_0.value);
            b_0 = new Var<Double>((double)FastMath.sin(Phi.Entry(i_0,i_1).value * FastMath.PI / Phi.Entry(n_3,n_3).value) * (f[Phi.Entry(i_0,i_1).value] - f[Phi.Entry(n_3,n_3).value - Phi.Entry(i_0,i_1).value]));
			Output.record("FastCosineTransformer", "fct", 166, "b_0", b_0.value);
            c_0 = new Var<Double>((double)FastMath.cos(Phi.Entry(i_0,i_1).value * FastMath.PI / Phi.Entry(n_3,n_3).value) * (f[Phi.Entry(i_0,i_1).value] - f[Phi.Entry(n_3,n_3).value - Phi.Entry(i_0,i_1).value]));
			Output.record("FastCosineTransformer", "fct", 167, "c_0", c_0.value);
            x[Phi.Entry(i_0,i_1).value] = a_0.value - b_0.value;
            x[Phi.Entry(n_3,n_3).value - Phi.Entry(i_0,i_1).value] = a_0.value + b_0.value;
            t1_1 = new Var<Double>((double)Phi.Entry(t1_0,t1_1).value + c_0.value);
			Output.record("FastCosineTransformer", "fct", 170, "t1_1", t1_1.value);
        	i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("FastCosineTransformer", "fct", 170, "i_1", i_1.value);
		}
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("FastCosineTransformer", "fct", 164, "i_2", i_2.value);
		t1_2 = Phi.Exit(t1_0,t1_1);
		Output.record("FastCosineTransformer", "fct", 164, "t1_2", t1_2.value);
        //;
        transformer_1 = new Var<FastFourierTransformer>(new FastFourierTransformer(DftNormalization.STANDARD));
		Output.record("FastCosineTransformer", "fct", 173, "transformer_1", transformer_1.value);
        Complex y[] = transformer_1.value.transform(x, TransformType.FORWARD);

        // reconstruct the FCT result for the original array
        transformed[0] = y[0].getReal();
        transformed[1] = t1_2.value;
        i_3 = new Var<Integer>(1);
		Output.record("FastCosineTransformer", "fct", 178, "i_3", i_3.value);
		while(Phi.Entry(i_3,i_4).value < (Phi.Entry(n_3,n_3).value >> 1)) {
            transformed[2 * Phi.Entry(i_3,i_4).value]     = y[Phi.Entry(i_3,i_4).value].getReal();
            transformed[2 * Phi.Entry(i_3,i_4).value + 1] = transformed[2 * Phi.Entry(i_3,i_4).value - 1] - y[Phi.Entry(i_3,i_4).value].getImaginary();
        	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
			Output.record("FastCosineTransformer", "fct", 181, "i_4", i_4.value);
		}
		i_5 = Phi.Exit(i_3,i_4);
		Output.record("FastCosineTransformer", "fct", 179, "i_5", i_5.value);
        transformed[n_3.value] = y[n_3.value >> 1].getReal();

        Output.recordProgramOutput("FastCosineTransformer", transformed[0], false);
        return transformed;
    }
}
