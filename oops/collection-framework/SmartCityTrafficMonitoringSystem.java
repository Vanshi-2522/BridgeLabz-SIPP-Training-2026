import java.util.*;

public class SmartCityTrafficMonitoringSystem {

    static HashMap<String, Integer> trafficData = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    // Add or Update Vehicle Count
    static void addOrUpdateRoad() {

        System.out.print("Enter Road Name: ");
        String road = sc.nextLine();

        System.out.print("Enter Vehicle Count: ");
        int count = Integer.parseInt(sc.nextLine());

        // If road exists, update count
        if (trafficData.containsKey(road)) {
            trafficData.put(road, trafficData.get(road) + count);
            System.out.println("Vehicle count updated successfully.");
        } else {
            trafficData.put(road, count);
            System.out.println("Road added successfully.");
        }
    }

    // Display Roads in Sorted Order
    static void displayRoads() {

        if (trafficData.isEmpty()) {
            System.out.println("No traffic data available.");
            return;
        }

        TreeMap<String, Integer> sortedRoads = new TreeMap<>(trafficData);

        System.out.println("\n===== Traffic Report (Sorted by Road Name) =====");

        for (Map.Entry<String, Integer> entry : sortedRoads.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue() + " vehicles");
        }

        System.out.println("\nTotal Roads Monitored: " + trafficData.size());
    }

    // Find Busiest Road
    static void busiestRoad() {

        if (trafficData.isEmpty()) {
            System.out.println("No traffic data available.");
            return;
        }

        String busiest = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : trafficData.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                busiest = entry.getKey();
            }
        }

        System.out.println("\nBusiest Road: " + busiest);
        System.out.println("Vehicle Count: " + max);
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== SMART CITY TRAFFIC MONITORING SYSTEM =====");
            System.out.println("1. Add/Update Vehicle Count");
            System.out.println("2. Display Traffic Report");
            System.out.println("3. Find Busiest Road");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addOrUpdateRoad();
                    break;

                case 2:
                    displayRoads();
                    break;

                case 3:
                    busiestRoad();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}