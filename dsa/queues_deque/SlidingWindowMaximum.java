package dsa.queues_deque;

import java.util.ArrayDeque;
import java.util.Deque;


public class SlidingWindowMaximum {


    static int[] findMaximum(int[] arr, int k) {


        int n = arr.length;

        int[] result = new int[n-k+1];


        Deque<Integer> deque = new ArrayDeque<>();


        for(int i=0; i<n; i++) {


            // Remove elements outside window
            while(!deque.isEmpty() &&
                  deque.peekFirst() <= i-k) {

                deque.pollFirst();
            }



            // Remove smaller elements
            while(!deque.isEmpty() &&
                  arr[deque.peekLast()] <= arr[i]) {

                deque.pollLast();
            }



            deque.offerLast(i);



            if(i >= k-1) {

                result[i-k+1] = arr[deque.peekFirst()];
            }
        }


        return result;
    }



    public static void main(String[] args) {


        int[] data = {4,2,12,3,8,7,9};

        int k = 3;


        int[] result = findMaximum(data,k);


        System.out.println("Maximum values:");

        for(int value : result) {

            System.out.print(value + " ");
        }
    }
}
