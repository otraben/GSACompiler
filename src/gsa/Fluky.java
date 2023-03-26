package gsa;

public class Fluky {
	
	public static int flukyInt(int i, double p) {
		double r = Math.random();
		if(r <= p) {
			return (i + 1) * (int)(r * 2);
		}
		else {
			return i;
		}
	}
	
	public static double flukyDouble(double d, double p) {
		double r = Math.random();
		if(r <= p) {
			return (d + 1) * (r * 2);
		}
		else {
			return d;
		}
	}
	
}
