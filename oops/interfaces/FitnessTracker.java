package oops.interfaces;
interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps.");
    }

    public void generateReport() {
        System.out.println("Report Generated.");
    }

    public void sendAlert() {
        System.out.println("Alert: Time to exercise!");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}
