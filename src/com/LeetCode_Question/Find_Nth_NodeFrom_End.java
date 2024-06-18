package com.LeetCode_Question;


// Find the given Node from the End
// total node= m
// So we use A.P formula the( n th From last = (m-n+1)th from start
// there is another way to solve this problem by two pointer Approach
// in this Method take two pointer slow and fast and move the fast pointer n times (n is the  nth Node From end )
// then move both pointer by One while fast in not Null at this Time slow will  point  on nth index from the last .

public class Find_Nth_NodeFrom_End {

    public static Node nthNode(Node head, int n){

        int size =0;
        Node temp= head ;
        while(temp != null){
            size++ ;
            temp= temp.next ;
        }
        int m = size-n+1 ;
        // mth Node From Start
        temp= head ;
        for(int i=1; i<= m-1; i++){
            temp= temp.next ;
        }
        return temp ;


    }
    //Another Method
    public static Node nthNode2(Node head, int n){
        Node slow=  head ;
        Node fast= head;

        for(int i=1; i<=n; i++){
            fast= fast.next ;
        }
        while(fast != null){
            slow= slow.next ;
            fast = fast.next ;
        }
        return slow ;
    }
    public static class Node{
        int data ;
        Node next ;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next= b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node Q= nthNode(a,2);
        System.out.println(Q.data);

        Node P= nthNode2(a,2);
        System.out.println(P.data);




    }
}
