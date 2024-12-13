package com.LeetCode_Question;
import java.util.* ;
public class maximumDistinctSUmSubArray {
    // Optimize the code in n(log(n))
    public static long maximumSubarraySum(int[] nums, int k) {
        int ans =0 ;

        for(int i=0; i<nums.length-k+1; i++){
            int sum =0;
            Set<Integer> set =new HashSet<>() ;
            for(int j=i; j<i+k; j++){
                set.add(nums[j]) ;
            }
            if(set.size()==k){
                for(int j=i; j<i+k; j++){
                    sum += nums[j] ;
                }
            }
            ans = Math.max(ans, sum ) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[]nums= {1,1,1,7,8,9};
        int k= 3 ;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
