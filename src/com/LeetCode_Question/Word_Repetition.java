package com.LeetCode_Question;

import java.util.HashMap;
import java.util.Map;

public class Word_Repetition {

    public static void repetitionOfWord(String s) {
        Map<String, Integer> map = new HashMap<>();
        int n = s.length();
        String[] str = s.split(" ");
        int count =0 ;
        String ans="" ;


        for (String st : str) {
            if (map.containsKey(st)) {
                map.put(st, map.get(st) + 1);
            }
            else{
                map.put(st, 1);
            }
        }
        for(var ar: map.entrySet()){
            if(ar.getValue()>count){
                count= ar.getValue();
                ans= ar.getKey() ;
            }
        }
        System.out.println("Repeated Word is:"+ans);
        System.out.println(ans+" rapeat "+count+" times.");
        System.out.println(map.entrySet());

    }

    public static void main(String[] args) {

        String s= "I am nitesh Mourya  nitesh nitesh nitesh am the";
        repetitionOfWord(s);
    }
}
