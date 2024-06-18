package Data_Structure_And_Algorithm;
import java.util.LinkedList ;

public class Implementation_02 {
    public static  class Node{
        int data ;
        Node next ;
        Node(int data ){
            this.data= data ;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val) ;
            if(head == null){
                head= temp;

            }
            else{
                tail.next= temp ;

            }
            tail= temp ;

        }
        void insertAtBeginning(int val){
            Node temp =new Node(val) ;
            if(head==null){
                head= tail= temp ;

            }
            else{
                temp.next= head ;
                head= temp ;
            }


        }
        void insertAtIndex(int idx, int val){
            Node t= new Node(val);
            Node temp= head ;
            if(idx == Size()){
                insertAtEnd(val);
                return ;
            }
            else if(idx==0){
                insertAtBeginning(val);
                return ;
            }
            for(int i=0; i< idx-1; i++){
                temp= temp.next ;
            }
            t.next= temp.next ;
            temp.next= t;
        }
        int getAt(int idx){
            Node temp= head ;
             for(int i=1; i<=idx; i++){
                temp= temp.next ;
            }
            return temp.data ;
        }
        int Size(){
            Node temp= head;
            int count=0 ;
            while(temp!= null){
                count++ ;
                temp= temp.next ;
            }
            return count ;
        }
        void DeleteAt(int idx){
            if(idx==0){
                head= head.next ;
            }
            Node temp= head ;
            for(int i=1; i<=idx-1 ; i++){
                temp=temp.next;
            }

            temp.next=temp.next.next ;
            tail= temp ;
        }
        void display(){
            Node temp= head ;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next ;
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
     linkedList l1= new linkedList() ;
        l1.insertAtEnd(2);
        //l1.display();
        l1.insertAtEnd(3);
      //  l1.display();
        l1.insertAtEnd(5);
      //  l1.display();
        l1.insertAtEnd(6);
       // l1.display();
        l1.insertAtBeginning(9);
      //  l1.display();
        l1.insertAtIndex(4,23);
        l1.display();
        l1.DeleteAt(0);
        l1.display();



    }
}
