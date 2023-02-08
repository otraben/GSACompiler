package outputs;

// tests alternative assignment operators
public class Test3 {
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> y_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> y_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> y_3 = null;
		Var<Integer> y_4 = null;
		Var<Integer> x_4 = null;
		Var<Integer> y_5 = null;
		Var<Integer> y_6 = null;
		Var<Integer> x_5 = null;
		Var<Integer> y_7 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
		Output.record("Test3", "main", 6, "x_0", x_0.value);
		y_0 = new Var<Integer>(0);
		Output.record("Test3", "main", 7, "y_0", y_0.value);
		x_1 = new Var<Integer>(x_0.value + 1);
		Output.record("Test3", "main", 8, "x_1", x_1.value);
		y_1 = new Var<Integer>(y_0.value - 1);
		Output.record("Test3", "main", 9, "y_1", y_1.value);
		x_2 = new Var<Integer>(x_1.value + y_1.value);
		Output.record("Test3", "main", 10, "x_2", x_2.value);
		y_2 = new Var<Integer>(y_1.value - x_2.value);
		Output.record("Test3", "main", 11, "y_2", y_2.value);
		x_3 = new Var<Integer>(x_2.value * y_2.value * 400);
		Output.record("Test3", "main", 12, "x_3", x_3.value);
		y_3 = new Var<Integer>(y_2.value / 2);
		Output.record("Test3", "main", 13, "y_3", y_3.value);
		y_4 = new Var<Integer>(y_3.value >>> x_3.value);
		Output.record("Test3", "main", 14, "y_4", y_4.value);
		
		if(x_3.value > 4) {
			x_4 = new Var<Integer>(x_3.value + 3);
			Output.record("Test3", "main", 17, "x_4", x_4.value);
			y_5 = new Var<Integer>(y_4.value + y_4.value);
			Output.record("Test3", "main", 18, "y_5", y_5.value);
			y_6 = new Var<Integer>(y_5.value - 1);
			Output.record("Test3", "main", 19, "y_6", y_6.value);
		}
		x_5 = Phi.If((x_3.value > 4),x_4,x_3);
		Output.record("Test3", "main", 16, "x_5", x_5.value);
		y_7 = Phi.If((x_3.value > 4),y_6,y_4);
		Output.record("Test3", "main", 16, "y_7", y_7.value);
		System.out.println(x_5.value + " " + y_7.value);
	}
}
