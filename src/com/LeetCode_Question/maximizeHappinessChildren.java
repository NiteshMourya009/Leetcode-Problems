package com.LeetCode_Question;

import java.util.Arrays;

public class maximizeHappinessChildren {
    public static long maximumHappinessSum(int[] happiness, int k) {

        int n= happiness.length ;
        long max=0 ;
        int count=0 ;
        Arrays.sort(happiness);
        for(int i=n-1; i>=0; i--){
            if( happiness[i]>0 && count<k){
                max += happiness[i] ;

            }
            for(int j=i-1; j>=0; j--){
                if(happiness[i]>0 && count<k) {
                    happiness[j]= happiness[j]-1 ;

                }

            }
            count++ ;
        }
        return max ;
    }
    public static void main(String[] args) {
        int []nums= {3,7,50};
        int k= 3;
        System.out.println(maximumHappinessSum(nums,k));
    }
}
