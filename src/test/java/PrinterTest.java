import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void print_out_the_longest_palindromes_of_provided_string() {


        PalindromesProcessor palindromesProcessor = new PalindromesProcessor();
        Printer printer = new Printer();

        String providedString = new Input().getProvidedInput();

        List<String> allPalindromes = new PalindromeFinder().findPalindromes(providedString);


        String expected = "  Text: hijkllkjih,  Index: 23,  Length: 10\n" +
                "  Text: defggfed,  Index: 13,  Length: 8\n" +
                "  Text: abccba,  Index: 5,  Length: 6\n";

        assertEquals(expected, printer.printOutcome(palindromesProcessor.retrieveSortedPalindromesInTreeMap(allPalindromes), allPalindromes));

    }

}