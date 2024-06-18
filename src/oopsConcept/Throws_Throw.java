package oopsConcept;

 class NegativeRadiusException extends  Exception{

     public String toString(){
         return "Radius cannot be negative!" ;
     }
     public String getMeassage(){
         return "I am getMeassage" ;
     }
 }



public class Throws_Throw {

    public static double area (int r) throws  NegativeRadiusException{
        if(r<0){
            throw new  NegativeRadiusException() ;
        }
        double results= Math.PI* r*r ;
        return results ;
    }

    public static int divide(int a , int b) throws ArithmeticException{

        int result = a/b ;
        return result ;
    }

    public static void main(String[] args) {

        try{
            int c= divide(6, 2) ;
            System.out.println(c);
            double ar = area(6) ;
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");

        }



    }
}
