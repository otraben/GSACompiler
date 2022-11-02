package outputs;

// tests while loops
public class Test4 {
	public static void main(String[] args) {
		int i_0 = 0;
		int j_0 = 0;
		int i_4 = 0;
		int j_3 = 0;
		boolean whileBool_0 = false;
		while(Phi.Entry(whileBool_0,i_0,i_4) < 10) {
			int i_1 = Phi.Entry(whileBool_0,i_0,i_4) + 1;
			i_2 = i_1 + 1;
			int j_1 = Phi.Entry(whileBool_0,j_0,j_3) + 1;
			int j_2 = 0;
			int i_4 = 0;
			boolean whileBool_1 = false;
			while(Phi.Entry(whileBool_1,j_1,j_2) < 10) {
				j_2 = Phi.Entry(whileBool_1,j_1,j_2) + 2;
				int i_3 = 0;
				boolean whileBool_2 = false;
				while(Phi.Entry(whileBool_2,i_2,i_3) > 5) {
					int x_0 = 10;
					i_3 = Phi.Entry(whileBool_2,i_2,i_3) + 6;
					whileBool_2 = true;
				}
				i_4 = i_3;
				whileBool_1 = true;
			}
			j_3 = j_2;
			whileBool_0 = true;
		}
		int i_5 = i_4;
		int j_4 = j_3;
		System.out.println(i_5);
	}
}
