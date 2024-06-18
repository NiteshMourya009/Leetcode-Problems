package com.LeetCode_Question;

import java.util.Arrays;
import java.util.HashMap;

public class n_repeatedElements {
    public static int repeatedNTimes(int[]nums) {
        int n = nums.length;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int miss = 0;
        for (var e : map.entrySet()) {
            if (e.getValue() == n / 2) {
                miss = e.getKey();
            }
        }
        return miss;
    }
    public static void main(String[] args) {

        int[]nums= {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }
}
