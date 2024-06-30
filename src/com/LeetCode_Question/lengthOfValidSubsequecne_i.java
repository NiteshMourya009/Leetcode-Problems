//package com.LeetCode_Question;
//
//public class lengthOfValidSubsequecne_i {
//    public static int length(int[] nums){
//        int n=nums.length ;
//        int[]arr=new int[n] ;
//        int[]ar= new int[n] ;
//        int count=0 ;
//        int max =0 ;
//        for(int i=0; i<n-1; i++){
//            if( (nums[i]+nums[i+1])%2 ==0 ){
//                arr[max++]=nums[i];
//                arr[max++]= nums[i+1] ;
//            }
//            else if( (nums[i]+nums[i+1])%2 ==1 ){
//                  ar[count++]= nums[i] ;
//                  ar[count]= nums[i+1];
//            }
//        }
//        if(arr.length > ar.length){
//            return arr.length ;
//        }
//        return ar.length ;
//    }
//    public static void main(String[] args) {
//        int[]nums= {1,2,1,1,2,1,2} ;
//        System.out.println(length(nums));
//    }
//}
