package outputs;

// tests nested if statements
public class Test5 {
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> y_0 = null;
		Var<Integer> z_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		Var<Integer> z_1 = null;
		Var<Integer> y_2 = null;
		Var<Integer> y_3 = null;
		Var<Integer> x_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> x_6 = null;
		Var<Integer> y_4 = null;
		Var<Integer> z_2 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		Output.record("Test5", "main", 6, "x_0", x_0.value);
		y_0 = new Var<Integer>(12);
		Output.record("Test5", "main", 7, "y_0", y_0.value);
		z_0 = new Var<Integer>(1);
		Output.record("Test5", "main", 8, "z_0", z_0.value);  //x - y;
		if(x_0.value < 0) {
			if(y_0.value < 10 && z_0.value > 1) {
				x_1 = new Var<Integer>(5);
				Output.record("Test5", "main", 11, "x_1", x_1.value);
				if(y_0.value > 5) {
					y_1 = new Var<Integer>(x_1.value + z_0.value);
					Output.record("Test5", "main", 13, "y_1", y_1.value);
					z_1 = new Var<Integer>(z_0.value + 5);
					Output.record("Test5", "main", 14, "z_1", z_1.value);
					y_2 = new Var<Integer>(y_1.value + z_1.value);
					Output.record("Test5", "main", 15, "y_2", y_2.value);
					y_3 = new Var<Integer>(y_2.value + z_1.value);
					Output.record("Test5", "main", 16, "y_3", y_3.value);
					x_2 = new Var<Integer>(x_1.value + 5);
					Output.record("Test5", "main", 17, "x_2", x_2.value);
				}
				else {
					x_3 = new Var<Integer>(x_1.value * z_0.value);
					Output.record("Test5", "main", 20, "x_3", x_3.value);
				}
				x_4 = Phi.If((y_0.value > 5),x_2,x_3);
				Output.record("Test5", "main", 19, "x_4", x_4.value);
			}
			else if(y_0.value < 10) {
				x_5 = new Var<Integer>(x_0.value - 1);
				Output.record("Test5", "main", 24, "x_5", x_5.value);
			}
		}
		x_6 = Phi.If((x_0.value < 0),x_5,x_0);
		Output.record("Test5", "main", 9, "x_6", x_6.value);
		y_4 = Phi.If((x_0.value < 0),y_3,y_0);
		Output.record("Test5", "main", 9, "y_4", y_4.value);
		z_2 = Phi.If((x_0.value < 0),z_1,z_0);
		Output.record("Test5", "main", 9, "z_2", z_2.value);
		
		System.out.println(x_6.value + y_4.value + z_2.value);
	}
}
