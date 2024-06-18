package Dyanmic_Programming.tabulation;

import java.util.Arrays;

public class str1Tostr2 {
    public static void main(String[] args) {

        String str1= "cat" ;
        String str2= "cut" ;
        int m=str1.length() ;
        int n= str2.length() ;

//        int[][] dp= new int[m+1][n+1] ;
//        // Base Condition
//        for(int i=0; i<=m; i++){
//            dp[i][0]= i ;
//        }
//        for(int j=0; j<=n; j++){
//            dp[0][j]= j ;
//        }
//        for(int i=1; i<=m; i++){
//            for(int j=1; j<=n; j++){
//                if(str1.charAt(i-1)==str2.charAt(j-1)){
//                    dp[i][j] =dp[i-1][j-1] ;
//
//                }
//                else{
//                    int replace= 1+ dp[i-1][j-1] ;
//                    int insertion= 1+ dp[i][j-1] ;
//                    int deletion= 1+ dp[i-1][j] ;
//                    dp[i][j] = Math.min(replace,Math.min(insertion,deletion)) ;
//                }
//            }
//        }
//        System.out.println(dp[m][n]);

        int[]prev =new int[n+1] ;
        int[]curr= new int[n+1] ;
        // Base Condition
        for(int i=0; i<=n; i++){
            prev[i]= i ;
        }

        for (int i=1; i<=m; i++){
            curr[0] = i ;
            for(int j=1; j<=n; j++){
                if(str1.charAt(i-1)== str2.charAt(j-1)){
                    curr[j] = prev[j-1];
                    continue;
                }
                int replace= 1+ prev[i-1] ;
                int insertion= 1+ curr[j-1] ;
                int deletion= 1+ prev[j] ;

                curr[j] = Math.min(replace, Math.min(insertion,deletion)) ;
            }
            prev= Arrays.copyOf(curr,n+1) ;
        }
        System.out.println(prev[m]);


    }
}
