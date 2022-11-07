package tests;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		while(i < 10) {
			i = i + 1;
			i = i + 1;
			j = j + 1;
			while(j < 10) {
				i = j + 2;
				j = j + 2;
			}
			i = i - 1;
		}
		System.out.println(i);
	}
}
