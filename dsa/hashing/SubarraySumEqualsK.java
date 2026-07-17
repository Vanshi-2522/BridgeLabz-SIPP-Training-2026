package dsa.hashing;
import java.util.*;

public class SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] nums, int k) {

        Map<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);

        int runningSum = 0;
        int answer = 0;

        for (int num : nums) {

            runningSum += num;

            answer += prefixCount.getOrDefault(runningSum - k, 0);

            prefixCount.merge(runningSum, 1, Integer::sum);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, -2, 2};

        System.out.println(subarraySumEqualsK(nums, 3));
    }
}