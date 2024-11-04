//package com.LeetCode_Question;
//
//import java.util.HashSet;
//
//public class CountOfSubStringVowelandKConso {
//    public static boolean isVowel(char ch){
//        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ;
//    }
//    public static long countOfSubstrings(String word, int k) {
//        int r =0 ;
//        int l =0 ;
//        int n=word.length() ;
//        int consonant=0 ;
//        HashSet<Character>set= new HashSet<>() ;
//        while(r < n){
//            if(isVowel(word.charAt(r))){
//                set.add(word.charAt(r)) ;
//            }
//            else{
//                consonant++ ;
//            }
//            while()
//        }
//    }
//    public static void main(String[] args) {
//        String s ="aeioqq";
//        int k=1 ;
//        System.out.println(countOfSubstrings(s, k));
//    }
//}
