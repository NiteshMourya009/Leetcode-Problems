package oopsConcept;


interface sampleInterface{
    void meth1() ;
    void meth2() ;
}
// when we use interface class then we can inherit parent properties only in interface class not as a simple class
// In simple class we can only " Implements not extends "
interface childSampleInterface extends sampleInterface{
  //  @Override
//    void meth1();

    @Override
    void meth2();
    void meth3() ;
    void meth4();
}
class mySampleClass implements childSampleInterface{


    // When inherit the interface then it must write parent method in implemented class
    // either you are using them or not .
    public void meth1(){
        System.out.println("It is meth one");
    }
    public void meth2(){
        System.out.println("Is is meth two");
    }
    public void meth3(){
        System.out.println("It is method Three");
    }
    public void meth4(){
        System.out.println("It is method Four");
    }
}



public class InterfacesInInheritance {
    public static void main(String[] args) {

    }
}
