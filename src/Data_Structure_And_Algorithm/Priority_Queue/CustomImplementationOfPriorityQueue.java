package Data_Structure_And_Algorithm.Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CustomImplementationOfPriorityQueue {
    public static class student{
        String name;
        Integer rollNo;
        Integer marks ;
        String Dob ;
    }
    private static class studentComparator implements Comparator<student> {
        // overriding
        public int compare(student s1, student s2){
            if(s1.marks > s2.marks){
                return -1 ;
            }
            else if(s2.marks > s1.marks){
                return 1;
            }
            else{
                if(s1.rollNo > s2.rollNo){
                    return -1 ;
                }
                if(s1.rollNo <s2.rollNo){
                    return 1 ;
                }
                else{
                    return 0 ;
                }
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> studentPriorityQueue= new PriorityQueue<>(new studentComparator() ) ;

        student harsh= new student() ;
        harsh.name ="Harsh" ;
        harsh.marks=97 ;
        harsh.Dob= "12-10-2002" ;
        harsh.rollNo= 45 ;
        studentPriorityQueue.add(harsh) ;

        student nitesh= new student() ;
        nitesh.name ="nitesh" ;
        nitesh.marks=99 ;
        nitesh.Dob= "08-07-2004" ;
        nitesh.rollNo= 25 ;
        studentPriorityQueue.add(nitesh) ;

        List<student> studentList= new ArrayList<>() ;
        studentList.add(nitesh);
        studentList.add(harsh);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);
    }
}
