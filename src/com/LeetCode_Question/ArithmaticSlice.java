package com.LeetCode_Question;

public class ArithmaticSlice {
    public static int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < n - 2; j++) {
                int cn = nums[j + 1] - nums[j];
                int tn = nums[j + 2] - nums[j + 1];
                if (cn == tn) {
                    count++;
                }
                else{
                    break ;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]nums= {1,2,3,8,9,10} ;
        System.out.println(numberOfArithmeticSlices(nums));
    }
}
