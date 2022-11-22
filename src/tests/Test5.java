package tests;

// tests nested if statements
public class Test5 {
	public static void main(String[] args) {
		int x = 5;
		int y = 12;
		int z = 1;  //x - y;
		if(x < 0) {
			if(y < 10 && z > 1) {
				x = 5;
			}
		}
		
		System.out.println(x + y + z);
	}
}
