package Dyanmic_Programming.memoization;

public class minPathSum {
    public  static int minSUm(int i, int j, int[][]arr){
        if(i==0 && j==0){
            return arr[i][j] ;
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE ;
        }
        int up= arr[i][j] + minSUm(i-1,j, arr) ;
        int right= arr[i][j] + minSUm(i, j-1, arr) ;

        return Math.min(up, right) ;
    }
    public static void main(String[] args) {
        int[][] grid= {{1,3,1},{1,5,1},{4,2,1}} ;
        int m=grid.length ;
        int n= grid[0].length ;
        System.out.println(minSUm(m-1,n-1, grid));

    }
}
