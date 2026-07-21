package dsa.heaps;
import java.util.*;

public class TopKFrequent {

    public static List<Integer> topK(int[] nums,int k){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);

        PriorityQueue<Integer> minHeap=
                new PriorityQueue<>(
                        (a,b)->map.get(a)-map.get(b));

        for(int key:map.keySet()){

            if(minHeap.size()<k)
                minHeap.offer(key);

            else if(map.get(key)>map.get(minHeap.peek())){
                minHeap.poll();
                minHeap.offer(key);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args){

        int[] nums={1,1,1,2,2,3};

        System.out.println(topK(nums,2));
    }
}
