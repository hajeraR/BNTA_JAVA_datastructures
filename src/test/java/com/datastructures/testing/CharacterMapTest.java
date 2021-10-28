package com.datastructures.testing;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.assertj.core.api.InstanceOfAssertFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CharacterMapTest {

    private CharacterMap mapper;

    @BeforeEach
    void setUp() {
        CharacterMap mapper = new CharacterMap();
        Map<Character,Integer> hashMap = new HashMap<>();
    }

    @Test
    void shouldReturnNumberOfInstancesOfACharacter() {
        //given
        String input = "A,B,C,C,B,C";


        //when
        Map actual = mapper.characterMap(input);

        //then
        assertThat(actual).extractingByKey('A').isEqualTo(1);
        assertThat(actual).extractingByKey('B').isEqualTo(2);
        assertThat(actual).extractingByKey('C').isEqualTo(3);


    }

    @Test
    void shouldReturnEmptyArrayForWhiteSpace() {
        //given
        String input = " ";


        //when
        Map actual = mapper.characterMap(input);

        //then
        assertThat(actual).isEmpty();


    }

    @Test
    void shouldReturnEmptyArrayForNoCharacters() {
        //given
        String input = "";


        //when
        Map actual = mapper.characterMap(input);

        //then
        assertThat(actual).isEmpty();


    }

}