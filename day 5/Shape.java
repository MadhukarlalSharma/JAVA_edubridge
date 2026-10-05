//  Day 5  8th Question  Overriding with super.method()

class Shape {
    void describe() {
        System.out.println("This is a shape.");
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void describe() {
        super.describe();
        System.out.println("It is a square with side " + side + " and area " + (side * side) + ".");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Square s = new Square(5);
        s.describe();
    }
}