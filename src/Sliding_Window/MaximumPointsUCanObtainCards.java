package Sliding_Window;

public class MaximumPointsUCanObtainCards {
    public static int maxScore(int[] cardPoints, int k) {
        int lsum =0 ;
        int rsum =0 ;
        int maxsum= 0 ;

        for(int i=0; i<k; i++){
            lsum = lsum+ cardPoints[i] ;
            maxsum =lsum ;
        }
        System.out.println(lsum);
        int ind= cardPoints.length-1 ;
        for(int i=k-1; i>=0; i--){
            lsum =lsum-cardPoints[i] ;
            rsum = rsum + cardPoints[ind] ;
            ind-- ;
            maxsum= Math.max(maxsum, rsum+ lsum );
        }
        return maxsum ;
    }
    public static void main(String[] args) {
        int[]nums= {1,2,3,4,5,6,1} ;
        int k=3 ;
        System.out.println(maxScore(nums, k));
    }
}
