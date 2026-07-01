import java.util.*;

class Astronaut {

    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }
}

public class SpaceMissionCrewManagementSystem {

    static HashMap<String, ArrayList<Astronaut>> missions = new HashMap<>();

    // Stores astronaut IDs to prevent duplicates in each mission
    static HashMap<String, HashSet<String>> assignedIds = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    // Add Mission
    static void addMission() {

        System.out.print("Enter Mission Name: ");
        String mission = sc.nextLine();

        if (missions.containsKey(mission)) {
            System.out.println("Mission already exists.");
            return;
        }

        missions.put(mission, new ArrayList<>());
        assignedIds.put(mission, new HashSet<>());

        System.out.println("Mission added successfully.");
    }

    // Assign Astronaut
    static void assignAstronaut() {

        System.out.print("Enter Mission Name: ");
        String mission = sc.nextLine();

        if (!missions.containsKey(mission)) {
            System.out.println("Mission not found.");
            return;
        }

        System.out.print("Enter Astronaut ID: ");
        String id = sc.nextLine();

        if (assignedIds.get(mission).contains(id)) {
            System.out.println("Astronaut already assigned to this mission.");
            return;
        }

        System.out.print("Enter Astronaut Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        Astronaut astronaut = new Astronaut(id, name, specialization);

        missions.get(mission).add(astronaut);
        assignedIds.get(mission).add(id);

        System.out.println("Astronaut assigned successfully.");
    }

    // Display Missions
    static void displayMissions() {

        if (missions.isEmpty()) {
            System.out.println("No missions available.");
            return;
        }

        System.out.println("\n===== Mission Details =====");

        for (String mission : missions.keySet()) {

            System.out.println("\nMission: " + mission);

            ArrayList<Astronaut> crew = missions.get(mission);

            if (crew.isEmpty()) {
                System.out.println("No astronauts assigned.");
            } else {

                for (Astronaut a : crew) {
                    System.out.println("------------------------");
                    System.out.println("ID : " + a.astronautId);
                    System.out.println("Name : " + a.name);
                    System.out.println("Specialization : " + a.specialization);
                }

                System.out.println("Total Astronauts: " + crew.size());
            }
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== SPACE MISSION CREW MANAGEMENT =====");
            System.out.println("1. Add Mission");
            System.out.println("2. Assign Astronaut");
            System.out.println("3. Display Missions");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addMission();
                    break;

                case 2:
                    assignAstronaut();
                    break;

                case 3:
                    displayMissions();
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