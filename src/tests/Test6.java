package tests;

// EDGE CASE REMINDER: alternative assignment operators (+=, -=, etc.) are not functional with Phi.Entry functions
// how important is runtime? would it be bad to go through the input file once beforehand to "pre-process" the code?
	// turn all for loops into while loops
	// turn all assignment operators into '=' operators
	// this would make life much easier

// tests for loops
public class Test6 {
	public static void main(String[] args) {
		int x = 1;
		for(int i = x - 12; i < 10; i++) {
			x = x + 1;
		}
		System.out.println(x);
	}
}
