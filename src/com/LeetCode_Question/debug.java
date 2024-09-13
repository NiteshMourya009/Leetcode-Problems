package com.LeetCode_Question;

import java.util.*;

public class debug {

    // Function to get the number of profitable pairs
    public static int getProfitablePairs(int[] profit, int[] implementationCost) {
        int n = profit.length;

        // Step 1: Calculate net profit for each project
        int[] netProfit = new int[n];
        for (int i = 0; i < n; i++) {
            netProfit[i] = profit[i] - implementationCost[i];
        }

        // Step 2: Sort the net profits array
        Arrays.sort(netProfit);

        // Step 3: Use two-pointer technique to count pairs whose sum is greater than zero
        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            if (netProfit[left] + netProfit[right] > 0) {
                // If the sum of netProfit[left] and netProfit[right] is greater than zero,
                // then all pairs from left to right are valid (since the array is sorted)
                count += (right - left);
                right--;  // Move the right pointer to consider the next smaller element
            } else {
                left++;  // Move the left pointer to increase the sum
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] profit = {10,2,3,2,2};
        int[] implementationCost = {1,1,5,4,2};

        int result = getProfitablePairs(profit, implementationCost);
        System.out.println("Number of profitable pairs: " + result);  // Expected output: 4
    }
}
