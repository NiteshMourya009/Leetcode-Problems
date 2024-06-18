package com.LeetCode_Question;

import java.util.Hashtable;
import java.util.Map;

public class firstUnique_characterIndex {
    public static int firstUniqueChar(String s){
        int n= s.length();
        Map<Character,Integer>map= new Hashtable<>();
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
        for(int i=0; i<n; i++){
            if(map.get(s.charAt(i))==1){
                return i ;
            }
        }
        return -1 ;


    }
    public static void main(String[] args) {

        String s="loveleetcode" ;
        System.out.println(firstUniqueChar(s));
    }
}
