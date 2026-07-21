package dsa.heaps;

import java.util.PriorityQueue;

public class KthSmallestMatrix {

    public static int kthSmallest(int[][] matrix,int k){

        PriorityQueue<Integer> maxHeap=
                new PriorityQueue<>((a,b)->b-a);

        for(int[] row:matrix){

            for(int value:row){

                if(maxHeap.size()<k)
                    maxHeap.offer(value);

                else if(value<maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.offer(value);
                }
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args){

        int[][] matrix={
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };

        System.out.println(kthSmallest(matrix,8));
    }
}
