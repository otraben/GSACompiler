package outputs;

public class Student
{
	public static Var<String> name_0 = new Var<String>("Josh");
    // Marks in various subjects
    public static Var<Integer> english_0;
    public static Var<Integer> telugu_0;
    public static Var<Integer> hindi_0;
    public static Var<Integer> maths_0;
    public static Var<Integer> science_0;
    public static Var<Integer> social_0;

    public static int getLanguagesTotal()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return english_0.value + telugu_0.value + hindi_0.value;
    }

    public static int getNonLanguagesTotal()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return maths_0.value + science_0.value + social_0.value;
    }

    public static int getAllSubjectsTotal()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return getLanguagesTotal() + getNonLanguagesTotal();
    }

    public static double getPCMPercentage()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return 100.0 * (maths_0.value + science_0.value) / 200.0;
    }

    public static void printMarksSummary()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }

    public static void printMarksDetails()
    {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		System.out.println("English : " + english_0.value);
        System.out.println("Telugu : " + telugu_0.value);
        System.out.println("Hindi : " + hindi_0.value);
        System.out.println("Maths : " + maths_0.value);
        System.out.println("Science : " + science_0.value);
        System.out.println("Social : " + social_0.value);
    }
    
    public static void main(String[] args) {
		// formal parameters
		Var<String[]> args_0 = new Var<String[]>(args);

		// all variables are declared to null
		Var<String> name_1 = null;
		Var<Integer> english_1 = null;
		Var<Integer> telugu_1 = null;
		Var<Integer> hindi_1 = null;
		Var<Integer> maths_1 = null;
		Var<Integer> science_1 = null;
		Var<Integer> social_1 = null;
    	
		/* PROGRAM STARTS */
		name_1 = new Var<String>("Srinivas");
        english_1 = new Var<Integer>(87);
        telugu_1 = new Var<Integer>(84);
        hindi_1 = new Var<Integer>(76);
        maths_1 = new Var<Integer>(100);
        science_1 = new Var<Integer>(92);
        social_1 = new Var<Integer>(88);
        
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
