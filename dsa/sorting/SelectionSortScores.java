package dsa.sorting;

import java.util.*;

public class SelectionSortScores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n];

        for (int i = 0; i < n; i++)
            score[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (score[j] < score[min])
                    min = j;
            }

            int temp = score[i];
            score[i] = score[min];
            score[min] = temp;
        }

        System.out.println(Arrays.toString(score));
    }
}