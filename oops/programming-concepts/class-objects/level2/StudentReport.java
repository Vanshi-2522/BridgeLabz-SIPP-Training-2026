// Student class
class Student {

    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate grade
    public String calculateGrade() {

        if (marks >= 90)
            return "A";

        else if (marks >= 75)
            return "B";

        else if (marks >= 60)
            return "C";

        else if (marks >= 40)
            return "D";

        else
            return "F";
    }

    // Display details
    public void displayDetails() {

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
    }
}

// Main class
public class StudentReport {

    public static void main(String[] args) {

        Student student =
                new Student("Rahul", 101, 88);

        student.displayDetails();
    }
}