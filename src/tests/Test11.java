package tests;

public class Test11 {

	int age;
	String name;
	
	public Test11() {
		age = 21;
		name = "Oliver";
	}
	
	public int getYearsUntilMidlifeCrisis() {
		int years = 50 - age;
		return years;
	}
	
}
