import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void test_Three_Longest_Palindromes_Are_Printed_Out() {

        //when
        Printer printer = new Printer();
        String actual = printer.printOutcome();

        //then
        String expected = "Text: hijkllkjih, Index: 23, Length: 10 +\n"
                + "Text: defggfed, Index: 13, Length: 8 + \n"
                + "Text: abccba, Index: 5 Length: 6+ \n";

        assertEquals(expected, actual);

    }

}