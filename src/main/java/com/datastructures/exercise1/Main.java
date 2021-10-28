package com.datastructures.exercise1;
//Exercise 1
//Given any string such as "a,b,b,c,c,c,z" write a function that return the number of occurrences for each letter
//Think of a suitable data structures that can be used to solve this problem.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

//this class shows our initial thought process, the completed code is under /testing in CharacterMap

public class Main {
    public static void main(String[] args) {
        String characterString = "A,B,B,A,C,A,A,C,C,C,B,B,B,A,C,C,A,Z";
        String characters = characterString.replace(",", "");
//        char[] character = characters.toCharArray();
//        System.out.println(character);
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();

        for (int i = 0; i < characters.length(); i++) {
            // charAt iterates through a string and breaks it into characters?
            char letter = characters.charAt(i);
            if (characterMap.containsKey(letter)) {
                int count = characterMap.get(letter);
                characterMap.put(letter, ++count);
            } else {
                characterMap.put(letter, 1);
            }
        }
        System.out.println(characterMap);
    }
}



