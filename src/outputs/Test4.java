package outputs;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);

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
		j_0 = new Var<Integer>(0);
		while(Phi.Entry(i_0,i_9).value < 10) {
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_9).value + 1);
			i_2 = new Var<Integer>(i_1.value + 1);
			j_1 = new Var<Integer>(Phi.Entry(j_0,j_4).value + 1);
			while(Phi.Entry(j_1,j_2).value < 10) {
				j_2 = new Var<Integer>(Phi.Entry(j_1,j_2).value + 1);
				i_3 = new Var<Integer>(Phi.Entry(i_2,i_6).value + 1);
				if (j_2.value < 5) {
					System.out.println(j_2.value);
				}
				else if(j_2.value > 9) {
					i_4 = new Var<Integer>(i_3.value - 4);
				}
				else {
					i_5 = new Var<Integer>(i_3.value + 2);
				}
				i_6 = Phi.If((j_2.value < 5),i_3,Phi.If((j_2.value > 9),i_4,i_5));
			}
			i_7 = Phi.Exit(i_2,i_6);
			j_3 = Phi.Exit(j_1,j_2);
			j_4 = new Var<Integer>(0);
			if(i_7.value < 0) {
				i_8 = new Var<Integer>(1);
			}
			i_9 = Phi.If((i_7.value < 0),i_8,i_7);
		}
		i_10 = Phi.Exit(i_0,i_9);
		j_5 = Phi.Exit(j_0,j_4);
		System.out.println(i_10.value);
	}
}
