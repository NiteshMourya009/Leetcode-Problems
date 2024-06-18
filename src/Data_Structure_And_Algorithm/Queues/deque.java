package Data_Structure_And_Algorithm.Queues;
import java.util.* ;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>() ;

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);

        System.out.println(dq);
        dq.addFirst(9);
        dq.addFirst(13);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());


    }
}
