package oopsConcept;


import java.util.ArrayList;

public class List_Sorting {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(50);
        list.add(66);
        list.add(17);
        list.add(20);
        list.add(9);

        list.set(3,10);

        list.sort(Integer::compareTo);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(17));
        System.out.println(list.get(4));






    }
}
