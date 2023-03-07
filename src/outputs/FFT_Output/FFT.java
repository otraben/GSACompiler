package outputs.FFT_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


import gsa.Output;

/**
 * Computes FFT's of complex, double precision data where n is an integer power of 2.
 * This appears to be slower than the Radix2 method,
 * but the code is smaller and simpler, and it requires no extra storage.
 * <p>
 *
 * @author Bruce R. Miller bruce.miller@nist.gov,
 * @author Derived from GSL (Gnu Scientific Library),
 * @author GSL's FFT Code by Brian Gough bjg@vvv.lanl.gov
 */

/* See {@link ComplexDoubleFFT ComplexDoubleFFT} for details of data layout.
 */

public class FFT {

    public static final double num_flops(int N) {
		// formal parameters
		Var<Integer> N_0 = new Var<Integer>(N);
		Output.record("FFT", "num_flops", 21, "N_0", N_0.value);

		// all variables are declared to null
		Var<Double> Nd_0 = null;
		Var<Double> logN_0 = null;
        
		/* PROGRAM STARTS */
		Nd_0 = new Var<Double>((double)(double) N_0.value);
		Output.record("FFT", "num_flops", 22, "Nd_0", Nd_0.value);
        logN_0 = new Var<Double>((double)(double) log2(N_0.value));
		Output.record("FFT", "num_flops", 23, "logN_0", logN_0.value);

        return (5.0 * Nd_0.value - 2) * logN_0.value + 2 * (Nd_0.value + 1);
    }

    /**
     * Compute Fast Fourier Transform of (complex) data, in place.
     */
    public static void transform(double[] data) {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		transform_internal(data, -1);
    }

    /**
     * Compute Inverse Fast Fourier Transform of (complex) data, in place.
     */
    public static void inverse(double[] data) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> nd_0 = null;
		Var<Integer> n_0 = null;
		Var<Double> norm_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
        
		/* PROGRAM STARTS */
		transform_internal(data, +1);
        // Normalize
        nd_0 = new Var<Integer>(data.length);
		Output.record("FFT", "inverse", 41, "nd_0", nd_0.value);
        n_0 = new Var<Integer>(nd_0.value / 2);
		Output.record("FFT", "inverse", 42, "n_0", n_0.value);
        norm_0 = new Var<Double>((double)1 / ((double) n_0.value));
		Output.record("FFT", "inverse", 43, "norm_0", norm_0.value);
        i_0 = new Var<Integer>(0);
		Output.record("FFT", "inverse", 43, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value < Phi.Entry(nd_0,nd_0).value)
            {
			data[Phi.Entry(i_0,i_1).value] = data[Phi.Entry(i_0,i_1).value] * Phi.Entry(norm_0,norm_0).value;
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("FFT", "inverse", 44, "i_1", i_1.value);
		}
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("FFT", "inverse", 44, "i_2", i_2.value);
    }

    /**
     * Accuracy check on FFT of data. Make a copy of data, Compute the FFT, then
     * the inverse and compare to the original.  Returns the rms difference.
     */
    public static double test(double[] data) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> nd_1 = null;
		Var<Double> diff_0 = null;
		Var<Integer> i_3 = null;
		Var<Double> d_0 = null;
		Var<Double> diff_1 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Double> diff_2 = null;
        
		/* PROGRAM STARTS */
		nd_1 = new Var<Integer>(data.length);
		Output.record("FFT", "test", 53, "nd_1", nd_1.value);
        // Make duplicate for comparison
        double copy[] = new double[nd_1.value];
        System.arraycopy(data, 0, copy, 0, nd_1.value);
        // Transform & invert
        transform(data);
        inverse(data);
        // Compute RMS difference.
        diff_0 = new Var<Double>((double)0.0);
		Output.record("FFT", "test", 60, "diff_0", diff_0.value);
        i_3 = new Var<Integer>(0);
		Output.record("FFT", "test", 61, "i_3", i_3.value);
		while(Phi.Entry(i_3,i_4).value < Phi.Entry(nd_1,nd_1).value) {
            d_0 = new Var<Double>((double)data[Phi.Entry(i_3,i_4).value] - copy[Phi.Entry(i_3,i_4).value]);
			Output.record("FFT", "test", 62, "d_0", d_0.value);
            diff_1 = new Var<Double>((double)Phi.Entry(diff_0,diff_1).value + d_0.value * d_0.value);
			Output.record("FFT", "test", 63, "diff_1", diff_1.value);
        	i_4 = new Var<Integer>(Phi.Entry(i_3,i_4).value + 1);
			Output.record("FFT", "test", 64, "i_4", i_4.value);
		}
		i_5 = Phi.Exit(i_3,i_4);
		Output.record("FFT", "test", 62, "i_5", i_5.value);
		diff_2 = Phi.Exit(diff_0,diff_1);
		Output.record("FFT", "test", 62, "diff_2", diff_2.value);
        return Math.sqrt(diff_2.value / nd_1.value);
    }

    /**
     * Make a random array of n (complex) elements.
     */
    public static double[] makeRandom(int n) {
		// formal parameters
		Var<Integer> n_1 = new Var<Integer>(n);
		Output.record("FFT", "makeRandom", 72, "n_1", n_1.value);

		// all variables are declared to null
		Var<Integer> nd_2 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> i_8 = null;
        
		/* PROGRAM STARTS */
		nd_2 = new Var<Integer>(2 * n_1.value);
		Output.record("FFT", "makeRandom", 72, "nd_2", nd_2.value);
        double data[] = new double[nd_2.value];
        i_6 = new Var<Integer>(0);
		Output.record("FFT", "makeRandom", 71, "i_6", i_6.value);
		while(Phi.Entry(i_6,i_7).value < Phi.Entry(nd_2,nd_2).value)
            {
			data[Phi.Entry(i_6,i_7).value] = Math.random();
			i_7 = new Var<Integer>(Phi.Entry(i_6,i_7).value + 1);
			Output.record("FFT", "makeRandom", 75, "i_7", i_7.value);
		}
		i_8 = Phi.Exit(i_6,i_7);
		Output.record("FFT", "makeRandom", 72, "i_8", i_8.value);
        return data;
    }

    /**
     * Simple Test routine.
     */
    public static void main(String[] args) {
		Output.newExecution("FFT");

		// formal parameters

		// all variables are declared to null
		Var<Double> o_0 = null;
		Var<Integer> n_2 = null;
		Var<Integer> i_9 = null;
		Var<Integer> n_3 = null;
		Var<Double> o_1 = null;
		Var<Integer> i_10 = null;
		Var<Integer> i_11 = null;
		Var<Double> o_2 = null;
    	
		/* PROGRAM STARTS */
		o_0 = new Var<Double>((double)0);
		Output.record("FFT", "main", 84, "o_0", o_0.value);
        if (args.length == 0) {
            n_2 = new Var<Integer>(1024);
			Output.record("FFT", "main", 85, "n_2", n_2.value);
            System.out.println("n=" + n_2.value + " => RMS Error=" + test(makeRandom(n_2.value)));
        }
        i_9 = new Var<Integer>(0);
		Output.record("FFT", "main", 88, "i_9", i_9.value);
		while(Phi.Entry(i_9,i_10).value < args.length) {
            n_3 = new Var<Integer>(Integer.parseInt(args[Phi.Entry(i_9,i_10).value]));
			Output.record("FFT", "main", 89, "n_3", n_3.value);
            System.out.println("n=" + n_3.value + " => RMS Error=" + test(makeRandom(n_3.value)));
            o_1 = new Var<Double>((double)test(makeRandom(n_3.value)));
			Output.record("FFT", "main", 91, "o_1", o_1.value);
        	i_10 = new Var<Integer>(Phi.Entry(i_9,i_10).value + 1);
			Output.record("FFT", "main", 92, "i_10", i_10.value);
		}
		i_11 = Phi.Exit(i_9,i_10);
		Output.record("FFT", "main", 88, "i_11", i_11.value);
		o_2 = Phi.Exit(o_0,o_1);
		Output.record("FFT", "main", 88, "o_2", o_2.value);
        System.out.println(o_2.value);
        Output.recordProgramOutput("FFT", o_2.value, false);
    }
    /* ______________________________________________________________________ */

    protected static int log2(int n) {
		// formal parameters
		Var<Integer> n_4 = new Var<Integer>(n);
		Output.record("FFT", "log2", 94, "n_4", n_4.value);

		// all variables are declared to null
		Var<Integer> log_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> log_1 = null;
		Var<Integer> k_1 = null;
		Var<Integer> log_2 = null;
		Var<Integer> k_2 = null;
        
		/* PROGRAM STARTS */
		log_0 = new Var<Integer>(0);
		Output.record("FFT", "log2", 94, "log_0", log_0.value);
        k_0 = new Var<Integer>(1);
		Output.record("FFT", "log2", 95, "k_0", k_0.value);
		while(Phi.Entry(k_0,k_1).value < Phi.Entry(n_4,n_4).value){
			
            ;
			log_1 = new Var<Integer>(Phi.Entry(log_0,log_1).value + 1);
			Output.record("FFT", "log2", 97, "log_1", log_1.value);
			k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value * 2);
			Output.record("FFT", "log2", 98, "k_1", k_1.value);
		}
		log_2 = Phi.Exit(log_0,log_1);
		Output.record("FFT", "log2", 96, "log_2", log_2.value);
		k_2 = Phi.Exit(k_0,k_1);
		Output.record("FFT", "log2", 96, "k_2", k_2.value);
        if (n_4.value != (1 << log_2.value))
            {
			throw new Error("FFT: Data length is not a power of 2!: " + n_4.value);
		}
        return log_2.value;
    }

    protected static void transform_internal(double[] data, int direction) {
		// formal parameters
		Var<Integer> direction_0 = new Var<Integer>(direction);
		Output.record("FFT", "transform_internal", 103, "direction_0", direction_0.value);

		// all variables are declared to null
		Var<Integer> n_5 = null;
		Var<Integer> logn_0 = null;
		Var<Integer> bit_0 = null;
		Var<Integer> dual_0 = null;
		Var<Double> w_real_0 = null;
		Var<Double> w_imag_0 = null;
		Var<Double> theta_0 = null;
		Var<Double> s_0 = null;
		Var<Double> t_0 = null;
		Var<Double> s2_0 = null;
		Var<Integer> b_0 = null;
		Var<Integer> i_12 = null;
		Var<Integer> j_0 = null;
		Var<Double> wd_real_0 = null;
		Var<Double> wd_imag_0 = null;
		Var<Integer> b_1 = null;
		Var<Integer> b_2 = null;
		Var<Integer> a_0 = null;
		Var<Double> tmp_real_0 = null;
		Var<Double> tmp_imag_0 = null;
		Var<Double> w_real_1 = null;
		Var<Double> w_imag_1 = null;
		Var<Integer> b_3 = null;
		Var<Integer> i_13 = null;
		Var<Integer> j_1 = null;
		Var<Double> z1_real_0 = null;
		Var<Double> z1_imag_0 = null;
		Var<Double> wd_real_1 = null;
		Var<Double> wd_imag_1 = null;
		Var<Integer> b_4 = null;
		Var<Integer> b_5 = null;
		Var<Integer> a_1 = null;
		Var<Integer> a_2 = null;
		Var<Integer> b_6 = null;
		Var<Double> w_real_2 = null;
		Var<Double> w_imag_2 = null;
		Var<Integer> dual_1 = null;
		Var<Integer> bit_1 = null;
		Var<Integer> bit_2 = null;
		Var<Integer> dual_2 = null;
        
		/* PROGRAM STARTS */
		if (data.length == 0)
            {
			return;
		}
        n_5 = new Var<Integer>(data.length / 2);
		Output.record("FFT", "transform_internal", 108, "n_5", n_5.value);
        if (n_5.value == 1)
            {
			return;
		} // Identity operation!
        logn_0 = new Var<Integer>(log2(n_5.value));
		Output.record("FFT", "transform_internal", 112, "logn_0", logn_0.value);

        /* bit reverse the input data for decimation in time algorithm */
        bitreverse(data);

        /* apply fft recursion */
        /* this loop executed log2(N) times */
        bit_0 = new Var<Integer>(0);
		Output.record("FFT", "transform_internal", 117, "bit_0", bit_0.value);
		dual_0 = new Var<Integer>(1);
		Output.record("FFT", "transform_internal", 118, "dual_0", dual_0.value);
		while(Phi.Entry(bit_0,bit_1).value < Phi.Entry(logn_0,logn_0).value) {
            w_real_0 = new Var<Double>((double)1.0);
			Output.record("FFT", "transform_internal", 120, "w_real_0", w_real_0.value);
            w_imag_0 = new Var<Double>((double)0.0);
			Output.record("FFT", "transform_internal", 121, "w_imag_0", w_imag_0.value);

            theta_0 = new Var<Double>((double)2.0 * Phi.Entry(direction_0,direction_0).value * Math.PI / (2.0 * (double) Phi.Entry(dual_0,dual_1).value));
			Output.record("FFT", "transform_internal", 123, "theta_0", theta_0.value);
            s_0 = new Var<Double>((double)Math.sin(theta_0.value));
			Output.record("FFT", "transform_internal", 124, "s_0", s_0.value);
            t_0 = new Var<Double>((double)Math.sin(theta_0.value / 2.0));
			Output.record("FFT", "transform_internal", 125, "t_0", t_0.value);
            s2_0 = new Var<Double>((double)2.0 * t_0.value * t_0.value);
			Output.record("FFT", "transform_internal", 126, "s2_0", s2_0.value);

            /* a = 0 */
            b_0 = new Var<Integer>(0);
			Output.record("FFT", "transform_internal", 128, "b_0", b_0.value);
			while(Phi.Entry(b_0,b_1).value < Phi.Entry(n_5,n_5).value) {
                i_12 = new Var<Integer>(2 * Phi.Entry(b_0,b_1).value);
				Output.record("FFT", "transform_internal", 130, "i_12", i_12.value);
                j_0 = new Var<Integer>(2 * (Phi.Entry(b_0,b_1).value + Phi.Entry(dual_0,dual_0).value));
				Output.record("FFT", "transform_internal", 131, "j_0", j_0.value);

                wd_real_0 = new Var<Double>((double)data[j_0.value]);
				Output.record("FFT", "transform_internal", 132, "wd_real_0", wd_real_0.value);
                wd_imag_0 = new Var<Double>((double)data[j_0.value + 1]);
				Output.record("FFT", "transform_internal", 133, "wd_imag_0", wd_imag_0.value);

                data[j_0.value] = data[i_12.value] - wd_real_0.value;
                data[j_0.value + 1] = data[i_12.value + 1] - wd_imag_0.value;
                data[i_12.value] = data[i_12.value] + wd_real_0.value;
                data[i_12.value + 1] = data[i_12.value+1] + wd_imag_0.value;
            	b_1 = new Var<Integer>(Phi.Entry(b_0,b_1).value + 2*Phi.Entry(dual_0,dual_0).value);
				Output.record("FFT", "transform_internal", 138, "b_1", b_1.value);
			}
			b_2 = Phi.Exit(b_0,b_1);
			Output.record("FFT", "transform_internal", 129, "b_2", b_2.value);

            /* a = 1 .. (dual-1) */
            a_0 = new Var<Integer>(1);
			Output.record("FFT", "transform_internal", 142, "a_0", a_0.value);
			while(Phi.Entry(a_0,a_1).value < Phi.Entry(dual_0,dual_0).value) {
                /* trignometric recurrence for w-> exp(i theta) w */
                {
                    tmp_real_0 = new Var<Double>((double)Phi.Entry(w_real_0,w_real_1).value - Phi.Entry(s_0,s_0).value * Phi.Entry(w_imag_0,w_imag_1).value - Phi.Entry(s2_0,s2_0).value * Phi.Entry(w_real_0,w_real_1).value);
					Output.record("FFT", "transform_internal", 146, "tmp_real_0", tmp_real_0.value);
                    tmp_imag_0 = new Var<Double>((double)Phi.Entry(w_imag_0,w_imag_1).value + Phi.Entry(s_0,s_0).value * Phi.Entry(w_real_0,w_real_1).value - Phi.Entry(s2_0,s2_0).value * Phi.Entry(w_imag_0,w_imag_1).value);
					Output.record("FFT", "transform_internal", 147, "tmp_imag_0", tmp_imag_0.value);
                    w_real_1 = new Var<Double>((double)tmp_real_0.value);
					Output.record("FFT", "transform_internal", 148, "w_real_1", w_real_1.value);
                    w_imag_1 = new Var<Double>((double)tmp_imag_0.value);
					Output.record("FFT", "transform_internal", 149, "w_imag_1", w_imag_1.value);
                }
                b_3 = new Var<Integer>(0);
				Output.record("FFT", "transform_internal", 151, "b_3", b_3.value);
				while(Phi.Entry(b_3,b_4).value < Phi.Entry(n_5,n_5).value) {
                    i_13 = new Var<Integer>(2 * (Phi.Entry(b_3,b_4).value + Phi.Entry(a_0,a_0).value));
					Output.record("FFT", "transform_internal", 152, "i_13", i_13.value);
                    j_1 = new Var<Integer>(2 * (Phi.Entry(b_3,b_4).value + Phi.Entry(a_0,a_0).value + Phi.Entry(dual_0,dual_0).value));
					Output.record("FFT", "transform_internal", 153, "j_1", j_1.value);

                    z1_real_0 = new Var<Double>((double)data[j_1.value]);
					Output.record("FFT", "transform_internal", 154, "z1_real_0", z1_real_0.value);
                    z1_imag_0 = new Var<Double>((double)data[j_1.value + 1]);
					Output.record("FFT", "transform_internal", 155, "z1_imag_0", z1_imag_0.value);

                    wd_real_1 = new Var<Double>((double)Phi.Entry(w_real_1,w_real_1).value * z1_real_0.value - Phi.Entry(w_imag_1,w_imag_1).value * z1_imag_0.value);
					Output.record("FFT", "transform_internal", 155, "wd_real_1", wd_real_1.value);
                    wd_imag_1 = new Var<Double>((double)Phi.Entry(w_real_1,w_real_1).value * z1_imag_0.value + Phi.Entry(w_imag_1,w_imag_1).value * z1_real_0.value);
					Output.record("FFT", "transform_internal", 156, "wd_imag_1", wd_imag_1.value);

                    data[j_1.value] = data[i_13.value] - wd_real_1.value;
                    data[j_1.value + 1] = data[i_13.value + 1] - wd_imag_1.value;
                    data[i_13.value] = data[i_13.value] + wd_real_1.value;
                    data[i_13.value + 1] = data[i_13.value+1] + wd_imag_1.value;
                	b_4 = new Var<Integer>(Phi.Entry(b_3,b_4).value + 2*Phi.Entry(dual_0,dual_0).value);
					Output.record("FFT", "transform_internal", 162, "b_4", b_4.value);
				}
				b_5 = Phi.Exit(b_3,b_4);
				Output.record("FFT", "transform_internal", 151, "b_5", b_5.value);
            	a_1 = new Var<Integer>(Phi.Entry(a_0,a_1).value + 1);
				Output.record("FFT", "transform_internal", 164, "a_1", a_1.value);
			}
			a_2 = Phi.Exit(a_0,a_1);
			Output.record("FFT", "transform_internal", 143, "a_2", a_2.value);
			b_6 = Phi.Exit(b_2,b_5);
			Output.record("FFT", "transform_internal", 143, "b_6", b_6.value);
			w_real_2 = Phi.Exit(w_real_0,w_real_1);
			Output.record("FFT", "transform_internal", 143, "w_real_2", w_real_2.value);
			w_imag_2 = Phi.Exit(w_imag_0,w_imag_1);
			Output.record("FFT", "transform_internal", 143, "w_imag_2", w_imag_2.value);
        	dual_1 = new Var<Integer>(Phi.Entry(dual_0,dual_1).value * 2);
			Output.record("FFT", "transform_internal", 166, "dual_1", dual_1.value);
			bit_1 = new Var<Integer>(Phi.Entry(bit_0,bit_1).value + 1);
			Output.record("FFT", "transform_internal", 167, "bit_1", bit_1.value);
		}
		bit_2 = Phi.Exit(bit_0,bit_1);
		Output.record("FFT", "transform_internal", 119, "bit_2", bit_2.value);
		dual_2 = Phi.Exit(dual_0,dual_1);
		Output.record("FFT", "transform_internal", 119, "dual_2", dual_2.value);
    }

    protected static void bitreverse(double[] data) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_6 = null;
		Var<Integer> nm1_0 = null;
		Var<Integer> i_14 = null;
		Var<Integer> j_2 = null;
		Var<Integer> ii_0 = null;
		Var<Integer> jj_0 = null;
		Var<Integer> k_3 = null;
		Var<Double> tmp_real_1 = null;
		Var<Double> tmp_imag_1 = null;
		Var<Integer> j_3 = null;
		Var<Integer> k_4 = null;
		Var<Integer> j_4 = null;
		Var<Integer> k_5 = null;
		Var<Integer> j_5 = null;
		Var<Integer> i_15 = null;
		Var<Integer> i_16 = null;
		Var<Integer> j_6 = null;
        /* This is the Goldrader bit-reversal algorithm */
        
		/* PROGRAM STARTS */
		n_6 = new Var<Integer>(data.length / 2);
		Output.record("FFT", "bitreverse", 173, "n_6", n_6.value);
        nm1_0 = new Var<Integer>(n_6.value - 1);
		Output.record("FFT", "bitreverse", 174, "nm1_0", nm1_0.value);
        i_14 = new Var<Integer>(0);
		Output.record("FFT", "bitreverse", 175, "i_14", i_14.value);
        j_2 = new Var<Integer>(0);
		Output.record("FFT", "bitreverse", 176, "j_2", j_2.value);
        while(Phi.Entry(i_14,i_15).value < Phi.Entry(nm1_0,nm1_0).value) {

            //int ii = 2*i;
            ii_0 = new Var<Integer>(Phi.Entry(i_14,i_15).value << 1);
			Output.record("FFT", "bitreverse", 180, "ii_0", ii_0.value);

            //int jj = 2*j;
            jj_0 = new Var<Integer>(Phi.Entry(j_2,j_5).value << 1);
			Output.record("FFT", "bitreverse", 183, "jj_0", jj_0.value);

            //int k = n / 2 ;
            k_3 = new Var<Integer>(Phi.Entry(n_6,n_6).value >> 1);
			Output.record("FFT", "bitreverse", 186, "k_3", k_3.value);

            if (Phi.Entry(i_14,i_15).value < Phi.Entry(j_2,j_5).value) {
                tmp_real_1 = new Var<Double>((double)data[ii_0.value]);
				Output.record("FFT", "bitreverse", 189, "tmp_real_1", tmp_real_1.value);
                tmp_imag_1 = new Var<Double>((double)data[ii_0.value + 1]);
				Output.record("FFT", "bitreverse", 190, "tmp_imag_1", tmp_imag_1.value);
                System.out.println(data.length + " " + ii_0.value + " " + jj_0.value);
                data[ii_0.value] = data[jj_0.value];
                data[ii_0.value + 1] = data[jj_0.value + 1];
                data[jj_0.value] = tmp_real_1.value;
                data[jj_0.value + 1] = tmp_imag_1.value;
            }

            while (Phi.Entry(k_3,k_4).value <= Phi.Entry(j_2,j_3).value) {
                //j = j - k ;
                j_3 = new Var<Integer>(Phi.Entry(j_2,j_3).value - Phi.Entry(k_3,k_4).value);
				Output.record("FFT", "bitreverse", 199, "j_3", j_3.value);

                //k = k / 2 ;
                k_4 = new Var<Integer>(Phi.Entry(k_3,k_4).value >> 1);
				Output.record("FFT", "bitreverse", 202, "k_4", k_4.value);
            }
			j_4 = Phi.Exit(j_2,j_3);
			Output.record("FFT", "bitreverse", 197, "j_4", j_4.value);
			k_5 = Phi.Exit(k_3,k_4);
			Output.record("FFT", "bitreverse", 197, "k_5", k_5.value);
            j_5 = new Var<Integer>(Phi.Entry(j_4,j_5).value + k_5.value);
			Output.record("FFT", "bitreverse", 204, "j_5", j_5.value);
        	i_15 = new Var<Integer>(Phi.Entry(i_14,i_15).value + 1);
			Output.record("FFT", "bitreverse", 205, "i_15", i_15.value);
		}
		i_16 = Phi.Exit(i_14,i_15);
		Output.record("FFT", "bitreverse", 177, "i_16", i_16.value);
		j_6 = Phi.Exit(j_2,j_5);
		Output.record("FFT", "bitreverse", 177, "j_6", j_6.value);
    }

}

