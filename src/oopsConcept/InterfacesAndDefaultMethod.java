package oopsConcept;


interface myCamera{
     void takeSnap() ;
     void recordVideo();
     // we can also use default method then no need to make empty method
     // like above we can declare here


    private void greet(){
        System.out.println("Good Morning to EveryOne");
        // private methods can also use although the are not accessible in main class due to private
        // but when default method is too long then we use private and use in default method like this
        // we can not use private method Directly
    }

     default void record4KVideo(){
        greet();
         System.out.println("Recording in 4k...");

     }

}
interface myWifi{
    String[] getNetwork() ;
    void connectToNetwork(String network) ;
}
class MyCellPhone{
   void callNumber(int phoneNumber){
       System.out.println("Calling"+ phoneNumber);
   }
   void pickCall(){
       System.out.println("Connecting...");
   }
}

class mySmartPhone extends MyCellPhone implements myWifi , myCamera{
  @Override
   public  void takeSnap(){
        System.out.println("Taking Snap");
    }
   public  void recordVideo(){
        System.out.println("Recording the video");
    }
    @Override
    public String[] getNetwork(){
        System.out.println("Getting List of Network");
        String[] networkList = {"Harry", "Nitesh", "Anchal"}  ;
        return  networkList ;

   }
    public void connectToNetwork(String network){
        System.out.println("Connecting to"+ network);
    }
}


public class InterfacesAndDefaultMethod {
    public static void main(String[] args) {

        mySmartPhone ms= new mySmartPhone() ;

        String[] ar = ms.getNetwork() ;
        for(String item:ar){
            System.out.println(item);
        }
        ms.record4KVideo();  // we can also Override this default method ;

    }
}
