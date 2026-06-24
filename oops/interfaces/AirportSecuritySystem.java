package oops.interfaces;

interface LuggageScanner {

    void scanLuggage();

    default void displaySecurityGuidelines() {
        System.out.println("Carry valid luggage.");
    }
}

interface PassportVerifier {

    void verifyPassport();

    default void displaySecurityGuidelines() {
        System.out.println("Carry valid passport.");
    }

    static boolean isPassportNumberValid(
            String passportNo) {

        return passportNo.length() == 8;
    }
}

class AirportSecurity
        implements LuggageScanner,
        PassportVerifier {

    public void scanLuggage() {
        System.out.println("Luggage Scanned.");
    }

    public void verifyPassport() {
        System.out.println("Passport Verified.");
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecuritySystem {

    public static void main(String[] args) {

        String[] passengers = {
                "Rahul",
                "Priya",
                "Amit"
        };

        String[] passports = {
                "AB123456",
                "1234",
                "CD987654"
        };

        AirportSecurity security =
                new AirportSecurity();

        security.displaySecurityGuidelines();

        System.out.println();

        for (int i = 0; i < passengers.length; i++) {

            if (PassportVerifier
                    .isPassportNumberValid(passports[i])) {

                System.out.println(
                        passengers[i] +
                                " -> Allowed to Board");
            } else {
                System.out.println(
                        passengers[i] +
                                " -> Boarding Denied");
            }
        }
    }
}
