package dsa.efficientSorting;

import java.util.Scanner;

public class HospitalEmergency {

    // Swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Lomuto Partition
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high);
        return i;
    }

    // Quick Select
    public static int quickSelect(int[] arr, int low, int high, int index) {

        if (low <= high) {

            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == index)
                return arr[pivotIndex];

            if (pivotIndex > index)
                return quickSelect(arr, low, pivotIndex - 1, index);

            return quickSelect(arr, pivotIndex + 1, high, index);
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        int[] priority = new int[n];

        System.out.println("Enter patient priorities:");

        for (int i = 0; i < n; i++) {
            priority[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // kth highest = (n-k)th smallest
        int answer = quickSelect(priority, 0, n - 1, n - k);

        System.out.println("Kth Highest Priority: " + answer);

        sc.close();
    }
}
