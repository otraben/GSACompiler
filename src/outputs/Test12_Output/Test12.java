package outputs.Test12_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


public class Test12 {
	
	public static void main(String[] args) {
		Output.newExecution("Test12");

		// formal parameters

		// all variables are declared to null
		Var<Integer> count_0 = null;
		Var<Integer> i_0 = null;
		Var<Integer> other_0 = null;
		Var<Integer> j_0 = null;
		Var<Integer> count_1 = null;
		Var<Integer> other_1 = null;
		Var<Integer> count_2 = null;
		Var<Integer> j_1 = null;
		Var<Integer> other_2 = null;
		Var<Integer> count_3 = null;
		Var<Integer> j_2 = null;
		Var<Integer> i_1 = null;
		Var<Integer> count_4 = null;
		Var<Integer> i_2 = null;
		
		
		/* PROGRAM STARTS */
		count_0 = new Var<Integer>(0);
		Output.record("Test12", "main", 7, "count_0", count_0.value);
		int a[] = {1,2,3};
		i_0=new Var<Integer>(0);
		Output.record("Test12", "main", 9, "i_0", i_0.value);
		while(Phi.Entry(i_0,i_1).value<2) {
			other_0 = new Var<Integer>(0);
			Output.record("Test12", "main", 9, "other_0", other_0.value);
			j_0=new Var<Integer>(Phi.Entry(i_0,i_1).value);
			Output.record("Test12", "main", 10, "j_0", j_0.value);
			while(Phi.Entry(j_0,j_1).value<10) {
				count_1 = new Var<Integer>(Phi.Entry(count_0,count_2).value + 1);
				Output.record("Test12", "main", 12, "count_1", count_1.value);
				other_1 = new Var<Integer>(Phi.Entry(other_0,other_1).value + 1);
				Output.record("Test12", "main", 13, "other_1", other_1.value);
				count_2 = new Var<Integer>(count_1.value + other_1.value);
				Output.record("Test12", "main", 14, "count_2", count_2.value);
				System.out.println(Phi.Entry(i_0,i_1).value);
				a[Phi.Entry(i_0,i_1).value] = 2;
				j_1 = new Var<Integer>(Phi.Entry(j_0,j_1).value + 1);
				Output.record("Test12", "main", 16, "j_1", j_1.value);
			}
			other_2 = Phi.Exit(other_0,other_1);
			other_1 = null;
			Output.record("Test12", "main", 11, "other_2", other_2.value);
			count_3 = Phi.Exit(count_0,count_2);
			Output.record("Test12", "main", 11, "count_3", count_3.value);
			j_2 = Phi.Exit(j_0,j_1);
			j_1 = null;
			Output.record("Test12", "main", 11, "j_2", j_2.value);
			i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value + 1);
			Output.record("Test12", "main", 17, "i_1", i_1.value);
		}
		count_4 = Phi.Exit(count_0,count_3);
		Output.record("Test12", "main", 10, "count_4", count_4.value);
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("Test12", "main", 10, "i_2", i_2.value);
		System.out.println(count_4.value);
		
	}
	
}
