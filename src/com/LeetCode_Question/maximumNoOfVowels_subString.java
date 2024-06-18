package com.LeetCode_Question;

import jdk.dynalink.beans.StaticClass;

public class maximumNoOfVowels_subString {
    public static int maxVowels(String s, int k){
        int n= s.length();
        char[] str= s.toCharArray() ;
        int count=0 ;
        int max =0 ;
        for(int i=0; i<n-k+1; i++){
            for(int j=i; j<i+k; j++){
                if(str[j]=='a'||str[j]=='e'||str[j]=='i'|| str[j]=='o'|str[j]=='u'){
                    count++ ;
                }
            }
            max= Math.max(max, count) ;
            count =0 ;
        }
        return max ;
    }
    public static void main(String[] args) {
        String s= "adviou";
        int k= 2 ;
        System.out.println( maxVowels(s,k));
    }
}
