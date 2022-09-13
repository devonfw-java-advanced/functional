package examples;

import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {
        example1OptionalOfIfPresent();
        example2OptionalOfNullableIfPresentOrElse();

        /**
         * Optional.orElseGet() uses Supplier as an argument.
         */
        Optional<String> optionalNullableText = Optional.ofNullable(null);
        String string = optionalNullableText.orElseGet(() -> OptionalsExample.getEmptyString()); // OptionalsExample::getEmptyString
    }

    private static String getEmptyString() {
        return "";
    }

    private static void example2OptionalOfNullableIfPresentOrElse() {
        /**
         * Use Optional.ofNullable() for safety.
         */
        String text = null;
        Optional<String> optionalTextSafe = Optional.ofNullable(text);
        System.out.println("Optional or else: " + optionalTextSafe.orElse("alternative text"));
        optionalTextSafe.ifPresentOrElse(System.out::println, () -> System.out.println("Here is a null"));
    }

    private static void example1OptionalOfIfPresent() {
        /**
         * Optional.of() has to be used on non-null value.
         */
        String text = "I'm a plain text";
        Optional<String> optionalText = Optional.of(text);
        optionalText.ifPresent(System.out::println);
    }
}
