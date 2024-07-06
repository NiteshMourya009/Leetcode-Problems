package Graphs;

public class flood_Fill_ALgorithm {
    private static void dfs(int row, int col, int[][]ans, int[][]image, int newcolor, int[] delRow,int[] delCol, int incolor){
        ans[row][col]= newcolor ;
        int n=image.length ;
        int m= image[0].length ;

        for(int i=0; i<4; i++){
            int nrow= row+ delRow[i] ;
            int ncol= col + delCol[i] ;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==incolor && ans[nrow][ncol] !=newcolor ){
                dfs(nrow, ncol, ans, image, newcolor, delRow, delCol, incolor) ;
            }
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int incolor= image[sr][sc] ;
        int[][] ans= image ;
        int delRow []= {-1,0,+1,0} ;
        int delCol[] ={0,1, 0, -1} ;
        dfs(sr,sc,ans, image, color, delRow, delCol, incolor) ;
        return ans ;
    }
    public static void main(String[] args) {
       int[][]image={{1,1,1},{1,1,0},{1,0,1}} ;
       int sr=1;
       int sc =1 ;
       int color=2 ;
       int [][]nums= floodFill(image, sr,sc,color) ;

       for(int i=0; i<nums.length; i++){
           for(int j=0; j<nums[0].length; j++){
               System.out.println(nums[i][j]);
           }
       }
    }
}
