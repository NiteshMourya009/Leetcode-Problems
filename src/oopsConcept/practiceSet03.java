package oopsConcept;

class Cylinder{
    private int  radius ;
    private  int height ;

    public Cylinder(int radius ,int height ) {
        this.radius = radius;
        this.height= height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return  2*3.14*radius*radius + 2*3.14 *radius*height ;
    }
    public double Volume(){
        return  3.14*radius*radius*height ;
    }
}
class  Rectangle{

    private int length;
    private int breadth ;

    public Rectangle(){
        this.length= 4;
        this.breadth= 5;
    }
    public Rectangle(int length, int breadth){
         this.length= length ;
         this.breadth= breadth ;

    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class practiceSet03 {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder(9,12) ;
        // Problem 01
       // myCylinder.setHeight(20);
        System.out.println(myCylinder.getHeight());

       // myCylinder.setRadius(6);
        System.out.println(myCylinder.getRadius());

        // Problem 02
        System.out.println(myCylinder.SurfaceArea());

        // problem 03

        System.out.println(myCylinder.Volume());

        // problem 04 (Using Constructor)

        //Problem 05 (Overload a constructor)

        Rectangle r=new Rectangle(13, 56) ;

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());


    }
}
