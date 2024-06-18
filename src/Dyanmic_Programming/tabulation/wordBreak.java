package Dyanmic_Programming.tabulation;

import java.util.List;

public class wordBreak {
    public static void main(String[] args) {
        String s= "applepenapple" ;
        List<String> wordDict= List.of("apple","pen") ;
        int n=s.length() ;

        int[]dp= new int[n+1] ;
        dp[n] =1 ;
        for(int idx=n-1; idx>=0 ; idx-- ){
            for(int i=idx; i<s.length() ; i++ ) {

                String prefix = s.substring(idx, i + 1);
                if (wordDict.contains(prefix)) {
                    // suffix pe recursion
                    if (dp[i + 1] == 1) {
                        dp[idx] = 1;
                    }
                }
            }

        }
        System.out.println(dp[0]);
    }
}
