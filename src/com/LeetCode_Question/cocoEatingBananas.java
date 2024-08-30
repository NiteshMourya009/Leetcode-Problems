package com.LeetCode_Question;

public class cocoEatingBananas {
    public static int minTime(int[]arr, int h){
        int maxhour=0 ;
        for(int i=0; i< arr.length; i++){
            maxhour += Math.ceil( (double) arr[i] / (double) h) ;
        }
        return maxhour ;
    }
    public static int minEatingSpeed(int[]arr, int h) {
          int  max =0 ;
          int ans =0 ;
          for(int i=0; i<arr.length; i++){
              max= Math.max(max, arr[i]) ;
          }
          int low =1 ;
          int high = max ;
          while(low<=high){
              int mid = (low+high) /2 ;
              int totaltime= minTime(arr, mid) ;
              if(totaltime <=h){
                  ans = mid ;
                  high= mid-1 ;
              }
              else{
                  low= mid+1 ;

              }
          }
          return ans ;
    }
    public static void main(String[] args) {
        int[]arr= {30,11,23,4,20} ;
        int h=5 ;
        System.out.println( minEatingSpeed(arr, h) );
    }
}
