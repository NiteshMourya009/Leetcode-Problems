package com.LeetCode_Question;

public class que {
    public static String length(String s){
        String sk="" ;
        int n=s.length() ;
        for(int i=0; i<4-n; i++){
            sk +=String.valueOf('0') ;
        }
        return sk+s ;

    }
    public static int generateKey(int num1, int num2, int num3) {
        String sb= String.valueOf(num1) ;
        String st= String.valueOf(num2) ;
        String s= String.valueOf(num3) ;
        if(sb.length()!=4){
            sb= length(sb);
        }
        if(st.length()!=4){
            st= length(st);
        }
        if(s.length()!=4){
            s= length(s);
        }
        String p="" ;

        int result =0 ;
        int max3= Integer.MAX_VALUE ;
        for(int i=0; i<4; i++){

            int  max1= Math.min(sb.charAt(i)-'0',    Math.min(st.charAt(i)-'0', s.charAt(i)));

            result= result*10 + max1 ;

        }
        return  result ;
    }
    public static void main(String[] args) {
        int a= 987 ;
        int b=879 ;
        int c= 798 ;
        System.out.println(generateKey(a,b,c));
    }
}
