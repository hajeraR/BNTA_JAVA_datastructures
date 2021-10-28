package com.datastructures.testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {

    @Test
    void itShouldCheckCorrectNumberOfBrackets() {
        //given
        String input = "({})";

        //when
        BracketChecker checker = new BracketChecker();
        boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void itShouldCheckInCorrectNumberOfBrackets() {
        //given
        String input = "({(})";

        //when
        BracketChecker checker = new BracketChecker();
        boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    void itShouldCheckNullNumberOfBrackets() {
        //given
        String input = "";

        //when
        BracketChecker checker = new BracketChecker();
        Boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void itShouldNotWorkWithOneOpeningBracket() {
        //given
        String input = "[";

        //when
        BracketChecker checker = new BracketChecker();
        Boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    void itShouldWorkWithALongSetOfCorrectNumberBrackets() {
        //given
        String input = "{([(([{}]))])}";

        //when
        BracketChecker checker = new BracketChecker();
        Boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    void itShouldWorkWithALongSetOfInCorrectNumberBrackets() {
        //given
        String input = "{([(([{]))])}";

        //when
        BracketChecker checker = new BracketChecker();
        Boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(false);
    }

    @Test
    void itShouldNotWorkWithAnInputWithoutBrackets() {
        //given
        String input = " ";

        //when
        BracketChecker checker = new BracketChecker();
        Boolean actual = checker.bracketChecker(input);

        //then
        assertThat(actual).isEqualTo(true);
    }
}