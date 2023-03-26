package outputs.Test_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


// tests basic SSA and a basic if/else statement
public class Test_Faulty {
    public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
        
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>((0));
		Output.record("Test", "main", 6, "x_0", x_0.value);
    }
}
