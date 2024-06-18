package com.LeetCode_Question;

import java.util.Arrays;

public class shuffle_string{
    public static  String restoreString(String s, int[]indices){
        int n= indices.length ;
        String[]str= new String[n] ;
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            int max= indices[i];
            str[max]= Character.toString(ch);
        }
        StringBuilder st= new StringBuilder();
        for(String sb: str){
            st.append(sb) ;
        }
        return st.substring(0, st.length());
    }
    public static void main(String[] args) {

        String s="codeleet" ;
        int[]indices= {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
}
