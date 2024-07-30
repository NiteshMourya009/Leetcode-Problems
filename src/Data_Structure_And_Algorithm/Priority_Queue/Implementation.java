package Data_Structure_And_Algorithm.Priority_Queue;

import java.util.PriorityQueue;
// Priority Queue is the implementation of the Heap
public class Implementation {
    public static void main(String[] args) {
           PriorityQueue<Integer> pq= new PriorityQueue<>() ;
           pq.add(20) ;
           pq.add(5) ;
           pq.add(10) ;

           pq.add(7) ;
        System.out.println(pq.peek());
        pq.remove() ;
       // In java Prioriy Queue is the Default Min Heap
        System.out.println(pq.peek());
    }
}
