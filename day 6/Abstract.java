//   Day 6   3rd Question   Abstract Class Shape

abstract class Shape {
   
    abstract double area();

    void print() {
        System.out.printf("%s area = %.2f%n", getClass().getSimpleName(), area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(10, 5);

        s1.print();
        s2.print();
    }
}