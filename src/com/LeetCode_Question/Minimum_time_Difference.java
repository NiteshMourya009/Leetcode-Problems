package com.LeetCode_Question;

import java.util.*;
import java.util.List;

public class Minimum_time_Difference {
    public static int minimumTime(List<String> timePoints) {
        int n= timePoints.size() ;
        int[]arr= new int [n] ;
        int a =0 ;
        int b =0 ;
        String s="00" ;
        for(int i=0 ; i<n; i++){
            String []nums= timePoints.get(i).split(":") ;
            int c=Integer.parseInt(nums[0]) ;
            if(c==0){
                a= 24 ;
            }
            else{
                a= c;
            }
            b= Integer.parseInt(nums[1]) ;

            arr[i]=a*60+b ;
        }
        int max =Integer.MAX_VALUE ;
        Arrays.sort(arr) ;
        for(int i=0; i<arr.length-1; i++){
            max= Math.min(max,arr[i+1]-arr[i]);
        }
        return Math.min(max, 1440-(arr[n-1]-arr[0])) ;
    }
    public static void main(String[] args) {
        List<String> time= new ArrayList<>() ;
      //  time.add("00:00") ;
        time.add("23:59");
        time.add("00:00");
        System.out.println(minimumTime(time));

    }
}
