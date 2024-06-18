package oopsConcept;

class  EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a=v ;
        //a= v;

    }
    public int returnOne(){
        return 1;

    }

}
class DoClass extends EkClass{
    DoClass(int c ){
        super(c);
        System.out.println("Mai Ek constructor hoon");

    }
}


public class thisAndSuperKeyword {
    public static void main(String[] args) {

        EkClass e= new EkClass(65);
        System.out.println(e.getA());

        DoClass d= new DoClass(6);
        System.out.println(e.getA());


    }
}
