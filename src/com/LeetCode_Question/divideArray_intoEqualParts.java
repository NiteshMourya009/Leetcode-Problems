package com.LeetCode_Question;

import java.util.HashMap;

public class divideArray_intoEqualParts {
    public static  boolean divideArray(int[]nums){
        int n= nums.length ;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }
        int count= 0;
        for(var e: map.entrySet()){
            if(e.getValue()%2==0){
                count += e.getValue() ;
            }
        }
        if(count==n){
            return  true ;
        }
        return false ;
    }
    public static void main(String[] args) {

        int []nums={1,2,3,4};
        System.out.println(divideArray(nums));

    }
}
