public class FixedWindow {

    public static int maxSum(int[] arr,int k){

        int windowSum=0;
        int max=Integer.MIN_VALUE;

        int start=0;

        for(int end=0;end<arr.length;end++){

            windowSum+=arr[end];

            if(end>=k-1){

                max=Math.max(max,windowSum);

                windowSum-=arr[start];
                start++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr={2,1,5,1,3,2};

        System.out.println(maxSum(arr,3));
    }
}