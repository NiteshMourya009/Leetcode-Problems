package oopsConcept;

import java.util.Stack;

public class Stack_List {
    public static void main(String[] args) {

        Stack<String> str= new Stack<>() ;

        str.push("nitesh") ;
        str.push("mourya");

        str.forEach(System.out::println);
    }
}
