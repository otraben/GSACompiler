package outputs.Test7_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


public class Test7_Faulty {
	
	int x;
	int y;
	static int z = 10;
	
	public static int flukyInt(int i) {
		double r = Math.random();
		if(r <= 0.5d) {
			return i;
		}
		return i * 2;
	}
	
	public static int min(int a, int b) {
		// formal parameters
		Var<Integer> a_0 = new Var<Integer>(a);
		Output.record("Test7", "min", 8, "a_0", a_0.value);
		Var<Integer> b_0 = new Var<Integer>(b);
		Output.record("Test7", "min", 8, "b_0", b_0.value);

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
		Output.newExecution("Test7");

		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> y_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> y_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		Output.record("Test7", "main", 22, "x_0", x_0.value);
		y_0 = new Var<Integer>(2 + x_0.value);
		Output.record("Test7", "main", 23, "y_0", y_0.value);
		
		do {
			x_1 = new Var<Integer>(flukyInt(Phi.Entry(x_0,x_1).value + 1));
			Output.record("Test7", "main", 26, "x_1", x_1.value);
			y_1 = new Var<Integer>(Phi.Entry(y_0,y_1).value + 1);
			Output.record("Test7", "main", 27, "y_1", y_1.value);
		} while(Phi.Entry(x_1,x_1).value < 10);
		x_2 = Phi.Exit(x_0,x_1);
		Output.record("Test7", "main", 25, "x_2", x_2.value);
		y_2 = Phi.Exit(y_0,y_1);
		Output.record("Test7", "main", 25, "y_2", y_2.value);
		
		while(Phi.Entry(x_2,x_3).value < 10) {
			x_3 = new Var<Integer>(Phi.Entry(x_2,x_3).value + 1);
			Output.record("Test7", "main", 31, "x_3", x_3.value);
		}
		x_4 = Phi.Exit(x_2,x_3);
		Output.record("Test7", "main", 30, "x_4", x_4.value);
		
		z = z + x_4.value;
		System.out.println(min(x_4.value, y_2.value) + z);
		Output.recordProgramOutput("Test7", min(x_4.value, y_2.value) + z, true);
	}
}
