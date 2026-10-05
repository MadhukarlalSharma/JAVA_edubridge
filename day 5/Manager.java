//   Day 5   6th Question   Multilevel Inheritance

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name      : " + name);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Salary    : " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team size : " + teamSize);
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Harsh Raj", 95000, 8);
        m.displayManager();
    }
}