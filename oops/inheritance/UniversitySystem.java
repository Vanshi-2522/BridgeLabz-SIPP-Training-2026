package oops.inheritance;
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

class Student extends Person {
    private final String studentId;
    protected double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                ", Student [ID=" + studentId + ", GPA=" + gpa + "]";
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, String studentId,
            double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis=" + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent(
                "Rahul", 24, "GS101", 9.1,
                "Artificial Intelligence");

        System.out.println(gs);

        System.out.println("\nIS-A Relationship:");
        System.out.println(gs instanceof Student);
        System.out.println(gs instanceof Person);
    }
}