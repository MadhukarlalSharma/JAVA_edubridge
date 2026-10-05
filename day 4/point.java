//  Day 4  8th  Question   Objects as parameters and return values

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    Point midpoint(Point other) {
        return new Point((this.x + other.x) / 2, (this.y + other.y) / 2);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("Distance = " + p1.distanceTo(p2));

        Point mid = p1.midpoint(p2);
        System.out.println("Midpoint = " + mid);
    }
}