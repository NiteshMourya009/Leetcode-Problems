package Data_Structure_And_Algorithm.Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {

        Queue<Integer> q= new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(7);
        q.add(9);
        q.add(1);
        q.add(5);
        System.out.println(q);

        q.remove() ;
        System.out.println(q);

        q.poll() ; // it also delete the value
        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.element()); // it is same as peek()

        System.out.println(q.size()); 




    }
}
