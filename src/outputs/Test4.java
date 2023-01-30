package outputs;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);
		Output.record("Test4", "main", 4, "args_0", args_0.value);

		// all variables are declared to null
		Var<Integer> i_0 = null;
		Var<Integer> j_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> i_2 = null;
		Var<Integer> j_1 = null;
		Var<Integer> j_2 = null;
		Var<Integer> i_3 = null;
		Var<Integer> i_4 = null;
		Var<Integer> i_5 = null;
		Var<Integer> i_6 = null;
		Var<Integer> i_7 = null;
		Var<Integer> j_3 = null;
		Var<Integer> j_4 = null;
		Var<Integer> i_8 = null;
		Var<Integer> i_9 = null;
		Var<Integer> i_10 = null;
		Var<Integer> j_5 = null;
		
		/* PROGRAM STARTS */
		i_0 = new Var<Integer>(0);
		Output.record("Test4", "main", 6, "i_0", i_0.value);
		j_0 = new Var<Integer>(0);
		Output.record("Test4", "main", 7, "j_0", j_0.value);
		while(Phi.Entry(i_0,i_9).value < 10) {
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_9).value + 1);
			Output.record("Test4", "main", 9, "i_1", i_1.value);
			i_2 = new Var<Integer>(i_1.value + 1);
			Output.record("Test4", "main", 10, "i_2", i_2.value);
			j_1 = new Var<Integer>(Phi.Entry(j_0,j_4).value + 1);
			Output.record("Test4", "main", 11, "j_1", j_1.value);
			while(Phi.Entry(j_1,j_2).value < 10) {
				j_2 = new Var<Integer>(Phi.Entry(j_1,j_2).value + 1);
				Output.record("Test4", "main", 13, "j_2", j_2.value);
				i_3 = new Var<Integer>(Phi.Entry(i_2,i_6).value + 1);
				Output.record("Test4", "main", 14, "i_3", i_3.value);
				if (j_2.value < 5) {
					System.out.println(j_2.value);
				}
				else if(j_2.value > 9) {
					i_4 = new Var<Integer>(i_3.value - 4);
					Output.record("Test4", "main", 19, "i_4", i_4.value);
				}
				else {
					i_5 = new Var<Integer>(i_3.value + 2);
					Output.record("Test4", "main", 22, "i_5", i_5.value);
				}
				i_6 = Phi.If((j_2.value < 5),i_3,Phi.If((j_2.value > 9),i_4,i_5));
				Output.record("Test4", "main", 21, "i_6", i_6.value);
			}
			i_7 = Phi.Exit(i_2,i_6);
			Output.record("Test4", "main", 12, "i_7", i_7.value);
			j_3 = Phi.Exit(j_1,j_2);
			Output.record("Test4", "main", 12, "j_3", j_3.value);
			j_4 = new Var<Integer>(0);
			Output.record("Test4", "main", 25, "j_4", j_4.value);
			if(i_7.value < 0) {
				i_8 = new Var<Integer>(1);
				Output.record("Test4", "main", 27, "i_8", i_8.value);
			}
			i_9 = Phi.If((i_7.value < 0),i_8,i_7);
			Output.record("Test4", "main", 26, "i_9", i_9.value);
		}
		i_10 = Phi.Exit(i_0,i_9);
		Output.record("Test4", "main", 8, "i_10", i_10.value);
		j_5 = Phi.Exit(j_0,j_4);
		Output.record("Test4", "main", 8, "j_5", j_5.value);
		System.out.println(i_10.value);
	}
}
