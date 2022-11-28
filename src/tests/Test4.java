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
				j = j + 1;
				i = i + 1;
				if (j < 5) {
					System.out.println(j);
				}
				else if(j > 9) {
					i -= 4;
				}
				else {
					i += 2;
				}
			}
			j = 0;
			if(i < 0) {
				i = 1;
			}
		}
		System.out.println(i);
	}
}
