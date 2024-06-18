package oopsConcept;
import java.util.* ;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<Integer> l1 =new LinkedList<>() ;

        LinkedList<Integer> l2 = new LinkedList<>() ;

        l2.add(11);
        l2.add(12);
        l2.add(14);
        l2.add(17);



        l1.add(7) ;
        l1.add(1) ;
        l1.add(3) ;
        l1.add(4) ;
        l1.add(9) ;
        l1.add(5) ;
        l1.add(0,16) ;


        l1.set(0,566) ;

        l1.addAll(l2) ;
        // L1.clear();
        System.out.println(l1.contains(22));

        // Available in only LinkedList in only

        l1.addLast(786);
        l1.addFirst(570);



        for(int i=0 ; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        System.out.println("Index of the 7 is: " + l1.indexOf(7));


    }
}
