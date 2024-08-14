package com.LeetCode_Question;

import java.util.PriorityQueue;

class Pair{
    int val1 ;
    int val2;
    int sum ;
    Pair(int val1, int val2, int sum){
        this.val1= val1 ;
        this.val2= val2 ;
        this.sum= sum ;
    }
}
public class kth_smallestPairDistance {
    public static int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> (b.sum- a.sum)) ;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(pq.size()==k && pq.peek().sum > Math.abs(nums[i]-nums[j])){
                    pq.poll() ;
                    pq.add(new Pair(nums[i], nums[j], Math.abs(nums[i]-nums[j]) )) ;
                }
                else if(pq.size()<k){
                    pq.add(new Pair(nums[i], nums[j], Math.abs(nums[i]-nums[j]) )) ;
                }

            }
        }
        return pq.peek().sum ;
    }
    public static void main(String[] args) {
        int[]arr= {1,3,1} ;
        int k=1 ;
        System.out.println(smallestDistancePair(arr, k) );
    }
}
