class Course {

    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName =
            "ABC Institute";

    public Course(
            String courseName,
            int duration,
            double fee) {

        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {

        System.out.println(
                courseName + " "
                        + instituteName);
    }

    public static void updateInstituteName(
            String newName) {

        instituteName = newName;
    }
}

public class OnlineCourseManagement {

    public static void main(String[] args) {

        Course.updateInstituteName(
                "Tech Academy");
    }
}