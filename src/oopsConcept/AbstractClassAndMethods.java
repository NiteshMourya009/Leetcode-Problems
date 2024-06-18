package oopsConcept ;

// Abstract means Only in thoughts  not in any physical Implementation

abstract class parent{
       public parent(){

           System.out.println("Mai base class ka Constructor hu");
      }

      public void SayHello(){
          System.out.println("Hello");
      }
      abstract public void greet() ;
      abstract public void greet2();
 }

  class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

      @Override
      public void greet2() {
          System.out.println("Ram Ram Bhai  Sarya ne");
      }
  }

  abstract class child02 extends parent{
    public void the(){
        System.out.println("I am Good");
        }
}

public class AbstractClassAndMethods {
    public static void main(String[] args) {

      // We can not make the object of abstract class

    //    parent p = new parent() {
    //    }
        child c= new child() ;
        c.greet();
        c.greet2();

        //  child02 d =new child02() {
        //  }

    }

}
