package com.LeetCode_Question;

public class flippingAn_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        int m= image[0].length-1 ;
        int j=0 ;
        for(int i=0; i<image.length; i++){
            while(j<=m){
                int temp= image[i][j];
                image[i][j]= image[i][m] ;
                image[i][m]= temp ;
                j++ ;
                m-- ;
            }
            j=0 ;
            m= image[0].length-1 ;
        }
        for(int i=0; i<image.length; i++){
            for(int k=0; k<image[0].length; k++){
                if(image[i][k]==0){
                    image[i][k]= 1 ;
                }
                else if(image[i][k]==1){
                    image[i][k]= 0 ;
                }
            }
        }
        return image ;
    }
    public static void main(String[] args) {
        int[][]image= {{1,1,0}, {1,0,1},{0,0,0}} ;
        int[][]nums= flipAndInvertImage(image)  ;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
    }
}
