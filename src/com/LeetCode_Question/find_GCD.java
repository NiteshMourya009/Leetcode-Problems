package com.LeetCode_Question;

public class find_GCD {
    public static int greatestCommonDivisor(int[]nums){
        int n= nums.length;
        int min=Integer.MAX_VALUE;
        int max= 0;
        for(int i=0; i<n; i++){
            max= Math.max(max,nums[i]);
            min= Math.min(min,nums[i]);
        }
        int gcd=0 ;
        for(int i=min; i<=max; i++){
            if(min%i==0 && max%i==0){
                gcd= Math.max(gcd,i);
            }
        }
        if(gcd !=0){
            return gcd ;
        }
        return 1 ;
    }
    public static void main(String[] args) {
        int[]nums= {3,3};
        System.out.println(greatestCommonDivisor(nums));

    }
}
