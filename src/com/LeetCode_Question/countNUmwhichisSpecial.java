package com.LeetCode_Question;

public class countNUmwhichisSpecial {
    public static int nonSpecialCount(int l, int r) {
        int count =0 ;
        int max =0 ;
        for(int i=l; i<=r; i++){
            for(int j=1 ;j<i; j++){
                if(i%j==0){
                    max++ ;
                }
            }
            if(max != 2){
                count++ ;
            }
            else{
                max =0 ;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int l =4;
        int r =16 ;
        System.out.println(nonSpecialCount(l, r));

    }
}
