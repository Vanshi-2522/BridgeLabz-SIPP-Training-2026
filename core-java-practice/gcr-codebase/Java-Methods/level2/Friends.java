import java.util.Scanner;

public class Friends {

    public static String youngest(int[] age, String[] names) {
        int min = 0;

        for (int i = 1; i < age.length; i++)
            if (age[i] < age[min])
                min = i;

        return names[min];
    }

    public static String tallest(double[] height, String[] names) {
        int max = 0;

        for (int i = 1; i < height.length; i++)
            if (height[i] > height[max])
                max = i;

        return names[max];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + youngest(age, names));
        System.out.println("Tallest: " + tallest(height, names));
    }
}