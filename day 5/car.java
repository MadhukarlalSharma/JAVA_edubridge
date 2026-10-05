//   Day 5   5th Question   Single Inheritance

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }
}

class Car extends Vehicle {
    int seats;

    Car(String brand, int seats) {
        super(brand);
        this.seats = seats;
    }

    void openSunroof() {
        System.out.println(brand + " sunroof is open.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car("BMW", 5);

        System.out.println("Brand : " + c.brand);
        c.start();

        System.out.println("Seats : " + c.seats);
        c.openSunroof();
    }
}