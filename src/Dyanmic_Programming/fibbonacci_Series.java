package Dyanmic_Programming;

public class fibbonacci_Series {
    static int calls= 0 ;
    private static int fibbo(int n, int []dp){

        if(n==1 || n==0){
            return 1 ;
        }
        if(dp[n] != -1){
            return dp[n] ;
        }
        calls++ ;
        int result= fibbo(n-1,dp) + fibbo(n-2,dp) ;
        dp[n]= result ;
        return result ;
    }
    public static void main(String[] args) {
        int n=10;
        int[] dp= new int [n+1] ;
        for(int i=0; i<=n; i++){
            dp[i] =-1 ;
        }
        System.out.println(fibbo(n,dp));
        System.out.println("calls" +" "+ calls);

    }
}
