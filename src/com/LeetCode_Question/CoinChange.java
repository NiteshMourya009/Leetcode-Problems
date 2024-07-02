package com.LeetCode_Question;

public class CoinChange {
    public static int change(int i, int[]arr, int target, int[][]dp){

        if(i==0){
            if(target%arr[i]==0){
                return target/arr[i] ;
            }
            else return (int)1e9  ;
        }

        if(dp[i][target] != -1){
            return dp[i][target] ;
        }
        int notTake= change(i-1,arr, target, dp) ;
        int take= Integer.MAX_VALUE ;
        if(arr[i]<= target){
            take = 1+ change(i, arr, target-arr[i], dp);
        }
        return dp[i][target]= Math.min(take, notTake) ;
    }
    public static void main(String[] args) {
        int[]coin= {1,2,5};
        int amount=11 ;
        int[][]dp= new int[coin.length][amount+1] ;
        for(int i=0; i<coin.length; i++){
            for(int j=0; j<=amount; j++){
                dp[i][j]= -1 ;
            }
        }
        int ans= change(coin.length-1, coin, amount,dp) ;
        if(ans>= 1e9){
            ans =-1 ;
        }
        System.out.println(ans);

    }
}
