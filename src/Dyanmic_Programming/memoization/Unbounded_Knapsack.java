package Dyanmic_Programming.memoization;

public class Unbounded_Knapsack {
    static int unboundedKnapsack(int W, int wt[], int val[], int idx,int[][]dp) {
        if (idx == 0) {
            return (W / wt[0]) * val[0];
        }
        if(dp[idx][W] != -1){
            return dp[idx][W] ;
        }
        int notTake = 0 + unboundedKnapsack(W, wt, val, idx - 1,dp);
        int take = Integer.MIN_VALUE;
        if (wt[idx] <= W) {
            take = val[idx]
                    + unboundedKnapsack(W - wt[idx], wt, val, idx,dp);
        }
        return dp[idx][W]= Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int W = 100;
        int val[] = { 10, 30, 20 };
        int wt[] = { 5, 10, 15 };
        int n = val.length;
        int[][]dp= new int[n][W+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=W; j++){
                dp[i][j] = -1 ;
            }
        }
        System.out.println( unboundedKnapsack(W, wt, val, n - 1,dp));
    }
}
