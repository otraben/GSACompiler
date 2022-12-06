package outputs;

// tests alternative assignment operators
public class Test3 {
	public static void main(String[] args) {
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
		y_0 = new Var<Integer>(0);
		x_1 = new Var<Integer>(x_0.value + 1);
		y_1 = new Var<Integer>(y_0.value - 1);
		x_2 = new Var<Integer>(x_1.value + y_1.value);
		y_2 = new Var<Integer>(y_1.value - x_2.value);
		x_3 = new Var<Integer>(x_2.value * y_2.value * 400);
		y_3 = new Var<Integer>(y_2.value / 2);
		y_4 = new Var<Integer>(y_3.value >>> x_3.value);
		
		if(x_3.value > 4) {
			x_4 = new Var<Integer>(x_3.value + 3);
			y_5 = new Var<Integer>(y_4.value + y_4.value);
			y_6 = new Var<Integer>(y_5.value - 1);
		}
		x_5 = Phi.If((x_3.value > 4),x_4,x_3);
		y_7 = Phi.If((x_3.value > 4),y_6,y_4);
		System.out.println(x_5.value + " " + y_7.value);
	}
}
