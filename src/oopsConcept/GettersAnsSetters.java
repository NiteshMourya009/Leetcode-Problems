package oopsConcept;

class MyEmployee{

   // When our access modifier is private then
   // we use getter and setter for accessing the
    private int id;
    private String name ;

     public String getName(){
         return name ;
     }
    public void setName(String n){
        name = n; //here we can also write like this.name= n ;
    }
    public void setId(int i){
        id= i ; //Here also write like this.id= i ;
    }
    public int getId(){
        return id ;
    }
}

public class GettersAnsSetters {
    public static void main(String[] args) {

        MyEmployee harry= new MyEmployee() ;

//        harry.id= 45;
//        harry.name="Code with Nitesh";  ---> they Throws dur to private access modifier

        harry.setName("Code With Nitesh");
        System.out.println("Name of the Employee is:"+harry.getName());

        harry.setId(420);
        System.out.println("Id of the Employee is:"+harry.getId());
    }
}
