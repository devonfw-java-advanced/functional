package exercises;

import common.DataFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static exercises.TestTools.failMsg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FunctionalInterfacesTest {

    private FunctionalInterfaces exercises = new FunctionalInterfaces();

    @Test
    @DisplayName("Exercise 1a: multiply by 5")
    public void multiply() {
        // when
        Integer multiply = exercises.multiplyBy5(25);
        // then
        assertEquals(125, multiply, failMsg("1a"));
    }

    @Test
    @DisplayName("Exercise 1b: add two numbers")
    public void sum() {
        // when
        BigInteger sum = exercises.sum(BigInteger.valueOf(10L), BigInteger.valueOf(5L));
        // then
        assertEquals(BigInteger.valueOf(15L), sum, failMsg("1b"));
    }

    @Test
    @DisplayName("Exercise 1c: check if the string is empty")
    public void empty() {
        // when
        boolean empty = exercises.empty("asd");
        // then
        assertFalse(empty, failMsg("1c"));
    }

    @Test
    @DisplayName("Exercise 1d: concatenate string list to string")
    public void concat() {
        // given
        List<String> stringList = Arrays.asList("one", "two", "three");
        // when
        String concatenated = exercises.concat(stringList);
        // then
        assertEquals("[one, two, three]", concatenated, failMsg("1d"));
    }

    @Test
    @DisplayName("Exercise 1e: print text to a PrintStream object")
    public void supplierGet() {
        // when
        String suppliedText = exercises.supplyText();
        // then
        assertEquals(DataFactory.getSuppliedText(), suppliedText, failMsg("1e"));
    }

    @Test
    @DisplayName("Exercise 1f: print text to a PrintStream object")
    public void print() {
        // given
        TestTools.PrintTestStreamer testStreamer = new TestTools.PrintTestStreamer(System.out);
        // when
        exercises.printText("Consumer seems to be working", testStreamer);
        // then
        assertEquals(1, testStreamer.getCallCount(), failMsg("1f"));
    }

}
