package com.LeetCode_Question;
import java.util.* ;
public class kth_smallestLexographucal {
    public static int findKthNumber(int n, int k) {
        String[]arr= new String[n] ;
        int p=0 ;
        for(int i=1; i<=n; i++){
            arr[p]= String.valueOf(i);
            p++ ;
        }
        Arrays.sort(arr, (a,b) -> (a+b).compareTo(b+a));
        return Integer.parseInt(arr[k-1]);
    }
    public static void main(String[] args) {
        int n =  13 ;
        int k=2 ;
        System.out.println(findKthNumber(n,k));
    }
}
