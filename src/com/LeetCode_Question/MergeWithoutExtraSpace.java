package com.LeetCode_Question;
import java.util.* ;
public class MergeWithoutExtraSpace {
    public static void merge(int[]a, int[]b){
        int n = a.length, m = b.length;
        int i=n-1, j=0;
        while(i>=0&&j<m){
            if(b[j]>a[i])break;
            if(b[j]<a[i]){
                int temp  = b[j];
                b[j] = a[i];
                a[i] = temp;
            }
            j++;
            i--;
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[]a = {2, 4, 7, 10} ;
        int[]b= {2, 3} ;
        merge(a,b) ;
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
