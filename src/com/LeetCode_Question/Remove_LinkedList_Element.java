package com.LeetCode_Question;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static com.LeetCode_Question.Remove_LinkedList_Element.ListNode.removeElements;

public class Remove_LinkedList_Element {

    public static class ListNode{
        int val;
        ListNode next ;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public static ListNode removeElements(ListNode head, int val){
            ListNode start= new ListNode(-1);
            start.next= head ;
            ListNode temp= start ;

            while(temp.next != null){
                if(temp.next.val== val){
                    temp.next= temp.next.next ;
                }
                else{
                    temp= temp.next ;
                }
            }
            return start.next ;
        }
        public static  void display(ListNode head){
            while(head != null){
                System.out.println(head.val);
                head= head.next ;
            }
        }
    }
    public static void main(String[] args) {
//        ListNode a= new ListNode(1);
//        ListNode b= new ListNode(2);
//        ListNode c= new ListNode(6);
//        ListNode d= new ListNode(3);
//        ListNode f= new ListNode(4);
//        ListNode g= new ListNode(5);
//        ListNode h= new ListNode(6);

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i< 10; i++){
            list.add(i+1);
            if(i%2==0){
                list.add(i+1);
            }
        }


//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=f;
//        f.next=g;
//        g.next=h ;

        int val= 6 ;

         List<Integer> res = removeElement(list, 3);;
         res.forEach(System.out::println);
    }

    private static List removeElement(LinkedList<Integer> list, Integer no) {
         //List<Integer> res = list.stream().filter(e-> e != no).toList();
        //list.remove(no);
        /*if(list.contains(no)){
            removeElement(list, no);
        }*/
        Iterator<Integer> itr = list.iterator();

         return list;
    }
}
