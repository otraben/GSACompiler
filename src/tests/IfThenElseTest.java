package tests;
import java.util.ArrayList;

public class IfThenElseTest {

  public static double multiply(int q, int p) {
    double g = 8.5;

    if (p < 4)
      if (p > 4)
        p = 0;
      else
        g = 1;
    else
      g = 7;

    return g;
  }
  
  public static void main(String[] args) {
	  System.out.println(multiply(4,5));
  }
}