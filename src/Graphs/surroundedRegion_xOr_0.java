package Graphs;

public class surroundedRegion_xOr_0 {
    private static void dfs(int row, int col ,int[][]vis, char[][]mat, int[]delrow, int[]delcol ){

        vis[row][col] =1 ;
        int n= mat.length ;
        int m= mat[0].length ;
        for(int i=0; i<4; i++){
            int nrow= row + delrow[i] ;
            int ncol= col + delcol[i] ;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='o'){
                dfs(nrow,ncol,vis, mat, delrow,delcol ) ;
            }
        }
    }
    public static char[][] fill(int n, int m, char mat[][] ){
        int delrow[] ={-1,0,+1,0} ;
        int delcol[] ={0,1,0,-1} ;
        int vis[][]= new int [n][m] ;
        for(int j=0; j<m; j++){

            if(vis[0][j]==0 && mat[0][j]=='o'){
                dfs(0,j, vis, mat, delrow, delcol) ;
            }
            if(vis[n-1][j]==0  && mat[n-1][j] =='o' ){
                dfs( n-1 ,j, vis, mat, delrow, delcol) ;
            }
        }
        for(int i=0; i<n; i++){
            if(vis[i][0]== 0 && mat[i][0]=='o'){
                dfs(i,0,vis,mat, delrow, delcol) ;
            }
            if(vis[i][m-1]== 0 && mat[i][m-1]=='o'){
                dfs(i,m-1,vis,mat, delrow, delcol) ;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && mat[i][j]=='o'){
                    mat[i][j]= 'x' ;
                }
            }
        }
        return mat  ;

    }
    public static void main(String[] args) {
        char[][]mat ={{'x','x','x','x'},{'x','o','0','x'},{'x','o','x','x'},{'x','o','x','x'} } ;
        int n= mat.length ;
        int m=mat[0].length ;

        char[][]sh= fill(n,m,mat) ;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(sh[i][j]+" ");
            }
            System.out.println();
        }
    }
}
