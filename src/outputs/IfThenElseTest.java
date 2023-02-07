package outputs;
import java.util.ArrayList;

public class IfThenElseTest {

  public static double multiply(int q, int p) {
		// formal parameters
		Var<Integer> p_0 = new Var<Integer>(p);
		Output.record("IfThenElseTest", "multiply", 6, "p_0", p_0.value);
		Var<Integer> q_0 = new Var<Integer>(q);
		Output.record("IfThenElseTest", "multiply", 6, "q_0", q_0.value);

		// all variables are declared to null
		Var<Double> g_0 = null;
		Var<Integer> p_1 = null;
		Var<Double> g_1 = null;
		Var<Double> g_2 = null;
		Var<Integer> p_2 = null;
		Var<Double> g_3 = null;
    
		/* PROGRAM STARTS */
		g_0 = new Var<Double>((double)8.5);
		Output.record("IfThenElseTest", "multiply", 7, "g_0", g_0.value);

    if (p_0.value < 4)
      {
			if (p_0.value > 4)
        {
			p_1 = new Var<Integer>(0);
				Output.record("IfThenElseTest", "multiply", 10, "p_1", p_1.value);
		}
      else
        {
			g_1 = new Var<Double>((double)1);
				Output.record("IfThenElseTest", "multiply", 9, "g_1", g_1.value);
		}
		}
    else
      {
			g_2 = new Var<Double>((double)7);
			Output.record("IfThenElseTest", "multiply", 14, "g_2", g_2.value);
		}
		p_2 = Phi.If((p_0.value < 4),p_1,p_0);
		Output.record("IfThenElseTest", "multiply", 13, "p_2", p_2.value);
		g_3 = Phi.If((p_0.value < 4),g_1,g_2);
		Output.record("IfThenElseTest", "multiply", 13, "g_3", g_3.value);

    return g_3.value;
  }
  
  public static void main(String[] args) {
		// formal parameters

		// all variables are declared to null
	  
		/* PROGRAM STARTS */
		System.out.println(multiply(4,5));
  }
}