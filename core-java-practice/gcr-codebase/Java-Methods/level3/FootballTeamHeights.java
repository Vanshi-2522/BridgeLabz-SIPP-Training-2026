import java.util.Random;

public class FootballTeamHeights {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nShortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}