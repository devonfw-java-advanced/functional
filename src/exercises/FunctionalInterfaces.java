package exercises;

import common.DataFactory;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> x * 5;
        Integer unaryOperatorResult = unaryOperator.apply(25);

        // BinaryOperator
        BinaryOperator<BigInteger> binaryOperator = BigInteger::add;
        BigInteger binaryOperatorResult = binaryOperator.apply(BigInteger.valueOf(10L), BigInteger.valueOf(5L));

        // Predicate
        Predicate<String> predicate = String::isEmpty;
        Boolean isStringEmpty = predicate.test("asd");

        // Function
        Function<List<String>,String> convertListToString = list -> Arrays.toString(list.toArray());
        String convertedList = convertListToString.apply(Arrays.asList("one", "two", "three"));

        // Supplier
        Supplier<String> supplier = DataFactory::getSuppliedText;
        String suppliedText = supplier.get();

        // Consumer
        Consumer<String> consumer = s -> System.out.println("Lemme print something for you: " + s);
        consumer.accept("consumer seems to be working");
    }
}
