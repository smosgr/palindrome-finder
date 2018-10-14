public class Palindrome {

    public Palindrome() {
    }

    public boolean checkForPalindrome(String firstPalindrome) {

        String reverse = "";

        for (int i = firstPalindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + firstPalindrome.charAt(i);
        }

        if (firstPalindrome.equals(reverse))
            return true;
        else
            return false;
    }
}
