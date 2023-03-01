package outputs.Test1_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


// tests different declaration types, and an if statement with no else
public class Test1 {
	public static void main(String[] args) {
		Output.newExecution("Test1");

		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<String> y_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
		Output.record("Test1", "main", 6, "x_0", x_0.value);
		y_0 = new Var<String>("hello");
		Output.record("Test1", "main", 7, "y_0", y_0.value);
		if(y_0.value.equals("bye")) {
			x_1 = new Var<Integer>(1);
			Output.record("Test1", "main", 9, "x_1", x_1.value);
		}
		x_2 = Phi.If((y_0.value.equals("bye")),x_1,x_0);
		Output.record("Test1", "main", 8, "x_2", x_2.value);
		System.out.println(y_0.value + x_2.value);
	}
}
