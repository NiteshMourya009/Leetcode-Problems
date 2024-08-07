package Sliding_Window;

import java.util.HashMap;

public class LongestSubStringwithAtmostKDistinctChara {
    public static int longesLength(String s, int k){
        HashMap<Character, Integer> map= new HashMap<>() ;
        int l=0;
        int r=0 ;
        int maxlen =0 ;

        while(r< s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), 1) ;
            }
            else{
                map.put(s.charAt(r), map.get(s.charAt(r))+ 1) ;
            }
            if(map.size()>k){
                while(map.size() <= k){
                    map.put(s.charAt(l), map.get(s.charAt(r))-1) ;
                    if(map.get(s.charAt(l))==0){
                        map.remove(map.get(l));
                    }
                    l++ ;
                }
            }
            else if(map.size()<=k){
                maxlen= Math.max(maxlen, r-l+1) ;

            }
            r++ ;
        }
        return maxlen ;
    }
    public static void main(String[] args) {
        String s= "aaabbccd" ;
        int k=2 ;
        System.out.println(longesLength(s,k));
    }
}
