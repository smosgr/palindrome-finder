import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PalindromeFinderTest {

    final Input input = new Input();

    @Test
    public void check_One_Character_Is_Palindrome() {

        //when
        String oneCharacter = "a";

        //then
        assertTrue(checkPalindromeInSequence(oneCharacter));
    }

    @Test
    public void check_Given_String_Is_Reverse_Of_Itself() {

        //when
        String firstPalindrome = "radar";

        //then
        assertTrue(checkPalindromeInSequence(firstPalindrome));
    }

    @Test
    public void check_Given_String_Is_Not_Reverse_Of_Itself() {

        //when
        String firstPalindrome = "not_palindrome";

        //then
        assertFalse(checkPalindromeInSequence(firstPalindrome));
    }

    @Test
    public void check_Multiple_Palindromes_Can_Be_Found_In_One_String() {

        //when
        String multiplePalindromes = "radar-radar-radar";

        //then
        assertTrue(checkPalindromeInSequence(multiplePalindromes));
    }

    @Test
    public void find_Palindrome_Between_Random_Characters() {

        //when
        String inBetweenPalindrome = "aradar";

        //then
        assertEquals("radar", suspectedPalindromeInSequence(inBetweenPalindrome));

    }

    @Test
    public void find_Single_Character_Palindrome_Between_Other_Characters() {

        //when
        String singleCharPalindrome = "aaaaadar";

        //then
        assertEquals("r", suspectedPalindromeInSequence(singleCharPalindrome));

    }

    @Test
    public void space_is_not_considered_as_palindrome() {

        //when
        String space = "";

        //then
        assertEquals("No palindrome found.", suspectedPalindromeInSequence(space));

    }

    @Test
    public void pop_is_the_first_palindrome_in_provided_string() {

        //then
        assertEquals("pop", suspectedPalindromeInSequence(input.getProvidedInput()));

    }


    @Test
    public void s_is_an_example_of_single_palindrome_in_provided_string() {

        //then
        assertTrue(new PalindromeFinder().findPalindromes(input.getProvidedInput()).contains("s"));

    }


    @Test
    public void hijkllkjih_is_an_example_of_long_palindrome_in_provided_string() {

        //then
        assertTrue(new PalindromeFinder().findPalindromes(input.getProvidedInput()).contains("hijkllkjih"));

    }

    @Test
    public void z_is_an_example_of_long_palindrome_in_provided_string() {

        //then
        assertTrue(new PalindromeFinder().findPalindromes(input.getProvidedInput()).contains("z"));

    }


    private String suspectedPalindromeInSequence(String palindrome) {
        return new PalindromeFinder().suspectedPalindrome(palindrome);
    }


    private boolean checkPalindromeInSequence(String palindrome) {
        return new PalindromeFinder().confirmPalindrome(palindrome);
    }


}