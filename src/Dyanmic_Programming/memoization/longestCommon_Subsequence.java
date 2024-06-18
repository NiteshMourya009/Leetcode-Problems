package Dyanmic_Programming.memoization;

public class longestCommon_Subsequence {
    private static int commonSequence(String s1,String s2,int i, int j,int[][]dp){
         if(i<0 || j<0){
             return 0 ;
         }
        if(dp[i][j] != -1){
            return dp[i][j] ;
        }
        if(s1.charAt(i)==s2.charAt(j)) {
            // Match
          return dp[i][j]= 1 + commonSequence(s1, s2, i - 1, j - 1,dp);
        }
        // Not match
        return dp[i][j]= Math.max(commonSequence(s1,s2,i-1,j,dp),commonSequence(s1,s2,i,j-1,dp)) ;

    }
    public static void main(String[] args) {
        String s1="AGGTAB" ;
        String s2="GXTXAYB" ;
         int m= s1.length() ;
         int n= s2.length() ;

         int[][]dp =new int[m][n];
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 dp[i][j]= -1 ;
             }
         }
        System.out.println(commonSequence(s1,s2,m-1,n-1,dp));


    }
}
