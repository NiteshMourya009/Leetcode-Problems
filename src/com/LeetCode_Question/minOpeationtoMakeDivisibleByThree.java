package com.LeetCode_Question;

public class minOpeationtoMakeDivisibleByThree {
    public static int isDivisibleByThree(int[]nums){
        int count= 0 ;
        for(int i=0; i<nums.length; i++){
             int m= nums[i]%3 ;
             if(m != 0 && m==1){

                 count++ ;
             }
             else if(m!=0 && m==2){
                 count++  ;

             }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[]nums= {3,6,9} ;
        int n= nums.length ;
        System.out.println(isDivisibleByThree(nums));
    }
}
