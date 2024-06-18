package Dyanmic_Programming.memoization;

import java.util.List;

public class wordBreak {
    private static int boolToInt(boolean b){
        if(b){
            return 1 ;
        }
        else{
            return 0 ;
        }
    }
    private static int checkdict(int idx, String s, List<String>wordDict,int[]dp){
         if(idx==s.length()) return 1 ;

         if(dp[idx] != -1){
             return dp[idx] ;
         }

        for(int i=idx; i<s.length() ;i++) {
            String prefix = s.substring(idx, i + 1);
//            String suffix = s.substring(i + 1, s.length());
            if (wordDict.contains(prefix)) {
                if(checkdict(i+1, s, wordDict,dp )==1){
                    return dp[idx] =1 ;
                }
                else{
                    return  dp[idx]= 0 ;
                }
            }
        }
        return dp[idx] =0 ;
    }
    public static void main(String[] args) {
        String s="applepenapple" ;
        List<String> wordDict= List.of("apple","pen") ;
        int n= wordDict.size() ;
        int[]dp= new int[n] ;
//         for( int i=0; i<n; i++){
//             dp[i]=-1 ;
//         }
        System.out.println(checkdict(0,s,wordDict,dp));
    }
}
