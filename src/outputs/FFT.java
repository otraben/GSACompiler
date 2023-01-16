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

    public static final double num_flops(int N) {
		// formal parameters
		Var<Integer> N_0 = new Var<Integer>(N);

		// all variables are declared to null
		Var<Double> Nd_0 = null;
		Var<Double> logN_0 = null;
        
		/* PROGRAM STARTS */
		Nd_0 = new Var<Double>((double) N_0.value);
        logN_0 = new Var<Double>((double) log2(N_0.value));

        return (5.0 * Nd_0.value - 2) * logN_0.value + 2 * (Nd_0.value + 1);
    }

    /**
     * Compute Fast Fourier Transform of (complex) data, in place.
     */
    public static void transform(double data[]) {
		// formal parameters
		Var<Double> data[]_0 = new Var<Double>(data[]);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		transform_internal(data, -1);
    }

    /**
     * Compute Inverse Fast Fourier Transform of (complex) data, in place.
     */
    public static void inverse(double data[]) {
		// formal parameters
		Var<Double> data[]_1 = new Var<Double>(data[]);

		// all variables are declared to null
		Var<Integer> nd_0 = null;
		Var<Integer> n_0 = null;
		Var<Double> norm_0 = null;
		Var<Integer> i_0 = null;
		Var<null> data_0 = null;
        
		/* PROGRAM STARTS */
		transform_internal(data, +1);
        // Normalize
        nd_0 = new Var<Integer>(data.length);
        n_0 = new Var<Integer>(nd_0.value / 2);
        norm_0 = new Var<Double>(1 / ((double) n_0.value));
        i_0 = new Var<Integer>(0);
		while(Phi.Entry(i_0,i_0).value < Phi.Entry(nd_0,nd_0).value)
            data_0[Phi.Entry(i_-1,i_0).value] = new Var<null>(Phi.Entry(data_-1,data_0).value * Phi.Entry(norm_-1,norm_0).value);
    }

    /**
     * Accuracy check on FFT of data. Make a copy of data, Compute the FFT, then
     * the inverse and compare to the original.  Returns the rms difference.
     */
    public static double test(double data[]) {
		// formal parameters
		Var<Double> data[]_2 = new Var<Double>(data[]);

		// all variables are declared to null
		Var<Integer> nd_1 = null;
		Var<Double> copy_0 = null;
		Var<Double> diff_0 = null;
		Var<Integer> i_1 = null;
		Var<Double> d_0 = null;
		Var<Double> diff_1 = null;
		Var<Double> diff_2 = null;
        
		/* PROGRAM STARTS */
		nd_1 = new Var<Integer>(data_0.value.length);
        // Make duplicate for comparison
        copy_0[] = new Var<Double>(new double[nd_1.value]);
        System.arraycopy(data_0.value, 0, copy_0.value, 0, nd_1.value);
        // Transform & invert
        transform(data_0.value);
        inverse(data_0.value);
        // Compute RMS difference.
        diff_0 = new Var<Double>(0.0);
        i_1 = new Var<Integer>(0);
		while(Phi.Entry(i_1,i_1).value < Phi.Entry(nd_1,nd_1).value) {
            d_0 = new Var<Double>(Phi.Entry(data_-1,data_0).value[Phi.Entry(i_0,i_1).value] - Phi.Entry(copy_-1,copy_0).value[Phi.Entry(i_0,i_1).value]);
            diff_1 = new Var<Double>(Phi.Entry(diff_0,diff_1).value + Phi.Entry(d_-1,d_0).value * Phi.Entry(d_-1,d_0).value);
        }
		diff_2 = Phi.Exit(diff_0,diff_1);
        return Math.sqrt(diff_2.value / nd_1.value);
    }

    /**
     * Make a random array of n (complex) elements.
     */
    public static double[] makeRandom(int n) {
		// formal parameters
		Var<Integer> n_1 = new Var<Integer>(n);

		// all variables are declared to null
		Var<Integer> nd_2 = null;
		Var<Double> data_1 = null;
		Var<Integer> i_2 = null;
		Var<Double> data_2 = null;
		Var<Double> data_3 = null;
        
		/* PROGRAM STARTS */
		nd_2 = new Var<Integer>(2 * n_1.value);
        data_1[] = new Var<Double>(new double[nd_2.value]);
        i_2 = new Var<Integer>(0);
		while(Phi.Entry(i_2,i_2).value < Phi.Entry(nd_2,nd_2).value)
            data_2[Phi.Entry(i_1,i_2).value] = new Var<Double>(Math.random());
		data_3 = Phi.Exit(data_1,data_2);
        return data_3.value;
    }

    /**
     * Simple Test routine.
     */
    public static void main(String args[]) {
		// formal parameters
		Var<String> args[]_0 = new Var<String>(args[]);

		// all variables are declared to null
		Var<Integer> n_2 = null;
		Var<Integer> n_3 = null;
		Var<Integer> i_3 = null;
		Var<Integer> n_4 = null;
		Var<Integer> n_5 = null;
        
		/* PROGRAM STARTS */
		if (args.length == 0) {
            n_2 = new Var<Integer>(1024);
            System.out.println("n=" + n_1.value + " => RMS Error=" + test(makeRandom(n_1.value)));
        }
		n_3 = Phi.If((args.length == 0),n_2,n_1);
        i_3 = new Var<Integer>(0);
		while(Phi.Entry(i_3,i_3).value < args.length) {
            n_4 = new Var<Integer>(Integer.parseInt(args[Phi.Entry(i_2,i_3).value]));
            System.out.println("n=" + Phi.Entry(n_3,n_4).value + " => RMS Error=" + test(makeRandom(Phi.Entry(n_3,n_4).value)));
        }
		n_5 = Phi.Exit(n_3,n_4);
    }
    /* ______________________________________________________________________ */

    protected static int log2(int n) {
		// formal parameters
		Var<Integer> n_6 = new Var<Integer>(n);

		// all variables are declared to null
		Var<Integer> log_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> k_1 = null;
		Var<Integer> k_2 = null;
		Var<Integer> log_1 = null;
        
		/* PROGRAM STARTS */
		log_0 = new Var<Integer>(0);
        k_0 = new Var<Integer>(1);
		while(Phi.Entry(k_0,k_1).value < Phi.Entry(n_6,n_6).value)
            	k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value * 2);
		k_2 = Phi.Exit(k_0,k_1);
			log_1 = new Var<Integer>(log_0.value + 1);
		;
        if (n_6.value != (1 << log_1.value))
            throw new Error("FFT: Data length is not a power of 2!: " + n_6.value);
        return log_1.value;
    }

    protected static void transform_internal(double data[], int direction) {
		// formal parameters
		Var<Double> data[]_3 = new Var<Double>(data[]);
		Var<Integer> direction_0 = new Var<Integer>(direction);

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
		Var<Double> data_4 = null;
		Var<Double> data_5 = null;
		Var<Double> data_6 = null;
		Var<Double> data_7 = null;
		Var<Double> data_8 = null;
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
		Var<Double> data_9 = null;
		Var<Double> data_10 = null;
		Var<Double> data_11 = null;
		Var<Double> data_12 = null;
		Var<Double> data_13 = null;
		Var<Double> wd_real_2 = null;
		Var<Integer> i_7 = null;
		Var<Integer> j_2 = null;
		Var<Double> wd_imag_2 = null;
		Var<Double> data_14 = null;
		Var<Double> wd_real_3 = null;
		Var<Integer> b_2 = null;
		Var<Double> w_real_2 = null;
		Var<Integer> i_8 = null;
		Var<Integer> j_3 = null;
		Var<Double> wd_imag_3 = null;
		Var<Double> w_imag_2 = null;
		Var<Integer> bit_1 = null;
		Var<Integer> dual_1 = null;
		Var<Double> data_15 = null;
		Var<Integer> bit_2 = null;
		Var<Integer> dual_2 = null;
		Var<Integer> i_9 = null;
        
		/* PROGRAM STARTS */
		if (data_3.value.length == 0)
            return;
        n_7 = new Var<Integer>(data_3.value.length / 2);
        if (n_7.value == 1)
            return; // Identity operation!
        logn_0 = new Var<Integer>(log2(n_7.value));

        /* bit reverse the input data for decimation in time algorithm */
        bitreverse(data_3.value);

        /* apply fft recursion */
        /* this loop executed log2(N) times */
        bit_0 = new Var<Integer>(0);
		dual_0 = new Var<Integer>(1);
		while(Phi.Entry(bit_0,bit_1).value < Phi.Entry(logn_0,logn_0).value) {
            w_real_0 = new Var<Double>(1.0);
            w_imag_0 = new Var<Double>(0.0);

            theta_0 = new Var<Double>(2.0 * Phi.Entry(direction_-1,direction_0).value * Math.PI / (2.0 * (double) Phi.Entry(dual_-1,dual_1).value));
            s_0 = new Var<Double>(Math.sin(Phi.Entry(theta_-1,theta_0).value));
            t_0 = new Var<Double>(Math.sin(Phi.Entry(theta_-1,theta_0).value / 2.0));
            s2_0 = new Var<Double>(2.0 * Phi.Entry(t_-1,t_0).value * Phi.Entry(t_-1,t_0).value);

            /* a = 0 */
            b_0 = new Var<Integer>(0);
			while(Phi.Entry(b_0,b_0).value < Phi.Entry(n_7,n_7).value) {
                i_4 = new Var<Integer>(2 * Phi.Entry(b_-1,b_0).value);
                j_0 = new Var<Integer>(2 * (Phi.Entry(b_-1,b_0).value + Phi.Entry(dual_-1,dual_0).value));

                wd_real_0 = new Var<Double>(Phi.Entry(data_2,data_7).value[Phi.Entry(j_-1,j_0).value]);
                wd_imag_0 = new Var<Double>(Phi.Entry(data_2,data_7).value[Phi.Entry(j_-1,j_0).value + 1]);

                data_4[Phi.Entry(j_-1,j_0).value] = new Var<Double>(Phi.Entry(data_3,data_7).value[Phi.Entry(i_3,i_4).value] - Phi.Entry(wd_real_-1,wd_real_0).value);
                data_5[Phi.Entry(j_-1,j_0).value + 1] = new Var<Double>(data_4.value[Phi.Entry(i_3,i_4).value + 1] - Phi.Entry(wd_imag_-1,wd_imag_0).value);
                data_6[Phi.Entry(i_3,i_4).value] = new Var<Double>(data_5.value + Phi.Entry(wd_real_-1,wd_real_0).value);
                data_7[Phi.Entry(i_3,i_4).value + 1] = new Var<Double>(data_6.value + Phi.Entry(wd_imag_-1,wd_imag_0).value);
            }
			data_8 = Phi.Exit(data_3,data_7);
			i_5 = Phi.Exit(i_3,i_4);

            /* a = 1 .. (dual-1) */
            a_0 = new Var<Integer>(1);
			while(Phi.Entry(a_0,a_0).value < Phi.Entry(dual_0,dual_0).value) {
                /* trignometric recurrence for w-> exp(i theta) w */
                {
                    tmp_real_0 = new Var<Double>(Phi.Entry(w_real_-1,w_real_1).value - Phi.Entry(s_-1,s_0).value * Phi.Entry(w_imag_-1,w_imag_1).value - Phi.Entry(s2_-1,s2_0).value * Phi.Entry(w_real_-1,w_real_1).value);
                    tmp_imag_0 = new Var<Double>(Phi.Entry(w_imag_-1,w_imag_1).value + Phi.Entry(s_-1,s_0).value * Phi.Entry(w_real_-1,w_real_1).value - Phi.Entry(s2_-1,s2_0).value * Phi.Entry(w_imag_-1,w_imag_1).value);
                    w_real_1 = new Var<Double>(Phi.Entry(tmp_real_-1,tmp_real_0).value);
                    w_imag_1 = new Var<Double>(Phi.Entry(tmp_imag_-1,tmp_imag_0).value);
                }
                b_1 = new Var<Integer>(0);
				while(Phi.Entry(b_1,b_1).value < Phi.Entry(n_7,n_7).value) {
                    i_6 = new Var<Integer>(2 * (Phi.Entry(b_0,b_1).value + Phi.Entry(a_-1,a_0).value));
                    j_1 = new Var<Integer>(2 * (Phi.Entry(b_0,b_1).value + Phi.Entry(a_-1,a_0).value + Phi.Entry(dual_-1,dual_0).value));

                    z1_real_0 = new Var<Double>(Phi.Entry(data_7,data_12).value[Phi.Entry(j_0,j_1).value]);
                    z1_imag_0 = new Var<Double>(Phi.Entry(data_7,data_12).value[Phi.Entry(j_0,j_1).value + 1]);

                    wd_real_1 = new Var<Double>(Phi.Entry(w_real_0,w_real_1).value * Phi.Entry(z1_real_-1,z1_real_0).value - Phi.Entry(w_imag_0,w_imag_1).value * Phi.Entry(z1_imag_-1,z1_imag_0).value);
                    wd_imag_1 = new Var<Double>(Phi.Entry(w_real_0,w_real_1).value * Phi.Entry(z1_imag_-1,z1_imag_0).value + Phi.Entry(w_imag_0,w_imag_1).value * Phi.Entry(z1_real_-1,z1_real_0).value);

                    data_9[Phi.Entry(j_0,j_1).value] = new Var<Double>(Phi.Entry(data_8,data_12).value[Phi.Entry(i_5,i_6).value] - Phi.Entry(wd_real_0,wd_real_1).value);
                    data_10[Phi.Entry(j_0,j_1).value + 1] = new Var<Double>(data_9.value[Phi.Entry(i_5,i_6).value + 1] - Phi.Entry(wd_imag_0,wd_imag_1).value);
                    data_11[Phi.Entry(i_5,i_6).value] = new Var<Double>(data_10.value + Phi.Entry(wd_real_0,wd_real_1).value);
                    data_12[Phi.Entry(i_5,i_6).value + 1] = new Var<Double>(data_11.value + Phi.Entry(wd_imag_0,wd_imag_1).value);
                }
				data_13 = Phi.Exit(data_8,data_12);
				wd_real_2 = Phi.Exit(wd_real_0,wd_real_1);
				i_7 = Phi.Exit(i_5,i_6);
				j_2 = Phi.Exit(j_0,j_1);
				wd_imag_2 = Phi.Exit(wd_imag_0,wd_imag_1);
            }
			data_14 = Phi.Exit(data_8,data_13);
			wd_real_3 = Phi.Exit(wd_real_0,wd_real_2);
			b_2 = Phi.Exit(b_0,b_1);
			w_real_2 = Phi.Exit(w_real_0,w_real_1);
			i_8 = Phi.Exit(i_5,i_7);
			j_3 = Phi.Exit(j_0,j_2);
			wd_imag_3 = Phi.Exit(wd_imag_0,wd_imag_2);
			w_imag_2 = Phi.Exit(w_imag_0,w_imag_1);
        	bit_1 = new Var<Integer>(Phi.Entry(bit_0,bit_1).value + 1);
			dual_1 = new Var<Integer>(Phi.Entry(dual_0,dual_1).value * 2);
		}
		data_15 = Phi.Exit(data_3,data_14);
		bit_2 = Phi.Exit(bit_0,bit_1);
		dual_2 = Phi.Exit(dual_0,dual_1);
		i_9 = Phi.Exit(i_3,i_8);
    }

    protected static void bitreverse(double data[]) {
		// formal parameters
		Var<Double> data[]_4 = new Var<Double>(data[]);

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
		Var<Double> data_16 = null;
		Var<Double> data_17 = null;
		Var<Double> data_18 = null;
		Var<Double> data_19 = null;
		Var<Double> data_20 = null;
		Var<Double> tmp_real_2 = null;
		Var<Double> tmp_imag_2 = null;
		Var<Integer> j_5 = null;
		Var<Integer> k_4 = null;
		Var<Integer> j_6 = null;
		Var<Integer> k_5 = null;
		Var<Integer> j_7 = null;
		Var<Double> data_21 = null;
		Var<Double> tmp_real_3 = null;
		Var<Double> tmp_imag_3 = null;
		Var<Integer> j_8 = null;
		Var<Integer> k_6 = null;
        /* This is the Goldrader bit-reversal algorithm */
        
		/* PROGRAM STARTS */
		n_8 = new Var<Integer>(data_15.value.length / 2);
        nm1_0 = new Var<Integer>(n_8.value - 1);
        i_10 = new Var<Integer>(0);
        j_4 = new Var<Integer>(0);
        while(Phi.Entry(i_10,i_10).value < Phi.Entry(nm1_0,nm1_0).value) {

            //int ii = 2*i;
            ii_0 = new Var<Integer>(Phi.Entry(i_9,i_10).value << 1);

            //int jj = 2*j;
            jj_0 = new Var<Integer>(Phi.Entry(j_3,j_7).value << 1);

            //int k = n / 2 ;
            k_3 = new Var<Integer>(Phi.Entry(n_7,n_8).value >> 1);

            if (Phi.Entry(i_9,i_10).value < Phi.Entry(j_3,j_7).value) {
                tmp_real_1 = new Var<Double>(Phi.Entry(data_14,data_20).value[Phi.Entry(ii_-1,ii_0).value]);
                tmp_imag_1 = new Var<Double>(Phi.Entry(data_14,data_20).value[Phi.Entry(ii_-1,ii_0).value + 1]);
                data_16[Phi.Entry(ii_-1,ii_0).value] = new Var<Double>(Phi.Entry(data_15,data_20).value[Phi.Entry(jj_-1,jj_0).value]);
                data_17[Phi.Entry(ii_-1,ii_0).value + 1] = new Var<Double>(data_16.value[Phi.Entry(jj_-1,jj_0).value + 1]);
                data_18[Phi.Entry(jj_-1,jj_0).value] = new Var<Double>(Phi.Entry(tmp_real_0,tmp_real_2).value);
                data_19[Phi.Entry(jj_-1,jj_0).value + 1] = new Var<Double>(Phi.Entry(tmp_imag_0,tmp_imag_2).value);
            }
			data_20 = Phi.If((i < j),data_19,data_15);
			tmp_real_2 = Phi.If((i < j),tmp_real_1,tmp_real_0);
			tmp_imag_2 = Phi.If((i < j),tmp_imag_1,tmp_imag_0);

            while (Phi.Entry(k_3,k_4).value <= Phi.Entry(j_4,j_5).value) {
                //j = j - k ;
                j_5 = new Var<Integer>(Phi.Entry(j_4,j_5).value - Phi.Entry(k_2,k_4).value);

                //k = k / 2 ;
                k_4 = new Var<Integer>(Phi.Entry(k_3,k_4).value >> 1);
            }
			j_6 = Phi.Exit(j_4,j_5);
			k_5 = Phi.Exit(k_3,k_4);
            j_7 = new Var<Integer>(Phi.Entry(j_6,j_7).value + Phi.Entry(k_4,k_5).value);
        }
		data_21 = Phi.Exit(data_15,data_20);
		tmp_real_3 = Phi.Exit(tmp_real_0,tmp_real_2);
		tmp_imag_3 = Phi.Exit(tmp_imag_0,tmp_imag_2);
		j_8 = Phi.Exit(j_4,j_7);
		k_6 = Phi.Exit(k_2,k_5);
    }

}

