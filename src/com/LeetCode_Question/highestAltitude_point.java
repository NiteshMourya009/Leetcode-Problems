package com.LeetCode_Question;

public class highestAltitude_point {
    public static int largestAltitude(int[] gain) {
        int n= gain.length;
        int[] arr= new int[n+1];
        int k=1 ;
        arr[0]= 0 ;
        for(int i=0; i<n; i++){
            arr[k++]= arr[i]+gain[i];

        }
        int max = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length; i++){
            max= Math.max(max, arr[i]);
        }
        return max ;
    }

    public static void main(String[] args) {
         int[]gain= {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
