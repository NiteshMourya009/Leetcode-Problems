package oopsConcept;


class MyThr extends  Thread {

    public  MyThr(String name){
        super(name);
    }
    public void run(){
        int i= 0 ;
        while(true){
            System.out.println("Thank you " + this.getName());
        }


    }
}

public class Thread_Priorities {
    public static void main(String[] args) {

        // Ready Queue: T1 T2 T3 T4 T5
        MyThr t1 = new MyThr("Brahma");
        MyThr t2 = new MyThr("Vishnu") ;
        MyThr t3 = new MyThr("Mahesh (Most Important)");
        MyThr t4 = new MyThr("Harry 1");
        MyThr t5 = new MyThr("Harry 2");
        MyThr t6 = new MyThr("Harry 3");
        MyThr t7 = new MyThr("Harry 4");
        MyThr t8 = new MyThr("Harry 5");


        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();









    }
}
