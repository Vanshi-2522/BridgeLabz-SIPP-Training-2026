import java.util.*;

public class CheckNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        checkNumbers(nums);
        compare(nums);
    }

    
    public static void checkNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                System.out.println(nums[i] + " is Zero");
            }
            else if (nums[i] > 0) {
                System.out.print(nums[i] + " is Positive");

                if (nums[i] % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            }
            else {
                System.out.println(nums[i] + " is Negative");
            }
        }
    }

   
    public static void compare(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];

        if (first == last) {
            System.out.println("First and Last numbers are equal");
        }
        else if (first > last) {
            System.out.println("First is greater than Last number");
        }
        else {
            System.out.println("First is less than Last number");
        }
    }
}