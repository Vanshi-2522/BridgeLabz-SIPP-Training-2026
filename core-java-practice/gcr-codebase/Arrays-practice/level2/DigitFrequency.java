import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();

        String str = String.valueOf(number);

        int[] frequency = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            frequency[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}