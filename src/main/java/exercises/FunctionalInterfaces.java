package exercises;

import common.DataFactory;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {

    /**
     * Solution 1a: Please create a UnaryOperator<Integer> instance that returns its parameter multiplied by 5.
     * After that please use it and return the result.
     */
    public Integer multiplyBy5(Integer num) {
        UnaryOperator<Integer> multiply = a -> a * 5;
        return multiply.apply(num);
    }

    /**
     * Solution 1b: Please create a BinaryOperator<BigInteger> instance that returns the sum of its parameters.
     * After that please use it and return the result.
     */
    public BigInteger sum(BigInteger x, BigInteger y) {
        BinaryOperator<BigInteger> sum = (a, b) -> a.add(b); // sum = BigInteger::add;
        return sum.apply(x, y);
    }

    /**
     * Solution 1c: Please create a Predicate<String> instance that determines whether passed parameter is empty
     * After that please use it and return the result.
     */
    public boolean empty(String str) {
        Predicate<String> empty = s -> s.isEmpty(); // empty = String::isEmpty;
        return empty.test(str);
    }

    /**
     * Solution 1d: Please create a Function<List<String>, String> instance that will take a list of strings,
     * convert it to array and then convert it to a string.
     * After that please use it and return the result.
     */
    public String concat(List<String> list) {
        Function<List<String>, String> stringFromList = strings -> Arrays.toString(strings.toArray());
        return stringFromList.apply(list);
    }

    /**
     * Solution 1e: Please create a Supplier<String> that would call on getSuppliedText() method.
     * After that please use it and return the result.
     */
    public String supplyText() {
        Supplier<String> suppliedText = () -> DataFactory.getSuppliedText(); // suppliedText = DataFactory::getSuppliedText();
        return suppliedText.get();
    }

    /**
     * Solution 1f: Please create a Consumer<String> that would display the parameter to the PrintStream object.
     */
    public void printText(String text, PrintStream printer) {
        Consumer<String> consolePrinter =  a -> printer.println(a); // printer::println;
        consolePrinter.accept(text);
    }
}
