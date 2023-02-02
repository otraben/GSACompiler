package tests;

public class Test8 {
	
	int[] z = new int[5];
	int w[] = new int[2];
	int f[][] = new int[1][1];
	
	public void yuh(int[] a, int b[][]) {
		return;
	}
	
	public static void main(String[] args) {
		int x[] = new int[5];
		int[] y = new int[3];
		int[][] h = new int[1][2];
		
		int c = 5;
		
		y[0] = 1;
		y[1] = 2;
		y[2] = y[0] + y[1] + c;
		
		y[0] += 5;
		
		System.out.println(y[2] + c);
	}
}
