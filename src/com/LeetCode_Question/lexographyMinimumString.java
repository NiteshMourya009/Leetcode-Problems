package com.LeetCode_Question;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class lexographyMinimumString {
    public static String  minimimumStr(String s){
        int n=s.length() ;
        Queue<Character> st= new ArrayDeque<>() ;
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            if(ch !='*'){
                st.add(ch);
            }
            else{
                st.remove();
            }
        }
        Queue<Character>pt= new ArrayDeque<>();
        while(st.size() !=0){
            char pa=st.remove() ;
            pt.add(pa);
        }
        String prt="";
        while(pt.size()!= 0){
            char sh=pt.remove();
            prt += String.valueOf(sh);
        }
        return prt ;
    }
    public static void main(String[] args) {
        String s="de*";
        System.out.println(minimimumStr(s));
    }
}
