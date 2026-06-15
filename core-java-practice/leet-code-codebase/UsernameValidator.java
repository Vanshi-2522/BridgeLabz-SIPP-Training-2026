import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        if (username.contains(" "))
            System.out.println("The username contains spaces.");
        else
            System.out.println("The username does not contain spaces.");

        System.out.println("Total number of characters: " + username.length());
        System.out.println("Username in uppercase: " + username.toUpperCase());

        String reversed = new StringBuilder(username).reverse().toString();

        if (username.equalsIgnoreCase(reversed))
            System.out.println("The username is a palindrome.");
        else
            System.out.println("The username is not a palindrome.");

        sc.close();
    }
}