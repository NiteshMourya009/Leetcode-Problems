package com.LeetCode_Question;
import java.util.*;
public class reverseStringII {
    public static String reverseString(String s, int k){
      char[] ch= s.toCharArray() ;
        int i=0;
        int j= k ;
        while(i<=j){
            char temp ;
            temp= ch[i];
            ch[i]= ch[j];
            ch[j]= temp ;

            i++ ;
            j-- ;

        }
        String st= ch.toString() ;
        return st ;
    }
    public static void main(String[] args) {
        String s="abcdef";
        int k=3 ;
        System.out.println(reverseString(s,k));
    }
}
