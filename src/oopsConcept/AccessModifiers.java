package oopsConcept;


class C1{
    public int x =5 ;
    protected  int y= 45 ;
    int z = 6 ;
    private int a = 78 ;

    public void  meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}


public class AccessModifiers {
    public static void main(String[] args) {

        C1 c= new C1() ;
        c.meth1();
       //Within the same class we can access all the  four modifiers

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    //    System.out.println(c.a); In Same Package outside the class we can not  use private

    }
}
