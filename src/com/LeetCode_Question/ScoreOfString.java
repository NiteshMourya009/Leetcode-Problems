package com.LeetCode_Question;
import java.util.* ;
public class ScoreOfString {
    public static int valueOfString(String s){
        int n=s.length() ;
        int value=0 ;

        for(int i=0; i<n-1; i++){
            char ch=s.charAt(i) ;
            char sc=s.charAt(i+1) ;
            int ascii=(int)ch;
            int ascii2=(int)sc ;
            int max=Math.abs(ascii-ascii2);
            value+=max ;
        }
        return value ;
    }
    public static void main(String[] args) {
        String str="javasa" ;
        System.out.println(valueOfString(str));
    }
}
