//   Day 5   7th Question   Constructor chaining with super

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called:\nName = " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called:\nBreed = " + breed);
    }
}

public class ConstructorOrder {
    public static void main(String[] args) {
        System.out.println("Creating a Dog object...");
        Dog d = new Dog("Bruno", "Labrador");
        System.out.println("Object created: " + d.name + " The " + d.breed);
    }
}