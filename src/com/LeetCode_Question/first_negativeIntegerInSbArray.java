package com.LeetCode_Question;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class first_negativeIntegerInSbArray {
    public static List firstNegative(int[]nums, int k){
        Queue<Integer> q= new ArrayDeque<>();
        ArrayList<Integer>arr= new ArrayList<>();
        int i=0 ;
        int j=0 ;
        int n= nums.length ;
        while(j<n){
            if(nums[j]<0){
                q.add(nums[j]) ;
            }
            if(j-i+1==k){
                if(!q.isEmpty()){
                    arr.add(q.peek());
                }
                else{
                    arr.add(0);
                }
                if(nums[i]<0 && !q.isEmpty()){
                    q.remove();
                }
                i++ ;
            }

            j++ ;
        }
        return arr ;
    }
    public static void main(String[] args) {

        int[] nums = {2,-8,4,5,-6,8};
        int k=2 ;
        System.out.println(firstNegative(nums, k));
    }
}
