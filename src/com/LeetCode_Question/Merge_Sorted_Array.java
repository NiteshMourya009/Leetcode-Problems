package com.LeetCode_Question;

public class Merge_Sorted_Array {

      static  void merge(int[]nums1,int m, int[]nums2, int n){


        int i= m-1;
        int j= n-1;
        int k= m+n-1;
        int[]arr= new int[k];

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                arr[k]=nums1[i];
                k--;
                i--;
            }
            else{
                arr[k]= nums2[j];
                k-- ;
                j-- ;
            }

        }
//        while(j>=0){
//            arr[k]= nums2[j];
//            k--;
//            j-- ;
//        }

        for(int val: arr){
            System.out.println(val);
        }



    }

    public static void main(String[] args) {

        int[]nums1= {1,2,3,0,0,0};
         int m= nums1.length;
         int[] nums2= {2,5,6};
        int n= nums2.length;

         merge(nums1,m, nums2, n);



    }
}
