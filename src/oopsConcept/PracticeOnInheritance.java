package oopsConcept;


class Circle{
    public int radius ;


     Circle(){
         System.out.println("I am non param of Circle");
     }
    Circle(int r){
        System.out.println("I am circle parameterized Constructor ");
        this.radius =r ;
    }
    public double area(){
        return Math.PI*this.radius*this.radius ;
    }
}

class Cylinder1 extends Circle{
    public int height ;
    Cylinder1(int r, int h){
        super(r);  //parameter wala constructor call hoga .
        System.out.println("I am Cylinder One with parameterized Constructor ");

         this.height = h;

    }

    public double volume() {

        return Math.PI*this.radius*this.radius*height;
    }

}


public class PracticeOnInheritance {
    public static void main(String[] args) {

        // Problem 01
        //   Circle obj01 =new Circle(10) ;
        Cylinder1 obj1= new Cylinder1(12 ,4) ;

    }
}
