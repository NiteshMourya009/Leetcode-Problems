package com.LeetCode_Question;

public class Increasing_TripletSequence {
    public static boolean increasingTriplet(int[]nums){
        int n=nums.length ;
        if (nums == null || nums.length < 3) {
            return false;
        }
        for(int i=0; i<n-2; i++){
            if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
         int[]num= {20,100,10,12,5,13} ;
        System.out.println(increasingTriplet(num));
    }
}
