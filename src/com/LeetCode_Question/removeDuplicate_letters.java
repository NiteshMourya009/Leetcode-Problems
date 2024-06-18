package com.LeetCode_Question;

import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicate_letters {
    public static String removeDuplicate(String s){
        HashMap<Character,Integer>map =new HashMap<>() ;
        Arrays.sort(s.toCharArray());
        String str="" ;
        for(char i:s.toCharArray()){
            if(!map.containsKey(i)){
                map.put(i,1) ;
            }
            else{
                map.put(i, map.get(i)+1) ;
            }
        }
        return str ;
    }
    public static void main(String[] args) {
        String s= "cbacdcbc" ;
    }
}
