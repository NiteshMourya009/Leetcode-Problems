package oopsConcept;

class base01{

    // Constructor
    base01(){
        System.out.println("Mai ek constructor hu");
    }
    base01(int x){
        System.out.println("I am overloaded constructor with value of a as:" + x );
    }
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x ){
        this.x= x;
    }

}

class Derived01 extends base01{

    // Constructor
    Derived01(){
        super(0);
        System.out.println("I am a Derived01 class constructor");
    }
    Derived01(int x, int y){
        super(x);
        System.out.println("I am an Overloaded constructor of Derived with value of y as:" + y );
    }

    public int y ;
    public int getY(){
        return y ;
    }
    public void setY(int y){
        this.y=y ;
    }
}


public class constructor_In_Inheritance {
    public static void main(String[] args) {

        base01 b = new base01() ;

        Derived01 d= new Derived01() ;

    }
}
