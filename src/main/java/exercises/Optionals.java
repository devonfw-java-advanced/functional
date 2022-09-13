package exercises;

import java.io.PrintStream;
import java.util.List;
import java.util.Optional;

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
     * Please check if optional value is present
     */
    public boolean isPresent(Optional<String> optional) {
        // TODO: implement
        return false;
    }

    /**
     * Please check if empty optional is empty
     */
    public boolean isEmpty(Optional<String> optional) {
        // TODO: implement
        return false;
    }

    /**
     * Please use a SINGLE method to determine if optional value is present
     * if so, please display the contents of optional to the PrintStream object.
     */
    public void ifPresent(Optional<String> optional, PrintStream printer) {
        // TODO: implement
    }

    /**
     * Please use a SINGLE method to determine if empty optional value is present
     * if not please return a string with an information that it is not present
     */
    public String orElse(Optional<String> optional) {
        // TODO: implement
        return null;
    }

    /**
     * Please use a SINGLE method to determine if empty optional value is present
     * if not please call a method that provides empty optional detection info.
     */
    public String orElseGet(Optional<String> optional) {
        // TODO: implement
        return null;
    }

    /**
     * Please use a SINGLE method to return another (non-empty) optional of string passed to the method in case the first was empty.
     *
     * !two solutions possible
     * !in case the first optional is NOT empty please return it
     * !in case the first optional is empty please use a supplier functional interface to return a new optional of the same type.
     */
    public Optional<String> or(Optional<String> optional, String nonEmptyOptionalInfo) {
        // TODO: implement
        return null;
    }

    /**
     * Please use a SINGLE method to determine if optional is present and handle two cases:
     * if it is present please display its contents on the console
     * else please display a message that the first optional was empty to the PrintStream object.
     */
    public void ifPresentOrElse(String emptyInfo, PrintStream printer) {
        // TODO: implement
    }

    /**
     * Please use a method to stream the optional value and return a list of its contents converted to upper case.
     */
    public List<String> stream(Optional<String> optionalValue) {
        // TODO: implement
        return null;
    }

}
