package dsa.sorting;

import java.util.*;

public class BubbleSwapCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        System.out.println("Sorted Array: " + Arrays.toString(nums));
        System.out.println("Total Swaps: " + swaps);
    }
}
