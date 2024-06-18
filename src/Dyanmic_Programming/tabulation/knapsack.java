package Dyanmic_Programming.tabulation;

import java.util.List;

public class knapsack {
    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3) ;
        List<Integer>weight= List.of(4,5,1) ;
         int w=4;
         int n= profit.size() ;
         int[][] dp =new int [n+1][w+1] ;
//         for(int i=0; i<=w; i++){
//             if(weight.get(0)<=i){
//                 dp[0][i]= profit.get(0) ;
//             }
//             else {
//                 dp[0][i] =0 ;
//             }
//         }
//        for(int idx=1; idx<n; idx++){
//            for(int W=0; W<=w;W++){
//                int pick =-1000 ;
//                if (W >= weight.get(idx)) {
//                    pick=profit.get(idx)+  dp[idx-1][ W-weight.get(idx)];
//                }
//                int not_pick= dp[idx-1][W] ;
//                dp[idx][w]= Math.max(pick,not_pick) ;
//            }
//        }
          int[] prev= new int[w+1] ;
          int[]cur =new int[w+1] ;

          for(int i=0; i<=w; i++){
              if(weight.get(0)<=i){
                  prev[i] = profit.get(0) ;
              }
              else{
                  prev[i] =0 ;
              }
          }
          for(int idx=1; idx<n ; idx++){
              for(int W=0; W<= w; W++){
                  int pick =-1000 ;
                  if(W>= weight.get(idx)){
                      pick = profit.get(idx) + prev[W-weight.get(idx)] ;
                  }
                  int not_pick= prev[W ];

                  cur[W] = Math.max(pick, not_pick) ;
              }
              System.arraycopy(cur,0, prev,0, w+1);

          }
        System.out.println(prev[w]);
    }
}
