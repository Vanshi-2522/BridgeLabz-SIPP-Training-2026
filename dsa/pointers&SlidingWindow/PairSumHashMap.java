import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class PairSumHashMap {

    public static int[] findPair(int[] arr, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            int complement = target - num;

            if(map.containsKey(complement)){
                return new int[]{complement,num};
            }

            map.put(num,1);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[] arr = {7,3,9,2,8};

        System.out.println(Arrays.toString(findPair(arr,11)));
    }
}