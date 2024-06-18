package com.LeetCode_Question;

public class lengthOFLast_Word {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            }
            else if (count > 0) {
                return count;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String s=" fly me to the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
