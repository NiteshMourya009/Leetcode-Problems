package com.LeetCode_Question;
import java.util.* ;
public class maximizeSumOFArrays_afterKNegation {
    public static int largestSumAfterKNegations(int[] nums, int k){
        int n= nums.length ;
        int max= 0 ;
        int count=0 ;
        int p=0 ;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            while(count!=k){
                if(nums[p]<0){
                    nums[p]= -1* nums[p];
                    p++ ;
                    count++ ;
                }
                else if(nums[p]>=0 ){
                    nums[p]= -1*nums[p];
                    count++ ;
                    //p++ ;
                }
            }
            max+= nums[i];

        }
        return max ;
    }
    public static void main(String[] args) {

        int[]nums= {1,2,3,6,7,9};
        int k= 3 ;
        System.out.println(largestSumAfterKNegations(nums,k));
    }
}
