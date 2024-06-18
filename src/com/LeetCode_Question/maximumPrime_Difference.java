package com.LeetCode_Question;
import java.util.* ;

public class maximumPrime_Difference {
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int maximumPrimeDifferences(int[]nums) {
        int min=Integer.MAX_VALUE;
        int max=0 ;
       for(int i=0; i<nums.length; i++){
           if(isPrime(nums[i])){
               max=Math.max(0,i);
               min=Math.min(0,i);
           }
       }
       return max-min ;

    }
    public static void main(String[] args) {
        int[] nums={4,2,9,5,3};
        System.out.println(maximumPrimeDifferences(nums));
    }
}
