package com.LeetCode_Question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class intersection_ofTwoArrays {
    public static int[] intersection(int[]nums1, int [] nums2){
        HashSet<Integer>map1= new HashSet<>();
        HashSet<Integer>map2= new HashSet<>();

        for(var num: nums1){
            map1.add(num) ;
        }
        for(var num: nums2){
            if(map1.contains(num)){
                map2.add(num) ;
            }
        }
        int[]arr= new int [map2.size()] ;
        int i=0 ;
        for(int k: map2){
            arr[i++]= k ;
        }
        return arr ;
    }
    public static void main(String[] args) {


        int[] nums1 = {4, 9, 5};
        int[] num = {9, 4, 9, 8, 4};
        intersection(nums1, num);
    }
}
