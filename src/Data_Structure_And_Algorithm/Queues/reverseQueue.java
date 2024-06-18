package Data_Structure_And_Algorithm.Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
        Stack<Integer> st= new Stack<>() ;
        while(q.size()>0){
             st.push(q.remove()) ;
        }
        System.out.println(st);
        while(st.size()>0){
            q.add(st.pop()) ;
        }
        System.out.println(q) ;

    }
}
