package dsa.efficientSorting;

import java.util.Scanner;

public class EmployeePromotionConflicts {

    static long conflicts = 0;

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge while counting promotion conflicts
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Count pairs where left value < right value
        while (i < n1 && j < n2) {

            if (leftArray[i] < rightArray[j]) {
                conflicts += (n2 - j);
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter performance scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        mergeSort(scores, 0, n - 1);

        System.out.println("Promotion Conflicts: " + conflicts);

        sc.close();
    }
}