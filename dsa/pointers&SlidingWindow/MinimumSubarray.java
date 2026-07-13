public class MinimumSubarray {

    public static int minLength(int[] arr,int target){

        int start=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int end=0;end<arr.length;end++){

            sum+=arr[end];

            while(sum>=target){

                min=Math.min(min,end-start+1);

                sum-=arr[start];
                start++;
            }
        }

        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {

        int[] arr={2,3,1,2,4,3};

        System.out.println(minLength(arr,7));
    }
}