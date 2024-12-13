package com.LeetCode_Question;

public class MinimumRepeatToMakeSubString {
    public static int minRepeats(String s1, String s2) {
        int count = 1;
        boolean flag = true;
        String str = s1;
        while (flag) {
            if (str.contains(s2)) {
                return count;
            }
            str += s1;
            count++;
            if (str.length() == 10 * s2.length()) {
                flag = false;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1= "abcd";
        String s2= "cdabcdab";
            System.out.println(minRepeats(s1,s2));
    }
}
