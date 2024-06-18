package com.LeetCode_Question;

import java.util.Stack;

public class implementQueue_usingStack {

    public class myQueue{
        Stack<Integer> st= new Stack<>() ;
        Stack<Integer>helper= new Stack<>() ;
        // Push Efficient Method
        public void push(int x){
            st.push(x) ;
        }
        public int pop(){
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x =st.pop() ;
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x ;
        }
        public int peek(){
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x =st.peek() ;
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x ;
        }
        public boolean empty(){
            if(st.size()==0){
                return true ;
            }
            else return false ;
        }

        //  Peek And Pop Efficient
//        public void pushs(int x){
//            if(st.size()==0) st.push(x);
//            else{
//                while(st.size()>0) {
//                    helper.push(st.pop());
//                }
//                st.push(x) ;
//
//                while(helper.size()>0){
//                    st.push(helper.pop()) ;
//                }
//            }
//        }
//        public  int peeks(){
//          return   st.peek();
//        }
//        public int pops(){
//            return st.pop();
//        }
    }

    public static void main(String[] args) {

    }
}
