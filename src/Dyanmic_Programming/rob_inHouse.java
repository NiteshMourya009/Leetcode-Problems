package Dyanmic_Programming;

public class rob_inHouse {
    static int calls= 0 ;
    private static int rob(int[]house,int ind,int[]dp){
        calls++ ;
        if(ind==house.length-1){
            return house[ind] ;
        }
        if(ind>=house.length){
            return 0 ;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int pick = house[ind]+ rob(house, ind+2,dp);
        int not_pick= rob(house,ind+1,dp) ;

        return dp[ind] = Math.max(pick, not_pick) ;
    }
    public static void main(String[] args) {
        int []house={8,4,3,9};
        int n= house.length ;
        int[]dp= new int[n];
        for(int i=0; i<n; i++) {
            dp[i]=-1 ;
        }

        System.out.println(rob(house,0,dp));
        System.out.println("Calls"+" "+ calls);
    }
}
