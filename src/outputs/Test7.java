package outputs;

public class Test7 {
	
	Var<Integer> x_0;
	Var<Integer> y_0;
	
	public static int min(int a, int b) {
		// formal parameters
		Var<Integer> a_0 = new Var<Integer>(a);
		Var<Integer> b_0 = new Var<Integer>(b);

		// all variables are declared to null
		Var<Integer> var1_0 = null;
		Var<Integer> var2_0 = null;
		Var<Integer> a_1 = null;
		Var<Integer> b_1 = null;
		
		/* PROGRAM STARTS */
		var1_0 = new Var<Integer>(a_0.value);
		var2_0 = new Var<Integer>(b_0.value);
		a_1 = new Var<Integer>(0);
		b_1 = new Var<Integer>(0);
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

		// all variables are declared to null
		Var<Integer> x_1 = null;
		Var<Integer> y_1 = null;
		
		/* PROGRAM STARTS */
		x_1 = new Var<Integer>(5);
		y_1 = new Var<Integer>(2 + x_1.value);
		System.out.println(min(x_1.value, y_1.value));
	}
}
