import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeFinder implements Palindrome {

    private static final String NO_PALINDROME_FOUND = "No palindrome found.";
    private List<String> palindromes = new ArrayList<>();

    public PalindromeFinder() {
    }

    public boolean confirmPalindrome(String palindrome) {

        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }

        return palindrome.equals(reverse) ? true : false;
    }


    public String suspectedPalindrome(String input) {

        String palindrome = "";

        for (int i = input.length(); i >= 0; i--) {

            for (int j = 0; j < input.length(); j++) {

                if (input.charAt(i - 1) == input.charAt(j)) {
                    if (confirmPalindrome(input.substring(j, i))) {
                        palindrome = input.substring(j, i);
                    }

                    return palindrome;
                }
            }

        }
        return NO_PALINDROME_FOUND;
    }


    public List<String> findPalindromes(String input) {

        int i = 0;
        String output;

        while (input.length() - 1 >= 0) {
            output = suspectedPalindrome(input);

            if (!output.equals(NO_PALINDROME_FOUND)) {

                palindromes.add(i, output);
                input = input.replaceFirst(output, "");
            }

            i++;
        }

        Collections.reverse(palindromes);
        return palindromes;
    }


}