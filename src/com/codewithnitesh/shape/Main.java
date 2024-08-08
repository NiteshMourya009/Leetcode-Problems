package com.codewithnitesh.shape;

public class Main {
    public static long kthElement(int k, int arr1[], int arr2[]) {

        int i=0 ;
        int j=0 ;
        int p= 0 ;
        int[] nums= new int[arr1.length+ arr2.length] ;
        while(i<arr1.length && j<arr2.length){

            if(arr1[i] <= arr2[j]){
                nums[p++]= arr1[i] ;
                i++ ;
            }
            else if(arr1[i] > arr2[j]){
                nums[p++]= arr2[j];
                j++ ;
            }
        }
        if(i==arr1.length-1 && j<arr2.length-1){
            while(j<arr2.length){
                nums[p++]= arr2[j] ;
                j++ ;
            }
        }
        else if(j==arr2.length-1 && i<arr1.length-1){
            while(i<arr1.length){
                nums[p++]= arr1[i] ;
                i++ ;
            }
        }
        return nums[k-1] ;
    }
    public static void main(String[] args) {
        int[]a={2, 3, 6, 7, 9} ;
        int[]b= {1, 4, 8, 10} ;
        int k=5 ;
        System.out.println(kthElement(k,a,b));
    }
}
