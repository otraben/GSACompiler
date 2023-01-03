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
		Var<String[]> args_0 = new Var<String[]>(args);

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> i_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> i_2 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(1);
		i_0 = new Var<Integer>(x_0.value - 12);
		while(Phi.Entry(i_0,i_1).value < 10) {
			x_1 = new Var<Integer>(Phi.Entry(x_0,x_1).value + 1);
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
		}
		x_2 = Phi.Exit(x_0,x_1);
		i_2 = Phi.Exit(i_0,i_1);
		System.out.println(x_2.value);
	}
}
