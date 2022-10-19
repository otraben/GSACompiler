package tests;

// tests alternative assignment operators
public class Test3 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		x++;
		y--;
		x += y;
		y -= x;
		x *= y * 400;
		y /= 2;
		y >>>= x;
		System.out.println(x + " " + y);
	}
}
