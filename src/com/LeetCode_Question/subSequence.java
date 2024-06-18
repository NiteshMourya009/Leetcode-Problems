package com.LeetCode_Question;
import java.util.* ;
import java.util.ArrayList;

public class subSequence {
    public static  void subSeq(int idx, int[]arr,int n,  List<List<Integer>>result, List<Integer>ans){

        if(idx>=n){
            result.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(arr[idx]) ;
        subSeq(idx+1, arr,n,result,ans) ;
        ans.remove(ans.size()-1) ;
        subSeq(idx+1, arr,n,result,ans) ;


    }
    public static void main(String[] args) {
        int[]arr= {3,1,2} ;
        int n= arr.length ;
        int idx=0;
        List<List<Integer>>result= new ArrayList<>() ;
        List<Integer>ans= new ArrayList<>() ;
        subSeq(0,arr,n,result,ans);
        System.out.println(result);
    }
}
