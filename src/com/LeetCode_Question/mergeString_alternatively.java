package com.LeetCode_Question;

public class mergeString_alternatively {
    public static String mergeAlternately(String word1, String word2){
        int m =word1.length();
        int n= word2.length();
        int min= Math.min(m,n);
        String str="";
        int i=0 ;
        while(i<min){
            char ch= word1.toCharArray()[i];
            char sc=word2.toCharArray()[i];
            str += ch + sc ;
            i++ ;
        }
        if(i<m){
            str += word1.charAt(i);
            i++ ;
        }
        else if(i<n){
            str += word2.charAt(i);
            i++ ;
        }
        return str ;
    }
    public static void main(String[] args) {

        String word1= "abcd";
        String word2= "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
