package com.LeetCode_Question;

public class AverageWaitingTime {
    public static double averageWaiting(int[][]customers){
        int n=customers.length ;
        int max = 0 ;
        int  ans= max  ;
        double result =0 ;

        for(int i=0; i<customers.length; i++){
            ans =Math.max(ans,customers[i][0])+customers[i][1] ;
            int st= ans- customers[i][0] ;
            result += st ;
        }
        return result/n ;
    }
    public static void main(String[] args) {
        int[][] nums= {{5,2},{5,4},{10,3},{20,1}} ;
        System.out.println(averageWaiting(nums));
    }
}
