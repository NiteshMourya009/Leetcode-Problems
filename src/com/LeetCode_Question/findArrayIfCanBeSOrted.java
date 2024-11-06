package com.LeetCode_Question;

public class findArrayIfCanBeSOrted {
    public static boolean canSortArray(int[] nums) {
        int[]arr =new int[nums.length] ;

        for(int i=0; i<nums.length; i++){
            int val = nums[i] ;
            int count =0 ;
            while(val > 0){
                count += (val & 1) ;
                val >>= 1 ;
            }
            arr[i] = count ;
        }
        for(int i=0; i<nums.length; i++){

            for(int j=0; j<nums.length-1; j++){
                if(nums[j] > nums[j+1] && arr[j]==arr[j+1]){
                    int temp = nums[j] ;
                    nums[j]= nums[j+1] ;
                    nums[j+1] = temp ;
                }
            }
        }
        for(int i=1; i< nums.length; i++){
            if(nums[i] < nums[i-1]){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int[]nums = {8,4,2,30,15};
        System.out.println(canSortArray(nums));
    }
}
