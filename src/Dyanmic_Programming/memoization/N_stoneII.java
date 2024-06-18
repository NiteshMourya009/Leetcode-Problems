package Dyanmic_Programming.memoization;

import java.util.List;

public class N_stoneII {
    private static int frog_jumpII(int i, List<Integer>heights,int k,int[]dp){
        if(dp[i]!= -1){
            return dp[i] ;
        }
        if(i==0){
            return 0 ;
        }
        int minCost =10000 ;
        for(int j=1; j<=k; j++){
            if(i-j >=0){
                int jump= Math.abs(heights.get(i)-heights.get(i-j))+ frog_jumpII(i-j, heights, k,dp) ;
                minCost =Math.min(minCost,jump) ;
            }
        }
        return dp[i] =minCost ;
    }
    public static void main(String[] args) {
        List<Integer> heights= List.of(10,30,40, 50 , 20) ;
        int k=3 ;
        int n=heights.size() ;
        int []dp =new int[n] ;
        for(int i=0;i<n ; i++){
            dp[i] =-1 ;
        }
        System.out.println(frog_jumpII(heights.size()-1,heights,k,dp));


    }
}
