package exercises;


import common.DataFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static common.DataFactory.*;

public class Optionals {

    public static void main(String[] args) {

        // isPresent
        boolean isPresent = getOptionalValue().isPresent();

        // isEmpty
        boolean isEmpty = getEmptyOptional().isEmpty();

        // ifPresent - print out the name
        getOptionalValue().ifPresent(System.out::println);

        // orElse
        String contentOfOptional = getEmptyOptional().orElse("Unfortunately it was empty");

        // orElseGet
        String orElseGetResult = getEmptyOptional().orElseGet(DataFactory::emptyOptionalInfo);

        // or
        Optional<String> orOptional = getEmptyOptional().or(() -> Optional.of("Had to get a second option"));

        // ifPresentOrElse
        getEmptyOptional().ifPresentOrElse(System.out::println, () -> System.out.println("Again, nothing was found"));

        // stream
        List<String> mappedListOfOptionals = getOptionalValue().stream().map(String::toUpperCase).collect(Collectors.toList());

    }
}
