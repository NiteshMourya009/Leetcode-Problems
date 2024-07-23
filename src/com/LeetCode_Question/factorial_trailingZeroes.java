package com.LeetCode_Question;

public  class factorial_trailingZeroes {
    public static int factorialtrailingZeroes(int n){
        if(n==0) {
            return 0;
        }
        int count =0 ;
        while(n>0){
            n= n/5 ;
            count =count + n  ;
        }
        return count ;
    }
    public static void main(String[] args) {
        int n= 30;
        System.out.println(factorialtrailingZeroes(n));
    }
}
