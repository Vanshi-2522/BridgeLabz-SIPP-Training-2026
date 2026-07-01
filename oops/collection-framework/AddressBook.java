import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static Scanner sc = new Scanner(System.in);

    // Add Contact
    static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {
            System.out.println("Contact with this name already exists.");
            return;
        }

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    // Search Contact
    static void searchContact() {
        System.out.print("Enter Name to Search: ");
        String name = sc.nextLine();

        Contact c = map.get(name);

        if (c != null) {
            System.out.println("\nContact Found");
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Delete Contact
    static void deleteContact() {
        System.out.print("Enter Name to Delete: ");
        String name = sc.nextLine();

        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted Successfully.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Display Sorted Contacts
    static void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available.");
            return;
        }

        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });

        System.out.println("\n----- Contact List -----");

        for (Contact c : contacts) {
            System.out.println("---------------------------");
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== ADDRESS BOOK =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    searchContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    displayContacts();
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