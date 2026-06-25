class Student {

    public int rollNumber;

    protected String name;

    private double cgpa;

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {

    public void display() {

        System.out.println(
                rollNumber);

        System.out.println(
                name);
    }
}

public class UniversityManagement {

    public static void main(String[] args) {

        PostgraduateStudent p =
                new PostgraduateStudent();

        p.rollNumber = 101;

        p.name = "Rahul";

        p.setCgpa(8.5);

        p.display();
    }
}