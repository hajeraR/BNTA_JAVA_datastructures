package com.datastructures.exercise2;
/*Exercise 2
        Given a string such as ({()})
        Implement a function that checks if the opening bracket/parenthesis has a corresponding closing bracket/parenthesis.

        For example:
        if input is "({()})" function should return true
        if input is "({})" function should return true
        if input is "()" function should return true
        if input is "({( })" function should return false
        if input is "({()}" function should return false

        Think of a suitable data structures that can be used to solve this problem.*/





import java.util.List;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

       CheckParenthesis("({()})");
//        String brackets = "({()})({()({})})";

    }

        public static boolean bracketChecker(String brackets) {

            if (brackets.isEmpty()) {
                System.out.println("null");
            }

            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < brackets.length(); i++) {
                //Converting string to characters
                char bracket = brackets.charAt(i);
                //pushing in an opening bracket
                if (bracket == '(' || bracket == '[' || bracket == '{') {
                    stack.push(bracket);
                }
                if (stack.isEmpty()) {
                    return false;
                }
                //Taking a peek at the top of the stack and matching the opening bracket to corresponding closing bracket.
                if (stack.peek() == '(' && bracket == ')' || stack.peek() == '[' && bracket == ']' || stack.peek() == '{' && bracket == '}') {
                    stack.pop();
                } else {
                    return false;}
//                if (stack.isEmpty() && brackets.length() == 0) {
//                    System.out.println(true);
//                    return true;
//                } else {
//                    System.out.println(false);
//                    return false;
//
//                }

            }
            //return stack.isEmpty() && brackets.isEmpty();

            return stack.isEmpty();
        }

//    public static boolean CheckParenthesis(String str) {
//        if (str.isEmpty())
//            return true;
//
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < str.length(); i++) {
//            char current = str.charAt(i);
//            if (current == '{' || current == '(' || current == '[') {
//                stack.push(current);
//            }
//
//
//            if (current == '}' || current == ')' || current == ']') {
//                if (stack.isEmpty())
//                    return false;
//
//                char last = stack.peek();
//                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
//                    stack.pop();
//                else
//                    return false;
//            }
//
//        }
//
//        return stack.isEmpty();
//    }
}




// Stack <Pringles> pringles = new Stack<>();
// pringles.push (new Pringles());
//boolean empty = pringles.empty();