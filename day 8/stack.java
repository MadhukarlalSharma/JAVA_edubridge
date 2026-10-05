//   Day 8   1st Question    Stack using an array

class MyStack {
    private int[] data = new int[3];
    private int top = -1;  

    void push(int value) {
        if (top == data.length - 1) {
            System.out.println("Stack Overflow: cannot push " + value);
            return;
        }
        top++;
        data[top] = value;
        System.out.println("Pushed " + value);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = data[top];
        top--;
        System.out.println("Popped " + value);
        return value;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);   
        System.out.println("Top element: " + s.peek());

        s.pop();
        s.pop();
        s.pop();
        s.pop();     
    }
}