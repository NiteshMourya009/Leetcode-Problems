package com.LeetCode_Question;

import java.util.Arrays;

public class Seive_Of_Erath {
    public static void Printprime(int n){
        int[] nums= new int[n+1] ;
        Arrays.fill(nums, 0);

        for(int i=2; i<=n; i++){
            if(nums[i]==0){
                for(int j= i*i ; j<=n; j+=i){
                    nums[j] =1 ;
                }
            }
        }
        for(int i=0; i<=n; i++){
            if(nums[i]==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n= 40 ;
        Printprime(n);
    }
}
