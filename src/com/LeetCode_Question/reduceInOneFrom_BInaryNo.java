package com.LeetCode_Question;
import java.util.* ;

public class reduceInOneFrom_BInaryNo {
    public static int reduceinOne(String s ){
        int binary= Integer.parseInt(s) ;
        int count= 0 ;
        int decimal = 0;
        int n = 0;
        while(true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        if(decimal==1){
            return count ;
        }
        else{
            while(decimal!=1){
                if(decimal%2==0){
                    decimal/=2 ;
                    count++ ;
                }
                else{
                    decimal +=1 ;
                    count++ ;
                }
            }
        }
        return count  ;
    }
    public static void main(String[] args) {
        String s= "11101111110010" ;
        System.out.println(reduceinOne(s));
    }
}
