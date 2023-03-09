package tests;

public class Test13 {
	public static void main(String[] args) {

		int c = 1;
		int p = 0;
		switch(c) {
			case 0: {
				p++;
				break;
			}
			case 1:
				p--;
				break;
			default:
				p += 10;
				break;
		}
		System.out.println(p);
	}
}
