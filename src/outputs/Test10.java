package outputs;

public class Test10 {
	
	public static int test() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> y_0 = null;
		Var<Integer> x_0 = null;
		
		/* PROGRAM STARTS */
		y_0 = new Var<Integer>(5);
		Output.record("Test10", "test", 6, "y_0", y_0.value);
		x_0 = new Var<Integer>(2);
		Output.record("Test10", "test", 7, "x_0", x_0.value);
		return x_0.value + y_0.value;
	}
	
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> z_0 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> y_1 = null;
		Var<Integer> x_6 = null;
		Var<Integer> x_7 = null;
		Var<Integer> z_1 = null;
		
		
		/* PROGRAM STARTS */
		if(true) {
			x_1 = new Var<Integer>(5);
			Output.record("Test10", "main", 14, "x_1", x_1.value);
			x_2 = new Var<Integer>(x_1.value + 2);
			Output.record("Test10", "main", 15, "x_2", x_2.value);
		}
		
		z_0 = new Var<Integer>(2);
		Output.record("Test10", "main", 18, "z_0", z_0.value);
		
		if(z_0.value > 1) {
			x_3 = new Var<Integer>(1);
			Output.record("Test10", "main", 21, "x_3", x_3.value);
		}
		else {
			if(z_0.value > 2) {
			x_4 = new Var<Integer>(2);
				Output.record("Test10", "main", 24, "x_4", x_4.value);
		}
		else {
			x_5 = new Var<Integer>(3);
				Output.record("Test10", "main", 27, "x_5", x_5.value);
		}
		}
		
		while(Phi.Entry(z_0,z_1).value > 0) {
			y_1 = new Var<Integer>(5);
			Output.record("Test10", "main", 31, "y_1", y_1.value);
			x_6 = new Var<Integer>(2);
			Output.record("Test10", "main", 32, "x_6", x_6.value);
			x_7 = new Var<Integer>(5);
			Output.record("Test10", "main", 33, "x_7", x_7.value);
			z_1 = new Var<Integer>(Phi.Entry(z_0,z_1).value - Phi.Entry(x_7,x_7).value);
			Output.record("Test10", "main", 34, "z_1", z_1.value);
		}
		
		
		System.out.println(z_1.value);
		
	}
	
}
