package com.LeetCode_Question;
import java.util.* ;
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length ;
        int n =matrix[0].length ;

        int count=0;
        int total=m*n;
        int minr=0 ;
        int maxr=m-1;
        int minc=0;
        int maxc=n-1 ;
        List<Integer>arr= new ArrayList<>();

        while(count<total){

            for(int i=minc; i<maxc; i++){
                arr.add(matrix[minr][i]) ;
                count++ ;
            }
            minr++ ;
            for(int i=minr; i<maxr; i++){
                arr.add(matrix[i][maxc]);
                count++ ;
            }
            maxc-- ;
            for(int i=maxc; i>=minc; i--){
                arr.add(matrix[maxr][i]);
                count++ ;
            }
            maxr-- ;
            for(int i= maxr; i>=minr; i--){
                arr.add(matrix[i][minr]);
                count++ ;
            }
            minc++ ;
        }
        return arr ;
    }
    public static void main(String[] args) {
        int[][]matrix= { {1,2,3},{4,5,6},{7,8,9}} ;
        List<Integer> st= spiralOrder(matrix);
        for(int num: st){
            System.out.print(num+" ");
        }
    }
}
