import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void check_Given_String_Is_Reverse_Of_Itself() {

        //given
        String firstPalindrome = "radar";

        //when-then
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.checkForPalindrome(firstPalindrome));
    }

    @Test
    public void check_Given_String_Is_not_Reverse_Of_Itself() {

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

    private boolean checkPalindromeInSequence(String twoPalindromes) {
        return new Palindrome().checkForPalindrome(twoPalindromes);
    }


}