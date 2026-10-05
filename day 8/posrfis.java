//   Day 8  4th Question  Evaluate a postfix expression

import java.util.ArrayDeque;

public class PostFixEval {
    static int evaluate(String expr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] tokens = expr.split(" ");

        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stack.pop();  
                int a = stack.pop();
                int result;

                switch (t) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    default:  result = a / b; break;
                }

                stack.push(result);
                System.out.println(a + " " + t + " " + b + " = " + result + "   stack: " + stack);
            } else {
                stack.push(Integer.parseInt(t));
                System.out.println("push " + t + "   stack: " + stack);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "5 3 + 8 2 - *";
        int answer = evaluate(expr);
        System.out.println();
        System.out.println("Answer = " + answer);
    }
}