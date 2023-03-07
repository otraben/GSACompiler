package gsa;


public class Main {

    public static void main(String[] args) {

    	for(String inputFilename : args) {
    		Translator translator = new Translator(inputFilename);
            translator.translate();
    	}
    }
    
}