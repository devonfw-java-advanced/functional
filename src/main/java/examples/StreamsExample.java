package examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        // filter
        List<Integer> filteredList = getExampleIntegerList().stream()
                .filter(integer -> integer > 7)
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);

        // map
        List<String> mappedList = getExampleStringList().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mapped list: " + mappedList);

        // flatmap
        List<String> flatmappedList = getExampledNestedStringList().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flatmapped list: " + flatmappedList);
    }

    private static List<List<String>> getExampledNestedStringList() {
        return Arrays.asList(Arrays.asList("first", "second"), Arrays.asList("third", "fourth"));
    }

    private static List<Integer> getExampleIntegerList() {
        return Arrays.asList(1, 10, 25);
    }


    private static List<String> getExampleStringList() {
        return Arrays.asList("first", "second", "third");
    }
}
