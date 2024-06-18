package com.LeetCode_Question;

public class kthFactor_ofN {
    public static int kthFactor(int n, int k) {
        int p=0 ;
        int[]nums= new int[n/2+1] ;
        int a =0 ;
        for(int i=1; i<n/2+1; i++){
            if(n%i==0){
                nums[a]=i ;
                a++ ;

            }
        }
        nums[a]= n ;
        if(k<=a+1){
            return nums[k-1] ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int n=16 ;
        int k=6 ;
        System.out.println(kthFactor(n,k));
    }
}
