package oopsConcept;

class Phone{
    public void name(){
        System.out.println("My name is Java");
    }

    public void greet(){
        System.out.println("Good Morning");
    }

}
class SmartPhone extends Phone{
    public void name(){
        // method overriding
        System.out.println("My name is java in class two");
    }
    public void Swagat(){
        System.out.println("Aapka Swagat hai");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

//        Phone obj= new Phone();
//        SmartPhone smObj= new SmartPhone() ;
//        obj.name();

        Phone obj= new SmartPhone() ; // it is allowed
        obj.greet();
        obj.name();
      // obj.Swagat(); this is not Valid
        }


        // Not Valid
       // SmartPhone obj2= new Phone() ; Not Allowed

    }

