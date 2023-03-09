package tests;

public class Test12 {
	
	public static void main(String[] args) {
		int x = 0;
		
		for(int i=0; i<10; i++) {
			if(i == 1) {
				x += 1;
			}
			else {
				while(x > -5) {
					if(i % 2 == 0) {
						x--;
					}
					else {
						x -= 2;
					}
				}
			}
		}
		System.out.print(x);
	}
	
}
