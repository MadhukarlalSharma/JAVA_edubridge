import java.util.ArrayDeque;
import java.util.Deque;

public class Q13 {

    static boolean isBalanced(String expr) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : expr.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(')
                        || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("([]{})"));
        System.out.println(isBalanced("([)]"));
        System.out.println(isBalanced("((("));
    }
}
