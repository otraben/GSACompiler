package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
        int x_0 = 0;
        int x_1 = 5;
        int y_0 = 7;
        int y_1 = 0;
		int y_2 = 0;
		if((x_1 == (2 * y_0))) {
        	int y_1 = 10;
        }
        else {
        	y_2 = 12;
        }
		int y_3 = Phi.If(((x_1 == (2 * y_0))),y_1,y_2);
        System.out.println(y_3);
    }
}
