package outputs;

public class Test11 {

	int age;
	String name;
	
	public Test11() {
		// formal parameters

		// all variables are declared to null
		
		/* PROGRAM STARTS */
		age = 21;
		name = "Oliver";
	}
	
	public int getYearsUntilMidlifeCrisis() {
		// formal parameters

		// all variables are declared to null
		Var<Integer> years_0 = null;
		
		/* PROGRAM STARTS */
		years_0 = new Var<Integer>(50 - age);
		Output.record("Test11", "getYearsUntilMidlifeCrisis", 14, "years_0", years_0.value);
		return years_0.value;
	}
	
}
