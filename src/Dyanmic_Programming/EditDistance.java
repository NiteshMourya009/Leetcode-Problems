package Dyanmic_Programming;

public class EditDistance {
    public static int minDist(int i, int j, String s1, String s2, int[][]dp){
        if(i==0){
            return j ;
        }
        if(j==0){
            return i  ;
        }
        if(dp[i][j] != -1){
            return dp[i][j] ;
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j] =  minDist(i-1, j-1, s1,s2,dp) ;
        }
        return dp[i][j]= 1+ Math.min(minDist(i-1, j, s1,s2,dp), Math.min(minDist(i, j-1, s1,s2,dp),minDist(i-1, j-1, s1,s2,dp))) ;
    }
    public static void main(String[] args) {
        String s= "horse" ;
        String s2="ros" ;
        int m= s.length() ;
        int n= s2.length() ;
        int[][]dp= new int[m+1][n+1] ;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                dp[i][j]= -1 ;
            }
        }
        System.out.println(minDist(m,n,s,s2, dp) );
    }
}
 