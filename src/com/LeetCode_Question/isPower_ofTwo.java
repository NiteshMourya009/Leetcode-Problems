package com.LeetCode_Question;

public class isPower_ofTwo {
    public static boolean isPower(int n){
        if(n==1){
            return true ;
        }
        if(n%2==0){
            isPower(n/2);
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {

        int n= 16 ;
        System.out.println(isPower(n));
    }
}
