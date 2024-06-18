package com.LeetCode_Question;

public class countAlternating_SubArray {
    public static long countAlternatingSubarrays(int[] nums) {
        int j=0 ;
        long count=0 ;
        long n=nums.length ;

        while(j<nums.length-1){
             int k=j ;
             if(nums[j]!=nums[j+1]){
                 while(k<n-1){
                     if(nums[k]!=nums[k+1]){
                         count++ ;
                         k++ ;
                     }
                     else{
                         break;
                     }
                 }
             }
             j++ ;

        }
        return count+n ;
    }
    public static void main(String[] args) {
        int[] nums={1,0,1,1} ;
        System.out.println(countAlternatingSubarrays(nums));
    }
}
