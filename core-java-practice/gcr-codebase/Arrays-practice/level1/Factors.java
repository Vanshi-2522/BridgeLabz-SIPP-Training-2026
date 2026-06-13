import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int max = 10;
        int[] factors = new int[max];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                if (index == max) {
                    max = max * 2;
                    int[] temp = new int[max];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}