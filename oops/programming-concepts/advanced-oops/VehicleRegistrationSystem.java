class Vehicle {

    static double registrationFee = 5000;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {

        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {

        if (this instanceof Vehicle) {
            System.out.println(registrationNumber + " " + ownerName + " " + vehicleType);
            System.out.println("Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("V101", "Rahul", "Car");

        Vehicle.updateRegistrationFee(7000);

        v1.display();
    }
}