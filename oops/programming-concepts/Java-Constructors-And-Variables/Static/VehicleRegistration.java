class Vehicle {

    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000;

    public Vehicle(
            String ownerName,
            String vehicleType) {

        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {

        System.out.println(
                ownerName + " "
                        + vehicleType);
    }

    public static void updateRegistrationFee(
            double fee) {

        registrationFee = fee;
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {

        Vehicle.updateRegistrationFee(
                7000);
    }
}