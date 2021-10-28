package com.datastructures.testing;

import java.util.Stack;

public class BracketChecker {


        public static boolean bracketChecker(String brackets) {

            if (brackets.isEmpty()) {
               return true;
            }


            Stack<Character> stack = new Stack<Character>();

            if(brackets.contains("(") || brackets.contains("[") || brackets.contains("{")) {
                for (int i = 0; i < brackets.length(); i++) {
                    char bracket = brackets.charAt(i);

                    if (bracket == '(' || bracket == '[' || bracket == '{') {
                        stack.push(bracket);
                    }
                    if (stack.peek() == '(' && bracket == ')' || stack.peek() == '[' && bracket == ']' || stack.peek() == '{' && bracket == '}') {
                        stack.pop();
                    }


                }
            }else return true;
            return stack.isEmpty();

        }
    }


