package com.LeetCode_Question;

public class powerOf_three {
    public static boolean isPowerOfThree(int n){
        if(n<3 && n!=1){
            return false ;
        }
       while( n!=1){
           if(n%3!=0){
               return false ;
           }
           else {
               n = n/3 ;
           }
       }
       return true ;
    }
    public static void main(String[] args) {

        int n= 18 ;
        System.out.println(isPowerOfThree(n));
    }
}
