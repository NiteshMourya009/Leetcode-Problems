package Sliding_Window;

public class MinimumSizeSubArray {
    public static int minSubArrayLen(int target, int[] arr) {
        int sum =0 ;
        int l=0;
        int r= 0;
        int maxlen= Integer.MAX_VALUE;
        if(target <=0){
            return 0 ;
        }
        while(r<arr.length){
            sum += arr[r] ;
            while(sum>= target && l<=r){
                maxlen = Math.min(maxlen, r - l + 1);
                sum= sum-arr[l];
                l++ ;
            }
            r++ ;
        }
        if(maxlen ==Integer.MAX_VALUE){
            return 0 ;
        }
        return maxlen ;
    }
    public static void main(String[] args) {
        int[]arr= {2,3,1,2,4,3} ;
        int target=7;
        System.out.println(minSubArrayLen(target, arr));
    }
}
