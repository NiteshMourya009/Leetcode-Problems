package com.LeetCode_Question;

import java.util.HashMap;
import java.util.Map;

public class UniqueNo_OfOccurrence {

    public static  boolean uniqueOccurences(int[]arr){
        Map<Integer, Integer>map= new HashMap<>();
        int count = 0;
        for(int no: arr){
            if(map.containsValue(no)) continue;
            count = 0;
            for(int value: arr) {
                if(no == value){
                    count++;
                }
            }
            if(map.containsKey(count)){
                return false;
            }
            map.put(count, no);
        }
        return true;
    }
    public static void main(String[] args) {

        int[]arr= {1,2};
        System.out.println(uniqueOccurences(arr)) ;

    }
}
