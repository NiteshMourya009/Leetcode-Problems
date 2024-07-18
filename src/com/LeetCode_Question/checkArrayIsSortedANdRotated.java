package com.LeetCode_Question;

import java.lang.reflect.Array;

public class checkArrayIsSortedANdRotated {
    public static boolean isSorted(int[]nums){

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                return false ;
            }
        }
        return true ;
    }
    public static void rotate(int[]nums,int i, int j){

        while(i<j){
            int temp= nums[i] ;
            nums[i] =nums[j] ;
            nums[j]= temp ;
            i++ ;
            j-- ;
        }
    }
    public static boolean sortedorRotated(int[]nums){
        if(isSorted(nums)){
            return true ;
        }
        rotate(nums, 0, nums.length-1);
        int[]arr= new int[nums.length] ;
        System.arraycopy(nums,0,arr,0,nums.length);
        for(int i=0; i<nums.length-1; i++){
            System.arraycopy(nums,0,arr,0,nums.length);
            rotate(arr,0,i);
            rotate(arr,i+1, nums.length-1);
            if(isSorted(arr)){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int[]nums ={7,9,1,1,1,3};
        System.out.println(sortedorRotated(nums));
    }
}
