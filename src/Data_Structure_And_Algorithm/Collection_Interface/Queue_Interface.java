package Data_Structure_And_Algorithm.Collection_Interface;

import java.util.*;

public class Queue_Interface {
    static void DequeExample(){ // Doubly ended Queue
        Deque<Integer> dq= new ArrayDeque<>() ;

        dq.addFirst(2);
        dq.addFirst(4);
        dq.addLast(20);
        dq.addLast(40);
        dq.addFirst(8);
        System.out.println(dq);

        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq.peekLast());
    }
    static  void PriorityQueueExample(){
    //    PriorityQueue<Integer> pq= new PriorityQueue<>(); //Min Priority
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()); // Now this is max Priority Queue
        pq.add(10);
        pq.add(8);
        pq.add(6);
        pq.add(16);
        System.out.println(pq.peek()); // 6 - Smallest element has the highest priority queue
        System.out.println(pq); // Topmost priority element will be processed first
        System.out.println(pq.poll());  // 6 and remove
        System.out.println(pq.peek()); // 8 has now priority
        System.out.println(pq);
    }

    static  void QueueExample(){
        LinkedList<Integer> q= new LinkedList<>() ;
        //LinkedList also use for Queue
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(6);

        System.out.println(q.peek()); //1
        System.out.println(q.poll()); // 1 and remove ;
        System.out.println(q.peek());
        System.out.println(q.isEmpty()); // False
        System.out.println(q.size());

        System.out.println(q);
    }

    public static void main(String[] args) {

       // QueueExample();
      //  PriorityQueueExample();

        DequeExample();
    }
}
