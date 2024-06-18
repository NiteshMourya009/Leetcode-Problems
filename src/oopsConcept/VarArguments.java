package oopsConcept;
// A Function with variable arguments can be created
// in java using the following syntax:


public class VarArguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int ...arr){
       // int[]arr ;
       int result =0;
       for(int a: arr){
           result += a;

       }
       return result ;


    }
    public static void main(String[] args) {

        System.out.println("Welcome to the VarArg Tutorial");
//        System.out.println("The sum of the 4 and 5"+ sum(4,5));
//        System.out.println("The sum of the 4, 3 and 5 is:"+sum(4,3,5));
//        System.out.println("The sum of the 4, 3 ,5 and 6 is:"+sum(4,3,5,6));


        System.out.println("The sum of the Nothing is:"+ sum()); //this is valid only this case but when another parameter int x is also given to sum method then must be apply x ARGUMENTS
        System.out.println("The sum of the 4, 3 and 5 is: "+ sum(4,3,5));
        System.out.println("The sum of the 4, 3 ,5 and 6 is:"+sum(4,3,5,6));
    }
}
