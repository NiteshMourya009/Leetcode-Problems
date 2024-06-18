package oopsConcept;


import java.util.* ;



public class ArralyList {
    public static void main(String[] args){

        ArrayList<Integer> L1 =new ArrayList<>() ;

        ArrayList<Integer> l2 = new ArrayList<>(5) ;

        l2.add(11);
        l2.add(12);
        l2.add(14);
        l2.add(17);



        L1.add(7) ;
        L1.add(1) ;
        L1.add(3) ;
        L1.add(4) ;
        L1.add(9) ;
        L1.add(5) ;
        L1.add(0,16) ;
        L1.add(1,21) ;

        L1.set(0,566) ;

        L1.addAll(l2) ;
        // L1.clear();
        System.out.println(L1.contains(22));
        for(int i=0 ; i<L1.size(); i++){
            System.out.println(L1.get(i));
        }

        System.out.println("Index of the 7 is: " + L1.indexOf(7));


    }
}
