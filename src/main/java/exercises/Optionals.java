package exercises;


import common.DataFactory;

import java.io.PrintStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Please complete all of below exercises using Optional API and data from @DataFactory class
 *
 * For data sources please use following methods:
 *
 * optional value - getOptionalValue() method
 * empty optional - getEmptyOptional() method
 * empty optional detection info - emptyOptionalInfo() method
 */
public class Optionals {

    /**
     * Solution 3a: Please check if optional value is present
     */
    public boolean isPresent(Optional<String> optional) {
        boolean isPresent = optional.isPresent();
        return isPresent;
    }

    /**
     * Solution 3b: Please check if empty optional is empty
     */
    public boolean isEmpty(Optional<String> optional) {
        boolean isEmpty = optional.isEmpty();
        return isEmpty;
    }

    /**
     * Solution 3c: Please use a SINGLE method to determine if optional value is present
     * if so, please display the contents of optional to the PrintStream object.
     */
    public void ifPresent(Optional<String> optional, PrintStream printer) {
        optional.ifPresent(printer::println);
    }

    /**
     * Solution 3d: Please use a SINGLE method to determine if empty optional value is present
     * if not please return a string with an information that it is not present
     */
    public String orElse(Optional<String> optional) {
        String ifOrElse = optional.orElse("I'm empty");
        return ifOrElse;
    }

    /**
     * Solution 3e: Please use a SINGLE method to determine if empty optional value is present
     * if not please call a method that provides empty optional detection info.
     *
     * Hint: always remember that you use reference to the method and NOT method invocation (static or non-static)
     * So that's why you cannot pass this: DataFactory.emptyOptionalInfo() in place of DataFactory::emptyOptionalInfo (this is NOT a replacement)
     */
    public String orElseGet(Optional<String> optional) {
        String ifOrElseGet = optional.orElseGet(DataFactory::emptyOptionalInfo);
        return ifOrElseGet;
    }

    /**
     * Solution 3f: Please use a SINGLE method to return another (non-empty) optional of string passed to the method in case the first was empty.
     *
     * !two solutions possible
     * !in case the first optional is NOT empty please return it
     * !in case the first optional is empty please use a supplier functional interface to return a new optional of the same type.
     */
    public Optional<String> or(Optional<String> optional, String nonEmptyOptionalInfo) {
        Optional<String> optionalOrAnotherOptional = optional.or(() -> Optional.of(nonEmptyOptionalInfo));
        return optionalOrAnotherOptional;
    }

    /**
     * Solution 3g: Please use a SINGLE method to determine if optional is present and handle two cases:
     * if it is present please display its contents on the console
     * else please display a message that the first optional was empty to the PrintStream object.
     */
    public void ifPresentOrElse(Optional<String> optional, String emptyInfo, PrintStream printer) {
        optional.ifPresentOrElse(printer::println, () -> printer.println(emptyInfo));
    }

    /**
     * Solution 3h: Please use a method to stream the optional value and return a list of its contents converted to upper case.
     */
    public List<String> stream(Optional<String> optionalValue) {
        List<String> strings = optionalValue.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return strings;
    }

}
