package com.LeetCode_Question;
import java.util.* ;
public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        String[] names= { "Mary","John","Emma" } ;
        int[]height={180,165,170} ;
        String[]s= sortPeople(names, height);
        for(String num: s){
            System.out.print(num+" ");
        }
    }
}
