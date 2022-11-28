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
	
	public static <T> T Entry(T a, T b) {
		if(b == null) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static <T> T Exit(T a, T b) {
		if(b == null) {
			return a;
		}
		else {
			return b;
		}
	}

}
