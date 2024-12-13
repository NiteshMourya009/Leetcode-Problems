package com.LeetCode_Question;


import java.util.*;

//public class HorizontalPodAutoscaler {
    public class HorizontalPodAutoscaler {
        public static List<Integer> optimizePods(int n, List<Integer> pods, int m, List<List<Integer>> logs) {
            int maxThreshold = Integer.MIN_VALUE;

            for (List<Integer> log : logs) {
                int type = log.get(0);
                int p = log.get(1);
                int x = log.get(2);

                if (type == 1) {
                    pods.set(p - 1, x);
                } else if (type == 2) {
                    maxThreshold = Math.max(maxThreshold, x);
                }
            }

            for (int i = 0; i < n; i++) {
                if (pods.get(i) < maxThreshold) {
                    pods.set(i, maxThreshold);
                }
            }

            return pods;
        }

        public static void main(String[] args) {
            int n = 4;
            List<Integer> pods = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            int m = 3;
            List<List<Integer>> logs = new ArrayList<>();
            logs.add(Arrays.asList(2, -1, 3));
            logs.add(Arrays.asList(1, 2, 2));
            logs.add(Arrays.asList(2, -1, 1));

            List<Integer> result = optimizePods(n, pods, m, logs);
            System.out.println(result);
        }
    }