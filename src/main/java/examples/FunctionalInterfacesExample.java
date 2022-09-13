package examples;

import common.DataFactory;
import common.model.Author;
import common.model.Book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        example1Sort();
        example2BinaryOperator();
        example3EffectivelyFinal();
        example4EffectivelyFinalInside();
        example5ExceptionHandling();
    }

    private static void example5ExceptionHandling() {
        /**
         * No checked exceptions inside lambda.
         */
        List<String> numbers = Arrays.asList("3", "7", "upps");
        numbers.forEach(str -> {
            try {
                int num = Integer.parseInt(str);
                System.out.println("Number parsed: " + num);
            } catch(NumberFormatException e) {
                System.err.println("Number NOT parsed: " + e.getMessage());
                // throw new RuntimeException(e); // RuntimeException can be always thrown, but it has to be caught somewhere finally
            }
        });
    }

    private static void example4EffectivelyFinalInside() {
        int numberOfTolkiensBooks = 0;
        /**
         * Local variables inside lambda expression have to be effectively final.
         */
        for(Book book : DataFactory.getBooks()) {
            if (book.getAuthor() == Author.J_R_R_TOLKIEN) {
                numberOfTolkiensBooks++;
            }
        }

        Set<Book> tolkiensBooks = new HashSet<>();
        DataFactory.getBooks().forEach(book -> {
            if (book.getAuthor() == Author.J_R_R_TOLKIEN) {
                // numberOfTolkiensBooks++; // compile error: Variable must be effectively final
                tolkiensBooks.add(book);
            }
        });
        System.out.println("Number of Tolkien's books: " + tolkiensBooks.size());
    }

    private static void example3EffectivelyFinal() {
        /**
         * The variable used in lambda expression must be effective final.
         */
        Author author = Author.T_PRATCHETT;
        Predicate<Book> authorPredicate = book -> book.getAuthor() == author;
        // ! the variable used in lambda expression have to be effectively final
        // author = Author.A_SAPKOWSKI;
    }

    private static void example2BinaryOperator() {
        /**
         * First we create a BinaryOperator instance and then we apply some argument to get a result
         */
        BinaryOperator<Integer> exampleBinaryOperator = (x, y) -> x - y;
        Integer exampleBinaryOperatorResult = exampleBinaryOperator.apply(25, 10);
        System.out.println("The result for this operator usage was: " + exampleBinaryOperatorResult);
    }

    private static void example1Sort() {
        /**
         * Sort unordered words
         */
        List<String> words = DataFactory.getSomeUnorderedWords();
        words.sort((w1, w2) -> {
            return w1.compareTo(w2);
        });
        words.forEach(System.out::println);
    }
}
