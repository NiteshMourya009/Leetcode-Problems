package Sliding_Window;

public class LargestSubArraySumLessTO_K {
    public static int largeestSubArray(int[]arr, int k) {

        int sum =0 ;
        int l=0;
        int r= 0;
        int maxlen= 0;
        while(r<arr.length){
            sum += arr[r] ;
            while(sum>k){
                sum= sum-arr[l];
                l++ ;
            }
            if(sum<=k){
                maxlen= Math.max(maxlen, r-l+1);
            }
            r++ ;
        }
        return maxlen ;

    }
    public static void main(String[] args) {
        int[]nums= {2,5,1,10,8,4,20};
        int k= 14 ;
        System.out.println(largeestSubArray(nums, k));
    }
}
