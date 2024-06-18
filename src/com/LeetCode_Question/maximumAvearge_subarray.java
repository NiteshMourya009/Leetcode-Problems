package com.LeetCode_Question;

public class maximumAvearge_subarray {
    public static double findMaxAverage(int[]nums, int k){
        int n= nums.length ;
        int max1= 0 ;
        double max2= Integer.MIN_VALUE;
        for(int i=0; i<n-k+1; i++){
            for(int j=i; j<i+k; j++) {
                max1 += nums[j] ;
            }
            max2 = Math.max(max2, max1) ;
            max1 =0 ;
        }
        double average= max2 /k ;
        return  average ;
    }
    public static void main(String[] args) {
        int[]nums= {1,12,-5,-6,50,3} ;
        int k= 4 ;
        System.out.println(findMaxAverage(nums, k));
    }
}
