package com.LeetCode_Question;


public class Sort_ArrayBy_Parity {

    public static void sortArrayByParity(int[] arr) {
        int j=0 ;
        int n=arr.length ;

        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                int temp= arr[i] ;
                arr[i]=arr[j];
                arr[j]= temp ;
                j++ ;

            }
        }
       for (int val: arr){
           System.out.println(val);
       }
    }
    public static void main(String[] args) {

        int[]arr= {3,1,2,4};
        sortArrayByParity(arr);

    }


}
