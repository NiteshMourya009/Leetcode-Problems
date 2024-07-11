package com.LeetCode_Question;

import java.util.Stack;

public class ReverseSubStrBtwParenthesis {
    public static String reverseParentheses(String s) {
        String str ="" ;
        Stack<Character> st =new Stack<>() ;
       // StringBuilder as= new StringBuilder() ;
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i) ;
            if(ch != ')'){
                st.push(ch) ;
            }
            else if(ch==')'){
                while( st.peek() != '(') {
                    str += (st.pop());
                }
                st.pop() ;
                int j=0 ;
                int p= str.length() ;
                while(j<p){
                    st.push(str.charAt(j++)) ;
                }
            }
            str="" ;
        }
        Stack<Character> ptr= new Stack<>() ;
        while(st.size()>0){
            ptr.push(st.pop()) ;
        }
        String str1="" ;
        int x= ptr.size() ;

        while(x>0){
            str1 += (ptr.pop());
            x-- ;
        }



        return str1 ;
     }
    public static void main(String[] args) {
        String str = "(ed(et(oc))el)" ;
        System.out.println(reverseParentheses(str));
    }
}
