package outputs;

// tests different declaration types, and an if statement with no else
public class Test1 {
	public static void main(String[] args) {
		int x_0 = 0;
		String y_0 = "hello";
		int x_1 = 0;
		if(y_0.equals("bye")) {
			x_1 = 1;
		}
		int x_2 = Phi.If((y_0.equals("bye")),x_1,x_0);
		System.out.println(y_0 + x_2);
	}
}
