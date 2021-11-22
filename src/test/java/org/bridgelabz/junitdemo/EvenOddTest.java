package org.bridgelabz.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import java.util.stream.Stream;

public class EvenOddTest {

    @Test
    public void shouldReturnTrueIfEvenNumberIsPassed() {
        EvenOdd evenOdd = new EvenOdd();
        Assertions.assertTrue(evenOdd.check(12));
    }

    @Test
    public void shouldReturnFalseIfOddNumberIsPassed() {
        EvenOdd evenOdd = new EvenOdd();
        Assertions.assertFalse(evenOdd.check(11));
    }

    @ParameterizedTest
    @MethodSource("getCollectionValues")
    public void shouldReturnTrueIfEvenNumbersIsPassed(Integer number, Boolean expectedResult) {
        EvenOdd evenOdd = new EvenOdd();
        System.out.println(number + ": " + expectedResult);
        Assertions.assertEquals(expectedResult, evenOdd.check(number));
    }


    private static Stream<Arguments> getCollectionValues() {
        return Stream.of(
                Arguments.of(0, true),
                Arguments.of(1, false),
                Arguments.of(2, true),
                Arguments.of(23, false)
        );
    }

}
