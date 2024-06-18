package com.LeetCode_Question;

public class countSubString_endWIthGivenChar {
    public static long countSubstrings(String s, char c) {

        long count =0 ;
        char[]chars= s.toCharArray();
        int n= s.length() ;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(chars[i]==c && chars[j]==c){
                    count++ ;
                }
            }
        }
        return count ;
    }
    
    public static void main(String[] args) {
        String s="zzz";
        char c='z' ;
        System.out.println(countSubstrings(s,c));
    }
}
