package com.LeetCode_Question;
import java.util.* ;
public class minAbsolute_Difference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr) ;
        int n= arr.length ;
        // List<Integer>ap= new ArrayList<>() ;
        List<List<Integer>>result= new ArrayList<>() ;
        int min= Integer.MAX_VALUE ;

        for(int i=0; i<n-1; i++){
            min= Math.min(min,Math.abs(arr[i+1]-arr[i])) ;

        }
        for(int i=0; i<n-1; i++){
            if(Math.abs(arr[i+1]-arr[i])==min){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return  result ;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(minimumAbsDifference(nums));
    }
}
