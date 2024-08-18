package com.LeetCode_Question;

public class luckyNumber {
    public static boolean isPrime(int a){
        if(a==1){
            return false ;
        }
        if(a==2){
            return true ;
        }
        for(int i=3; i<= Math.sqrt(a); i= i+2){
            if(a%i==0){
                return false ;
            }
        }
        return true ;
    }
//    public static int square(int val){
//        int squ =0 ;
//        while(val>0){
//            int a= val%10 ;
//            squ += a*a ;
//            val/=10 ;
//        }
//        return squ ;
//    }
//    public static int sum(int val){
//        int sum =0 ;
//        while(val>0){
//            int a= val%10 ;
//            sum +=a ;
//            val/=10 ;
//        }
//        return sum ;
//    }
    public static int isLuckyNUm(int a, int b){
        int count =0 ;
        for(int i=a; i<=b; i++){
            int sum =0 ;
            int square= 0;
            int ind=i ;
            while(ind>0){
                int val=ind%10 ;
                sum += val ;
                square += val*val ;

                ind = ind/10 ;
            }
            if(isPrime(sum) && isPrime(square)){
                count++ ;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int a= 20 ;
        int b= 25 ;
        System.out.println(isLuckyNUm(a,b));
    }
}
