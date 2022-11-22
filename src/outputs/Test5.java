package outputs;

// tests nested if statements
public class Test5 {
	public static void main(String[] args) {
		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> y_0 = null;
		Var<Integer> z_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> x_3 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		y_0 = new Var<Integer>(12);
		z_0 = new Var<Integer>(1);  //x - y;
		if(x_0.value < 0) {
			if(y_0.value < 10 && z_0.value > 1) {
				x_1 = new Var<Integer>(5);
			}
			x_2 = Phi.If((y_0.value < 10 && z_0.value > 1),x_1,x_0);
		}
		x_3 = Phi.If((x_0.value < 0),x_2,x_0);
		
		System.out.println(x_3.value + y_0.value + z_0.value);
	}
}
