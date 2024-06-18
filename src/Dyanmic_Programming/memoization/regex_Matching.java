package Dyanmic_Programming.memoization;

public class regex_Matching {
    public static boolean regexmatching(int i,int j, String s,String p,int[][]dp){
        if(j== -1 || i== -1){
            return true ;
        }
        if(j==-1 && i>=0){
             return false ;
        }
        if(i==-1 && j>=0){
            boolean flag= true ;
            for(int x=0; x<=j ; x++){
                if(p.charAt(x)!='*'){
                    flag = false ;
                }

            }
            return flag ;
        }
        if(s.charAt(i)==s.charAt(j) || p.charAt(j)=='.'){
            return regexmatching(i-1,j-1,s,p,dp) ;
        }
        else if(p.charAt(j)=='*'){
             return regexmatching(i-1,j,s,p,dp) || regexmatching(i,j-1,s,p,dp) ; // ignore and take
        }
        else
            return false ;

    }
    public static void main(String[] args) {
        String s ="abbbac" ;
        String p= "*a." ;
        int m=s.length() ;
        int n=p.length() ;

        int[][] dp = new int[m][n] ;
        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                dp[i][j]=-1 ;
            }
        }

        System.out.println(regexmatching(m-1, n-1, s, p,dp));
    }
}
