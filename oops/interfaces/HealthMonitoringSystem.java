package oops.interfaces;

interface HeartRateMonitor {

    void displayHeartRate();

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }
}

interface TemperatureMonitor {

    void displayTemperature();

    default void displayHealthTips() {
        System.out.println("Stay hydrated.");
    }

    static boolean isPatientIdValid(
            String patientId) {

        return patientId.startsWith("P");
    }
}

class HospitalMonitor
        implements HeartRateMonitor,
        TemperatureMonitor {

    public void displayHeartRate() {
        System.out.println("Heart Rate: 72 BPM");
    }

    public void displayTemperature() {
        System.out.println("Temperature: 98.6°F");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
}

public class HealthMonitoringSystem {

    public static void main(String[] args) {

        String[] names = {
                "Rahul",
                "Priya",
                "Amit"
        };

        String[] ids = {
                "P101",
                "X202",
                "P303"
        };

        HospitalMonitor monitor =
                new HospitalMonitor();

        monitor.displayHealthTips();

        System.out.println();

        for (int i = 0; i < names.length; i++) {

            if (TemperatureMonitor
                    .isPatientIdValid(ids[i])) {

                System.out.println(
                        names[i] +
                                " -> Valid Patient");

                monitor.displayHeartRate();
                monitor.displayTemperature();
            } else {
                System.out.println(
                        names[i] +
                                " -> Invalid Patient ID");
            }

            System.out.println();
        }
    }
}