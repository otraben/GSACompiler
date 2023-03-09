package outputs.Test12_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


public class Test12_Faulty {
	
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> x_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> x_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> i_3 = null;
		Var<Integer> x_6 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Integer> x_7 = null;
		Var<Integer> i_6 = null;
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>((0));
		Output.record("Test12", "main", 6, "x_0", x_0.value);
		
		i_0=new Var<Integer>((0));
		Output.record("Test12", "main", 8, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_5).value<10) {
			i_1 = new Var<Integer>((Phi.Entry(i_0,i_5).value));
			Output.record("Test12", "main", 8, "i_1", i_1.value);
if(i_1.value == 1) {
				x_1 = new Var<Integer>((Phi.Entry(x_0,x_6).value + 1));
				Output.record("Test12", "main", 10, "x_1", x_1.value);
			}
			else {
				while(Phi.Entry(x_0,x_4).value > -5) {
					i_2 = new Var<Integer>((Phi.Entry(i_1,i_2).value));
					Output.record("Test12", "main", 13, "i_2", i_2.value);
if(i_2.value % 2 == 0) {
						x_2 = new Var<Integer>((Phi.Entry(x_0,x_4).value - 1));
						Output.record("Test12", "main", 15, "x_2", x_2.value);
					}
					else {
						x_3 = new Var<Integer>((x_0.value - 2));
						Output.record("Test12", "main", 18, "x_3", x_3.value);
					}
					x_4 = Phi.If((i_2.value % 2 == 0),x_2,x_3);
					Output.record("Test12", "main", 17, "x_4", x_4.value);
				}
				x_5 = Phi.Exit(x_1,x_4);
				Output.record("Test12", "main", 13, "x_5", x_5.value);
				i_3 = Phi.Exit(i_1,i_2);
				Output.record("Test12", "main", 13, "i_3", i_3.value);
			}
			x_6 = Phi.If((i_1.value == 1),x_1,x_5);
			Output.record("Test12", "main", 12, "x_6", x_6.value);
			i_4 = Phi.If((i_1.value == 1),i_1,i_3);
			Output.record("Test12", "main", 12, "i_4", i_4.value);
			i_5 = new Var<Integer>((i_4.value + 1));
			Output.record("Test12", "main", 21, "i_5", i_5.value);
		}
		x_7 = Phi.Exit(x_0,x_6);
		Output.record("Test12", "main", 9, "x_7", x_7.value);
		i_6 = Phi.Exit(i_0,i_5);
		Output.record("Test12", "main", 9, "i_6", i_6.value);
		System.out.print(x_7.value);
	}
	
}
