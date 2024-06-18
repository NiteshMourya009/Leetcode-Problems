package oopsConcept;


class PracticeA extends Thread {

    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
// While using sleep it will take time how much we define
class PracticeB extends Thread {
    public  void run(){
        while(true){
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome!");
        }
    }
}



public class practiceThreads {
    public static void main(String[] args) {

        PracticeA p1 = new PracticeA() ;
         p1.setPriority(6);
        PracticeB p2= new PracticeB() ;
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        System.out.println(p2.getState());

       // p1.start();
     //   p2.start();

    }
}
