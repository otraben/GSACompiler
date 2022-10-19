package outputs;

public class Phi {
	
	public static <T> T If(boolean cond, T a, T b) {
		if(cond) {
			return a;
		}	
		else {
			return b;
		}
	}

}
