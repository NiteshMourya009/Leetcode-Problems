package com.LeetCode_Question;
import java.util.* ;
public class permutation {
    public static void permutation(int[]arr,  List<List<Integer>>result, List<Integer>ans, boolean[]freq) {
        if(ans.size()==arr.length){
            result.add(new ArrayList<>(ans)) ;
            return ;
        }
        for(int i=0; i<arr.length; i++){
            if(!freq[i]){
                freq[i]= true ;
                ans.add(arr[i]) ;
                permutation(arr,result,ans, freq) ;
                ans.remove(ans.size()-1) ;
                freq[i]= false ;

            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result= new ArrayList<>() ;
        List<Integer>ans= new ArrayList<>() ;
        boolean[]freq= new boolean[nums.length] ;
        permutation(nums,result,ans, freq) ;

        return result ;
    }
    public static void main(String[] args) {
        int[]nums= {1,2,3} ;
        Set<List<Integer>> st= new HashSet<>();
        System.out.println(permute(nums));
    }
}
