package com.LeetCode_Question;

public class StringToInteger {
    public static int myAtoi(String s) {
        String str="" ;
        String sp= s.trim() ;
        int n = sp.length() ;
        for(int i=0; i<n; i++){
            if(sp.charAt(i)==' '){
                break ;
            }
            if(sp.charAt(i)=='0' && sp.charAt(i+1)=='-'){
                return 0 ;
            }
            char ch= sp.charAt(i) ;
            if(sp.charAt(i)== '-'){
                str += sp.charAt(i) ;
                if(sp.charAt(i+1)=='0'){
                    i++ ;
                }
            }
            else if(Character.isLetter(ch)){
                break ;
            }
            else{
                str +=sp.charAt(i) ;

            }

        }
        int result=0 ;
        int sign=1 ;
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(ch=='-'){
                sign= -1 ;
            }
            else{
                int digit= ch-'0' ;
                result= result*10+ digit ;
            }
        }
        return result*sign ;
    }
    public static void main(String[] args) {
        String s= "4193 with words";
        System.out.println(myAtoi(s));
    }
}
