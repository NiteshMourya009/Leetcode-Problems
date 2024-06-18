package Data_Structure_And_Algorithm.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class pre_In_post_traversal {

    public static  class Node{
        int val ;
        Node left ;
        Node right ;
        public Node(int val){
            this.val= val ;
        }
    }
    public static List<Integer> inOrderTraversal (Node root){
         // Inorder traversal using iterative mode
        List<Integer> arr= new ArrayList<>();
        if(root==null) return arr ;
        Stack<Node> st= new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node temp= st.peek();
            if(temp.left!=null){
                st.push(temp.left) ;
                temp.left= null ; // VVIMP
            }
            else{
                st.pop() ;
                arr.add(temp.val);
                if(temp.right!= null){
                    st.push(temp.right) ;
                }
            }
        }
        return arr;
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

        System.out.println( inOrderTraversal(root));
    }
}
