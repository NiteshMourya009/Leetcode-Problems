package com.LeetCode_Question;
import java.util.* ;
public class PalindromPairs {
    public static boolean isPalindrom(String s, String t){
         String str= s + t ;
         int i=0 ;
         int j=str.length()-1 ;
         while(i<j){
             if(str.charAt(i) != str.charAt(j)){
                 return false ;
             }
             i++ ;
             j-- ;
         }
         return true ;

    }
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>>arr= new ArrayList<>() ;
        for(int i=0; i<words.length; i++){

            for(int j=0; j< words.length; j++){
                if(isPalindrom(words[i],words[j]) && i!=j){
                    List<Integer>ans= new ArrayList<>() ;
                    ans.add(i);
                    ans.add(j);
                    arr.add(new ArrayList<>(ans)) ;
                }
            }
        }
        return arr ;
    }
    public static void main(String[] args) {
        String []s={"bat","tab","cat"} ;
        List<List<Integer>>ar= palindromePairs(s) ;
        System.out.println(ar);
    }
}
