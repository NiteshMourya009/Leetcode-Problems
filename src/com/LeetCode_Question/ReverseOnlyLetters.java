package com.LeetCode_Question;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        int n= s.length() ;
        int i=0;
        int j= n-1 ;
        char[]ch= s.toCharArray() ;
        while(i<j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char temp= ch[i] ;
                ch[i]= ch[j] ;
                ch[j] = temp ;
                i++ ;
                j-- ;
            }
            else if(!Character.isLetter(ch[i])){
                i++ ;
            }
            else if(!Character.isLetter(ch[j])){
                j-- ;
            }
        }
        String str="";
        for(int k=0; k<ch.length; k++){
            str += String.valueOf(ch[k]) ;
        }
        return str ;

    }
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj" ;
        System.out.println(reverseOnlyLetters(s));
    }
}
