package outputs;

// tests multiple variables within an if/else statement, as well as variables being present on both the left and right side of assignments
public class Test2 {
	public static void main(String[] args) {
		int x0 = 5;
		String y0 = "hello";
		if(y0.equals(x0)) {
			String y1 = y0.substring(1);
			int x1 = x0 - 1;
		}
		else {
			String y2 = y1.substring(2);
			int x2 = x1 - 2;
		}
		int x3 = phi_if((y0.equals(x0)),x1,x2);
		String y3 = phi_if((y0.equals(x0)),y1,y2);
		System.out.println(y3 + " " + x3);
	}
}
