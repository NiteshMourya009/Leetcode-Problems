package com.LeetCode_Question;

import java.util.Stack;

public class removeAllAdjacent_duplicate {
    public static String removeDuplicate(String s){
        int n= s.length() ;
        Stack<Character>str= new Stack<>() ;
       // str.add(s.charAt(0));
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);

            if(!str.empty() && str.peek()==ch){
               // str.add(ch);
                str.pop();
            }
            else{
                str.push(ch);

            }
        }
        StringBuilder sb= new StringBuilder();
        while(!str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.reverse().toString();

    }
    public static void main(String[] args) {

        String s= "abbaca" ;
        System.out.println(removeDuplicate(s));
    }
}
