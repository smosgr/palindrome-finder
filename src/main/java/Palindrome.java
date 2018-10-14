public class Palindrome {

    public Palindrome() {
    }

    public boolean checkForPalindrome(String palindrome) {

        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }

        if (palindrome.equals(reverse))
            return true;
        else
            return false;
    }
}
