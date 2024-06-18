package oopsConcept;
import java.util.Scanner ;
public class ErrorsDemo {
    public static void main(String[] args) {
        // Errors are three type
      //  i) Syntax Errors
      //2) Logical Errors
      // 3) Runtime Errors ;

//     // Syntax error
//      int a =4;
//      int b= 10


    // Write the a program to print all prime numbers from 1 to 10

        // Logical Error
        System.out.println(2);
        for (int i=1 ; i<5; i++ ){
            System.out.println(2*i+1);
            //(Here 9 is also print and it is not the prime number SO it is logical error)
        }

        // Runtime Error

        Scanner sc= new Scanner(System.in) ;

        int k= sc.nextInt() ;
        System.out.println("Integer part of 1000 divided by k is"+ 1000/k);
       // Here if we use "0" then it is Runtime Error

    }
}
