/   Day 6   8th Question  Instanceof and downcasting

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof");
    }

    
     void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Cat()};

        for (Animal a : animals) {
            a.sound();

            if (a instanceof Dog) {
                Dog d = (Dog) a;  
                d.fetch();
            }
        }
    }
}