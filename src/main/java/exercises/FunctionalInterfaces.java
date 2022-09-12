package exercises;

import common.DataFactory;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {

        /**
         * Exercise 1a: Please create a UnaryOperator<Integer> instance that returns its parameter multiplied by 5.
         * After that please use it and return the result.
         */
        public Integer multiplyBy5(Integer num) {
            // TODO implementation
            return null;
        }

        /**
         * Exercise 1b: Please create a BinaryOperator<BigInteger> instance that returns the sum of its parameters.
         * After that please use it and return the result.
         */
        public BigInteger sum(BigInteger x, BigInteger y) {
                // TODO implementation
                return null;
        }

        /**
         * Exercise 1c: Please create a Predicate<String> instance that determines whether passed parameter is empty
         * After that please use it and return the result.
         */
        public boolean empty(String str) {
                // TODO implementation
                return true;
        }

        /**
         * Exercise 1d: Please create a Function<List<String>, String> instance that will take a list of strings,
         * convert it to array and then convert it to a string.
         * After that please use it and return the result.
         */
        public String concat(List<String> list) {
                // TODO implementation
                return null;
        }

        /**
         * Exercise 1e: Please create a Supplier<String> that would call on getSuppliedText() method.
         * After that please use it and return the result.
         */
        public String supplyText() {
                // TODO implementation
                return null;
        }

        /**
         * Exercise 1f: Please create a Consumer<String> that would display the parameter to the PrintStream object.
         */
        public void printText(String text, PrintStream printer) {
                // TODO implementation
        }
}
