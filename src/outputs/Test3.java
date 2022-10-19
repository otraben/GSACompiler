package outputs;

// tests alternative assignment operators
public class Test3 {
	public static void main(String[] args) {
		int x0 = 0;
		int y0 = 0;
		int x1 = x0 + 1;
		int y1 = y0 - 1;
		int x2 = x1 + y1;
		int y2 = y1 - x2;
		int x3 = x2 * y2 * 400;
		int y3 = y2 / 2;
		int y4 = y3 >>> x3;
		System.out.println(x3 + " " + y4);
	}
}
