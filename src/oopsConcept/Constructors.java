package oopsConcept;
import java.util.Scanner ;

class MainEmployee{
    private int id;
    private String name ;

    // this is a constructor made with same name as class name
    // it is used with in place of setter declaration
    public MainEmployee(){
        id=60 ;
        name= "Your-name_here" ;
    }
    // constructor overloading
    public MainEmployee(String MyName, int Myid){
         this.id= Myid ;
         this.name= MyName ;
    }
    public String getName(){
        return name ;
    }
    public  void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id ;

    }
    public void setId(int i){
        this.id = i ;
    }

}

public class Constructors {
    public static void main(String[] args)  {

        MainEmployee nitesh= new MainEmployee("ProgrammingWithNitesh", 420) ; //  arguments pass to overloading mostly and we can also write

       // nitesh.setName("code with nitesh");
       // System.out.println(nitesh.getName());

        System.out.println(nitesh.getName());
        System.out.println(nitesh.getId());
    }
}
