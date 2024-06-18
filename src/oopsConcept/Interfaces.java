package oopsConcept;


interface Bicycle {
    int a= 45 ;

    void applyBrake(int decrement);

    void  speedUp(int increment);

}
interface HornBicycle{
    int b= 40 ;
    void blowHorn3Kg() ;
    void blowHorn5Kg() ;
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    @Override
   public  void applyBrake(int decrement) {
       System.out.println("Apply Brake");
   }
   @Override
    public void speedUp(int increment) {
        System.out.println("applying Speedup");
    }
    @Override
    public void blowHorn3Kg(){
        System.out.println("kabhi Khushi kabhi gum pee pee pee");
    }
    @Override
    public void blowHorn5Kg(){
        System.out.println("Main hu naa po po po ");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        AvonCycle cycleHarry = new AvonCycle() ;
        cycleHarry.applyBrake(4);
        cycleHarry.speedUp(25);
        System.out.println("This is the Variable of Direct Interface:"+cycleHarry.a);



        //  You cannot create Properties in Interfaces
        //  You cannot modify the properties in
        //  Interface as they are final Ex-: cycleHarry.a= 420 ;   (cann't Possible)


        cycleHarry.blowHorn();
        cycleHarry.blowHorn5Kg();
        cycleHarry.blowHorn3Kg();

    }
}
