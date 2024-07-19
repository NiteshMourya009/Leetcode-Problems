package com.LeetCode_Question;
import java.util.* ;
public class countSmallerNumAfterSelf {
    public static List<Integer> countSmaller(int[] nums) {
        int k=0 ;
        List<Integer>arr =new ArrayList<>() ;
        for(int i=0; i<nums.length; i++){
            int count =0 ;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++ ;
                }
            }
            arr.add(count) ;

        }
        return arr ;
    }
    public static void main(String[] args) {
        int[]nums={5,2,6,1};
        List<Integer> ap= countSmaller(nums) ;
        for(int num: ap){
            System.out.println(num) ;
        }
    }
}
