package com.LeetCode_Question;

import Data_Structure_And_Algorithm.Stack.Array_Implementaton_InStack;

import java.util.Stack;

public class removingStar_fromString {
    public static void main(String[] args) {

        String str = "leet**cod*e";

        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '*') {
                val.pop();
            } else {
                val.push(ch + "");
            }
        }
        System.out.println(val);
        String ans="";
        for(int i=0; i<val.size(); i++){
            ans += val.elementAt(i);
        }
        System.out.println(ans);

//
        }
    }




