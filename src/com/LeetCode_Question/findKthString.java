package com.LeetCode_Question;

public class findKthString {
    public static char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while (str.length() < k) {
            char lastChar = str.charAt(str.length() - 1);
            char nextChar = (char) ((lastChar == 'z') ? 'a' : lastChar + 1);
            String st = str.substring(1) + nextChar;
            str.append(st);
        }
        return str.charAt(k-1);
    }
    public static void main(String[] args) {
        int k=5 ;
        System.out.println(kthCharacter(k));
    }
}
