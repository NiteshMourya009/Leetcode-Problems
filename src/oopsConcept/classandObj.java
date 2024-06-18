package oopsConcept;

class Employee{
    int id ;
    String name;
    public void printDetails(){
        System.out.println("My id is:"+id);
        System.out.println("and my name is:"+name);
    }
}

public class classandObj {
    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee Nitesh= new Employee(); //Instantiating a new Employee object

        Nitesh.id=30;
        Nitesh.name="CodeWithNitesh" ;

        // System.out.println("This is my id Number:"+Nitesh.id);
        //System.out.println("This is my unique name:"+Nitesh.name);

        Nitesh.printDetails();

        Employee harry= new Employee() ;
        harry.id=50 ;
        harry.name=" Shree RAM " ;

        harry.printDetails();


    }
}
