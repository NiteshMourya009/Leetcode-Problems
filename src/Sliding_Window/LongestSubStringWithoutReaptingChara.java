package Sliding_Window;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubStringWithoutReaptingChara {
    public static int lengthOfLongestSubstring(String s){
         int n= s.length() ;
         int[]hash= new int[256] ;
        Arrays.fill(hash, -1);
        int l=0 ;
        int r =0 ;
        int max =0 ;
        int len =0 ;
        while(r<n){
           if(hash[s.charAt(r)] != -1){
               if(hash[s.charAt(r)] >= l){
                   l= hash[s.charAt(r)] +1 ;
               }
           }
           len= r-l+1 ;
           max= Math.max(len, max) ;
           hash[s.charAt(r)] = r ;
           r++ ;
        }
        return max ;
    }
    public static void main(String[] args) {
        String s= "abcabcbb" ;
        System.out.println(lengthOfLongestSubstring(s));
    }
}
