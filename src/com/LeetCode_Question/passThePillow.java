package com.LeetCode_Question;

public class passThePillow {
    public static int passThePillow(int n, int time) {
        int ans =0;
        if( (time/(n-1))%2 !=0 ){
            int h=time%(n-1) ;
            ans=n-h ;
        }
        else{
            // int q= time/n ;
            int p= time%(n-1) ;
            ans= p+1  ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        int time =9 ;
        int n= 8 ;
        System.out.println(passThePillow(n,time));

    }
}
