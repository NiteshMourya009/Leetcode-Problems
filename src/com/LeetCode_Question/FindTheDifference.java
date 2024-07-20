package com.LeetCode_Question;
import java.util.* ;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int m= s.length() ;
        int n= t.length() ;
        // if(m==0){
        //     return  ;
        // }
        char[]str= s.toCharArray() ;
        char[]ptr=t.toCharArray() ;
        Arrays.sort(str) ;
        Arrays.sort(ptr) ;
        String st ="" ;
        for(int i=0; i<m; i++){
            if(ptr[i]!=str[i]){
                return ptr[i];
            }
        }
        return ptr[n-1 ];

    }
    public static void main(String[] args) {
        String s= "abcde";
        String t= "abcfde";
        System.out.println(findTheDifference(s,t));
    }
}
