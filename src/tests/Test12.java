package tests;

public class Test12 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int[] a = {1,2,3};
		for(int i=0; i<2; i++) {
			int other = 0;
			for(int j=i; j<10; j++) {
				count++;
				other++;
				count += other;
				System.out.println(i);
				a[i] = 2;
			}
		}
		System.out.println(count);
		
	}
	
}
