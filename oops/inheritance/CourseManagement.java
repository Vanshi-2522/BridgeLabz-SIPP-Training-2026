package oops.inheritance;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName,
            int duration,
            String platform,
            boolean isRecorded) {

        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName,
            int duration,
            String platform,
            boolean isRecorded,
            double fee,
            double discount) {

        super(courseName,
                duration,
                platform,
                isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseManagement {
    public static void main(String[] args) {

        PaidOnlineCourse course =
                new PaidOnlineCourse(
                        "Java Masterclass",
                        60,
                        "Udemy",
                        true,
                        5000,
                        20);

        course.displayCourse();
    }
}
