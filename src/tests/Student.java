package tests;

public class Student
{
	public static String name = "Josh";
    // Marks in various subjects
    public static int english;
    public static int telugu;
    public static int hindi;
    public static int maths;
    public static int science;
    public static int social;

    public static int getLanguagesTotal()
    {
        return english + telugu + hindi;
    }

    public static int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    public static int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    public static double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }

    public static void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }

    public static void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Telugu : " + telugu);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
    }
    
    public static void main(String[] args) {
    	name = "Srinivas";
        english = 87;
        telugu = 84;
        hindi = 76;
        maths = 100;
        science = 92;
        social = 88;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        printMarksSummary();
        System.out.println("-------------------------------------------------"); 
    }
}
