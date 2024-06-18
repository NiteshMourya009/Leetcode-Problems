package com.LeetCode_Question;

public class findFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int n= nums.length ;
        int[]arr= new int [2] ;
        int count= 0 ;
        int k=0 ;
        for(int i=0; i<n && count<1; i++){
            if(nums[i]==target){
                arr[k]=i ;
                k++ ;
                count++ ;
            }
        }
        if(count<1){
            arr[k++]=-1;
            count++ ;
        }
        for(int i=n-1; i>=0 && count<2; i--){
            if(nums[i]==target){
                arr[k]=i ;
                k++ ;
                count++ ;
            }
        }
        if(count<2){
            arr[k++]=-1 ;
            count++ ;
        }

        return arr ;
    }
    public static void main(String[] args) {
        int[]nums= {5,7,7,8,8,10};
        int target= 8 ;
        int[]ans= searchRange(nums,target);
        System.out.print(ans+" ");

    }
}
