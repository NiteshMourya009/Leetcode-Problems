package com.LeetCode_Question;

public class nth_TribbonacciNo {
    public static int tribonacci(int n,int[]dp) {
         if(n==0){
             return  0 ;
         }
         if(n==1) return 1 ;
         if(n==2) return 1 ;
         if(dp[n] != -1) return dp[n] ;

         return tribonacci(n-1,dp)+tribonacci(n-2,dp)+tribonacci(n-3,dp) ;
    }
    public static void main(String[] args) {
        int n= 25 ;
        int[]dp= new int[n+1] ;

        for(int i=0; i<=n; i++){
            dp[i]= -1 ;
        }
        System.out.println(tribonacci(n,dp));
    }
}
