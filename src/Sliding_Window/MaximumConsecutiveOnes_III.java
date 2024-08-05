package Sliding_Window;

public class MaximumConsecutiveOnes_III {
    public static int longestOnes(int[] nums, int k) {
         int n= nums.length ;
         int r =0 ;
         int l=0;
         int max =0;
         int zero =0 ;
         while (r<n){
             if(nums[r]==0){
                 zero++ ;
             }
             while(zero>k){
                 if(nums[l]==0){
                     zero-- ;
                 }
                 l++ ;
             }
             if(zero <= k){
                 max= Math.max(max, r-l+1);
             }
             r++ ;
         }
         return max ;
    }
    public static void main(String[] args) {
        int[]arr= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3 ;
        System.out.println(longestOnes(arr,   k));
    }
}
