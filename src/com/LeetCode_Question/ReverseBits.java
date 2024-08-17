package com.LeetCode_Question;

public class ReverseBits {
    public static void swap(char[] ch){

        int i=0;
        int j= ch.length-1 ;
        while(i<j){
            char temp= ch[i] ;
            ch[i]= ch[j] ;
            ch[j]= temp ;
            i++ ;
            j-- ;
        }
    }
    public static void main(String[] args) {
        int n = 00000010100101000;
        String st=Integer.toBinaryString(n) ;
        char[]ch=st.toCharArray() ;
        swap(ch);

        double max =0 ;
        int k=0 ;
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i]=='1'){
                max += Math.pow(2,k);
            }
            k++ ;
        }
        System.out.println(max);

    }
}
