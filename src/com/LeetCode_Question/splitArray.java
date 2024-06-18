package com.LeetCode_Question;

import java.util.HashMap;

public class splitArray {
    public static boolean isPossibleToSplit(int[] nums) {
        int n= nums.length ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }
        for(var e: map.entrySet()){
            if(e.getValue()>2){
                return false ;
            }
        }
        return true ;

    }
    public static void main(String[] args) {
        int[] nums= {1,1,2,2,3,4} ;
        System.out.println(isPossibleToSplit(nums));
    }
}
