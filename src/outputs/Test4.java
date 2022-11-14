package outputs;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		int i_0 = 0;
		int j_0 = 0;
		int i_5 = i_0;
		int j_3 = j_0;
		int i_4 = i_0;
		boolean whileBool_0 = false;
		while(int Phi.Entry(whileBool_0,i_0,i_5)_0 < 10) {
			int i_1 = Phi.Entry(whileBool_0,i_0,i_5)_0 + 1;
			int i_2 = i_1 + 1;
			int j_1 = Phi.Entry(whileBool_0,j_0,j_3)_0 + 1;
			int j_2 = j_1;
			int i_3 = i_2;
			boolean whileBool_1 = false;
			while(int Phi.Entry(whileBool_1,j_1,j_2)_1 < 10) {
				i_3 = int Phi.Entry(whileBool_1,j_0,j_2)_1 + 2;
				j_2 = Phi.Entry(whileBool_1,j_1,j_2)_1 + 2;
				whileBool_1 = true;
			}
			i_4 = i_3;
			j_3 = j_2;
			i_5 = i_4 - 1;
			whileBool_0 = true;
		}
		int i_6 = i_5;
		System.out.println(i_6);
	}
}
