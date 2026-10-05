// Day 4   3rd  Question   Default and Parameterized Constructor

class Student {
    String name;
    int marks;

    Student() {
        name = "Unknown";
        marks = 0;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Harsh Raj", 95);

        s1.display();
        System.out.println();
        s2.display();
    }
}