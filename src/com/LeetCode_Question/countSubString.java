package com.LeetCode_Question;

public class countSubString {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int[] prefixOnes = new int[n + 1];
        int[] prefixZeros = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
            prefixZeros[i + 1] = prefixZeros[i] + (s.charAt(i) == '0' ? 1 : 0);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int numOnes = prefixOnes[j + 1] - prefixOnes[i];
                int numZeros = prefixZeros[j + 1] - prefixZeros[i];
                if (numOnes >= numZeros * numZeros) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s= "101101";
        System.out.println(numberOfSubstrings(s));
    }
}
