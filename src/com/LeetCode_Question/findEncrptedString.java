package com.LeetCode_Question;

public class findEncrptedString {
    public static String getEncryptedString(String s, int k){
        int n= s.length() ;
        String str ="";
        for(int i=0; i<n; i++){
            int x= (i+k)% n ;
            char ch= s.charAt(x) ;
            str += String.valueOf(ch);
        }
        return str ;
    }
    public static void main(String[] args) {
        String s= "aaa" ;
        int k=1 ;
        System.out.println(getEncryptedString(s,k));
    }
}
