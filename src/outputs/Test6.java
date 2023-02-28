package outputs;

// EDGE CASE REMINDER: alternative assignment operators (+=, -=, etc.) are not functional with Phi.Entry functions
// how important is runtime? would it be bad to go through the input file once beforehand to "pre-process" the code?
	// turn all for loops into while loops
	// turn all assignment operators into '=' operators
	// this would make life much easier

// tests for loops
public class Test6 {
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> j_0 = null;
		Var<Integer> y_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> y_1 = null;
		Var<Integer> j_1 = null;
		Var<Integer> i_1 = null;
		Var<Integer> x_3 = null;
		Var<Integer> i_2 = null;
		Var<Integer> j_2 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(1);
		Output.record("Test6", "main", 12, "x_0", x_0.value);
		i_0 = new Var<Integer>(x_0.value - 12);
		Output.record("Test6", "main", 13, "i_0", i_0.value);
		j_0 = new Var<Integer>(2 - x_0.value);
		Output.record("Test6", "main", 12, "j_0", j_0.value);
		while(Phi.Entry(i_0,i_1).value < 10) {
			y_0 = new Var<Integer>(1);
			Output.record("Test6", "main", 14, "y_0", y_0.value);
			x_1 = new Var<Integer>(1);
			Output.record("Test6", "main", 15, "x_1", x_1.value);
			x_2 = new Var<Integer>(x_1.value + y_0.value);
			Output.record("Test6", "main", 16, "x_2", x_2.value);
			y_1 = new Var<Integer>(2);
			Output.record("Test6", "main", 17, "y_1", y_1.value);
			j_1 = new Var<Integer>(Phi.Entry(j_0,j_1).value - Phi.Entry(i_0,i_1).value);
			Output.record("Test6", "main", 17, "j_1", j_1.value);
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("Test6", "main", 17, "i_1", i_1.value);
		}
		x_3 = Phi.Exit(x_0,x_2);
		Output.record("Test6", "main", 13, "x_3", x_3.value);
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("Test6", "main", 13, "i_2", i_2.value);
		j_2 = Phi.Exit(j_0,j_1);
		Output.record("Test6", "main", 13, "j_2", j_2.value);
		System.out.println(x_3.value);
	}
}
