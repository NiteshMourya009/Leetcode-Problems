package Dyanmic_Programming.memoization;

public class minPathSum {
    public  static int minSUm(int i, int j, int[][]arr,int[][]dp){

        if(i<0 || j<0){
            return Integer.MAX_VALUE ;
        }
        if(i==0 && j==0){
            return dp[i][j] = arr[i][j] ;
        }
        if(dp[i][j] != -1){
            return dp[i][j] ;
        }
        return dp[i][j]=arr[i][j] +Math.min(minSUm(i-1,j,arr,dp),minSUm(i,j-1,arr,dp)) ;
    }
    public static void main(String[] args) {
        int[][] grid= {{1,3,1},{1,5,1},{4,2,1}} ;
        int m=grid.length ;
        int n= grid[0].length ;
        int[][]dp =new int[m][n] ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] =-1 ;
            }
        }
        System.out.println(minSUm(m-1,n-1, grid,dp));

    }
}
