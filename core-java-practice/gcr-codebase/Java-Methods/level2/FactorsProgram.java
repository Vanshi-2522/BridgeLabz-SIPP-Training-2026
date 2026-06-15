import java.util.Scanner;

public class FactorsProgram {
    public static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr)
            s += x;
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int x : arr)
            p *= x;
        return p;
    }

    public static double sumSquares(int[] arr) {
        double s = 0;
        for (int x : arr)
            s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        for (int x : factors)
            System.out.print(x + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum Squares = " + sumSquares(factors));
    }
}