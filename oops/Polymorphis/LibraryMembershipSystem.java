package oops.Polymorphis;

abstract class LibraryMember {

    String memberName;
    String memberId;

    public LibraryMember(String memberName,
                         String memberId) {

        this.memberName = memberName;
        this.memberId = memberId;
    }

    abstract double calculateFine(
            int overdueDays);

    void displayDetails() {
        System.out.println(
                memberId + " " + memberName);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(
            String name,
            String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(
            String name,
            String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(
            String name,
            String id) {

        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryMembershipSystem {

    static void searchMember(
            LibraryMember[] members,
            String id) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {

                System.out.println(
                        "Found Member");

                m.displayDetails();
                return;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] arr = {

                new StudentMember(
                        "Rahul",
                        "S101"),

                new FacultyMember(
                        "Aman",
                        "F201"),

                new GuestMember(
                        "Neha",
                        "G301")
        };

        for (LibraryMember m : arr) {

            m.displayDetails();

            System.out.println(
                    "Fine = "
                            + m.calculateFine(4));
        }

        searchMember(arr, "F201");
    }
}
