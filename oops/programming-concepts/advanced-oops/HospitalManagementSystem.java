class Patient {

    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {

        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {

        if (this instanceof Patient) {
            System.out.println(hospitalName);
            System.out.println(patientID + " " + name + " " + age + " " + ailment);
        }
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Rahul", 25, "Fever");
        Patient p2 = new Patient(2, "Aman", 30, "Cold");

        p1.display();
        p2.display();

        Patient.getTotalPatients();
    }
}