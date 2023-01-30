package outputs;

public class Test7 {
	
	Var<Integer> x_0;
	Var<Integer> y_0;
	
	public static int min(int a, int b) {
		// formal parameters
		Var<Integer> a_0 = new Var<Integer>(a);
		Output.record("Test7", "min", 7, "a_0", a_0.value);
		Var<Integer> b_0 = new Var<Integer>(b);
		Output.record("Test7", "min", 7, "b_0", b_0.value);

		// all variables are declared to null
		Var<Integer> var1_0 = null;
		Var<Integer> var2_0 = null;
		Var<Integer> a_1 = null;
		Var<Integer> b_1 = null;
		
		/* PROGRAM STARTS */
		var1_0 = new Var<Integer>(a_0.value);
		Output.record("Test7", "min", 9, "var1_0", var1_0.value);
		var2_0 = new Var<Integer>(b_0.value);
		Output.record("Test7", "min", 10, "var2_0", var2_0.value);
		a_1 = new Var<Integer>(0);
		Output.record("Test7", "min", 11, "a_1", a_1.value);
		b_1 = new Var<Integer>(0);
		Output.record("Test7", "min", 12, "b_1", b_1.value);
		if(var1_0.value < var2_0.value) {
			return var1_0.value;
		}
		else {
			return var2_0.value;
		}
	}
	
	public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);
		Output.record("Test7", "main", 20, "args_0", args_0.value);

		// all variables are declared to null
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		
		/* PROGRAM STARTS */
		x_1 = new Var<Integer>(5);
		Output.record("Test7", "main", 22, "x_1", x_1.value);
		y_1 = new Var<Integer>(2 + x_1.value);
		Output.record("Test7", "main", 23, "y_1", y_1.value);
		System.out.println(min(x_1.value, y_1.value));
	}
}
