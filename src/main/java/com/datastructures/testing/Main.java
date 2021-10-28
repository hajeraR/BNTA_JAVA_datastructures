package com.datastructures.testing;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        BracketChecker bracket = new BracketChecker();
        Boolean bracketResult = bracket.bracketChecker("({({)})");
        System.out.println(bracketResult);

        CharacterMap character = new CharacterMap();

        Map characterResult = character.characterMap(" ");
        System.out.println(characterResult);





        }
}
