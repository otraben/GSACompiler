package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
        int x_0 = 0;
        int x_1 = 5;
        int y_0 = 7;
        int y_1 = 0;
		int y_4 = 0;
		if((x_1 == (2 * y_0))) {
        	y_1 = 10;
        }
        else int y_2 = 0;
		int y_3 = 0;
		if(x_1==2) {
        	int y_2 = 2;
        }
        else {
        	y_3 = 12;
        }
		y_4 = Phi.If((x_1==2),y_2,y_3);
		int y_5 = Phi.If(((x_1 == (2 * y_0))),y_3,y_4);
        System.out.println(y_5);
    }
}
