package outputs.Test12_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


public class Test12 {
	
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> i_3 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> i_4 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> x_6 = null;
		Var<Integer> i_5 = null;
		Var<Integer> x_7 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> x_8 = null;
		Var<Integer> i_8 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>((0));
		Output.record("Test12", "main", 6, "x_0", x_0.value);
		
		i_0=new Var<Integer>((0));
		Output.record("Test12", "main", 8, "i_0", i_0.value);
		i_1 = new Var<Integer>((i_0.value));
		Output.record("Test12", "main", 8, "i_1", i_1.value);
		i_2 = new Var<Integer>((i_1.value));
		Output.record("Test12", "main", 8, "i_2", i_2.value);
		while(Phi.Entry(i_2,i_7).value<10) {
			i_3 = new Var<Integer>((Phi.Entry(i_2,i_7).value));
			Output.record("Test12", "main", 9, "i_3", i_3.value);
			if(i_3.value == 1) {
				x_1 = new Var<Integer>((Phi.Entry(x_0,x_7).value + 1));
				Output.record("Test12", "main", 10, "x_1", x_1.value);
			}
			else {
				x_2 = new Var<Integer>((Phi.Entry(x_0,x_7).value));
				Output.record("Test12", "main", 12, "x_2", x_2.value);
				while(Phi.Entry(x_2,x_5).value > -5) {
					i_4 = new Var<Integer>((Phi.Entry(i_3,i_4).value));
					Output.record("Test12", "main", 13, "i_4", i_4.value);
					if(i_4.value % 2 == 0) {
						x_3 = new Var<Integer>((Phi.Entry(x_2,x_5).value - 1));
						Output.record("Test12", "main", 15, "x_3", x_3.value);
					}
					else {
						x_4 = new Var<Integer>((Phi.Entry(x_2,x_5).value - 2));
						Output.record("Test12", "main", 18, "x_4", x_4.value);
					}
					x_5 = Phi.If((i_4.value % 2 == 0),x_3,x_4);
					Output.record("Test12", "main", 17, "x_5", x_5.value);
				}
				x_6 = Phi.Exit(x_2,x_5);
				x_5 = null;
				Output.record("Test12", "main", 13, "x_6", x_6.value);
				i_5 = Phi.Exit(i_3,i_4);
				i_4 = null;
				Output.record("Test12", "main", 13, "i_5", i_5.value);
			}
			x_7 = Phi.If((i_3.value == 1),x_1,x_6);
			Output.record("Test12", "main", 12, "x_7", x_7.value);
			i_6 = Phi.If((i_3.value == 1),i_3,i_5);
			Output.record("Test12", "main", 12, "i_6", i_6.value);
			i_7 = new Var<Integer>((i_6.value + 1));
			Output.record("Test12", "main", 21, "i_7", i_7.value);
		}
		x_8 = Phi.Exit(x_0,x_7);
		x_7 = null;
		Output.record("Test12", "main", 9, "x_8", x_8.value);
		i_8 = Phi.Exit(i_2,i_7);
		i_7 = null;
		Output.record("Test12", "main", 9, "i_8", i_8.value);
		System.out.print(x_8.value);
	}
	
}
