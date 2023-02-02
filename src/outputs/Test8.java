package outputs;

public class Test8 {
	
	int[] z_0 = new int[5];
	int w[] = new int[2];
	int f[][] = new int[1][1];
	
	public void yuh(int[] a, int[][] b) {
		// formal parameters

		// all variables are declared to null
		
		/* PROGRAM STARTS */
		return;
	}
	
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> c_0 = null;
		
		/* PROGRAM STARTS */
		int x[] = new int[5];
		int y[] = new int[3];
		int h[][] = new int[1][2];
		
		c_0 = new Var<Integer>(5);
		Output.record("Test8", "main", 18, "c_0", c_0.value);
		
		y[0] = 1;
		y[1] = 2;
		y[2] = y[0] + y[1] + c_0.value;
		
		y[0] = y[0] + 5;
		
		System.out.println(y[2] + c_0.value);
	}
}
