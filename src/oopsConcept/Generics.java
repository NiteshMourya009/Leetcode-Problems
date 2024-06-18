package oopsConcept;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;

  class myGenerics<T1, T2>{

      int val= 445 ;
      private T1 t1 ;
      private T2 t2 ;


      public myGenerics(int val, T1 t1, T2 t2) {
           this.val= val ;
          this.t1= t1 ;
          this.t2= t2 ;
      }
      public T2 getT2() {
          return t2;
      }

      public void setT2(T2 t2) {
          this.t2 = t2;
      }


      public T1 getT1() {
          return t1;
      }

      public void setT1(T1 t1) {
          this.t1 = t1;
      }

      public int getVal() {
          return val;
      }

      public void setVal(int val) {
          this.val = val;
      }
  }


public class Generics {
    public static void main(String[] args) {

//        ArrayList arrayList= new ArrayList() ;
//
//        arrayList.add("str 1");
//        arrayList.add(420) ;
//        arrayList.add(108) ;
//
//        int a= (int)  arrayList.get(2) ;
//        System.out.println(a);

    // Noe use of generics TypeCast ;
//        ArrayList<Integer> arrayList= new ArrayList<>() ;
//
//        arrayList.add(12);
//        arrayList.add(420) ;
//        arrayList.add(108) ;
//
//        int a= arrayList.get(2) ;
//        System.out.println(a);

        myGenerics<String, Integer> g1= new myGenerics(420,"aham Brahma ashmi",45 );
        String str= g1.getT1() ;
        Integer int1= g1.getVal();
        Object int2= g1.getT2() ;
        System.out.println(str+" ,"+ int1 +" ,"+ int2);





    }
}
