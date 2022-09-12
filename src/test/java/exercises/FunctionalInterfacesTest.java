package exercises;

import common.DataFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FunctionalInterfacesTest {

    private static final String FAIL_SOLUTION = ": Your solution does not return the correct result.";

    private FunctionalInterfaces exercises = new exercises.FunctionalInterfaces();

    private String failMsg(String exNum) {
        return "Exercise " + exNum + FAIL_SOLUTION;
    }

    @Test
    @DisplayName("Exercise 1a: multiply by 5")
    public void multiply() {
        Integer multiply = exercises.multiplyBy5(25);
        assertEquals(125, multiply, failMsg("1a"));
    }

    @Test
    @DisplayName("Exercise 1b: add two numbers")
    public void sum() {
        BigInteger sum = exercises.sum(BigInteger.valueOf(10L), BigInteger.valueOf(5L));
        assertEquals(BigInteger.valueOf(15L), sum, failMsg("1b"));
    }

    @Test
    @DisplayName("Exercise 1c: check if the string is empty")
    public void empty() {
        boolean empty = exercises.empty("asd");
        assertFalse(empty, failMsg("1c"));
    }

    @Test
    @DisplayName("Exercise 1d: concatenate string list to string")
    public void concat() {
        List<String> stringList = Arrays.asList("one", "two", "three");
        String concatenated = exercises.concat(stringList);
        assertEquals("[one, two, three]", concatenated, failMsg("1d"));
    }

    @Test
    @DisplayName("Exercise 1e: print text to a PrintStream object")
    public void supplierGet() {
        String suppliedText = exercises.supplyText();
        assertEquals(DataFactory.getSuppliedText(), suppliedText, failMsg("1e"));
    }

    @Test
    @DisplayName("Exercise 1f: print text to a PrintStream object")
    public void print() {
        PrintTestStreamer testStreamer = new PrintTestStreamer(System.out);
        exercises.printText("Consumer seems to be working", testStreamer);
        assertEquals(1, testStreamer.getCallCount(), failMsg("1f"));
    }

    private class PrintTestStreamer extends PrintStream {

        private int callCount;

        public PrintTestStreamer(OutputStream out) {
            super(out);
        }

        @Override
        public void println(String x) {
            callCount++;
            super.println(x);
        }

        public int getCallCount() {
            return callCount;
        }
    }
}
