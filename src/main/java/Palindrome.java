import java.util.List;

public interface Palindrome {

    boolean confirmPalindrome(String palindrome);

    String suspectedPalindrome(String input);

    List<String> findPalindromes(String input);
}
