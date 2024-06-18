package oopsConcept;


class MyThread1 extends Thread{
      @Override
    public void run(){
        while(true){
            System.out.println("My thread is Running");
            System.out.println( "I am Happy");
        }
    }
}

class MyThread2 extends Thread{

    public void run(){
        while(true){
            System.out.println("My thread is Good");
            System.out.println( "I am Sad!");
        }
    }

}

public class Multithreading {
    public static void main(String[] args) {

        MyThread1 t1 =new MyThread1() ;
        MyThread2 t2= new MyThread2() ;

        t1.start();
        t2.start();
    }
}
