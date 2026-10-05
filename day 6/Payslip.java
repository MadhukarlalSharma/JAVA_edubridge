//   Day 6  5th Question  Abstract class with constructor

abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }
   
    abstract double calculatePay();

    void printSlip() {
        System.out.println("---- Pay Slip ----");
        System.out.println("Name : " + name);
        System.out.printf("Pay  : Rs.%.2f%n", calculatePay());
    }
}

class FullTime extends Employee {
    private double monthlySalary;

    FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class PartTime extends Employee {
    private int hours;
    private double rate;

    PartTime(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculatePay() {
        return hours * rate;
    }
}

public class PayslipDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTime("Harsh Raj", 60000);
        Employee e2 = new PartTime("Ravi Kumar", 80, 250);

        e1.printSlip();
        System.out.println();
        e2.printSlip();
    }
}