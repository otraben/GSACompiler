package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
        int x = 0;
        x = 5;
        int y = x - 12;
        int z;
		int  w;
        y = 4;
        if((x == (2 * y))) {
        	y = 10;
        	x = 5;
        	z = 4;
        }
        else {
			if (x == 1) {
        	y = 12;
        	z = 3;
        }
        else {
        	x = 5;
        	z = 2;
        }
		}
        
        System.out.println(y + z);
    }
}
