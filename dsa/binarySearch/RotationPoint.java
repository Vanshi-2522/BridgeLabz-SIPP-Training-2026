package dsa.binarySearch;

import java.util.Scanner;

public class RotationPoint {

    public static int findMinimum(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int index = findMinimum(arr);

        System.out.println("Rotation Point Index = " + index);
        System.out.println("Minimum Element = " + arr[index]);
    }
}
