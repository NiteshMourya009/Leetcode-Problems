package com.LeetCode_Question;
import java.util.* ;
public class LuckyNumberInMAtrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer>arr= new ArrayList<>() ;
        int min=Integer.MAX_VALUE ;
        int max= Integer.MIN_VALUE ;
        int p=0 ;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                min= Math.min(min,matrix[i][j]);
            }
            //int row=0 ;
            int col=0 ;
            for(int j=0; j<matrix[0].length; j++){
                if(min==matrix[i][j]){
                    col=j ;
                }
            }
            int k=0 ;
            while(k<matrix.length){
                max =Math.max(max, matrix[k++][col]) ;
            }
            if(min==max){
                arr.add(min);
            }
            min=Integer.MAX_VALUE ;
            max= Integer.MIN_VALUE ;
        }

        return arr ;
    }
    public static void main(String[] args) {
        int[][]matrix={
                {3,7,8}, {9,11,13}, {15,16,17} } ;
        List<Integer> num= luckyNumbers(matrix) ;
        for(int i:num){
            System.out.println(i) ;
        }

    }
}
