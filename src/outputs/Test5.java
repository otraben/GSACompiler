package outputs;

// tests nested if statements
public class Test5 {
	public static void main(String[] args) {
		int x_0 = 5;
		int y_0 = 12;
		int z_0 = x_0 - y_0;
		int x_2 = 0;
		if(x_0 < 0) {
			int x_1 = 0;
			if(y_0 < 10 && z_0 > 2) {
				x_1 = x_0 + 5;
			}
			x_2 = Phi.If((y_0 < 10 && z_0 > 2),x_1,x_0);
		}
		int x_3 = Phi.If((x_0 < 0),x_1,x_2);
		
		System.out.println(x_3 + y_0 + z_0);
	}
}
