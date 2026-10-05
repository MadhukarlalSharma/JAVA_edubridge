// Day 4   4th Question   Counter Object

class Counter {
    private int count;

    void increment() {
        count++;
    }

    void decrement() {
        if (count > 0) {
            count--;
        }
    }

    void reset() {
        count = 0;
    }

    int getCount() {
        return count;
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();
        System.out.println("After 3 increments: " + c.getCount());

        c.decrement();
        System.out.println("After 1 decrement : " + c.getCount());

        c.reset();
        System.out.println("After reset       : " + c.getCount());

        c.decrement();
        System.out.println("Decrement at 0    : " + c.getCount());
    }
}