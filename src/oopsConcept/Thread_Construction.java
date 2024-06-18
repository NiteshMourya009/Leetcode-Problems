package oopsConcept;


class myThread extends Thread{

    public myThread(String name) {
           super(name) ;

    }
    public void run(){
        int i= 0;
        while(i<150){
            System.out.println("I am a Thread");
            i++ ;
        }
    }
}

public class Thread_Construction {
    public static void main(String[] args) {


        myThread t = new myThread("Nitesh");

        t.start();

        System.out.println("The id of the thread is:"+ t.getId());
        System.out.println("The name of the Thread is:"+ t.getName());
        System.out.println(t.getState());
        System.out.println(t.equals(10));

    }
}









