package com.LeetCode_Question;

import java.util.Arrays;

public class setMatrixZeroes {
    public static  void setZero(int[][]matrix, int row, int col,boolean[][]flag){
        flag[row][col]= true ;
        for(int i=0; i<matrix[0].length; i++){
           if(matrix[row][i] != 0){
               matrix[row][i]=0 ;
               flag[row][i]=true ;
           }
        }
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][col]!=0){
                matrix[i][col]= 0 ;
                flag[i][col]= true ;
            }
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m= matrix.length ;
        int n= matrix[0].length ;
        boolean[][] flag= new boolean[m][n] ;
        for( int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                flag[i][j]=false ;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0 && flag[i][j]==false){
                    setZero(matrix, i, j,flag) ;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[][]matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
         setZeroes(matrix);
         for(int i=0; i<matrix.length; i++){
             for(int j=0; j<matrix[0].length; j++){
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }
    }
}
