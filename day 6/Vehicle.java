//    Day 6   7th Question   Default and static interface methods

interface Vehicle {
   
    int wheels();

   
    default void honk() {
        System.out.println("Beep beep!");
    }

   
    static void info() {
        System.out.println("Vehicle: a means of transport.");
    }
}

class Car implements Vehicle {
    @Override
    public int wheels() {
        return 4;
    }

   
}

class Truck implements Vehicle {
    @Override
    public int wheels() {
        return 6;
    }

    @Override
    public void honk() {
        System.out.println("HONK HONK!");
    }
}

public class VehicleInterfaceDemo {
    public static void main(String[] args) {
        Vehicle.info();

        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println("Car wheels   : " + car.wheels());
        car.honk();

        System.out.println("Truck wheels : " + truck.wheels());
        truck.honk();
    }
}