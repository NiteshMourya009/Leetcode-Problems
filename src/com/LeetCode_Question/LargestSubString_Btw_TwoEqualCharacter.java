package com.LeetCode_Question;

import java.util.HashMap;
import java.util.Map;

public class LargestSubString_Btw_TwoEqualCharacter {

    public static  int maxLength(String s){
        Map<Character, Integer> map= new HashMap<>();
        int length= -1 ;
        int maxlength= -1 ;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(!map.containsKey(c)) {
            map.put(c,i);

            }
             else{
              length= i-map.get(c)-1 ;
            }
             if(maxlength< length){
                 maxlength= length ;

             }


        }
        System.out.println(maxlength);

        return maxlength ;
    }
    public static void main(String[] args) {

        String s= "abcdaca";
        maxLength(s) ;

    }
}
