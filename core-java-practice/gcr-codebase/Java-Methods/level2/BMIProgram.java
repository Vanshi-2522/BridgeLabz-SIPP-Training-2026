import java.util.Scanner;

public class BMIProgram {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] people = new double[10][3];

        for (int i = 0; i < 10; i++) {
            people[i][0] = sc.nextDouble();
            people[i][1] = sc.nextDouble();

            people[i][2] = calculateBMI(people[i][0], people[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    people[i][0] + " " +
                    people[i][1] + " " +
                    people[i][2] + " " +
                    getStatus(people[i][2]));
        }
    }
}