package com.datastructures.testing;

import java.util.HashMap;
import java.util.Map;

public class CharacterMap {

    public static Map characterMap(String characterString){
        String intermediateString = characterString.replace(" ", "");
        String characters = intermediateString.replace(",", "");
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();

        for (int i = 0; i < characters.length(); i++) {
            char letter = characters.charAt(i);
            if (characterMap.containsKey(letter)) {
                int count = characterMap.get(letter);
                characterMap.put(letter, ++count);
            } else {
                characterMap.put(letter, 1);
            }
        }
        return characterMap;
    }
}
