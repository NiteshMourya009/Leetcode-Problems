package com.LeetCode_Question;

public class isHappy {
    public static boolean isHappy(int n) {
        int max=0 ;
        while(n!=1 && max==1){
            int rem =n%10 ;
            max+=rem*rem ;
            n= n/10 ;
            if(n<1){
                n= max;
            }
        }
        if(max==1){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        int n=19 ;
        System.out.println(isHappy(n));
    }
}
