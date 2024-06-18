package Dyanmic_Programming;

public class fibbo_Tabulation {
    static int calls= 0 ;
    private static  int fibbo(int n, int []dp){
        calls++ ;
        if(dp[n]!= -1){
            return dp[n] ;
        }
        if(n==1 || n==2){
            return dp[n] =1 ;
        }
        return dp[n]= fibbo(n-1,dp)+ fibbo(n-2,dp );
    }
    public static void main(String[] args) {
        int n=10 ;
//
        int prev1=1 ;
        int prev2=1 ;
        int current =0 ;
        for(int i=3; i<=n ; i++){
//            dp[i]= dp[i-1] +dp[i-2] ;
             current= prev1+prev2 ;
             prev1= prev2 ;
             prev2= current ;
        }
        System.out.println(current);
    }
}
