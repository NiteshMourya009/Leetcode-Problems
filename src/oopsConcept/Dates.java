package oopsConcept;

import java.util.Date ;
// These all class are Depricated ;
public class Dates {
    public static void main(String[] args) {


        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date d= new Date() ;
        System.out.println(d);

        System.out.println(d.getTime());
        System.out.println(d.getClass());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());



    }
}
