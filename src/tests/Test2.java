package tests;

// tests multiple variables within an if/else statement, as well as variables being present on both the left and right side of assignments
public class Test2 {
	public static void main(String[] args) {
		int x = 5;
		String y = "hello";
		if(y.equals(x)) {
			y = y.substring(1);
			x = x - 1;
		}
		else {
			x = x + 2;
			if(y.equals("whoa")) {
				y = y.substring(1);
				x = x - 3;
			}
			else {
				y = y.substring(2);
				x = x - 2;
			}
		}
//		if(y.equals(x)) {
//			y = y.substring(1);
//			x = x - 1;
//		}
//		else if(y.equals("whoa")) {
//			y = y.substring(1);
//			x = x - 3;
//		}
//		else {
//			y = y.substring(2);
//			x = x - 2;
//		}
		System.out.println(y + " " + x);
	}
}
