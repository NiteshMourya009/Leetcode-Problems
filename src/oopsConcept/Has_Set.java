package oopsConcept;

import java.util.HashSet;

public class Has_Set {
    public static void main(String[] args) {

        HashSet<Integer> myHash= new HashSet<>(5, 0.5f);

        myHash.add(5);
        myHash.add(6);
        myHash.add(7);
        myHash.add(8);
        myHash.add(9);
        myHash.add(11);

        System.out.println(myHash);



    }
}
