package com.LeetCode_Question;
import java.util.* ;
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
         List<String>st= new ArrayList<>() ;
         for(int i=1; i<=n; i++){
             if(i%3==0 && i%5==0){
                 st.add("FizzBuzz") ;
             }
             else if(i%3==0){
                 st.add("Fizz") ;
             }
             else if(i%5==0){
                 st.add("Buzz") ;
             }
             else{
                 st.add(String.valueOf(i)) ;
             }
         }
         return st ;
    }
    public static void main(String[] args) {
        int n=15 ;
        List<String> pt= fizzBuzz(n) ;
        for(int i=0; i<pt.size(); i++){
            System.out.println(pt.get(i));
        }
    }
}
