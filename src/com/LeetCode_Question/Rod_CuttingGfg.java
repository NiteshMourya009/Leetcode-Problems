package com.LeetCode_Question;

public class Rod_CuttingGfg {
    public static int cutRod(int N,int[]length ,int price[], int idx,int[][]dp) {
        if (idx == 0) {
            return ( N/ length[0]) * price[0];
        }
        if(dp[idx][N] != -1){
            return dp[idx][N] ;
        }
        int notTake = 0 + cutRod(N, length, price, idx - 1,dp);
        int take = Integer.MIN_VALUE;
        if (length[idx] <= N) {
            take = price[idx] + cutRod(N - length[idx], length, price, idx,dp);
        }
        return dp[idx][N]= Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int N = 8;
        int price[] = {3, 5, 8, 9, 10, 17, 17, 20};
        int length[] ={1,2,3,4,5,6,7,8};
        int n = price.length;
        int[][]dp= new int[n][N+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=N; j++){
                dp[i][j] = -1 ;
            }
        }
        System.out.println( cutRod(N, length, price, n - 1,dp));
    }
}
