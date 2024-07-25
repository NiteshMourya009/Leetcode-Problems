package com.LeetCode_Question;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        int n= s.length() ;
        char[][]nums= new char [numRows][n];
        int count =0 ;

        int minc=0 ;
        int maxr= numRows ;
        int max= 0 ;
        int k=0 ;
        int p=0 ;

        while(count != n){

            if(p%2==0){
                for(int i=max; i<numRows; i++){
                    if(count<n) {
                        nums[i][minc] = s.charAt(k++);
                        count++;
                    }
                }
                minc++ ;
                p++ ;
                 maxr = numRows-2 ; ;
            }
            else{
                for(int i=maxr; i>=0; i--){
                    if(count<n) {
                        nums[i][minc++] = s.charAt(k++);
                        count++;
                    }
                }
                p++ ;
                minc-- ;
            }
            max= 1 ;

        }
        String str="" ;
        for(int i=0; i<numRows; i++){
            for(int j=0; j<n; j++){
                char ch =nums[i][j];
                if(Character.isLetter(ch)){
                    str += String.valueOf(ch);
                }
            }
        }
        return str ;
    }
    public static void main(String[] args) {
        String s="PAYPALISHIRING  " ;
        System.out.println(convert(s,4));
    }
}
