package com.LeetCode_Question;

import java.util.PriorityQueue;

public class kth_SmallestPrimeFraction {

    public static int[] smallestFraction(int[]arr, int k){
        int n = arr.length;
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double ans = (double) arr[i] / arr[j];
                pq.offer(new double[]{ans, (double) arr[i], (double) arr[j]});

                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        double[] ans = pq.poll();
        return new int[]{(int) ans[1], (int) ans[2]};
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,5} ;
        int k=3 ;
        int[]a= smallestFraction(arr, k) ;
        for(int c: a){
            System.out.println(a);
        }
    }
}
