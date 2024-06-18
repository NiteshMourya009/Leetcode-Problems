package com.LeetCode_Question;

public class existenceSubString_inReverse {
    public static String reverse(String s) {
        char[] chararray = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = chararray[i];
            chararray[i] = chararray[j];
            chararray[j] = temp;
            i++;
            j--;
        }
        return new String(chararray);
    }
    public static boolean isSubstringPresent(String s) {
        String rev = reverse(s);
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (rev.contains(sub)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(isSubstringPresent(s));
    }
}
