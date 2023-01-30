package outputs;

public class Test8 {
	
	Var<Integer[]> z_0 = new Var<Integer[]>(new Integer[5]);
	Var<Integer[]> w_0 = new Var<Integer[]>(new Integer[2]);
	Var<Integer[][]> f_0 = new Var<Integer[][]>(new Integer[1][1]);
	
	public void yuh(Integer[] a, Integer[][] b) {
		// formal parameters
		Var<Integer[]> a_0 = new Var<Integer[]>(a);
		Output.record("Test8", "yuh", 9, "a_0", a_0.value);
		Var<Integer[][]> b_0 = new Var<Integer[][]>(b);
		Output.record("Test8", "yuh", 9, "b_0", b_0.value);

		// all variables are declared to null
		
		/* PROGRAM STARTS */
		return;
	}
	
	public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);
		Output.record("Test8", "main", 13, "args_0", args_0.value);

		// all variables are declared to null
		Var<Integer[]> x_0 = null;
		Var<Integer[]> y_0 = null;
		Var<Integer[][]> h_0 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer[]>(new Integer[5]);
		Output.record("Test8", "main", 14, "x_0", x_0.value);
		y_0 = new Var<Integer[]>(new Integer[6]);
		Output.record("Test8", "main", 15, "y_0", y_0.value);
		h_0 = new Var<Integer[][]>(new Integer[1][2]);
		Output.record("Test8", "main", 16, "h_0", h_0.value);
	}
}
