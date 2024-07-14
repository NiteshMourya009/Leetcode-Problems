package com.LeetCode_Question;

public class LexogrpSmallestStringAfterSwap {
    public static String getSmallestString(String s) {
    int n = s.length();
    char[] charArray = s.toCharArray();

        for (int i = 0; i < n - 1; i++) {
        int a = charArray[i] - '0';
        int b = charArray[i + 1] - '0';
        if (a % 2 == b % 2 && a > b) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
            break;
        }
    }

        return new String(charArray);

}
    public static void main(String[] args) {
        String s ="45320" ;
        System.out.println(getSmallestString(s));
    }
}
