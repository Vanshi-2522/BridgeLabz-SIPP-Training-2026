package oops.Polymorphis;
abstract class Vehicle {

    String vehicleNumber;
    String ownerName;

    public Vehicle(String vehicleNumber,
                   String ownerName) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    abstract double calculateToll();
}

class Car extends Vehicle {

    public Car(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    public Bus(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    public Truck(String no, String owner) {
        super(no, owner);
    }

    double calculateToll() {
        return 500;
    }
}

public class VehicleTollManagementSystem {

    static double calculateTotalRevenue(
            Vehicle[] arr) {

        double total = 0;

        for (Vehicle v : arr)
            total += v.calculateToll();

        return total;
    }

    static void searchVehicle(
            Vehicle[] arr,
            String number) {

        for (Vehicle v : arr) {

            if (v.vehicleNumber.equals(number)) {

                System.out.println(
                        "Owner = "
                                + v.ownerName);
                return;
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {

                new Car("C101", "Rahul"),
                new Bus("B101", "Aman"),
                new Truck("T101", "Neha")
        };

        System.out.println(
                "Revenue = "
                        + calculateTotalRevenue(
                        vehicles));
    }
}
