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
		Output.record("Test7", "min", 8, "var1_0", var1_0.value);
		var2_0 = new Var<Integer>(b_0.value);
		Output.record("Test7", "min", 9, "var2_0", var2_0.value);
		a_1 = new Var<Integer>(0);
		Output.record("Test7", "min", 10, "a_1", a_1.value);
		b_1 = new Var<Integer>(0);
		Output.record("Test7", "min", 11, "b_1", b_1.value);
		if(var1_0.value < var2_0.value) {
			return var1_0.value;
		}
		else {
			return var2_0.value;
		}
	}
	
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> y_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> y_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		
		/* PROGRAM STARTS */
		x_1 = new Var<Integer>(5);
		Output.record("Test7", "main", 21, "x_1", x_1.value);
		y_1 = new Var<Integer>(2 + x_1.value);
		Output.record("Test7", "main", 22, "y_1", y_1.value);
		
		do {
			x_2 = new Var<Integer>(Phi.Entry(x_1,x_2).value + 1);
			Output.record("Test7", "main", 25, "x_2", x_2.value);
			y_2 = new Var<Integer>(Phi.Entry(y_1,y_2).value + 1);
			Output.record("Test7", "main", 26, "y_2", y_2.value);
		} while(Phi.Entry(x_2,x_2).value < 10);
		x_3 = Phi.Exit(x_1,x_2);
		Output.record("Test7", "main", 24, "x_3", x_3.value);
		y_3 = Phi.Exit(y_1,y_2);
		Output.record("Test7", "main", 24, "y_3", y_3.value);
		
		while(Phi.Entry(x_3,x_4).value < 10) {
			x_4 = new Var<Integer>(Phi.Entry(x_3,x_4).value + 1);
			Output.record("Test7", "main", 30, "x_4", x_4.value);
		}
		x_5 = Phi.Exit(x_3,x_4);
		Output.record("Test7", "main", 29, "x_5", x_5.value);
		
		System.out.println(min(x_5.value, y_3.value));
	}
}
