package gsa;

public class Fluky {
	
	public static int flukyInt(int i, double p) {
		double r = Math.random();
		if(r <= p) {
			return 2 * i + 5;
		}
		else {
			return i;
		}
	}
	
	public static double flukyDouble(double d, double p) {
		double r = Math.random();
		if(r <= p) {
			return 2 * d + 5;
		}
		else {
			return d;
		}
	}
	
}
