package tests;

public class Test7 {
	
	int x,y;
	
	public static int min(int a, int b) {
		int var1 = a;
		int var2 = b;
		a = 0;
		b = 0;
		if(var1 < var2) {
			return var1;
		}
		else {
			return var2;
		}
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 2 + x;
		
		do {
			x++;
			y++;
		} while(x < 10);
		
		while(x < 10) {
			x++;
		}
		
		System.out.println(min(x, y));
	}
}
