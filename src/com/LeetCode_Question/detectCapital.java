package com.LeetCode_Question;

import java.util.Stack;

public class detectCapital {
    public static boolean detectCapitalUse(String word){
        int n= word.length() ;
        Stack<Character>str= new Stack<>() ;
        for(int i=0; i<n; i++){
           char ch = word.charAt(i);
           int ascii= (int) ch ;
           // int count= 0 ;
           if(ascii>=62 && ascii<=90){
               str.push(ch) ;
             //  count++ ;
           }
           if(str.size()==0 && str.size()==1){
               return false ;
           }
           if(str.size()==n){
               return true ;
           }

        }
        return false ;

    }
    public static void main(String[] args) {

        String word= "FlaG" ;
        System.out.println(detectCapitalUse(word));
    }
}
