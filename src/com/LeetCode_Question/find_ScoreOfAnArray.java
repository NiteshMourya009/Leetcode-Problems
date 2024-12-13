package com.LeetCode_Question;
import java.util.* ;
public class find_ScoreOfAnArray {
    public static long findScore(int[] nums) {
        int n= nums.length ;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for(int i=0; i<n; i++){
            pq.add(new int[]{nums[i], i}) ;
        }
        long sum =0 ;
        boolean[] flag = new boolean[n] ;
        while(!pq.isEmpty()){
            int[]arr= pq.remove() ;
            int st=arr[0];
            int ind =arr[1] ;

            if(flag[ind]) continue ;
            sum += (long) st ;
            if (ind > 0) flag[ind - 1] = true;
            if (ind < n - 1) flag[ind + 1] = true;

        }
        return sum ;
    }
    public static void main(String[] args) {
        int[]arr = {2,5,6,6,10} ;
        System.out.println(findScore(arr));
    }
}
