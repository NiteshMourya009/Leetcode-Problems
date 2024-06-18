package oopsConcept;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return  salary ;
    }

    public String getName(){
        return name;
    }

    public void setName(String n ){
        name= n ;
    }

}

class CellPhone{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public  void callFriend(){
        System.out.println("Calling Nitesh...");
    }

}
class square{
    int side;

    public int area(){
        return side*side ;

    }
    public int perimeter(){
        return 4*side ;
    }
}
class Tommy{

    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }

}
public class practiceSet01 {
    public static void main(String[] args) {

        //Problem 01
        Employee1 harry= new Employee1() ;

        harry.salary= 230;
        System.out.println(harry.getSalary());

        harry.setName("code with Nitesh");
        System.out.println(harry.getName());

        //Problem 02
        CellPhone asus =new CellPhone();

        asus.callFriend();
        asus.vibrate();
        asus.Ring();

        //Problem 03
        square sq= new square();

        sq.side= 3   ;
        System.out.println("Area of th square is:"+ sq.area());
        System.out.println("Perimeter of the square is:"+ sq.perimeter());


        // Problem 04
        Tommy Player1= new Tommy();

        Player1.run();
        Player1.hit();
        Player1.fire();
    }
}