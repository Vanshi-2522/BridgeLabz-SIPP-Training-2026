import java.util.*;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("While Sum = " + sum);
        System.out.println("Formula Sum = " + formula);
        System.out.println(sum == formula);
    }
}