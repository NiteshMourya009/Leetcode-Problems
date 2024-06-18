package oopsConcept;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice_CollectionFrame_work {
    public static void main(String[] args) {

        ArrayList<String> ar= new ArrayList<>();

        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");

        for(Object o: ar) {
        System.out.println(o);}


        HashSet<Integer> s= new HashSet<>();
         // Duplicate element print only once
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(4);
        s.add(8);
        for (Object p:s){
            System.out.println(s);
        }
        // Problem 03
        Date d= new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());


        // Problem 04

        Calendar c= Calendar.getInstance() ;
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // Problem 05
        LocalDateTime dt = LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy--E h:m a") ;
        String myDate = dt.format(df) ;
        System.out.println(myDate);

    }
}
