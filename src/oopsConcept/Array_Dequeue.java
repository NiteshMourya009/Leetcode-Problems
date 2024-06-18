package oopsConcept;
 import java.util.ArrayDeque ;



public class Array_Dequeue {
    public static void main(String[] args) {

          ArrayDeque<Integer>ad1= new ArrayDeque<>() ;


          ad1.add(2) ;
          ad1.add(43) ;
          ad1.add(5) ;
          ad1.addFirst(8);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());




    }
}
