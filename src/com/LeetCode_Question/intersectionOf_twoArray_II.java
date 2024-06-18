package com.LeetCode_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOf_twoArray_II {
    public static int[]intersect(int[]nums1, int[]nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0 ;
        int j=0 ;
        ArrayList<Integer>arr= new ArrayList<>() ;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++ ;
            }
            else if(nums1[i]>nums2[j]){
                j++ ;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++ ;
            }
        }
       int []ans =new int[arr.size()] ;
        int k=0 ;
        while(k<arr.size()){
            ans[k]= arr.get(k);
            k++ ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums1= {4,9,5};
        int[]nums2= {9,4,9,8,4} ;

        System.out.println(intersect(nums1, nums2));

    }
}
