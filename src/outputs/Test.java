package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);
		Output.record("Test", "main", 5, "args_0", args_0.value);

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> y_0 = null;
		Var<Integer> z_0 = null;
		Var<Integer> w_0 = null;
		Var<Integer> y_1 = null;
		Var<Integer> y_2 = null;
		Var<Integer> x_2 = null;
		Var<Integer> z_1 = null;
		Var<Integer> y_3 = null;
		Var<Integer> z_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> z_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> y_4 = null;
		Var<Integer> z_4 = null;
        
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
		Output.record("Test", "main", 6, "x_0", x_0.value);
        x_1 = new Var<Integer>(5);
		Output.record("Test", "main", 7, "x_1", x_1.value);
        y_0 = new Var<Integer>(x_1.value - 12);
		Output.record("Test", "main", 8, "y_0", y_0.value);
        //;
		//;
        y_1 = new Var<Integer>(4);
		Output.record("Test", "main", 10, "y_1", y_1.value);
        if((x_1.value == (2 * y_1.value))) {
        	y_2 = new Var<Integer>(10);
			Output.record("Test", "main", 12, "y_2", y_2.value);
        	x_2 = new Var<Integer>(5);
			Output.record("Test", "main", 13, "x_2", x_2.value);
        	z_1 = new Var<Integer>(4);
			Output.record("Test", "main", 14, "z_1", z_1.value);
        }
        else if (x_1.value == 1) {
        	y_3 = new Var<Integer>(12);
			Output.record("Test", "main", 17, "y_3", y_3.value);
        	z_2 = new Var<Integer>(3);
			Output.record("Test", "main", 18, "z_2", z_2.value);
        }
        else {
        	x_3 = new Var<Integer>(5);
			Output.record("Test", "main", 21, "x_3", x_3.value);
        	z_3 = new Var<Integer>(2);
			Output.record("Test", "main", 22, "z_3", z_3.value);
        }
		x_4 = Phi.If(((x_1.value == (2 * y_1.value))),x_2,Phi.If((x_1.value == 1),x_1,x_3));
		Output.record("Test", "main", 20, "x_4", x_4.value);
		y_4 = Phi.If(((x_1.value == (2 * y_1.value))),y_2,Phi.If((x_1.value == 1),y_3,y_1));
		Output.record("Test", "main", 20, "y_4", y_4.value);
		z_4 = Phi.If(((x_1.value == (2 * y_1.value))),z_1,Phi.If((x_1.value == 1),z_2,z_3));
		Output.record("Test", "main", 20, "z_4", z_4.value);
        
        System.out.println(y_4.value + z_4.value);
    }
}
