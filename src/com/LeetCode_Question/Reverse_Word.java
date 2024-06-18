package com.LeetCode_Question;

import java.util.Stack;

public class Reverse_Word {
    public static String reverse(String s){
        String[]str= s.trim().split("\\s+");
        int n= str.length;
        int i=0, j=n-1;

        while(i<j){
            String temp= str[i];
            str[i]= str[j];
            str[j]= temp ;
            i++;
            j-- ;
        }
        return String.join(" ",str);
    }
    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverse(s));
    }
}