//package com.LeetCode_Question;
//import java.util.* ;
//public class String {
//    public static int compress(char[] chars) {
//        int n = chars.length;
//        StringBuilder sb = new StringBuilder();
//
//        int freq = 1;
//
//        for (int i = 0; i < n; i++) {
//            char c = chars[i];
//
//            while (i < n - 1 && chars[i] == chars[i + 1]) {
//                freq++;
//                i++;
//            }
//
//            sb.append(c);
//
//            if (freq > 1) {
//                sb.append(freq);
//            }
//
//            freq = 1;
//        }
//
//        String Str = sb.toString();
//        char[] Chars = Str.toCharArray();
//
//        for (int i = 0; i < Chars.length; i++) {
//            chars[i] = Chars[i];
//        }
//
//        return Chars.length;
//    }
//    public static void main(String[] args) {
//        char[] chars= {'a','a','b','b','c','c','c'} ;
//        System.out.println(compress(chars));
//    }
//}
