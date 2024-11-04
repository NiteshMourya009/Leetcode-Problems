package com.LeetCode_Question;

public class flipStringInMonotoneString {
    public static int minFlipsMonoIncr(String s) {
        int min = Integer.MAX_VALUE ;
        int a =0 ;
        int b =0 ;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                a++ ;
            }
            else{
                b++ ;
            }
        }
        int one =0;
        int zero =0 ;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)=='0'){
                zero++ ;
            }
            else{
                one++ ;
            }
            int val=0 ;
            int val1 =0 ;
            if(one==0){
                val =0 ;
            }
            else if (one != 0 && s.charAt(i)=='1'){
                val =one -1 ;
            }else{
                val = one ;
            }
            if(zero==0){
                val1 =0 ;
            }
            else{
                val1 = a-zero ;
            }
            min = Math.min(min, val+val1) ;

        }
        return min ;
    }
    public static void main(String[] args) {
        String s = "010110" ;
        System.out.println(minFlipsMonoIncr(s));
    }
}
