package com.LeetCode_Question;

public class passThePillow {
    public static int passThePillow(int n, int time) {


        if(time<n){
            n= time+1 ;
        }
        else if(time>n ){
            if( (time/n)%2 !=0 ){
                int h=time%n ;
                n =n-h-1 ;
            }
            else{
                int q= time/n ;
                int p= time%n ;
                n= p+1 +q ;
            }
        }
        return n ;
    }
    public static void main(String[] args) {
        int time =9 ;
        int n= 8 ;
        System.out.println(passThePillow(n,time));

    }
}
