package com.LeetCode_Question;

public class Jump_Game {
    public static boolean canJump(int[] nums) {
        int maxInd= 0;
        for(int i=0; i<nums.length ; i++){
            if(i>maxInd){
                return false ;
            }
            else{
                maxInd= Math.max(maxInd, i+nums[i]) ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int[]nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
