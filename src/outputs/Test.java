package outputs;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
        int x = 0;
        x = 5;
        int y = x - 12;
        y = 4;
        if((x == (2 * y))) {
        	y = 10;
        	x = 5;
        }
        else if (x == 1) {
        	y = 12;
        }
        else {
        	x = 5;
        }
        
        System.out.println(y);
    }
}
