package com.LeetCode_Question;

public class unique_Path_II {
    public static int UniquePath_II(int i, int j, int[][]dp,int[][]arr){
        if(i>=0 && j>=0 &&arr[i][j]==1){
            return 0 ;
        }
        if(i==0 && j==0){
            return dp[i][j] = 1 ;
        }
        if(i<0 || j<0){
            return 0 ;
        }
        if(dp[i][j] != -1){
            return dp[i][j] ;
        }
        int up= UniquePath_II(i-1,j, dp,arr) ;
        int left= UniquePath_II(i,j-1,dp,arr) ;

        return dp[i][j]= up +left ;
    }
    public static void main(String[] args) {
        int[][] ObstacleGrid= {{0,0,0},{0,1,0},{0,0,0}} ;
        int m= ObstacleGrid.length ;
        int n= ObstacleGrid[0].length ;
        int[][]dp =new int [m][n] ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] =-1 ;
            }
        }
        System.out.println(UniquePath_II(m-1,n-1,dp,ObstacleGrid));
    }
}
