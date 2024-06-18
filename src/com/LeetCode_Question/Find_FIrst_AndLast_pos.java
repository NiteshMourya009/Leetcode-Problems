package com.LeetCode_Question;

public class Find_FIrst_AndLast_pos {

    public static int[]searchRange(int[]nums, int target){

        int n= nums.length ;
        int i=0, j=n;
        while(i<j){
            if(nums[i]==target && nums[j]==target){
                i++ ;
                j--;
                return new int[]{i, j};

            }else {
                i++;
                j-- ;
                return new int[]{-1,-1} ;

            }
        }
        return new int[]{} ;
    }
    public static void main(String[] args) {

        int[]nums= {5,7,7,8,8,10};
        int target= 8;
        int[] res =searchRange(nums,target) ;
        for(int val: res){
            System.out.println(val);
        }

    }
}
