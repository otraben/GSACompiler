package outputs;

// tests multiple variables within an if/else statement, as well as variables being present on both the left and right side of assignments
public class Test2 {
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<String> y_0 = null;
		Var<String> y_1 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<String> y_2 = null;
		Var<Integer> x_3 = null;
		Var<String> y_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> x_6 = null;
		Var<String> y_4 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		Output.record("Test2", "main", 6, "x_0", x_0.value);
		y_0 = new Var<String>("hello");
		Output.record("Test2", "main", 7, "y_0", y_0.value);
		if(y_0.value.equals(x_0.value)) {
			y_1 = new Var<String>(y_0.value.substring(1));
			Output.record("Test2", "main", 9, "y_1", y_1.value);
			x_1 = new Var<Integer>(x_0.value - 1);
			Output.record("Test2", "main", 10, "x_1", x_1.value);
		}
		else {
			x_2 = new Var<Integer>(x_0.value + 2);
			Output.record("Test2", "main", 13, "x_2", x_2.value);
			if(y_0.value.equals("whoa")) {
				y_2 = new Var<String>(y_0.value.substring(1));
				Output.record("Test2", "main", 15, "y_2", y_2.value);
				x_3 = new Var<Integer>(x_2.value - 3);
				Output.record("Test2", "main", 16, "x_3", x_3.value);
			}
			else {
				y_3 = new Var<String>(y_0.value.substring(2));
				Output.record("Test2", "main", 19, "y_3", y_3.value);
				x_4 = new Var<Integer>(x_2.value - 2);
				Output.record("Test2", "main", 20, "x_4", x_4.value);
			}
			x_5 = Phi.If((y_0.value.equals("whoa")),x_3,x_4);
			Output.record("Test2", "main", 18, "x_5", x_5.value);
		}
		x_6 = Phi.If((y_0.value.equals(x_0.value)),x_1,x_5);
		Output.record("Test2", "main", 12, "x_6", x_6.value);
		y_4 = Phi.If((y_0.value.equals(x_0.value)),y_1,y_3);
		Output.record("Test2", "main", 12, "y_4", y_4.value);
//		if(y.equals(x)) {
//			y = y.substring(1);
//			x = x - 1;
//		}
//		else if(y.equals("whoa")) {
//			y = y.substring(1);
//			x = x - 3;
//		}
//		else {
//			y = y.substring(2);
//			x = x - 2;
//		}
		System.out.println(y_4.value + " " + x_6.value);
	}
}
