package com.LeetCode_Question;

import java.util.Arrays;

public class minAverageOfSmallestandLargetsELe {
    public static float minAverage(int[]nums){
        int i=0 ;
        int j=nums.length-1 ;
        float[]arr= new float[nums.length/2];
        Arrays.sort(nums);
        int k=0 ;
        float min= 0 ;
        while(i<=j){
            min= nums[i]+nums[j];
            min= min/2 ;
            arr[k++] =min ;
            i++ ;
            j-- ;

        }
        float average= 100000;
        for(int p=0; p<arr.length; p++){
           average= Math.min(average,arr[p]);
        }
        return average ;
    }

    public static void main(String[] args) {
        int[]nums= {1,9,8,3,10,5};
        System.out.println(minAverage(nums));
    }
}
