public class MaximumAverage {

    public static double findAverage(int[] arr,int k){

        int windowSum=0;
        int maxSum=Integer.MIN_VALUE;

        int start=0;

        for(int end=0;end<arr.length;end++){

            windowSum+=arr[end];

            if(end>=k-1){

                maxSum=Math.max(maxSum,windowSum);

                windowSum-=arr[start];
                start++;
            }
        }

        return (double)maxSum/k;
    }

    public static void main(String[] args) {

        int[] arr={1,12,-5,-6,50,3};

        System.out.println(findAverage(arr,4));
    }
}