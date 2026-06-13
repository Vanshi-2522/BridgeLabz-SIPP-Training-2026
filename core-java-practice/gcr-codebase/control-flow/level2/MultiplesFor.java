import java.util.*;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Number");
            return;
        }

        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }
    }
}