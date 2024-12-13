package com.LeetCode_Question;

public class shortestSubArraywithSUmAtLeastK {
    public static int shortestSubarray(int[] nums, int k) {
        int l=0 ;
        int r =0 ;
        int sum=0;
        int minlen= Integer.MAX_VALUE ;

        while(r< nums.length){
            sum += nums[r] ;

            while(sum >=k && l<=r){
                minlen= Math.min(minlen, r-l+1) ;
                if(nums[l] >0){
                    sum= sum- nums[l] ;
                }
                else{
                    sum= sum + nums[l] ;
                }
                l++ ;
            }
            r++ ;
        }
        if(minlen == Integer.MAX_VALUE ){
            return -1 ;
        }
        return minlen ;
    }
    public static void main(String[] args) {
        int[]nums= {84,-37,32,40,95};
        int k =167 ;
        System.out.println(shortestSubarray(nums, k));
    }
}
