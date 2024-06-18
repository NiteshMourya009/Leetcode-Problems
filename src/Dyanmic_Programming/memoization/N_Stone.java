package Dyanmic_Programming.memoization;

import java.util.List;

public class N_Stone {
    public static int frog_jump(int i, List<Integer>heights){
//         if(dp[i] != -1){
//             return dp[i] ;
//         }
        if(i==0){
            return 0 ;
        }

        int jump1= Math.abs(heights.get(i)-heights.get(i-1)) + frog_jump(i-1,heights) ;
        int jump2= 100000  ;
        if(i>1){
            jump2= Math.abs(heights.get(i)-heights.get(i-2)) + frog_jump(i-2,heights) ;
        }

        return Math.min(jump1,jump2) ;
    }
    public static void main(String[] args) {
        List<Integer> heights= List.of(10,30,40,50,20) ;
        int i= heights.size() ;
        System.out.println(frog_jump(i-1,heights));

    }
}
