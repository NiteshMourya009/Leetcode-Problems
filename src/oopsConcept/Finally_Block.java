package oopsConcept;






public class Finally_Block {

    public static int greet() {
        try {
            int a = 50;
            int b = 5;
            int c = a / b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is end the of the this program");
            // it will run always either Exception occurs
        }
        return 0;
    }
    public static void main(String[] args) {

        int k = greet() ;
        System.out.println(k);
    }
}
