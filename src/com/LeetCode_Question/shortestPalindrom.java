package com.LeetCode_Question;

public class shortestPalindrom {
    public static String  reverse(String s){
    char[]ch= s.toCharArray() ;
    int i=0 ;
    int j=s.length()-1 ;

    while(i<=j){
        char sh= ch[i] ;
        ch[i]= ch[j] ;
        ch[j]= sh ;

        i++ ;
        j-- ;
    }
    String t="" ;
    for(int p=0; p<ch.length; p++){
        t += String.valueOf(ch[p]) ;
    }
    return t ;
}
    public static String shortestPalindrome(String s) {
        StringBuilder sb= new StringBuilder() ;
        StringBuilder st= new StringBuilder() ;

        int i=0 ;
        int j= s.length()-1 ;

        while(i<= j){
            if(s.charAt(i)==s.charAt(j)){
                sb.append(s.charAt(i));
                i++ ;
                j-- ;

            }
            else{
                sb.append(s.charAt(j)) ;
                j-- ;
            }
        }
        for(int k=i; k<s.length(); k++){
            sb.append(s.charAt(k));
        }
        String t = reverse(s) ;

        int x=0 ;
        int y= t.length()-1 ;

        while(x<= j){
            if(t.charAt(x)==t.charAt(y)){
                st.append(t.charAt(x));
                x++ ;
                y-- ;

            }
            else{
                st.append(t.charAt(y)) ;
                y-- ;
            }
        }
        for(int k=x; k<t.length(); k++){
            st.append(t.charAt(k));
        }

        if(sb.length() <= st.length()){
            return sb.toString() ;
        }
        return st.toString() ;
    }
    public static void main(String[] args) {
        String s=  "aacecaaa" ;

        System.out.println(shortestPalindrome(s));
    }
}
