package com.LeetCode_Question;

public class canPartition {
    public static boolean subSetSum(int idx, int target,int[]arr,Boolean[][]dp){
        if(target==0) return true ;
        if(idx==0) return (arr[0]==target) ;
        if(dp[idx][target] != null){
            return dp[idx][target] ;
        }
        boolean notTake= subSetSum(idx-1, target,arr,dp) ;
        boolean take= false ;
        if(arr[idx]<= target){
            take=  subSetSum(idx-1, target-arr[idx],arr,dp) ;
        }
        return dp[idx][target] =  take || notTake ;
    }
    public static void main(String[] args) {
        int[]nums= {5,5,4,8,2};
        int n= nums.length ;
        int sum =0;
        for(int i=0; i<n; i++){
            sum+= nums[i] ;
        }
        if(sum%2 != 0){
            System.out.println(false);
        }
        int totalSum= sum/2 ;
        Boolean[][]dp= new Boolean[n][totalSum+1] ;
        for(int i=0; i<n; i++){
            for(int j=0; j<=totalSum; j++){
                dp[i][j]= null;
            }
        }
        System.out.println( subSetSum(n-1,totalSum,nums,dp)); ;

    }
}
