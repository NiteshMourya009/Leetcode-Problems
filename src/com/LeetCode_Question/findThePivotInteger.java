package com.LeetCode_Question;

public class findThePivotInteger {
    public static int pivot_Integer(int n){
        int min=0;
        int max=0 ;
        for(int i=1; i<=n; i++){
            max += i ;
            for(int j=i; j<=n; j++ ){
                min += j ;
            }
            if(min==max){
                return i ;

            }

            else{
                min=0 ;
            }
        }
        return -1 ;
    }
    public static int pivotInteger(int n){
        int left=0 ;
        int right= n ;
        int totalSum=(n*(n+1))/2;
        while(left<=right){
            int mid= left +(right-left)/2 ;
            int  firstSum= (mid*(mid+1))/2 ;
            int SecondSum= totalSum-firstSum+mid ;
            if(firstSum==SecondSum){
                return mid ;
            } else if (firstSum<SecondSum) {
                left= mid+1 ;
            }
            else{
                right= mid-1 ;
            }
        }
        return -1 ;

    }
    public static void main(String[] args) {
        int n=8 ;
        System.out.println(pivot_Integer(n));
        System.out.println(pivotInteger(n));
    }
}
