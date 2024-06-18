package Dyanmic_Programming.memoization;

public class editStr1_TomakeStr2 {
    // this Question only consist of the remove and insert and not any other operation like replace
    private static int makeStr2(String str1,String str2, int i, int j,int[][]dp){
        if(i< 0|| j<0){
            return 0 ;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ;
        }
        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j] =  1+ makeStr2(str1,str2, i-1, j-1,dp);
        }
        return dp[i][j] = Math.max(makeStr2(str1,str2,i-1,j,dp),makeStr2(str1,str2,i,j-1,dp)) ;

    }
    public static void main(String[] args) {
        String str1="cut" ;
        String str2="cat" ;
        int m=str1.length() ;
        int n= str2.length() ;

        int[][]dp =new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]= -1 ;
            }
        }
        int lcslenght= makeStr2(str1,str2,m-1,n-1,dp) ;


        System.out.println(  m-lcslenght+n-lcslenght);

    }
}
