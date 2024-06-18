package com.LeetCode_Question;

public class noOfSegmentsInString {
    public static int noOfsegments(String s){
        String[]str= s.split(" ");
        int n= str.length ;
        return n ;
    }
    public static void main(String[] args) {

        String s ="my name , is Nitesh Mourya" ;
        System.out.println(noOfsegments(s));
    }
}
