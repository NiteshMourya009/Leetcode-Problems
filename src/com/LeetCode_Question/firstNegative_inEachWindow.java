package com.LeetCode_Question;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegative_inEachWindow {
    public static long[]printFirstNegativeInteger(long A[], int n, int k){

        long[]res= new long[n-k+1] ;
        Queue<Integer> q= new LinkedList<>();

        for(int i=0; i<n; i++){
            if(A[i]<0){ // Adding -ve value indices
                q.add(i);
            }
        }
        for(int i=0; i<n-k+1; i++){
            if(q.peek()<i){
                q.remove() ;
            }
            else if(q.peek()<= i+k-1){
                res[i]= A[q.peek()] ;
            }
            else{
                res[i]= 0 ;
            }
        }
        return res ;
    }
    public static void main(String[] args) {

        long[] arr= {12,-1,-7,8,-15,30,16,28} ;
        int k=3 ;
        int n= arr.length ;
         printFirstNegativeInteger(arr,n,k);
     
    }
}
