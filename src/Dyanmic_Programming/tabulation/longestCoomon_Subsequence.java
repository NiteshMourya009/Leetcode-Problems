package Dyanmic_Programming.tabulation;

public class longestCoomon_Subsequence {
    public static void main(String[] args) {
        String s1="AGGTAB" ;
        String s2="GXTXAYB" ;
        int m= s1.length() ;
        int n= s2.length() ;
//        int[][]dp =new int[m+1][n+1] ;
//        for(int i=0; i<=m; i++){
//            dp[i][0]= 0 ;
//        }
//        for(int j=0; j<=n; j++){
//            dp[0][j]= 0 ;
//        }
//        for(int i=1; i<=m; i++){
//            for(int j=1; j<=n; j++){
//                if(s1.charAt(i-1)==s2.charAt(j-1)){
//                    dp[i][j] = 1+ dp[i-1][j-1] ;
//                }
//                else{
//                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]) ;
//                }
//            }
//        }
//        System.out.println(dp[m][n]);
        int[] cur= new int[n+1] ;
        int[]prev= new int[n+1] ;

//        for(int i=0; i<=m; i++) {
//            cur[i] = 0;
//        }
        for(int j=0; j<=n; j++){
            prev[j] =0 ;
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    cur[j] = 1+ prev[j-1] ;
                }
                else{
                    cur[j] =Math.max(prev[j],cur[j-1]) ;
                }
                prev =cur ;
            }
        }
        System.out.println(prev[n]);


    }
}
