import java.util.ArrayDeque;
import java.util.Deque;

public class Q16 {

    static class QueueUsingStacks {

        Deque<Integer> in = new ArrayDeque<>();
        Deque<Integer> out = new ArrayDeque<>();

        void enqueue(int value) {
            in.push(value);
        }

        int dequeue() {

            if (out.isEmpty()) {

                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }

            return out.pop();
        }
    }

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());

        q.enqueue(40);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
    }
}
