package com.LeetCode_Question;
import java.util.* ;
public class Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s) ;
        int l=0;
        int r =0 ;

        while(l<s.length && r<g.length){

            if(g[r]<= s[l]){
                r= r+1 ;
            }
            l= l+1 ;
        }
        return r ;
    }
    public static void main(String[] args) {
        int[] g= {1,2};
        int[]s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
