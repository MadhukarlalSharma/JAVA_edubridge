//   Day 8  3rd Question  Balanced Brackets

import java.util.ArrayDeque;

public class BalancedBrackets {
    static boolean isBalanced(String expr) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;          
                }
                char open = stack.pop();
                if ((ch == ')' && open != '(')
                        || (ch == ']' && open != '[')
                        || (ch == '}' && open != '{')) {
                    return false;         
                }
            }
        }

        return stack.isEmpty();            
    }

    public static void main(String[] args) {
        String[] tests = {"{[()()]}", "([)]", "(("};

        for (String t : tests) {
            System.out.println("\"" + t + "\" -> " + (isBalanced(t) ? "Balanced" : "Not balanced"));
        }
    }
}