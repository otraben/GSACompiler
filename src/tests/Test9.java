package tests;

public class Test9 {

	public static void main(String[] args) {
		
		int x = 0;
		
		if (x < 5)
			x = 6;
		else
			x = 5;
		
		while (x == 5)
			x += 5;
		
		for(int i=0; i<x; i++)
			System.out.println(x-i);
		
	}
	
}
