package com.LeetCode_Question;

public class minOpearationTomakeBinaryEqualOne {
    public static void flips(int[] nums, int start){
        for(int i=start; i<start+3; i++ ){
            nums[i] = nums[i] == 0 ? 1 : 0;
        }
    }
    public static int isEqualToOne(int[]nums){
        int n=nums.length ;
        int count= 0 ;
        for(int i=0; i<nums.length-2 ;i++){
           if(nums[i]==0){
               flips(nums,i);
               count++ ;
           }
       }
        for (int i = n - 2; i < n; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[]nums= {0,1,1,1,0,0} ;
        System.out.println(isEqualToOne(nums));
    }
}
