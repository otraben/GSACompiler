package outputs;

// tests multiple variables within an if/else statement, as well as variables being present on both the left and right side of assignments
public class Test2 {
	public static void main(String[] args) {
		int x_0 = 5;
		String y_0 = "hello";
		String y_1 = "";
		String y_2 = "";
		int x_1 = 0;
		int x_2 = 0;
		if(y_0.equals(x_0)) {
			y_1 = y_0.substring(1);
			x_1 = x_0 - 1;
		}
		else {
			y_2 = y_0.substring(2);
			x_2 = x_0 - 2;
		}
		int x_3 = Phi.If((y_0.equals(x_0)),x_1,x_2);
		String y_3 = Phi.If((y_0.equals(x_0)),y_1,y_2);
		System.out.println(y_3 + " " + x_3);
	}
}
