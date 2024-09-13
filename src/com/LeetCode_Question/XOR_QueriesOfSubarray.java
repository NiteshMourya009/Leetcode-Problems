package com.LeetCode_Question;

public class XOR_QueriesOfSubarray {
    public static int xorTwoNumbers(int a, int b) {
        return a ^ b;  // XOR operation
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
         int[]nums= new int[queries.length] ;

         for(int i=0; i<queries.length; i++){
             int st= queries[i][0] ;
             int end= queries[i][1] ;
             int ans =0 ;
             if(end-st==0){
                 nums[i]= arr[st] ;
             }
             else{
                 for(int j=st; j<=end; j++){
                     int result = xorTwoNumbers(ans, arr[j]) ;
                     ans= result ;
                 }
                 nums[i]= ans ;
             }
         }
         return nums ;
    }
    public static void main(String[] args) {
        int[]arr= {4,8,2,10} ;
        int[][]querie= { {2,3}, {1,3},{0,0}, {0,3} };
        int[]ar= xorQueries(arr, querie) ;
        for(int a: ar){
            System.out.print(a+" ");
        }
    }
}
