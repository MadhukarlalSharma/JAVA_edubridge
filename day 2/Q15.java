public class Q15 {

    static class CircularQueue {

        int[] queue = new int[4];

        int front = 0;
        int rear = -1;
        int size = 0;

        void enqueue(int value) {

            if (size == queue.length) {
                System.out.println("Queue Overflow");
                return;
            }

            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;

            System.out.println("Enqueued: " + value);
        }

        int dequeue() {

            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int value = queue[front];

            front = (front + 1) % queue.length;
            size--;

            return value;
        }

        void display() {

            for (int i = 0; i < size; i++) {
                System.out.print(
                    queue[(front + i) % queue.length] + " "
                );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.enqueue(5);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        q.enqueue(5);
        q.enqueue(6);

        q.display();
    }
}
