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
		Var<String> y_2 = null;
		Var<Integer> x_2 = null;
		Var<String> y_3 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<String> y_4 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		Output.record("Test2", "main", 6, "x_0", x_0.value);
		y_0 = new Var<String>("hello");
		Output.record("Test2", "main", 7, "y_0", y_0.value);
		/*if(y.equals(x)) {
			y = y.substring(1);
			x = x - 1;
		}
		else {
			x = x + 2;
			if(y.equals("whoa")) {
				y = y.substring(1);
				x = x - 3;
			}
			else {
				y = y.substring(2);
				x = x - 2;
			}
		}*/
		if(y_0.value.equals(x_0.value)) {
			y_1 = new Var<String>(y_0.value.substring(1));
			Output.record("Test2", "main", 24, "y_1", y_1.value);
			x_1 = new Var<Integer>(x_0.value - 1);
			Output.record("Test2", "main", 25, "x_1", x_1.value);
		}
		else if(y_0.value.equals("whoa")) {
			y_2 = new Var<String>(y_0.value.substring(1));
			Output.record("Test2", "main", 28, "y_2", y_2.value);
			x_2 = new Var<Integer>(x_0.value - 3);
			Output.record("Test2", "main", 29, "x_2", x_2.value);
		}
		else {
			y_3 = new Var<String>(y_0.value.substring(2));
			Output.record("Test2", "main", 32, "y_3", y_3.value);
			x_3 = new Var<Integer>(x_0.value - 2);
			Output.record("Test2", "main", 33, "x_3", x_3.value);
		}
		x_4 = Phi.If((y_0.value.equals(x_0.value)),x_1,Phi.If((y_0.value.equals("whoa")),x_2,x_3));
		Output.record("Test2", "main", 31, "x_4", x_4.value);
		y_4 = Phi.If((y_0.value.equals(x_0.value)),y_1,Phi.If((y_0.value.equals("whoa")),y_2,y_3));
		Output.record("Test2", "main", 31, "y_4", y_4.value);
		System.out.println(y_4.value + " " + x_4.value);
	}
}
