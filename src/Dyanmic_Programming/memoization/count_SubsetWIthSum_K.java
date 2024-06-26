package Dyanmic_Programming.memoization;

import java.util.Arrays;

public class count_SubsetWIthSum_K {
    public static int countSub(int i, int[]arr, int sum, int[][]dp){
        if(sum==0){
            return 1 ;
        }
        if(i==0){
           if(sum%arr[i]==0){
               return 1 ;
           }
           else return 0 ;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum] ;
        }
        int notTake= countSub(i-1, arr,sum, dp) ;
        int take =0 ;
        if(arr[i]<=sum){
            take= countSub(i, arr, sum-arr[i],dp) ;
        }
        return dp[i][sum]= take+notTake ;
    }
    public static void main(String[] args) {
        int[] nums= {3,2,5} ;
        int sum= 5 ;
        int[][]dp =new int[nums.length][sum+1] ;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<=sum; j++){
                dp[i][j] = -1 ;
            }
        }
        System.out.println(countSub(nums.length-1, nums,sum, dp));
    }

}
