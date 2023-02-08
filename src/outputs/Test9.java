package outputs;

public class Test9 {

	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> x_0 = null;
		Var<Integer> x_1 = null;
		Var<Integer> x_2 = null;
		Var<Integer> x_3 = null;
		Var<Integer> x_4 = null;
		Var<Integer> x_5 = null;
		Var<Integer> x_6 = null;
		Var<Integer> i_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		
		
		/* PROGRAM STARTS */
		x_0 = new Var<Integer>(0);
		Output.record("Test9", "main", 7, "x_0", x_0.value);
		
		if (x_0.value < 5)
			{
			x_1 = new Var<Integer>(6);
			Output.record("Test9", "main", 9, "x_1", x_1.value);
		}
		else if (x_0.value <6)
			{
			x_2 = new Var<Integer>(7);
			Output.record("Test9", "main", 9, "x_2", x_2.value);
		}
		else
			{
			x_3 = new Var<Integer>(5);
			Output.record("Test9", "main", 10, "x_3", x_3.value);
		}
		x_4 = Phi.If((x_0.value < 5),x_1,Phi.If((x_0.value <6),x_2,x_3));
		Output.record("Test9", "main", 10, "x_4", x_4.value);
		
		while (Phi.Entry(x_4,x_5).value == 5)
			{
			x_5 = new Var<Integer>(Phi.Entry(x_4,x_5).value + 5);
			Output.record("Test9", "main", 12, "x_5", x_5.value);
		}
		x_6 = Phi.Exit(x_4,x_5);
		Output.record("Test9", "main", 10, "x_6", x_6.value);
		
		i_0=new Var<Integer>(0);
		Output.record("Test9", "main", 15, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value<Phi.Entry(x_6,x_6).value)
			{
			System.out.println(Phi.Entry(x_6,x_6).value-Phi.Entry(i_0,i_1).value);
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("Test9", "main", 19, "i_1", i_1.value);
		}
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("Test9", "main", 16, "i_2", i_2.value);
		
	}
	
}
