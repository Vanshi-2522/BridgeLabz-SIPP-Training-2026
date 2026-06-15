import java.util.Scanner;
import java.util.Arrays;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("String 1 in Uppercase: " + str1.toUpperCase());
        System.out.println("String 2 in Uppercase: " + str2.toUpperCase());

        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        char[] a1 = str1.toLowerCase().toCharArray();
        char[] a2 = str2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");

        sc.close();
    }
}