import java.util.ArrayDeque;
import java.util.Deque;

public class Q12 {
    public static void main(String[] args) {

        String str = "STACK";

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
