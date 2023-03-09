package outputs.Test13_Output;
import gsa.Output;
import gsa.Phi;
import gsa.Var;


public class Test13_Faulty {
	public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
		Var<Integer> c_0 = null;
		Var<Integer> p_0 = null;
		Var<Integer> p_1 = null;
		Var<Integer> p_2 = null;
		Var<Integer> p_3 = null;
		Var<Integer> p_4 = null;

		
		/* PROGRAM STARTS */
		c_0 = new Var<Integer>((1));
		Output.record("Test13", "main", 6, "c_0", c_0.value);
		p_0 = new Var<Integer>((0));
		Output.record("Test13", "main", 7, "p_0", p_0.value);
		
			if ((c_0.value).equals(0)) {
 
				p_1 = new Var<Integer>((p_0.value + 1));
			Output.record("Test13", "main", 11, "p_1", p_1.value);
				;
			}
			else if ((c_0.value).equals(1)) {

				p_2 = new Var<Integer>((p_0.value - 1));
			Output.record("Test13", "main", 16, "p_2", p_2.value);
				;}
			else {

				p_3 = new Var<Integer>((p_0.value + 10));
			Output.record("Test13", "main", 20, "p_3", p_3.value);
				;}
		p_4 = Phi.If(((c_0.value).equals(0)),p_1,Phi.If(((c_0.value).equals(1)),p_2,p_3));
		Output.record("Test13", "main", 18, "p_4", p_4.value);
		
		System.out.println(p_4.value);
	}
}
