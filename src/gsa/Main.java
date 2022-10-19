package gsa;


public class Main {

    public static void main(String[] args) {

        String inputFilename = args[0];

        Translator translator = new Translator(inputFilename);
        translator.translate();
    }
    
}
