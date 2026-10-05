//  Day 5  10th Question Encapsulation with Inheritance

class Employee1 {
    String name;
    private double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager1 extends Employee1 {
    private double bonus;

    Manager1(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    double getTotalPay() {
        return getSalary() + bonus;
    }
}

public class PayrollDemo {
    public static void main(String[] args) {
        Manager1 m = new Manager1("Harsh Raj", 60000, 15000);

        System.out.println("Name      : " + m.name);
        System.out.println("Salary    : " + m.getSalary());
        System.out.println("Total pay : " + m.getTotalPay());
    }
}