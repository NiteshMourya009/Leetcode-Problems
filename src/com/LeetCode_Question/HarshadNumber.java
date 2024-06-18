package com.LeetCode_Question;

public class HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=0;
        int no=x ;
        while(x>0){
            int b=x%10 ;
            num+=b ;
            x/=10 ;
        }
        if(no%num!=0){
            return -1;
        }
        return num ;
    }
    public static void main(String[] args) {
        int x =23 ;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}
