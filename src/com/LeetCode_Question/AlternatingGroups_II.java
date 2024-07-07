package com.LeetCode_Question;

public class AlternatingGroups_II {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < k - 1; j++) {
                if (colors[(i + j) % n] == colors[(i + j + 1) % n]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[]nums= {0,1,0,0,1,0,1} ;
        int k=6 ;
        System.out.println(numberOfAlternatingGroups(nums,k));
    }
}
