package outputs;
import java.util.ArrayList;

public class Sum {
  protected static int log2(int n) {
		// formal parameters
		Var<Integer> n_0 = new Var<Integer>(n);
		Output.record("Sum", "log2", 5, "n_0", n_0.value);

		// all variables are declared to null
		Var<Integer> log_0 = null;
		Var<Integer> k_0 = null;
		Var<Integer> log_1 = null;
		Var<Integer> k_1 = null;
		Var<Integer> log_2 = null;
		Var<Integer> k_2 = null;
    
		/* PROGRAM STARTS */
		log_0 = new Var<Integer>(0);
		Output.record("Sum", "log2", 6, "log_0", log_0.value);
    k_0 = new Var<Integer>(1);
		Output.record("Sum", "log2", 6, "k_0", k_0.value);
		while(Phi.Entry(k_0,k_1).value < Phi.Entry(n_0,n_0).value){
			
      ;
			log_1 = new Var<Integer>(Phi.Entry(log_0,log_1).value + 1);
			Output.record("Sum", "log2", 6, "log_1", log_1.value);
			k_1 = new Var<Integer>(Phi.Entry(k_0,k_1).value * 2);
			Output.record("Sum", "log2", 7, "k_1", k_1.value);
		}
		log_2 = Phi.Exit(log_0,log_1);
		Output.record("Sum", "log2", 7, "log_2", log_2.value);
		k_2 = Phi.Exit(k_0,k_1);
		Output.record("Sum", "log2", 7, "k_2", k_2.value);
    if (n_0.value != (1 << log_2.value))
      {
			throw new Error("FFT: Data length is not a power of 2!: " + n_0.value);
		}
    return log_2.value;
  }
  
  public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
	  
		/* PROGRAM STARTS */
		System.out.println(log2(8));
  }
}