class Student {

    static String universityName = "AKTU";
    static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;

        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {

        if (this instanceof Student) {
            System.out.println(universityName);
            System.out.println(rollNumber + " " + name + " " + grade);
        }
    }
}

public class UniversityStudentSystem {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul", "A");
        Student s2 = new Student(2, "Aman", "B");

        s1.display();
        s2.display();

        Student.displayTotalStudents();
    }
}