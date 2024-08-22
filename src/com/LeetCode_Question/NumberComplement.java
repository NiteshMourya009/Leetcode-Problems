package com.LeetCode_Question;

public class NumberComplement {
    public static int numberComp(int a){
        String st= Integer.toBinaryString(a) ;
        char[] ch= st.toCharArray() ;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='0'){
                ch[i]='1' ;
            }
            else if(ch[i]=='1'){
                ch[i]= '0' ;
            }
        }
        String ptr= "" ;
        for(int i=0; i<ch.length; i++){
            ptr += String.valueOf(ch[i]) ;
        }
        int comp= Integer.parseInt(ptr, 2) ;
        return comp ;
    }
    public static void main(String[] args) {
        int a= 1 ;
        System.out.println(numberComp(a));
    }
}
