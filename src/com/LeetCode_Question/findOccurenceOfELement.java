package com.LeetCode_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class findOccurenceOfELement {
    public static int[] findOccu(int[]nums, int[]q, int x){
        int[] arr= new int[nums.length+1] ;
        Arrays.fill(arr,-1);
        int k=1 ;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                arr[k++]= i ;
            }
        }
        ArrayList<Integer> pq= new ArrayList<>() ;
        for(int i=0; i<q.length; i++){
            if(q[i]<=nums.length){
                pq.add(arr[q[i]]) ;
            }
            else{
                pq.add(-1) ;
            }
        }
        int[]a= new int[pq.size()];
        for(int i=0; i<pq.size(); i++){
            a[i]=pq.get(i) ;
        }
        return a ;
    }
    public static void main(String[] args) {
        int[]nums={6} ;
        int[]q={3,2,1,3};
        int x= 6 ;
        int[]arr= findOccu(nums,q,x ) ;
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
