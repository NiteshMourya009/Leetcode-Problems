package oopsConcept;

class base{
    int x;

    public int getX(){
        return x ;
    }
    public void printMe(){
        System.out.println("I am a Constructor");
    }
    public void setX(int x){
        System.out.println("I am Setting x now in child");
        this.x= x;
    }
}
// Inheritance
class Derived extends base{
    int y;
    public int getX(){
        return x ;
    }
    public void setX(int x){
        System.out.println("I am Setting x now in parent");
        this.x= x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Inheritance01 {
    public static void main(String[] args) {

        base base= new base();
        base.setX(420);
        System.out.println(base.getX());

        Derived derived= new Derived();
        derived.setX(520);
        System.out.println(derived.getX());

        derived.setY(30);
        System.out.println(derived.getY());

        base base1 = new Derived();
        base1.setX(100);

        base1.printMe();


    }
}
