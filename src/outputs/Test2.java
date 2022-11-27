package outputs;

// tests multiple variables within an if/else statement, as well as variables being present on both the left and right side of assignments
public class Test2 {
	public static void main(String[] args) {
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
		y_0 = new Var<String>("hello");
		if(y_0.value.equals(x_0.value)) {
			y_1 = new Var<String>(y_0.value.substring(1));
			x_1 = new Var<Integer>(x_0.value - 1);
		}
		else if(y_0.value.equals("whoa")) {
			y_2 = new Var<String>(y_0.value.substring(1));
			x_2 = new Var<Integer>(x_0.value - 3);
		}
		else {
			y_3 = new Var<String>(y_0.value.substring(2));
			x_3 = new Var<Integer>(x_0.value - 2);
		}
		x_4 = Phi.If((y_0.value.equals(x_0.value)),x_1,Phi.If((y_0.value.equals("whoa")),x_2,x_3));
		y_4 = Phi.If((y_0.value.equals(x_0.value)),y_1,Phi.If((y_0.value.equals("whoa")),y_2,y_3));
		System.out.println(y_4.value + " " + x_4.value);
	}
}
