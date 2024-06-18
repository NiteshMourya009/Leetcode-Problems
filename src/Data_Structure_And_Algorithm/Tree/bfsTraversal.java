package Data_Structure_And_Algorithm.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class bfsTraversal {
    public static class Node{
        Node left ;
        Node right ;
        int val ;
        public Node(int val){
            this.val= val ;
        }
    }
    public static void bfs(Node root){
        // breadh first search is level wise traversal techniques
        Queue<Node> q= new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp =q.peek() ;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b=new Node(3);
        root.left=a ;
        root.right=b;
        Node c= new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e ;
        b.right=f ;
        Node g=new Node(8);
        Node h= new Node(9);
        c.right=g;
        d.left=h ;
        bfs(root);
    }
}
