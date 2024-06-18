package Data_Structure_And_Algorithm;


public class Find_Length_OfList {

    public static int length(Node head){
        int count=0 ;
        while(head!= null){
            count++ ;
            head= head.next ;
        }
        return count ;
    }

    public static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data= data ;
        }
    }

    public static void main(String[] args) {

        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(25);
        Node e= new Node(8);
        Node f= new Node(45);
        Node g= new Node(9);
        Node h= new Node(21);
        Node i= new Node(32);

        a.next=b ;
        b.next= c ;
        c.next=d ;
        d.next= e ;
        e.next=f ;
        f.next= g ;
        g.next=h ;
        h.next=i ;

        System.out.println( length(a));

    }
}
