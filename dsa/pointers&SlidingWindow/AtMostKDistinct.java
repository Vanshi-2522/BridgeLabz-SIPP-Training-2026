import java.util.HashMap;
import java.util.Map;

public class AtMostKDistinct {

    public static int longest(int[] arr,int k){

        Map<Integer,Integer> map=new HashMap<>();

        int start=0;
        int max=0;

        for(int end=0;end<arr.length;end++){

            map.put(arr[end],map.getOrDefault(arr[end],0)+1);

            while(map.size()>k){

                map.put(arr[start],map.get(arr[start])-1);

                if(map.get(arr[start])==0)
                    map.remove(arr[start]);

                start++;
            }

            max=Math.max(max,end-start+1);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr={1,2,1,2,3};

        System.out.println(longest(arr,2));
    }
}