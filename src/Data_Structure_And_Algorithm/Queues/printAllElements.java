package Data_Structure_And_Algorithm.Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class printAllElements {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(7);
        q.add(9);
        q.add(1);
        q.add(5);
        // rear-> 5 1 9 7 6 3 -> Front
        System.out.println(q);
        Queue<Integer> helper= new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek());
            helper.add(q.poll()) ;
        }
        while(helper.size()>0){
            q.add(helper.poll()) ;
        }
    }
}
