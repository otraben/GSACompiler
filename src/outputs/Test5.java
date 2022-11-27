package outputs;

// tests nested if statements
public class Test5 {
	public static void main(String[] args) {
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
		Var<Integer> y_4 = null;
		Var<Integer> z_2 = null;
		Var<Integer> x_5 = null;
		Var<Integer> x_6 = null;
		Var<Integer> y_5 = null;
		Var<Integer> z_3 = null;
		Var<Integer> x_7 = null;
		Var<Integer> y_6 = null;
		Var<Integer> z_4 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(5);
		y_0 = new Var<Integer>(12);
		z_0 = new Var<Integer>(1);  //x - y;
		if(x_0.value < 0) {
			if(y_0.value < 10 && z_0.value > 1) {
				x_1 = new Var<Integer>(5);
				if(y_0.value > 5) {
					y_1 = new Var<Integer>(x_1.value + z_0.value);
					z_1 = new Var<Integer>(z_0.value + 5);
					y_2 = new Var<Integer>(y_1.value + z_1.value);
					y_3 = new Var<Integer>(y_2.value + z_1.value);
					x_2 = new Var<Integer>(x_1.value + 5);
				}
				else {
					x_3 = new Var<Integer>(x_1.value * z_0.value);
				}
				x_4 = Phi.If((y_0.value > 5),x_2,x_3);
				y_4 = Phi.If((y_0.value > 5),y_3,y_0);
				z_2 = Phi.If((y_0.value > 5),z_1,z_0);
			}
			else if(y_0.value < 10) {
				x_5 = new Var<Integer>(x_0.value - 1);
			}
			x_6 = Phi.If((y_0.value < 10 && z_0.value > 1),x_4,Phi.If((y_0.value < 10),x_5,x_0));
			y_5 = Phi.If((y_0.value < 10 && z_0.value > 1),y_4,Phi.If((y_0.value < 10),y_0,y_0));
			z_3 = Phi.If((y_0.value < 10 && z_0.value > 1),z_2,Phi.If((y_0.value < 10),z_0,z_0));
		}
		x_7 = Phi.If((x_0.value < 0),x_6,x_0);
		y_6 = Phi.If((x_0.value < 0),y_5,y_0);
		z_4 = Phi.If((x_0.value < 0),z_3,z_0);
		
		System.out.println(x_7.value + y_6.value + z_4.value);
	}
}
