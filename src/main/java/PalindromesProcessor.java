import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class PalindromesProcessor {


    public PalindromesProcessor() {
    }


    public int retrieveLength(String palindrome) {

        return palindrome.length();

    }


    public TreeMap<Integer, String> retrieveSortedPalindromesInTreeMap(List<String> allPalindromes) {

        TreeMap<Integer, String> palindromesSortedTreeMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 1; i <= allPalindromes.size() - 1; i++) {
            palindromesSortedTreeMap.put(retrieveLength(allPalindromes.get(i)), allPalindromes.get(i));

        }

        return palindromesSortedTreeMap;

    }

    public int retrieveIndex(List<String> allPalindromes, int node) {

        int index = 0;
        for (int i = 1; i <= allPalindromes.size() - 1; i++) {
            index = index + retrieveLength(allPalindromes.get(i - 1));
            if (i == node)
                return index;
        }

        return -1;
    }

    public int retrieveIndexByString(List<String> allPalindromes, String longerValue) {

        int index = 0;
        for (int i = 1; i <= allPalindromes.size() - 1; i++) {
            index = index + retrieveLength(allPalindromes.get(i - 1));

            if (allPalindromes.get(i).equals(longerValue)) {
                return index;
            }
        }

        return index;
    }


}




