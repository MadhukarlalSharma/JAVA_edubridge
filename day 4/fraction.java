//  Day 4   7th  Question    Array of Employee objects

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee("Mohhammed Mujeeb", 45000);
        emp[1] = new Employee("Harsh Raj", 62000);
        emp[2] = new Employee("Nivedita Kumbhar", 38000);
        emp[3] = new Employee("Aradhana Pradhan", 55000);

        Employee highest = emp[0];
        double total = 0;

        for (Employee e : emp) {
            total += e.salary;
            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        double average = total / emp.length;

        System.out.println("Highest paid : " + highest.name + " (" + highest.salary + ")");
        System.out.printf("Average salary : %.2f%n", average);
    }
}