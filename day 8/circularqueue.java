//   Day 8  5th Question  Circular Queue using an array

class CircularQueue {
    private int[] data;
    private int capacity;
    private int front = 0;   
    private int rear = -1;   
    private int size = 0;    

    CircularQueue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Full: cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
        System.out.println("Enqueued " + value);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int value = data[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued " + value);
        return value;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front to rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);   

        q.dequeue();
        q.dequeue();

        q.enqueue(5);
        q.enqueue(6);

        q.display();
    }
}