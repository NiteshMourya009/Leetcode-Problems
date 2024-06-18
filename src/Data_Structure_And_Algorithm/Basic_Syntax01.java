package Data_Structure_And_Algorithm;

public class Basic_Syntax01 {

    // Recursive Method
    public static void displayRecursive(Node head){
        if(head==null){
            return  ;
        }
        System.out.print(head.data+" ");
        displayRecursive(head.next);
    }
    // REVERSE PRINTING
    public static void displayRecur(Node head){
        if(head==null)
            return  ;

        displayRecursive(head.next);
        System.out.print(head.data+" ");

    }

    public static void display(Node head){
          Node temp =head ;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp= temp.next ;
        }
    }
    public static  class Node{

        int data ; // Value
        Node next ; // Address of the next node

        Node(int data){
            this.data= data ;
        }

    }

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(8);
        Node f = new Node(5);

        a.next= b ;  //  3 ->4
        b.next= c ; //   3 -> 4 ->7
        c.next=d ;
        d.next= e ;
        e.next= f ;
       // System.out.println(a.data);
       // System.out.println(a.next.data);

        //Node temp= a ;
//       for(int i=0; i<=5 ; i++){
//           System.out.println(temp.data);
//           temp= temp.next ;
//       }
       // Another Method ;
//        while(temp != null){
//            System.out.println(temp.data);
//            temp= temp.next ;
//        }

        //Function Method
        display(a);
        System.out.println();

        // Recursively Method
        displayRecursive(a);
        System.out.println();
        // REVERSE PRINTING
        displayRecur(a);
    }
}
