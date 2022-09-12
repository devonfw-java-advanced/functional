package exercises;


import common.DataFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static common.DataFactory.*;

public class Optionals {

    /**
     * Please complete all of below exercises using Optional API and data from @DataFactory class
     *
     * For data sources please use following methods:
     *
     * optional value - getOptionalValue() method
     * empty optional - getEmptyOptional() method
     * empty optional detection info - emptyOptionalInfo() method
     *
     */
    public static void main(String[] args) {

        // isPresent
        /**
         * Please check if optional value is present
         */
        boolean isPresent = false;

        // isEmpty
        /**
         * Please check if empty optional is empty
         */
        boolean isEmpty = false;

        // ifPresent - print out the name
        /**
         * Please use a SINGLE method to determine if optional value is present
         * if so, please display the contents of optional on the console
         */
        // code

        // orElse
        /**
         * Please use a SINGLE method to determine if empty optional value is present
         * if not please return a string with an information that it is not present
         */
        String contentOfOptional = null;

        // orElseGet
        /**
         * Please use a SINGLE method to determine if empty optional value is present
         * if not please call a method that provides empty optional detection info
         */
        String orElseGetResult = null;

        // or
        /**
         * Please use a SINGLE method to return another optional in case the first was empty
         *
         * !two solutions possible
         * !in case the first optional is NOT empty please return it
         * !in case the first optional is empty please use a supplier funtional interface to return a new optional of the same type
         */
        Optional<String> orOptional = null;

        // ifPresentOrElse
        /**
         * Please use a SINGLE method to determine if optional is present and handle two cases:
         * if it is present please display its contents on the console
         * else please display a message that the first optional was empty on the console
         */
        // code

        // stream
        /**
         * Please use a method to stream the optional value and return a list of its contents converted to upper case
         */
        List<String> mappedListOfOptionals = null;

    }
}
