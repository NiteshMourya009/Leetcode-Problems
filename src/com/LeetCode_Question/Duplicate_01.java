package com.LeetCode_Question;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_01 {
    public static boolean duplicate(int[]nums){
        Map<Integer,Integer>map= new HashMap<>();

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        for(var el: map.entrySet()){
            if(el.getValue()>=2){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,4,5,6,2,1};
        System.out.println(duplicate(nums) );
    }
}
