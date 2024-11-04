package com.LeetCode_Question;

public class MinLength_AfterRemovingSubString {
    public static int minLength(String s) {
         int n= s.length() ;
         String st="";
         int min =Integer.MAX_VALUE ;
         for(int i=0; i<s.length(); i++){
             for(int j=0; j<s.length(); j++){
                 if(j<s.length()){
                     if( (s.charAt(j)=='A'&& s.charAt(j+1)=='B') || (s.charAt(j)=='C' && s.charAt(j+1)=='D')){
                         j++ ;
                     }
                     else {
                         st += String.valueOf(s.charAt(j));
                     }
                 }

             }
             s= st ;
             st= "" ;
             min= Math.min(min, s.length());
         }
         return min ;
    }
    public static void main(String[] args) {
        String s= "ABFCACDB" ;
        System.out.println(minLength(s));
    }
}
