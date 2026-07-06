package dsa.sorting;

import java.util.*;

public class MovieRatings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ratings = new int[n];

        for (int i = 0; i < n; i++)
            ratings[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[min])
                    min = j;
            }

            int temp = ratings[i];
            ratings[i] = ratings[min];
            ratings[min] = temp;
        }

        System.out.println(Arrays.toString(ratings));
    }
}