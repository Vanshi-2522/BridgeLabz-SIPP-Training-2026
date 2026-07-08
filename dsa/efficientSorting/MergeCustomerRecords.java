package dsa.efficientSorting;
import java.util.Scanner;

public class MergeCustomerRecords {

    // Merge two sorted arrays
    public static int[] mergeArrays(int[] first, int[] second) {

        int n = first.length;
        int m = second.length;

        int[] merged = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        while (i < n) {
            merged[k++] = first[i++];
        }

        while (j < m) {
            merged[k++] = second[j++];
        }

        return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customer IDs in Branch A: ");
        int n = sc.nextInt();

        int[] branchA = new int[n];

        System.out.println("Enter sorted customer IDs for Branch A:");

        for (int i = 0; i < n; i++) {
            branchA[i] = sc.nextInt();
        }

        System.out.print("Enter number of customer IDs in Branch B: ");
        int m = sc.nextInt();

        int[] branchB = new int[m];

        System.out.println("Enter sorted customer IDs for Branch B:");

        for (int i = 0; i < m; i++) {
            branchB[i] = sc.nextInt();
        }

        int[] result = mergeArrays(branchA, branchB);

        System.out.println("Merged Sorted Customer IDs:");

        for (int id : result) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}
