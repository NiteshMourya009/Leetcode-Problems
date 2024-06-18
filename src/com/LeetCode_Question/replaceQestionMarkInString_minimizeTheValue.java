package com.LeetCode_Question;

import java.util.HashMap;

public class replaceQestionMarkInString_minimizeTheValue {
    public static String minimizeStringValue(String s) {
         int n=s.length();
         int ascii=97 ;
         String st="";

         for(char i:s.toCharArray()){
              int sc=(int) i ;
              ascii= Math.max(ascii,sc );
             if(i!='?'){
                 st+= Character.toString(i);
                 ascii+=1 ;

             }
             else if(i=='?'){

                 char g= (char) ascii ;
                 st+=Character.toString(g);
                  ascii+=1 ;
             }
         }
         return st ;
    }
    public static void main(String[] args) {
        String s="a?b?";
        System.out.println(minimizeStringValue(s));
    }
}
