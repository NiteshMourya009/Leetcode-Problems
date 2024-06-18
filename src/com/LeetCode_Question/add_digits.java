package com.LeetCode_Question;

public class add_digits {
    public static int addDigit(int n){
        int b= 0 ;
        if(n<9){
            return n ;
        }
        while(n>=9){
            int a= n%10 ;
            n=n/10 ;
             b= n+a ;
             n= b;
        }
        System.out.println(b);
        return b ;
    }
    public static void main(String[] args) {
        int n= -91;
        addDigit(n);
    }
}
