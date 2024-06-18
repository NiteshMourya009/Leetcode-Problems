package com.LeetCode_Question;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthethis {
    public static boolean isBalanced(String str){
    Stack<Character> st= new Stack<>() ;
    int n= str.length() ;
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            if(ch=='(' || ch=='{'  || ch=='['){
               st.push(ch);
            }
            else{
                if(st.peek()==ch) return false ;
                if(st.peek()==ch) return false ;
                else if(st.size()==0) return false ;
                else if(st.peek()=='(') st.pop() ;

            }
        }
        if(st.size()>0) return false ;
        else  return true ;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine() ;
        System.out.println(isBalanced(str));

    }
}


