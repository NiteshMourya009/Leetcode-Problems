package com.LeetCode_Question;

public class Rotate_Array {

    public static void rotateArray(int[]arr, int k){
        int n= arr.length ;
        k= k%n ;

        reversePart(arr,0,n-1);
        reversePart(arr,0,k-1);
        reversePart(arr, k,n-1);
        System.out.println(arr);
    }
    public static  void reversePart(int[]arr, int s, int t){
        while(s<t){
            int temp= arr[s];
            arr[s]= arr[t];
            arr[t]= temp ;
            s++ ;
            t-- ;
        }
    }

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7};
        int k= 3 ;
        rotateArray(arr,k);
       // System.out.println(rotateArray(arr,k));
       // System.out.println(arr);
    }
}
