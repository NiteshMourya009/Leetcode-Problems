package com.LeetCode_Question;

import java.util.Stack;

public class question01 {
    public static String minflip(String s){
        int n= s.length() ;
        String str="";
        for(int i=0; i<n; i++){

            if(i%2==0){
                str+= "0" ;
            }
            else{
                str+="1";
            }
        }
        return str ;
    }
    public static void main(String[] args) {

        String s= "01101010";
        System.out.println(minflip(s));

    }
}
