package com.LeetCode_Question;

public class unique_Path {
    public static int UniquePath(int i, int j, int[][]dp){
        if(i==0 && j==0){
            return dp[i][j] = 1 ;
        }
        if(i<0 || j<0){
            return 0 ;
        }
        if(dp[i][j] != -1){
            return dp[i][j] ;
        }
        int up= UniquePath(i-1,j, dp) ;
        int left= UniquePath(i,j-1,dp) ;

        return dp[i][j]= up +left ;
    }
    public static void main(String[] args) {
        int m= 4 ;
        int n= 4 ;
        int[][]dp =new int [m][n] ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] =-1 ;
            }
        }
        System.out.println(UniquePath(m-1,n-1,dp));

        // tabulation Method
//        int[][]dp= new int[m][n] ;
//        dp[0][0]= 1 ;
//
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//
//                if(m==0 && n==0){
//                    return dp[i][j]= 1 ;
//                }
//                if(i>0){
//                    dp[i][j] += dp[i-1][j] ;
//                }
//                if(j>0){
//                    dp[i][j] += dp[i][j-1] ;
//                }
//
//            }
//        }
//
//        return dp[m-1][n-1] ;

    }
}
