import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    static ArrayList<String> parkingList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Vehicle
    static void addVehicle() {
        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (parkingList.contains(vehicle)) {
            System.out.println("Vehicle is already parked.");
        } else {
            parkingList.add(vehicle);
            System.out.println("Vehicle entered successfully.");
        }
    }

    // Remove Vehicle
    static void removeVehicle() {
        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (parkingList.remove(vehicle)) {
            System.out.println("Vehicle exited successfully.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    // Search Vehicle
    static void searchVehicle() {
        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (parkingList.contains(vehicle)) {
            System.out.println("Vehicle is currently parked.");
        } else {
            System.out.println("Vehicle is not parked.");
        }
    }

    // Display All Vehicles
    static void displayVehicles() {

        if (parkingList.isEmpty()) {
            System.out.println("Parking is empty.");
            return;
        }

        System.out.println("\nVehicles Currently Parked:");

        for (String vehicle : parkingList) {
            System.out.println(vehicle);
        }

        System.out.println("\nTotal Occupied Parking Slots: " + parkingList.size());
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== SMART PARKING SLOT MANAGER =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addVehicle();
                    break;

                case 2:
                    removeVehicle();
                    break;

                case 3:
                    searchVehicle();
                    break;

                case 4:
                    displayVehicles();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}