//  Day 8  6th Question  Queue using two stacks

import java.util.ArrayDeque;

class QueueTwoStacks {
    private ArrayDeque<Character> in = new ArrayDeque<>();  
    private ArrayDeque<Character> out = new ArrayDeque<>(); 

    void enqueue(char value) {
        in.push(value);
        System.out.println("Enqueued " + value);
    }

    char dequeue() {
        if (out.isEmpty()) {
           
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            System.out.println("Queue Empty");
            return '\0';
        }
        char value = out.pop();
        System.out.println("Dequeued " + value);
        return value;
    }
}

public class QueueTwoStacksDemo {
    public static void main(String[] args) {
        QueueTwoStacks q = new QueueTwoStacks();

        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');

        q.dequeue();

        q.enqueue('D');

        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}