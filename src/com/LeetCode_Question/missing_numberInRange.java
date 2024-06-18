package com.LeetCode_Question;

import java.util.Arrays;
import java.util.HashSet;

public class missing_numberInRange {
    public static  int missingNumber(int[]nums){
        int n= nums.length ;
       int max=0;
       int min =5000;
       for(int i=0; i<n; i++){
           max= Math.max(max,nums[i]);
           min=Math.min(min,nums[i]);
       }
        System.out.println(min);
        System.out.println(max);
       int missing=0 ;
        Arrays.sort(nums);
       for(int i=min; i<max; i++){
          if(nums[i]!=i){
               missing= i;
          }

       }
       return missing;
    }
//    public static int misNumber(int[] nums){
//        HashSet<Integer>set= new HashSet<>() ;
//
//        for(int num:nums){
//            if(!set.contains(num)){
//                set.add(num) ;
//            }
//            else{
//
//            }
//        }
//    }
    public static void main(String[] args) {

        int [] num={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(num));
    }
}
