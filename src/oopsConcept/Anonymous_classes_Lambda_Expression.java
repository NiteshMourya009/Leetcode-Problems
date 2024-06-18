package oopsConcept;


interface demoAnony{
    void meth1() ;
  //  void meth2() ;
}
// class AnonyDemo implements demoAnony{
//
//    public void Display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public  void meth1(){
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2(){
//        System.out.println("I am meth 2 ");
//    }

//}
class HarryFunc implements demoAnony{
    @Override
    public void meth1(){
        System.out.println("Mai method 1 hu") ;
    }
    public void meth2(){
        System.out.println("mai jinda hu");
    }
}


public class Anonymous_classes_Lambda_Expression {
    public static void main(String[] args) {

//        AnonyDemo obj= new AnonyDemo() ;
//        obj.meth1();
  ///  Anonymous Class
//        demoAnony obj = new demoAnony() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth 2");
//            }
//        } ;
//
//        obj.meth1();
//        obj.meth2() ;

        // Lambda Expression
//        demoAnony obj2= new HarryFunc() ; Normal Flow
//        obj2.meth1() ;
        demoAnony obj1=()->{
            System.out.println("I am method 1 from this lambda") ;
        } ;
        obj1.meth1();

    }
}
