package outputs;

// tests different declaration types, and an if statement with no else
public class Test1 {
	public static void main(String[] args) {
		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<String> y_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
		y_0 = new Var<String>("hello");
		if(y_0.value.equals("bye")) {
			x_1 = new Var<Integer>(1);
		}
		x_2 = Phi.If((y_0.value.equals("bye")),x_1,x_0);
		System.out.println(y_0.value + x_2.value);
	}
}
