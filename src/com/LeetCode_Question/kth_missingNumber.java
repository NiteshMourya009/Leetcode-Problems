package com.LeetCode_Question;

public class kth_missingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int n= arr.length ;
        int[]nums= new int[k+4] ;
        int j=0 ;
        int q=0 ;
        for(int i=1; i<n; i++){
            if(arr[i]!=i){
                int p=i ;
                while(p<=arr[i] &&  q<=k){
                    nums[j]=p ;
                    p++ ;
                    j++ ;
                    q++ ;
                }
            }
            else if(i==n-1 && q<=k){
                int p=0 ;
                while(p!=k-1){
                    nums[p]= arr[n-1]+1 ;
                    p++;
                    q++ ;
                }
            }


        }
        return nums[k-1] ;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,7,11};
        int k=5 ;
        System.out.println( findKthPositive(arr,k));
    }
}
