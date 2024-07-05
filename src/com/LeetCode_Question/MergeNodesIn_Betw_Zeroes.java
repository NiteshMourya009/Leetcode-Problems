package com.LeetCode_Question;

public class MergeNodesIn_Betw_Zeroes {
    public class ListNode{
        ListNode next ;
        int val ;
        public ListNode(int val){
            this.val= val ;
        }
    }
    public void main(String[] args) {
          ListNode newnode= new ListNode(2) ;
          newnode.next= new ListNode(5) ;
          newnode.next.next= new ListNode(6) ;

    }
}
