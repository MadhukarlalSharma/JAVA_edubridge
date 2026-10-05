//  Day 4   5th Question   Time class with this() chaining

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int h) {
        this(h, 0);
    }

    Time(int h, int m) {
        this(h, m, 0);
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    @Override 
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(9);
        Time t2 = new Time(9, 30);
        Time t3 = new Time(9, 30, 45);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}