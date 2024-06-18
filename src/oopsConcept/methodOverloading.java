package oopsConcept;

public class methodOverloading {
    // Two or more method with same name but different parameters
    // Method overloading can't be performed by changing the return type of the method
    static void foo(){
        System.out.println("Good Morning bro!");

    }
    static void foo(int a){ //here Int a is a parameter
        // Here int a taken as a copying off 'a' not actual values
        System.out.println("Good Morning "+ a +" bro!");
    }
    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    public static void main(String[] args) {

        foo();
        foo(300);
        foo(400,6000);
        // Here 300 , 400, 6000 are the arguments not parameters.
        // Arguments are the Actual values

    }

}
