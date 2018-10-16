import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PalindromesProcessorTest {

    private List<String> allPalindromes = new PalindromeFinder().findPalindromes(new Input().getProvidedInput());


    @Test
    public void retrieves_length_of_second_palindrome() {

        //when-then
        assertEquals(4, new PalindromesProcessor().retrieveLength(allPalindromes.get(1)));
    }


    @Test
    public void retrieves_index_of_second_palindrome() {

        //when-then
        assertEquals(5, new PalindromesProcessor().retrieveIndex(allPalindromes, 2));
    }


    @Test
    public void retrieves_max_length_value_and_length_in_palindromes_tree() {

        //when-then
        assertTrue(new PalindromesProcessor().retrieveSortedPalindromesInTreeMap(allPalindromes).containsKey(10));
        assertTrue(new PalindromesProcessor().retrieveSortedPalindromesInTreeMap(allPalindromes).containsValue("hijkllkjih"));
    }


    @Test
    public void retrieve_index_for_a_string_in_palindromes_tree() {

        assertEquals(23, new PalindromesProcessor().retrieveIndexByString(allPalindromes, "hijkllkjih"));
    }

}