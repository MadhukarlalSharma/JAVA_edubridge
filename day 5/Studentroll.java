//  Day 5  3rd Question   Read-only roll number

class Student {
    private final int rollNo;
    private String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StudentRollDemo {
    public static void main(String[] args) {
        Student s = new Student(120, "Ravi Kumar");
        System.out.println("Roll No : " + s.getRollNo());
        System.out.println("Name    : " + s.getName());

        s.setName("Harsh Raj");
        System.out.println("After Update:\nName    : " + s.getName());
        System.out.println("Roll No.: " + s.getRollNo());
    }
}