package com.LeetCode_Question;

public class Remove_Nth_nodeFromEnd {

    public static void RemoveNthNode(Node head, int n){
        Node slow= head ;
        Node fast= head ;

        for(int i=1; i<=n; i++){
            fast= fast.next ;
        }
        if(fast==null){
            head= head.next ;
            return;
        }
        while(fast.next != null){
            slow= slow.next;
            fast= fast.next;
        }
        slow.next= slow.next.next ;
    }
    public static void Display(Node head){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+ ", ");
            temp= temp.next ;
        }
        System.out.println();
    }
    public static class Node{
        int data ;
        Node next ;
        Node(int data) {

            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a= new Node(11);
        Node b= new Node(12);
        Node c= new Node(13);
        Node d= new Node(14);
        Node e= new Node(15);
        Node f= new Node(16);
        Node g= new Node(17);

        a.next= b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g ;

        Display(a);
        RemoveNthNode(a,7);
        Display(a);
    }
}
