package outputs;


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

    public static final double num_flops(Integer N) {
		// formal parameters
		Var<Integer> N_0 = new Var<Integer>(N);
		Output.record("FFT", "num_flops", 20, "N_0", N_0.value);

		// all variables are declared to null
		Var<Double> Nd_0 = null;
		Var<Double> logN_0 = null;
        
		/* PROGRAM STARTS */
		Nd_0 = new Var<Double>((double) N_0.value);
		Output.record("FFT", "num_flops", 21, "Nd_0", Nd_0.value);
        logN_0 = new Var<Double>((double) log2(N_0.value));
		Output.record("FFT", "num_flops", 22, "logN_0", logN_0.value);

        return (5.0 * Nd_0.value - 2) * logN_0.value + 2 * (Nd_0.value + 1);
    }

    /**
     * Compute Fast Fourier Transform of (complex) data, in place.
     */
    public static void transform(Double[] data) {
		// formal parameters
		Var<Double[]> data_0 = new Var<Double[]>(data);
		Output.record("FFT", "transform", 30, "data_0", data_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		transform_internal(data_0.value, -1);
    }

    /**
     * Compute Inverse Fast Fourier Transform of (complex) data, in place.
     */
    public static void inverse(Double[] data) {
		// formal parameters
		Var<Double[]> data_1 = new Var<Double[]>(data);
		Output.record("FFT", "inverse", 37, "data_1", data_1.value);

		// all variables are declared to null
		Var<Integer> nd_0 = null;
		Var<Integer> n_0 = null;
		Var<Double> norm_0 = null;
		Var<Integer> i_0 = null;
		Var<Double[]> data_2 = null;
		Var<Double[]> data_3 = null;
        
		/* PROGRAM STARTS */
		transform_internal(data_1.value, +1);
        // Normalize
        nd_0 = new Var<Integer>(data_1.value.length);
		Output.record("FFT", "inverse", 40, "nd_0", nd_0.value);
        n_0 = new Var<Integer>(nd_0.value / 2);
		Output.record("FFT", "inverse", 41, "n_0", n_0.value);
        norm_0 = new Var<Double>(1 / ((double) n_0.value));
		Output.record("FFT", "inverse", 42, "norm_0", norm_0.value);
        i_0 = new Var<Integer>(0);
		Output.record("FFT", "inverse", 42, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_0).value < Phi.Entry(nd_0,nd_0).value)
            {data_2[Phi.Entry(i_-1,i_0).value] = new Var<Double[]>(Phi.Entry(data_1,data_2).value * Phi.Entry(norm_-1,norm_0).value);
			Output.record("FFT", "inverse", 44, "data_2", data_2.value);}
		data_3 = Phi.Exit(data_1,data_2);
		Output.record("FFT", "inverse", 43, "data_3", data_3.value);
    }

    /**
     * Accuracy check on FFT of data. Make a copy of data, Compute the FFT, then
     * the inverse and compare to the original.  Returns the rms difference.
     */
    public static double test(Double[] data) {
		// formal parameters
		Var<Double[]> data_4 = new Var<Double[]>(data);
		Output.record("FFT", "test", 51, "data_4", data_4.value);

		// all variables are declared to null
		Var<Integer> nd_1 = null;
		Var<Double[]> copy_0 = null;
		Var<Double> diff_0 = null;
		Var<Integer> i_1 = null;
		Var<Double> d_0 = null;
		Var<Double> diff_1 = null;
		Var<Double> diff_2 = null;
        
		/* PROGRAM STARTS */
		nd_1 = new Var<Integer>(data_4.value.length);
		Output.record("FFT", "test", 52, "nd_1", nd_1.value);
        // Make duplicate for comparison
        copy_0 = new Var<Double[]>(new Double[nd_1.value]);
		Output.record("FFT", "test", 54, "copy_0", copy_0.value);
        System.arraycopy(data_4.value, 0, copy_0.value, 0, nd_1.value);
        // Transform & invert
        transform(data_4.value);
        inverse(data_4.value);
        // Compute RMS difference.
        diff_0 = new Var<Double>(0.0);
		Output.record("FFT", "test", 60, "diff_0", diff_0.value);
        i_1 = new Var<Integer>(0);
		Output.record("FFT", "test", 60, "i_1", i_1.value);
		while(Phi.Entry(i_1,i_1).value < Phi.Entry(nd_1,nd_1).value) {{
            d_0 = new Var<Double>(Phi.Entry(data_3,data_4).value[Phi.Entry(i_0,i_1).value] - Phi.Entry(copy_-1,copy_0).value[Phi.Entry(i_0,i_1).value]);
				Output.record("FFT", "test", 62, "d_0", d_0.value);
            diff_1 = new Var<Double>(Phi.Entry(diff_0,diff_1).value + Phi.Entry(d_-1,d_0).value * Phi.Entry(d_-1,d_0).value);
				Output.record("FFT", "test", 63, "diff_1", diff_1.value);
        }}
		diff_2 = Phi.Exit(diff_0,diff_1);
		Output.record("FFT", "test", 61, "diff_2", diff_2.value);
        return Math.sqrt(diff_2.value / nd_1.value);
    }

    /**
     * Make a random array of n (complex) elements.
     */
    public static double[] makeRandom(Integer n) {
		// formal parameters
		Var<Integer> n_1 = new Var<Integer>(n);
		Output.record("FFT", "makeRandom", 71, "n_1", n_1.value);

		// all variables are declared to null
		Var<Integer> nd_2 = null;
		Var<Double[]> data_5 = null;
		Var<Integer> i_2 = null;
		Var<Double[]> data_6 = null;
		Var<Double[]> data_7 = null;
        
		/* PROGRAM STARTS */
		nd_2 = new Var<Integer>(2 * n_1.value);
		Output.record("FFT", "makeRandom", 72, "nd_2", nd_2.value);
        data_5 = new Var<Double[]>(new Double[nd_2.value]);
		Output.record("FFT", "makeRandom", 73, "data_5", data_5.value);
        i_2 = new Var<Integer>(0);
		Output.record("FFT", "makeRandom", 73, "i_2", i_2.value);
		while(Phi.Entry(i_2,i_2).value < Phi.Entry(nd_2,nd_2).value)
            {data_6[Phi.Entry(i_1,i_2).value] = new Var<Double[]>(Math.random());
			Output.record("FFT", "makeRandom", 75, "data_6", data_6.value);}
		data_7 = Phi.Exit(data_5,data_6);
		Output.record("FFT", "makeRandom", 74, "data_7", data_7.value);
        return data_7.value;
    }

    /**
     * Simple Test routine.
     */
    public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);
		Output.record("FFT", "main", 82, "args_0", args_0.value);

		// all variables are declared to null
		Var<Integer> n_2 = null;
		Var<Integer> n_3 = null;
		Var<Integer> i_3 = null;
		Var<Integer> n_4 = null;
		Var<Integer> n_5 = null;
        
		/* PROGRAM STARTS */
		if (args_0.value.length == 0) {{
            n_2 = new Var<Integer>(1024);
				Output.record("FFT", "main", 84, "n_2", n_2.value);
            System.out.println("n=" + n_1.value + " => RMS Error=" + test(makeRandom(n_1.value)));
        }}
		n_3 = Phi.If((args_0.value.length == 0),n_2,n_1);
		Output.record("FFT", "main", 83, "n_3", n_3.value);
        i_3 = new Var<Integer>(0);
		Output.record("FFT", "main", 86, "i_3", i_3.value);
		while(Phi.Entry(i_3,i_3).value < Phi.Entry(args_0,args_0).value.length) {{
            n_4 = new Var<Integer>(Integer.parseInt(Phi.Entry(args_-1,args_0).value[Phi.Entry(i_2,i_3).value]));
				Output.record("FFT", "main", 88, "n_4", n_4.value);
            System.out.println("n=" + Phi.Entry(n_3,n_4).value + " => RMS Error=" + test(makeRandom(Phi.Entry(n_3,n_4).value)));
        }}
		n_5 = Phi.Exit(n_3,n_4);
		Output.record("FFT", "main", 87, "n_5", n_5.value);
    }
    /* ______________________________________________________________________ */

    protected static int log2(Integer n) {
		// formal parameters
		Var<Integer> n_6 = new Var<Integer>(n);
		Output.record("FFT", "log2", 94, "n_6", n_6.value);

		// all variables are declared to null
		Var<Integer> log_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> k_1 = null;
		Var<Integer> k_2 = null;
		Var<Integer> log_1 = null;
        
		/* PROGRAM STARTS */
		log_0 = new Var<Integer>(0);
		Output.record("FFT", "log2", 95, "log_0", log_0.value);
        k_0 = new Var<Integer>(1);
		Output.record("FFT", "log2", 95, "k_0", k_0.value);
		while(Phi.Entry(k_0,k_1).value < Phi.Entry(n_6,n_6).value)
            	k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value * 2);
		Output.record("FFT", "log2", 96, "k_1", k_1.value);
		k_2 = Phi.Exit(k_0,k_1);
		Output.record("FFT", "log2", 96, "k_2", k_2.value);
			log_1 = new Var<Integer>(log_0.value + 1);
		Output.record("FFT", "log2", 96, "log_1", log_1.value);
		{;}
        if (n_6.value != (1 << log_1.value))
            {throw new Error("FFT: Data length is not a power of 2!: " + n_6.value);}
        return log_1.value;
    }

    protected static void transform_internal(Double[] data, Integer direction) {
		// formal parameters
		Var<Double[]> data_8 = new Var<Double[]>(data);
		Output.record("FFT", "transform_internal", 103, "data_8", data_8.value);
		Var<Integer> direction_0 = new Var<Integer>(direction);
		Output.record("FFT", "transform_internal", 103, "direction_0", direction_0.value);

		// all variables are declared to null
		Var<Integer> n_7 = null;
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
		Var<Integer> i_4 = null;
		Var<Integer> j_0 = null;
		Var<Double> wd_real_0 = null;
		Var<Double> wd_imag_0 = null;
		Var<Double[]> data_9 = null;
		Var<Double[]> data_10 = null;
		Var<Double[]> data_11 = null;
		Var<Double[]> data_12 = null;
		Var<Double[]> data_13 = null;
		Var<Integer> i_5 = null;
		Var<Integer> a_0 = null;
		Var<Double> tmp_real_0 = null;
		Var<Double> tmp_imag_0 = null;
		Var<Double> w_real_1 = null;
		Var<Double> w_imag_1 = null;
		Var<Integer> b_1 = null;
		Var<Integer> i_6 = null;
		Var<Integer> j_1 = null;
		Var<Double> z1_real_0 = null;
		Var<Double> z1_imag_0 = null;
		Var<Double> wd_real_1 = null;
		Var<Double> wd_imag_1 = null;
		Var<Double[]> data_14 = null;
		Var<Double[]> data_15 = null;
		Var<Double[]> data_16 = null;
		Var<Double[]> data_17 = null;
		Var<Double[]> data_18 = null;
		Var<Double> wd_real_2 = null;
		Var<Integer> i_7 = null;
		Var<Integer> j_2 = null;
		Var<Double> wd_imag_2 = null;
		Var<Double[]> data_19 = null;
		Var<Double> wd_real_3 = null;
		Var<Integer> b_2 = null;
		Var<Double> w_real_2 = null;
		Var<Integer> i_8 = null;
		Var<Integer> j_3 = null;
		Var<Double> wd_imag_3 = null;
		Var<Double> w_imag_2 = null;
		Var<Integer> bit_1 = null;
		Var<Integer> dual_1 = null;
		Var<Double[]> data_20 = null;
		Var<Integer> bit_2 = null;
		Var<Integer> dual_2 = null;
		Var<Integer> i_9 = null;
        
		/* PROGRAM STARTS */
		if (data_8.value.length == 0)
            {return;}
        n_7 = new Var<Integer>(data_8.value.length / 2);
		Output.record("FFT", "transform_internal", 106, "n_7", n_7.value);
        if (n_7.value == 1)
            {return;} // Identity operation!
        logn_0 = new Var<Integer>(log2(n_7.value));
		Output.record("FFT", "transform_internal", 109, "logn_0", logn_0.value);

        /* bit reverse the input data for decimation in time algorithm */
        bitreverse(data_8.value);

        /* apply fft recursion */
        /* this loop executed log2(N) times */
        bit_0 = new Var<Integer>(0);
		Output.record("FFT", "transform_internal", 116, "bit_0", bit_0.value);
		dual_0 = new Var<Integer>(1);
		Output.record("FFT", "transform_internal", 116, "dual_0", dual_0.value);
		while(Phi.Entry(bit_0,bit_1).value < Phi.Entry(logn_0,logn_0).value) {{
            w_real_0 = new Var<Double>(1.0);
				Output.record("FFT", "transform_internal", 118, "w_real_0", w_real_0.value);
            w_imag_0 = new Var<Double>(0.0);
				Output.record("FFT", "transform_internal", 118, "w_imag_0", w_imag_0.value);

            theta_0 = new Var<Double>(2.0 * Phi.Entry(direction_-1,direction_0).value * Math.PI / (2.0 * (double) Phi.Entry(dual_-1,dual_1).value));
				Output.record("FFT", "transform_internal", 120, "theta_0", theta_0.value);
            s_0 = new Var<Double>(Math.sin(Phi.Entry(theta_-1,theta_0).value));
				Output.record("FFT", "transform_internal", 121, "s_0", s_0.value);
            t_0 = new Var<Double>(Math.sin(Phi.Entry(theta_-1,theta_0).value / 2.0));
				Output.record("FFT", "transform_internal", 122, "t_0", t_0.value);
            s2_0 = new Var<Double>(2.0 * Phi.Entry(t_-1,t_0).value * Phi.Entry(t_-1,t_0).value);
				Output.record("FFT", "transform_internal", 123, "s2_0", s2_0.value);

            /* a = 0 */
            b_0 = new Var<Integer>(0);
				Output.record("FFT", "transform_internal", 125, "b_0", b_0.value);
			while(Phi.Entry(b_0,b_0).value < Phi.Entry(n_7,n_7).value) {{
                i_4 = new Var<Integer>(2 * Phi.Entry(b_-1,b_0).value);
						Output.record("FFT", "transform_internal", 127, "i_4", i_4.value);
                j_0 = new Var<Integer>(2 * (Phi.Entry(b_-1,b_0).value + Phi.Entry(dual_-1,dual_0).value));
						Output.record("FFT", "transform_internal", 128, "j_0", j_0.value);

                wd_real_0 = new Var<Double>(Phi.Entry(data_7,data_12).value[Phi.Entry(j_-1,j_0).value]);
						Output.record("FFT", "transform_internal", 130, "wd_real_0", wd_real_0.value);
                wd_imag_0 = new Var<Double>(Phi.Entry(data_7,data_12).value[Phi.Entry(j_-1,j_0).value + 1]);
						Output.record("FFT", "transform_internal", 131, "wd_imag_0", wd_imag_0.value);

                data_9[Phi.Entry(j_-1,j_0).value] = new Var<Double[]>(Phi.Entry(data_8,data_12).value[Phi.Entry(i_3,i_4).value] - Phi.Entry(wd_real_-1,wd_real_0).value);
						Output.record("FFT", "transform_internal", 133, "data_9", data_9.value);
                data_10[Phi.Entry(j_-1,j_0).value + 1] = new Var<Double[]>(data_9.value[Phi.Entry(i_3,i_4).value + 1] - Phi.Entry(wd_imag_-1,wd_imag_0).value);
						Output.record("FFT", "transform_internal", 134, "data_10", data_10.value);
                data_11[Phi.Entry(i_3,i_4).value] = new Var<Double[]>(data_10.value + Phi.Entry(wd_real_-1,wd_real_0).value);
						Output.record("FFT", "transform_internal", 135, "data_11", data_11.value);
                data_12[Phi.Entry(i_3,i_4).value + 1] = new Var<Double[]>(data_11.value + Phi.Entry(wd_imag_-1,wd_imag_0).value);
						Output.record("FFT", "transform_internal", 136, "data_12", data_12.value);
            }}
				data_13 = Phi.Exit(data_8,data_12);
				Output.record("FFT", "transform_internal", 126, "data_13", data_13.value);
				i_5 = Phi.Exit(i_3,i_4);
				Output.record("FFT", "transform_internal", 126, "i_5", i_5.value);

            /* a = 1 .. (dual-1) */
            a_0 = new Var<Integer>(1);
				Output.record("FFT", "transform_internal", 139, "a_0", a_0.value);
			while(Phi.Entry(a_0,a_0).value < Phi.Entry(dual_0,dual_0).value) {{
                /* trignometric recurrence for w-> exp(i theta) w */
                {
                    tmp_real_0 = new Var<Double>(Phi.Entry(w_real_-1,w_real_1).value - Phi.Entry(s_-1,s_0).value * Phi.Entry(w_imag_-1,w_imag_1).value - Phi.Entry(s2_-1,s2_0).value * Phi.Entry(w_real_-1,w_real_1).value);
							Output.record("FFT", "transform_internal", 143, "tmp_real_0", tmp_real_0.value);
                    tmp_imag_0 = new Var<Double>(Phi.Entry(w_imag_-1,w_imag_1).value + Phi.Entry(s_-1,s_0).value * Phi.Entry(w_real_-1,w_real_1).value - Phi.Entry(s2_-1,s2_0).value * Phi.Entry(w_imag_-1,w_imag_1).value);
							Output.record("FFT", "transform_internal", 144, "tmp_imag_0", tmp_imag_0.value);
                    w_real_1 = new Var<Double>(Phi.Entry(tmp_real_-1,tmp_real_0).value);
							Output.record("FFT", "transform_internal", 145, "w_real_1", w_real_1.value);
                    w_imag_1 = new Var<Double>(Phi.Entry(tmp_imag_-1,tmp_imag_0).value);
							Output.record("FFT", "transform_internal", 145, "w_imag_1", w_imag_1.value);
                }
                b_1 = new Var<Integer>(0);
						Output.record("FFT", "transform_internal", 147, "b_1", b_1.value);
				while(Phi.Entry(b_1,b_1).value < Phi.Entry(n_7,n_7).value) {{
                    i_6 = new Var<Integer>(2 * (Phi.Entry(b_0,b_1).value + Phi.Entry(a_-1,a_0).value));
								Output.record("FFT", "transform_internal", 149, "i_6", i_6.value);
                    j_1 = new Var<Integer>(2 * (Phi.Entry(b_0,b_1).value + Phi.Entry(a_-1,a_0).value + Phi.Entry(dual_-1,dual_0).value));
								Output.record("FFT", "transform_internal", 150, "j_1", j_1.value);

                    z1_real_0 = new Var<Double>(Phi.Entry(data_12,data_17).value[Phi.Entry(j_0,j_1).value]);
								Output.record("FFT", "transform_internal", 152, "z1_real_0", z1_real_0.value);
                    z1_imag_0 = new Var<Double>(Phi.Entry(data_12,data_17).value[Phi.Entry(j_0,j_1).value + 1]);
								Output.record("FFT", "transform_internal", 153, "z1_imag_0", z1_imag_0.value);

                    wd_real_1 = new Var<Double>(Phi.Entry(w_real_0,w_real_1).value * Phi.Entry(z1_real_-1,z1_real_0).value - Phi.Entry(w_imag_0,w_imag_1).value * Phi.Entry(z1_imag_-1,z1_imag_0).value);
								Output.record("FFT", "transform_internal", 155, "wd_real_1", wd_real_1.value);
                    wd_imag_1 = new Var<Double>(Phi.Entry(w_real_0,w_real_1).value * Phi.Entry(z1_imag_-1,z1_imag_0).value + Phi.Entry(w_imag_0,w_imag_1).value * Phi.Entry(z1_real_-1,z1_real_0).value);
								Output.record("FFT", "transform_internal", 156, "wd_imag_1", wd_imag_1.value);

                    data_14[Phi.Entry(j_0,j_1).value] = new Var<Double[]>(Phi.Entry(data_13,data_17).value[Phi.Entry(i_5,i_6).value] - Phi.Entry(wd_real_0,wd_real_1).value);
								Output.record("FFT", "transform_internal", 158, "data_14", data_14.value);
                    data_15[Phi.Entry(j_0,j_1).value + 1] = new Var<Double[]>(data_14.value[Phi.Entry(i_5,i_6).value + 1] - Phi.Entry(wd_imag_0,wd_imag_1).value);
								Output.record("FFT", "transform_internal", 159, "data_15", data_15.value);
                    data_16[Phi.Entry(i_5,i_6).value] = new Var<Double[]>(data_15.value + Phi.Entry(wd_real_0,wd_real_1).value);
								Output.record("FFT", "transform_internal", 160, "data_16", data_16.value);
                    data_17[Phi.Entry(i_5,i_6).value + 1] = new Var<Double[]>(data_16.value + Phi.Entry(wd_imag_0,wd_imag_1).value);
								Output.record("FFT", "transform_internal", 161, "data_17", data_17.value);
                }}
						data_18 = Phi.Exit(data_13,data_17);
						Output.record("FFT", "transform_internal", 148, "data_18", data_18.value);
						wd_real_2 = Phi.Exit(wd_real_0,wd_real_1);
						Output.record("FFT", "transform_internal", 148, "wd_real_2", wd_real_2.value);
						i_7 = Phi.Exit(i_5,i_6);
						Output.record("FFT", "transform_internal", 148, "i_7", i_7.value);
						j_2 = Phi.Exit(j_0,j_1);
						Output.record("FFT", "transform_internal", 148, "j_2", j_2.value);
						wd_imag_2 = Phi.Exit(wd_imag_0,wd_imag_1);
						Output.record("FFT", "transform_internal", 148, "wd_imag_2", wd_imag_2.value);
            }}
				data_19 = Phi.Exit(data_13,data_18);
				Output.record("FFT", "transform_internal", 140, "data_19", data_19.value);
				wd_real_3 = Phi.Exit(wd_real_0,wd_real_2);
				Output.record("FFT", "transform_internal", 140, "wd_real_3", wd_real_3.value);
				b_2 = Phi.Exit(b_0,b_1);
				Output.record("FFT", "transform_internal", 140, "b_2", b_2.value);
				w_real_2 = Phi.Exit(w_real_0,w_real_1);
				Output.record("FFT", "transform_internal", 140, "w_real_2", w_real_2.value);
				i_8 = Phi.Exit(i_5,i_7);
				Output.record("FFT", "transform_internal", 140, "i_8", i_8.value);
				j_3 = Phi.Exit(j_0,j_2);
				Output.record("FFT", "transform_internal", 140, "j_3", j_3.value);
				wd_imag_3 = Phi.Exit(wd_imag_0,wd_imag_2);
				Output.record("FFT", "transform_internal", 140, "wd_imag_3", wd_imag_3.value);
				w_imag_2 = Phi.Exit(w_imag_0,w_imag_1);
				Output.record("FFT", "transform_internal", 140, "w_imag_2", w_imag_2.value);
        	bit_1 = new Var<Integer>(Phi.Entry(bit_0,bit_1).value + 1);
				Output.record("FFT", "transform_internal", 163, "bit_1", bit_1.value);
			dual_1 = new Var<Integer>(Phi.Entry(dual_0,dual_1).value * 2);
				Output.record("FFT", "transform_internal", 163, "dual_1", dual_1.value);
		}}
		data_20 = Phi.Exit(data_8,data_19);
		Output.record("FFT", "transform_internal", 117, "data_20", data_20.value);
		bit_2 = Phi.Exit(bit_0,bit_1);
		Output.record("FFT", "transform_internal", 117, "bit_2", bit_2.value);
		dual_2 = Phi.Exit(dual_0,dual_1);
		Output.record("FFT", "transform_internal", 117, "dual_2", dual_2.value);
		i_9 = Phi.Exit(i_3,i_8);
		Output.record("FFT", "transform_internal", 117, "i_9", i_9.value);
    }

    protected static void bitreverse(Double[] data) {
		// formal parameters
		Var<Double[]> data_21 = new Var<Double[]>(data);
		Output.record("FFT", "bitreverse", 167, "data_21", data_21.value);

		// all variables are declared to null
		Var<Integer> n_8 = null;
		Var<Integer> nm1_0 = null;
		Var<Integer> i_10 = null;
		Var<Integer> j_4 = null;
		Var<Integer> ii_0 = null;
		Var<Integer> jj_0 = null;
		Var<Integer> k_3 = null;
		Var<Double> tmp_real_1 = null;
		Var<Double> tmp_imag_1 = null;
		Var<Double[]> data_22 = null;
		Var<Double[]> data_23 = null;
		Var<Double[]> data_24 = null;
		Var<Double[]> data_25 = null;
		Var<Double[]> data_26 = null;
		Var<Double> tmp_real_2 = null;
		Var<Double> tmp_imag_2 = null;
		Var<Integer> j_5 = null;
		Var<Integer> k_4 = null;
		Var<Integer> j_6 = null;
		Var<Integer> k_5 = null;
		Var<Integer> j_7 = null;
		Var<Double[]> data_27 = null;
		Var<Double> tmp_real_3 = null;
		Var<Double> tmp_imag_3 = null;
		Var<Integer> j_8 = null;
		Var<Integer> k_6 = null;
        /* This is the Goldrader bit-reversal algorithm */
        
		/* PROGRAM STARTS */
		n_8 = new Var<Integer>(data_21.value.length / 2);
		Output.record("FFT", "bitreverse", 169, "n_8", n_8.value);
        nm1_0 = new Var<Integer>(n_8.value - 1);
		Output.record("FFT", "bitreverse", 170, "nm1_0", nm1_0.value);
        i_10 = new Var<Integer>(0);
		Output.record("FFT", "bitreverse", 171, "i_10", i_10.value);
        j_4 = new Var<Integer>(0);
		Output.record("FFT", "bitreverse", 172, "j_4", j_4.value);
        while(Phi.Entry(i_10,i_10).value < Phi.Entry(nm1_0,nm1_0).value) {{

            //int ii = 2*i;
            ii_0 = new Var<Integer>(Phi.Entry(i_9,i_10).value << 1);
				Output.record("FFT", "bitreverse", 176, "ii_0", ii_0.value);

            //int jj = 2*j;
            jj_0 = new Var<Integer>(Phi.Entry(j_3,j_7).value << 1);
				Output.record("FFT", "bitreverse", 179, "jj_0", jj_0.value);

            //int k = n / 2 ;
            k_3 = new Var<Integer>(Phi.Entry(n_7,n_8).value >> 1);
				Output.record("FFT", "bitreverse", 182, "k_3", k_3.value);

            if (Phi.Entry(i_9,i_10).value < Phi.Entry(j_3,j_7).value) {{
                tmp_real_1 = new Var<Double>(Phi.Entry(data_20,data_26).value[Phi.Entry(ii_-1,ii_0).value]);
						Output.record("FFT", "bitreverse", 185, "tmp_real_1", tmp_real_1.value);
                tmp_imag_1 = new Var<Double>(Phi.Entry(data_20,data_26).value[Phi.Entry(ii_-1,ii_0).value + 1]);
						Output.record("FFT", "bitreverse", 186, "tmp_imag_1", tmp_imag_1.value);
                data_22[Phi.Entry(ii_-1,ii_0).value] = new Var<Double[]>(Phi.Entry(data_21,data_26).value[Phi.Entry(jj_-1,jj_0).value]);
						Output.record("FFT", "bitreverse", 187, "data_22", data_22.value);
                data_23[Phi.Entry(ii_-1,ii_0).value + 1] = new Var<Double[]>(data_22.value[Phi.Entry(jj_-1,jj_0).value + 1]);
						Output.record("FFT", "bitreverse", 188, "data_23", data_23.value);
                data_24[Phi.Entry(jj_-1,jj_0).value] = new Var<Double[]>(Phi.Entry(tmp_real_0,tmp_real_2).value);
						Output.record("FFT", "bitreverse", 189, "data_24", data_24.value);
                data_25[Phi.Entry(jj_-1,jj_0).value + 1] = new Var<Double[]>(Phi.Entry(tmp_imag_0,tmp_imag_2).value);
						Output.record("FFT", "bitreverse", 190, "data_25", data_25.value);
            }}
				data_26 = Phi.If((i < j),data_25,data_21);
				Output.record("FFT", "bitreverse", 184, "data_26", data_26.value);
				tmp_real_2 = Phi.If((i < j),tmp_real_1,tmp_real_0);
				Output.record("FFT", "bitreverse", 184, "tmp_real_2", tmp_real_2.value);
				tmp_imag_2 = Phi.If((i < j),tmp_imag_1,tmp_imag_0);
				Output.record("FFT", "bitreverse", 184, "tmp_imag_2", tmp_imag_2.value);

            while (Phi.Entry(k_3,k_4).value <= Phi.Entry(j_4,j_5).value) {{
                //j = j - k ;
                j_5 = new Var<Integer>(Phi.Entry(j_4,j_5).value - Phi.Entry(k_2,k_4).value);
						Output.record("FFT", "bitreverse", 195, "j_5", j_5.value);

                //k = k / 2 ;
                k_4 = new Var<Integer>(Phi.Entry(k_3,k_4).value >> 1);
						Output.record("FFT", "bitreverse", 198, "k_4", k_4.value);
            }}
				j_6 = Phi.Exit(j_4,j_5);
				Output.record("FFT", "bitreverse", 193, "j_6", j_6.value);
				k_5 = Phi.Exit(k_3,k_4);
				Output.record("FFT", "bitreverse", 193, "k_5", k_5.value);
            j_7 = new Var<Integer>(Phi.Entry(j_6,j_7).value + Phi.Entry(k_4,k_5).value);
				Output.record("FFT", "bitreverse", 200, "j_7", j_7.value);
        }}
		data_27 = Phi.Exit(data_21,data_26);
		Output.record("FFT", "bitreverse", 173, "data_27", data_27.value);
		tmp_real_3 = Phi.Exit(tmp_real_0,tmp_real_2);
		Output.record("FFT", "bitreverse", 173, "tmp_real_3", tmp_real_3.value);
		tmp_imag_3 = Phi.Exit(tmp_imag_0,tmp_imag_2);
		Output.record("FFT", "bitreverse", 173, "tmp_imag_3", tmp_imag_3.value);
		j_8 = Phi.Exit(j_4,j_7);
		Output.record("FFT", "bitreverse", 173, "j_8", j_8.value);
		k_6 = Phi.Exit(k_2,k_5);
		Output.record("FFT", "bitreverse", 173, "k_6", k_6.value);
    }

}

