package oopsConcept;

// Annotation used to provide extra Information about a program
// Annotation provides metadata to class/ Methods



class NewPhone {
    public void showTime(){
        System.out.println("Time is 8 pm" );
    }

}
class kalaPhone extends NewPhone{

    @Override
    public void showTime(){
        System.out.println("Time is 10 AM");
    }
     @Deprecated
    public int sum(int a , int b){
        return a+b ;
    }

}


public class Annotation{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        kalaPhone phone= new kalaPhone() ;
        phone.showTime();

        phone.sum(5,8);
    }


}
