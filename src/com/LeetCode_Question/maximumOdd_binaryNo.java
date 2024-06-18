package com.LeetCode_Question;
import  java.util.* ;
public class maximumOdd_binaryNo {
    public static String maximumOddBinaryNumber(String s) {
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        int k=0 ;
//        for (int i = chars.length -2; i >= 0; i--) {
//            if (chars[i] == '1') {
//                char temp = chars[i];
//                chars[i] = chars[k];
//                chars[k] = temp;
//                k++ ;
//               // break;
//            }
//        }
//        return new String(chars);
   int count1 = 0, count2 = 0;
        for (char a : s.toCharArray()) {
        if (a == '1') count1++;
        else if (a == '0') count2++;
    }
    StringBuilder ans = new StringBuilder();
        ans.append("1".repeat(count1 - 1));
        ans.append("0".repeat(count2));
        ans.append("1");
        return ans.toString();
    }
    public static void main(String[] args) {

        String s= "01000111010";
       System.out.println(maximumOddBinaryNumber(s));
    }
}
