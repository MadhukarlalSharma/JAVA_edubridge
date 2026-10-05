public class Q11 {

    static class MyStack {

        int[] stack = new int[3];
        int top = -1;

        void push(int value) {

            if (top == stack.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return stack[top--];
        }

        int peek() {

            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return stack[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Peek: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.pop();
    }
}
