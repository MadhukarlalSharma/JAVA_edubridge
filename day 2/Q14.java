import java.util.ArrayDeque;
import java.util.Deque;

public class Q14 {

    public static void main(String[] args) {

        String expression = "5 3 + 8 2 - *";

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : expression.split(" ")) {

            if (token.matches("\\d+")) {

                stack.push(Integer.parseInt(token));
                System.out.println("Push: " + token);

            } else {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result);

                System.out.println("Operation: "
                        + a + " " + token + " " + b
                        + " = " + result);
            }
        }

        System.out.println("Final Answer = " + stack.pop());
    }
}
