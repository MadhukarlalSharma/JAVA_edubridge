//  Day 8  2nd Question  Reverse a string using stack

import java.util.ArrayDeque;

public class ReverseWithStack {
    public static void main(String[] args) {
        String text = "STACK";
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        System.out.println("Stack after pushing: " + stack);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed: " + reversed);
    }
}