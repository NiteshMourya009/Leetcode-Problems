package com.LeetCode_Question;

import java.util.ArrayList;

public class interview {
    public static int freq(int n){
        String str= String.valueOf(n) ;
        ArrayList<Integer>arr= new ArrayList<>() ;
        for(int i=0; i<str.length(); i++){
            int count =1 ;
            int j=i+1 ;
            while(j<str.length() && str.charAt(i)==str.charAt(j)){
                count++ ;
                i=j ;
                j++ ;
            }
            arr.add(count ) ;
            arr.add(str.charAt(i)-'0');

        }
        System.out.println(arr);
        return 1 ;
    }
    public static void main(String[] args) {
        int a= 1112223333;
        freq(a) ;
    }
}
