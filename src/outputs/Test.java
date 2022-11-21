package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> y_0 = null;
		Var<Integer> y_1 = null;
		Var<Integer> y_2 = null;
		Var<Integer> x_2 = null;
		Var<Integer> y_3 = null;
		Var<Integer> x_3 = null;
		Var<Integer> y_4 = null;
        
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
        x_1 = new Var<Integer>(5);
        y_0 = new Var<Integer>(7);
        y_1 = new Var<Integer>(4);
        if((x_1.value == (2 * y_1.value))) {
        	y_2 = new Var<Integer>(10);
        	x_2 = new Var<Integer>(5);
        }
        else if (x_2.value == 1) {
        	y_3 = new Var<Integer>(12);
        }
		x_3 = Phi.If(((x_1.value == (2 * y_1.value))),x_2,Phi.If((x_2.value == 1),x_null,x_1));
		y_4 = Phi.If(((x_1.value == (2 * y_1.value))),y_2,Phi.If((x_2.value == 1),y_3,y_1));
        
        System.out.println(y_4.value);
    }
}
