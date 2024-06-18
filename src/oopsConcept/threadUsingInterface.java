package oopsConcept;

class MyThreadRunnable1 implements Runnable{

    public void run(){
     int i =0;
     while(i<40000){
         System.out.println("I am a Thread 1 not a threat 1");
          i++ ;
        }
    }
}

class MyThreadRunnable2 implements Runnable{

    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("I am a Thread 2 not a threat 2");
            i++ ;
        }


    }
}



public class threadUsingInterface {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1= new MyThreadRunnable1() ;
        Thread gun1 = new Thread(bullet1) ;

        MyThreadRunnable2 bullet2 =new MyThreadRunnable2() ;
        Thread gun2 = new Thread(bullet2) ;

//        bullet1.start() ;
//        bullet2.start();   when Runnable interface use the we can not ACCESS them like this
        // we have to use thread obj like above ;

        gun1.start();
        gun2.start();



    }
}
