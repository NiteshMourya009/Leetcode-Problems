package com.LeetCode_Question;

public class takegiftsRichPile {
    public static long pickGifts(int[] gifts, int k) {

        int n = gifts.length;
        int max = Integer.MIN_VALUE;
        int ind = 0;
        while (k > 0) {
            for (int i = 0; i < n; i++) {
                if (max < gifts[i]) {
                    max = gifts[i];
                    ind = i;
                }
            }
            k--;
            double val = Math.sqrt(max);
            gifts[ind] = (int) val;
            max= Integer.MIN_VALUE;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += gifts[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr= {25,64,9,4,100} ;
        System.out.println(pickGifts(arr, 4));
    }
}
