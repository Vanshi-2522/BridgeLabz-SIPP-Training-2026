package dsa.sorting;

import java.util.*;

public class SportsMeet {

    static void bubbleSort(int[] arr) {

        int swaps = 0;
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                    sorted = false;
                }
            }

            if (!swapped)
                break;
        }

        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
        System.out.println("Swaps = " + swaps);

        if (sorted)
            System.out.println("Already Sorted (Best Case)");
    }

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n];

        for (int i = 0; i < n; i++)
            score[i] = sc.nextInt();

        int[] bubble = score.clone();
        int[] insertion = score.clone();

        bubbleSort(bubble);

        insertionSort(insertion);

        System.out.println("Top 3 Medalists:");

        for (int i = bubble.length - 1; i >= bubble.length - 3; i--)
            System.out.print(bubble[i] + " ");
    }
}
