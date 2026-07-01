import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    // Register Participant
    static void registerParticipant() {
        System.out.print("Enter Participant Email ID: ");
        String email = sc.nextLine();

        if (participants.add(email)) {
            System.out.println("Registration Successful.");
        } else {
            System.out.println("Duplicate Registration! Entry Rejected.");
        }
    }

    // Display Participants
    static void displayParticipants() {

        if (participants.isEmpty()) {
            System.out.println("No Participants Registered.");
            return;
        }

        System.out.println("\n----- Registered Participants -----");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("\nTotal Eligible Participants: " + participants.size());
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== EVENT ENTRY VERIFICATION SYSTEM =====");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    registerParticipant();
                    break;

                case 2:
                    displayParticipants();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}