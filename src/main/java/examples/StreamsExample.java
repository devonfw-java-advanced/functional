package examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        example1Sort();
        example2Filter();
        example3Map();
        example4FlatMap();
    }

    private static void example1Sort() {
        /**
         * Sort list by stream.
         */
        List<Integer> sortedList = getExampleUnorderedIntegerList().stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList);
    }

    private static void example4FlatMap() {
        // flatMap
        List<String> flatmappedList = getExampledNestedStringList().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flatmapped list: " + flatmappedList);
    }

    private static void example3Map() {
        // map
        List<String> mappedList = getExampleStringList().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mapped list: " + mappedList);
    }

    private static void example2Filter() {
        // filter
        List<Integer> filteredList = getExampleIntegerList().stream()
                .filter(integer -> integer > 7)
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }

    private static List<List<String>> getExampledNestedStringList() {
        return Arrays.asList(Arrays.asList("first", "second"), Arrays.asList("third", "fourth"));
    }

    private static List<Integer> getExampleIntegerList() {
        return Arrays.asList(1, 10, 25);
    }

    private static List<Integer> getExampleUnorderedIntegerList() {
        return Arrays.asList(33, 2, 22, 7, 12);
    }

    private static List<String> getExampleStringList() {
        return Arrays.asList("first", "second", "third");
    }
}
