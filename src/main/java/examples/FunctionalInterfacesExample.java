package examples;

import java.util.function.BinaryOperator;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {

        /**
         * First we create a BinaryOperator instance and then we apply some argument to get a result
         */
        BinaryOperator<Integer> exampleBinaryOperator = (x, y) -> x - y;
        Integer exampleBinaryOperatorResult = exampleBinaryOperator.apply(25, 10);
        System.out.println("The result for this operator usage was: " + exampleBinaryOperatorResult);
    }
}
