package oopsConcept;

abstract class Pen{

    abstract void write() ;

    abstract void reFill();


}
class fountainPen extends Pen{

    void write(){
        System.out.println("pen uses for Writing");
    }
    void reFill(){
        System.out.println("Refill the pen");
    }
    void changeNib(){
        System.out.println("I am changing my pen Nib");
    }
}
class monkey{
    void jump(){
        System.out.println("Monkey is jumping ");
    }
    void bite(){
        System.out.println("Monkey is not Biting anybody");
    }

}

interface BasicAnimal{
    void eat();
    void sleep() ;
}
class Human extends monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello Sir");
    }
    public void eat(){
        System.out.println("Every one eat food");
    }
    public void sleep(){
        System.out.println("Every Ones needs sleep ");
    }



}





public class PracticeOnAbstractOrInterface {
    public static void main(String[] args) {

        //Problem 01 or 2
        fountainPen pen = new fountainPen() ;

        pen.changeNib();
        pen.write();
        pen.reFill();

     // Problem 03
        Human harry= new Human() ;
        harry.sleep();
        harry.eat();
        harry.jump();


    // Problem 05 (Polymorphism)

        monkey m1= new Human() ;
        m1.bite();
        m1.jump();
        // m1.speak(); ---> Cannot use speak method because the reference is monkey which does not have Speak method ;

        BasicAnimal lovish =new Human() ;

        lovish.eat();
        lovish.sleep();


    }
}
