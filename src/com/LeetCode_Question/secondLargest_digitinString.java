package com.LeetCode_Question;
import java.util.* ;
public class secondLargest_digitinString {
    public static int secondHighest(String s) {

        int n = s.length();
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ascii= Character.getNumericValue(ch);
            if (ascii >= 0 && ascii < 10) {
                map.put(ascii , 1);
            }

        }
        int[] ans = new int[map.size()];
        for (var e : map.entrySet()) {
            ans[k] = e.getKey();
            k++;
        }
        Arrays.sort(ans);
        if(ans.length<2){
            return -1 ;
        }
        int max = ans[1];
        return max ;

    }
    public static void main(String[] args) {

        String s= "abc111111";
        System.out.println(secondHighest(s));

    }
}
