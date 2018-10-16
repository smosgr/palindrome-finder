import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Printer {


    public Printer() {
    }


    public String printOutcome(TreeMap<Integer, String> sortedPalindromes, List<String> allPalindromes) {

        PalindromesProcessor palindromesProcessor = new PalindromesProcessor();


        String outcome = "";

        List<String> values = sortedPalindromes
                .values()
                .stream()
                .limit(3)
                .collect(Collectors
                        .toList());

        List<Integer> lengths = sortedPalindromes
                .keySet()
                .stream()
                .limit(3)
                .collect(Collectors
                        .toList());


        for (int i = 0; i < 3; i++) {

            outcome = outcome.concat("  Text: " + values.get(i)
                    + ",  Index: "
                    + palindromesProcessor.retrieveIndexByString(allPalindromes, values.get(i))
                    + ",  Length: "
                    + lengths.get(i) + "\n");
        }

        return outcome;
    }
}
