package Dyanmic_Programming;

import java.util.List;

public class knapsack {
    private static int knap(int idx, int W  ,List<Integer>profit, List<Integer>weight, int[][]dp){
        if(dp[idx][W]!= -1){
            return dp[idx][W] ;
        }
         if(idx==0){
             if(weight.get(idx) <= W){
                 return profit.get(0) ;
             }
             else {
                 return 0 ;
             }
         }
        int pick =0;
        if (W >= weight.get(idx)) {

            pick=profit.get(idx)+  knap(idx-1, W-weight.get(idx), profit, weight,dp) ;

        }
        int not_pick= knap(idx-1, W, profit, weight,dp) ;

        return dp[idx][W] =Math.max(pick, not_pick);
    }
    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3) ;
        List<Integer> weight= List.of(4,5,1) ;
        int w= 4 ;
        int n= profit.size() ;
        int[][]dp= new int[n+1][w+1] ;
        for(int i=0; i<=n; i++ ){
            for(int j=0; j<=w ; j++){
                dp[i][j]= -1 ;
            }
        }



        System.out.println(knap(n-1, w, profit, weight, dp));
    }
}
