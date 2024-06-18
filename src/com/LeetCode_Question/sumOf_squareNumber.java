package com.LeetCode_Question;

public class sumOf_squareNumber {
    public static boolean judgeSum(int c){

        double end= Math.sqrt(c) ;
        for(int i=0; i<= end ; i++){
            for(int j=i ; j<=end; j++){
                 if(Math.pow(i,2)+Math.pow(j,2)== c) {
                     return true;
                 }
            }

        }
        return false ;
    }
    public static void main(String[] args) {
        int c= 6 ;
        System.out.println(judgeSum(c));

    }
}
