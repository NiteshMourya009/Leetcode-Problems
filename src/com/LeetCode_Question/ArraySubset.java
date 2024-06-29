package com.LeetCode_Question;

import java.util.HashMap;

public class ArraySubset {
    public static boolean subset(int[]a1, int[]a2){
        HashMap<Integer, Integer>map= new HashMap<>();
        HashMap<Integer,Integer>map1= new HashMap<>();
        for(int num:a1){
            if(!map.containsKey(num)){
                map.put(num,1) ;
            }
            else{
                map.put(num, map.get(num)+1) ;
            }
        }
        for(int i=0; i<a2.length; i++){
            if(!map.containsKey(a2[i])){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int[]a1={1,2,3,3,4,5,6};
        int[]a2={1,4,4};
        System.out.println(subset(a1,a2));
    }
}
