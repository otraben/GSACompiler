package outputs;

// tests different declaration types, and an if statement with no else
public class Test1 {
	public static void main(String[] args) {
		int x = 0;
		String y = "hello";
		if(y.equals("bye")) {
			x = 1;
		}
		System.out.println(y + x);
	}
}
