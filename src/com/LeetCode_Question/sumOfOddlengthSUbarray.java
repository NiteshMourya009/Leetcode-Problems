package com.LeetCode_Question;

public class sumOfOddlengthSUbarray {
    public static int sumOddLengthSubarrays(int[] arr) {
        int max =0 ;
        int n=arr.length;
        for(int i=0; i<n; i++){
            int sum =0;
            int count=1 ;
            for(int j=i; j<n; j++){
                sum += arr[j] ;
                if(count%2 !=0){
                    max+=sum ;
                }
                count++ ;
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        int[]nums= {1,4,2,5,3} ;
        System.out.println(sumOddLengthSubarrays(nums));
    }
}
