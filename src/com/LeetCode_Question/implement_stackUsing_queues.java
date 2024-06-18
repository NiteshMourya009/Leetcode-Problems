package com.LeetCode_Question;

import java.util.LinkedList;
import java.util.Queue;

public class implement_stackUsing_queues {

     public static class myStack{
        Queue<Integer>q= new LinkedList<>() ;

         public  void push(int x){

             q.add(x);
         }

         public int pop(){
             for(int i=1; i<q.size()-1; i++){
                 q.add(q.remove()) ;
             }
             int val = q.peek() ;
             q.remove() ;
             return val ;
         }
        public int top(){
            for(int i=1; i<q.size()-1; i++){
                q.add(q.remove()) ;
            }
            int val = q.peek() ;
            q.add(q.remove());
            return val ;
        }
        public boolean empty(){
            if(q.size()==0) return true ;
            else return false ;
        }
    }
    public static void main(String[] args) {

        myStack obj= new myStack() ;

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

        System.out.println(obj);

        System.out.println(obj.top());


    }
}
