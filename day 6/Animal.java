//   Day 6   2nd Question   Runtime Polymorphism

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
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow says: Moo");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal a : animals) {
            a.sound();
        }
    }
}