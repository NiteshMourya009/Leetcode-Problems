package oopsConcept;

public class Enum {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //these are enum Constant
        // public static and final
        // since its final you can create child enums

      //  Week(){
           // System.out.println("Constructor called for "+this.toString());
     //   }
    }
    public static void main(String[] args) {

        Week week ;
        week= Week.Saturday ;


        for (Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());

    }
}
