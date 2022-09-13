package exercises;

import common.DataFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static common.DataFactory.getEmptyOptional;
import static exercises.TestTools.failMsg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalTests {

    private Optionals exercises = new Optionals();

    @Test
    @DisplayName("Exercise 2a: check if is present")
    public void isPresent() {
        // when
        boolean isPresent = exercises.isPresent(DataFactory.getOptionalValue());
        // then
        assertTrue(isPresent, failMsg("2a"));
    }

    @Test
    @DisplayName("Exercise 2b: check if is empty")
    public void empty() {
        // when
        boolean isEmpty = exercises.isEmpty(DataFactory.getEmptyOptional());
        // then
        assertTrue(isEmpty, failMsg("2b"));
    }

    @Test
    @DisplayName("Exercise 2c: print if present")
    public void ifPresent() {
        // given
        TestTools.PrintTestStreamer testStreamer = new TestTools.PrintTestStreamer(System.out);
        // when
        exercises.ifPresent(DataFactory.getOptionalValue(), testStreamer);
        // then
        assertEquals(1, testStreamer.getCallCount(), failMsg("2c"));
        assertEquals("I'm not empty!", testStreamer.getPrintedText(), failMsg("2c"));
    }

    @Test
    @DisplayName("Exercise 2d: or else")
    public void orElse() {
        // when
        String notPresentContent = exercises.orElse(getEmptyOptional());
        // then
        assertEquals("I'm empty", notPresentContent, failMsg("2d"));
    }

    @Test
    @DisplayName("Exercise 2e: or else get")
    public void orElseGet() {
        // when
        String callIfEmptyContent = exercises.orElseGet(DataFactory.getEmptyOptional());
        // then
        assertEquals("Nothing was found here either", callIfEmptyContent, failMsg("2e"));
    }

    @Test
    @DisplayName("Exercise 2f: return another optional if the first was empty")
    public void or() {
        // given
        final String nonEmptyOptionalString = "New not empty optional";
        // when
        Optional<String> notEmptyOptional = exercises.or(getEmptyOptional(), nonEmptyOptionalString);
        // then
        assertEquals(nonEmptyOptionalString, notEmptyOptional.get(), failMsg("2f"));
    }

    @Test
    @DisplayName("Exercise 2g: if present or else")
    public void ifPresentOrElse() {
        // given
        TestTools.PrintTestStreamer testStreamer = new TestTools.PrintTestStreamer(System.out);
        final String empty = "Empty";
        // when
        exercises.ifPresentOrElse(empty, testStreamer);
        // then
        assertEquals(1, testStreamer.getCallCount(), failMsg("2g"));
        assertEquals(empty, testStreamer.getPrintedText(), failMsg("2g"));
    }

    @Test
    @DisplayName("Exercise 2h: optional to list")
    public void stream() {
        // when
        List<String> stringList = exercises.stream(DataFactory.getOptionalValue());
        // then
        Assertions.assertThat(stringList)
                .describedAs("2h")
                .containsExactly("I'M NOT EMPTY!");
    }
}
