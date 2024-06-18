package oopsConcept;

// polymorphism = one object many form
interface myCamera2{
    void takeSnap() ;
    void recordVideo();
    private void greet(){

        System.out.println("Good Morning to EveryOne");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");

    }

}
interface myWifi2{
    String[] getNetwork() ;
    void connectToNetwork(String network) ;
}
class MyCellPhone2{
    void callNumber(int phoneNumber){

        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone2 extends MyCellPhone2 implements myWifi2 , myCamera2{
    @Override
    public  void takeSnap(){

        System.out.println("Taking Snap");
    }
    @Override
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


public class Polymorphism {
    public static void main(String[] args) {


        myCamera2 cam1= new mySmartPhone2() ; // this is smartphone use it as a Camera Only
      //  cam1.getNetwork() ; (Can't allow this)
      // this. allow only camera2 class methods only

        cam1.record4KVideo();
        cam1.takeSnap();

        mySmartPhone2 s= new mySmartPhone2() ;

        s.connectToNetwork("dada");
        s.recordVideo();
        s.record4KVideo();
        s.pickCall();
        s.takeSnap();
    }
}
