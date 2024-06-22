package Dyanmic_Programming.memoization;

public class subsetSumEqual_k {
    public static boolean subSetSumToK(int idx, int target,int[]arr){
        if(target==0) return true ;
        if(idx==0) return (arr[0]==target) ;

        boolean notTake= subSetSumToK(idx-1, target,arr) ;
        boolean take= false ;
        if(arr[idx]<= target){
            take=  subSetSumToK(idx-1, target-arr[idx],arr) ;
        }
        return  take || notTake ;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4} ;
        int k=4 ;
        int n= nums.length ;
        System.out.println(subSetSumToK(n-1,k,nums));
    }
}
