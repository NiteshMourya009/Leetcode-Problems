package com.LeetCode_Question;
import java.util.* ;
public class extraCharacterInString {

        public static int longestCommonPrefix(int[] arr1, int[] arr2) {
            HashMap<String, Integer> prefixMap = new HashMap<>();
            for (int num : arr1) {
                String strNum = Integer.toString(num);
                String prefix = "";
                for (char ch : strNum.toCharArray()) {
                    prefix += ch;
                    prefixMap.put(prefix, prefixMap.getOrDefault(prefix, 0) + 1);
                }
            }

            int maxLength = 0;

            for (int num : arr2) {
                String strNum = Integer.toString(num);
                String prefix = "";
                for (char ch : strNum.toCharArray()) {
                    prefix += ch;
                    if (prefixMap.containsKey(prefix)) {
                        maxLength = Math.max(maxLength, prefix.length());
                    }
                }
            }

            return maxLength;
    }
    public static void main(String[] args) {
        int[]arr1= {1,10,100};
        int[]arr2= {1000} ;
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
}
