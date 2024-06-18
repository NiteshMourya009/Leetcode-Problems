package com.LeetCode_Question;

public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t){
        int count=0 ;
        if(s.length()>t.length()) {
            return false ;
        }
        if(s.length()==0) return true ;
        for(int i=0; i<t.length(); i++){
            if(s.charAt(count)==t.charAt(i)){
                count++;
            }
            if(count==s.length()) return true ;
        }
        return false ;
    }

    public static void main(String[] args) {

        String s="axc";
        String t="ahbgdc";

        System.out.println(isSubsequence(s,t));
    }
}
