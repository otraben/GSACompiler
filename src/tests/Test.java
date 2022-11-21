package tests;

// tests basic SSA and a basic if/else statement
public class Test {
    public static void main(String[] args) {
        int x = 0;
        x = 5;
        int y = 7;
        y = 4;
        if((x == (2 * y))) {
        	y = 10;
        	x = 5;
        }
        else if (x == 1) {
        	y = 12;
        }
        
        System.out.println(y);
    }
}
