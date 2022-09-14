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
    @DisplayName("Exercise 3a: check if is present")
    public void isPresent() {
        // when
        boolean isPresent = exercises.isPresent(DataFactory.getOptionalValue());
        // then
        assertTrue(isPresent, failMsg("3a"));
    }

    @Test
    @DisplayName("Exercise 3b: check if is empty")
    public void empty() {
        // when
        boolean isEmpty = exercises.isEmpty(getEmptyOptional());
        // then
        assertTrue(isEmpty, failMsg("3b"));
    }

    @Test
    @DisplayName("Exercise 3c: print if present")
    public void ifPresent() {
        // given
        TestTools.PrintTestStreamer testStreamer = new TestTools.PrintTestStreamer(System.out);
        // when
        exercises.ifPresent(DataFactory.getOptionalValue(), testStreamer);
        // then
        assertEquals(1, testStreamer.getCallCount(), failMsg("3c"));
        assertEquals("I'm not empty!", testStreamer.getPrintedText(), failMsg("3c"));
    }

    @Test
    @DisplayName("Exercise 3d: or else")
    public void orElse() {
        // when
        String notPresentContent = exercises.orElse(getEmptyOptional());
        // then
        assertEquals("I'm empty", notPresentContent, failMsg("3d"));
    }

    @Test
    @DisplayName("Exercise 3e: or else get")
    public void orElseGet() {
        // when
        String callIfEmptyContent = exercises.orElseGet(getEmptyOptional());
        // then
        assertEquals("Nothing was found here either", callIfEmptyContent, failMsg("3e"));
    }

    @Test
    @DisplayName("Exercise 3f: return another optional if the first was empty")
    public void or() {
        // given
        final String nonEmptyOptionalString = "New not empty optional";
        // when
        Optional<String> notEmptyOptional = exercises.or(getEmptyOptional(), nonEmptyOptionalString);
        // then
        assertEquals(nonEmptyOptionalString, notEmptyOptional.get(), failMsg("3f"));
    }

    @Test
    @DisplayName("Exercise 3g: if present or else")
    public void ifPresentOrElse() {
        // given
        TestTools.PrintTestStreamer testStreamer = new TestTools.PrintTestStreamer(System.out);
        final String empty = "Empty";
        // when
        exercises.ifPresentOrElse(getEmptyOptional(), empty, testStreamer);
        // then
        assertEquals(1, testStreamer.getCallCount(), failMsg("3g"));
        assertEquals(empty, testStreamer.getPrintedText(), failMsg("3g"));
    }

    @Test
    @DisplayName("Exercise 3h: optional to list")
    public void stream() {
        // when
        List<String> stringList = exercises.stream(DataFactory.getOptionalValue());
        // then
        Assertions.assertThat(stringList)
                .describedAs("3h")
                .containsExactly("I'M NOT EMPTY!");
    }
}
