package com.LeetCode_Question;

import org.jetbrains.annotations.Contract;

public class superPow {
    @Contract(pure = true)
    public static int superPower(int a, int[]b){
        // Not Passes all the Cases in Leetcode
        int n= b.length ;
        int value= 0;
        for(int i=0; i<n; i++){
            value= value*10 + b[i] ;
        }
        int max= (int) Math.pow(a,value);
        int superValue= max% 1337 ;

        return superValue ;
    }
    public static void main(String[] args) {

        int a =2;
        int[]b= {1,0} ;
        System.out.println(superPower(a,b));
    }
}
