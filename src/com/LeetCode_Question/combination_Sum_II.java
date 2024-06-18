package com.LeetCode_Question;
import java.util.* ;
public class combination_Sum_II {
    public static void combi(int idx,int[] arr, int n, int sum,int target, List<List<Integer>>result, List<Integer>ans){

        if(idx>= n){
            if(sum==target){
                result.add(new ArrayList<>(ans));
            }
            return ;
        }
        if(sum <= target){
            ans.add(arr[idx]);
            combi(idx+1, arr,n, sum+arr[idx],target, result, ans) ;
            ans.remove(ans.size()-1) ;
        }
        combi(idx+1, arr,n, sum,target, result, ans) ;

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>>result= new ArrayList<>() ;
        List<Integer>ans= new ArrayList<>() ;
        int idx=0 ;
        int sum=0 ;
        int n= candidates.length ;
        combi(0,candidates,n,sum, target , result, ans ) ;
        return result ;

    }
    public static void main(String[] args) {
        int[] candidates= {10,1,2,7,6,1,5} ;
        int target =8 ;
        System.out.println(combinationSum2(candidates,target));
    }
}
