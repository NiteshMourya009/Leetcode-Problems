package com.LeetCode_Question;
import java.util.* ;
public class countAlmostEqualPAirsII {
    public static Set<String> isEqual(int num){
        String str= Integer.toString(num) ;
        Set<String>set= new HashSet<>() ;
        set.add(str) ;
        char[]ch= str.toCharArray() ;
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                char temp= ch[i] ;
                ch[i]= ch[j] ;
                ch[j]= temp ;

                set.add(new String(ch));
                ch[j]= ch[i] ;
                ch[i]= temp ;

            }
        }
        return set ;

    }
    public static boolean isAlmostEqual(int x, int y){

        Set<String> mp= isEqual(x);
        Set<String> tp= isEqual(y) ;

        for(String st: mp){
            if(tp.contains(st)){
                return true ;
            }
        }
        return false ;
    }
    public static int countPairs(int[] nums) {
        int count =0 ;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(isAlmostEqual(nums[i],nums[j])){
                    count++ ;
                }
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int[]arr={3,12,30,17,21} ;
        System.out.println(countPairs(arr));
    }
}
