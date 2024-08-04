package com.LeetCode_Question;
import  java.util.* ;
public class RangeSumOfSubarraySum {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int ind = (n * (n + 1)) / 2;

        int[] arr = new int[ind];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];
                arr[k++] = sum;
            }
        }
        Arrays.sort(arr);
        int max = 0;
        final int maxValue = (int) 1e9 + 7;
        for (int i = left - 1; i < right; i++) {
            max = (max + arr[i]) % maxValue;
        }
        return max;
    }
    public static void main(String[] args) {
        int left =1 ;
        int right=5 ;
        int[]nums= {1,2,3,4} ;
        System.out.println(rangeSum(nums, nums.length, left, right));
    }
}
