package tests;

public class Test10 {
	
	public static int test() {
		int y = 5;
		int x = 2;
		return x + y;
	}
	
	public static void main(String[] args) {
		
		if(true) {
			int x = 5;
			x += 2;
		}
		
		int z = 2;
		
		if(z > 1) {
			int x = 1;
		}
		else if(z > 2) {
			int x = 2;
		}
		else {
			int x = 3;
		}
		
		while(z > 0) {
			int y = 5;
			int x = 2;
			x = 5;
			z -= x;
		}
		
		
		System.out.println(z);
		
	}
	
}
