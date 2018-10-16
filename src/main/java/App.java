import java.util.List;

public class App {

    public static void main(String[] args) {

        System.out.println("Application starting...\n");
        init();
    }

    private static void init() {


        //initialising objects
        Input input = new Input();
        PalindromesProcessor palindromesProcessor = new PalindromesProcessor();
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        Printer printer = new Printer();

        //preparing content
        String providedString = input.getProvidedInput();
        List<String> allPalindromes = palindromeFinder.findPalindromes(providedString);


        //output call
        String output = printer.printOutcome(palindromesProcessor
                .retrieveSortedPalindromesInTreeMap(allPalindromes), allPalindromes);

        System.out.println(output);

    }


}
