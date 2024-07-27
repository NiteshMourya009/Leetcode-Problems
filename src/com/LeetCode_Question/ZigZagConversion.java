package com.LeetCode_Question;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
       int minr =0;
       int minc= 0;
       int k=0 ;
       char[][] ch= new char[numRows][s.length()] ;
       ch[0][0]= s.charAt(k++) ;

       for(int i=0; i<s.length(); i++){

           if(minr==0 && k<s.length()){
               for(minr=1; minr<numRows; minr++){
                   if(k<s.length()){
                       ch[minr][minc]= s.charAt(k++) ;
                   }
               }
               minc++ ;
               minr= minr-1 ; ;
           }
           else if(minr==numRows-1  && k<s.length()){
               minr-- ;
                while(minr >= 0){
                   if(k<s.length()){
                       ch[minr--][minc++]= s.charAt(k++) ;
                   }
                }
                minc-- ;
                minr++ ;
           }
       }
       String str="" ;
       for(int i=0; i<numRows; i++){
           for(int j=0; j<s.length(); j++){
               char sh= ch[i][j];
               if(Character.isLetter(sh)){
                   str += String.valueOf(sh) ;
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
