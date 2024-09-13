package com.LeetCode_Question;

public class sumOfDIgit {
    public static int digitSum(int val){
        int total =0 ;
        while(val>0){
            total = total+(val%10);
            val/=10 ;
        }
        return total ;
    }
    public static int getLucky(String s, int k) {
        String str= "" ;

        for(int i=0; i<s.length(); i++){
            str += String.valueOf(s.charAt(i)-'a'+1);
        }

        int ans =0 ;
        //int sum= Integer.parseInt(str);
        for(int i=0; i<str.length(); i++){
            ans += str.charAt(i)-'0' ;
        }
        while(k>1){
            ans = digitSum(ans);
            k-- ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        String s= "leetcode" ;
        int k=2 ;
        System.out.println(getLucky(s,k));
    }
}
