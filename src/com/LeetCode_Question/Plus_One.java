package com.LeetCode_Question;

import java.math.BigInteger;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        int n= digits.length ;
        for(int i= n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++ ;
                return digits ;
            }
            digits[i] =0 ;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        int[]digits= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[]ans= plusOne(digits);
        for(long i:ans){
            System.out.print(i+" ");
        }

    }
}
