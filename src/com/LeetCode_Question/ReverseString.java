package com.LeetCode_Question;

public class ReverseString {
    public static void reverse(char[]ch, int i, int j){
        while(i<=j){
            char temp= ch[i] ;
            ch[i]= ch[j] ;
            ch[j]= temp ;
            i++ ;
            j-- ;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = s.length();
         if(k>n){
             reverse(ch,0,n-1);
         }
         else{
             for (int i = 0; i < n; i = i + 2*k) {
                 int end= Math.min(i+k-1, n-1);
                 reverse(ch, i, end);
             }
         }


        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str += String.valueOf(ch[i]);
        }
        return str;
    }
    public static void main(String[] args) {
        String s="abcdefg";
        int k=8 ;
        System.out.println(reverseStr(s,k));
    }
}
