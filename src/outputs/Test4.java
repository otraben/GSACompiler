package outputs;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		int i_0 = 0;
		int j_0 = 0;
		int j_1 = 0;
		int i_2 = 0;
		while(Phi.Entry(i_0,i_2) < 10) {
			int i_1 = Phi.Entry(i_0,i_2) + 1;
			i_2 = i_1 + 1;
			j_1 = Phi.Entry(j_0,j_1) + 1;
		}
		System.out.println(i_2);
	}
}
