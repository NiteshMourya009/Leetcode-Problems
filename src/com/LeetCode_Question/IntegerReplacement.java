package com.LeetCode_Question;

public class IntegerReplacement {
    public static int integerReplacement(long n) {
       if(n==1){
           return 0 ;
       }
       int result =0 ;
       if(n%2==0){
           result = 1+ integerReplacement(n/2) ;
       }
       else {
           result = 1+ Math.min(integerReplacement(n+1),integerReplacement(n-1));
       }
       return result ;
    }
    public static void main(String[] args) {
        int n =10000 ;
        System.out.println(integerReplacement((long)n));
    }
}
