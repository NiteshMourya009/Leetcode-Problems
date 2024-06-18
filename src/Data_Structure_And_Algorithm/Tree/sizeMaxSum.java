package Data_Structure_And_Algorithm.Tree;

public class sizeMaxSum {

    public static class Node{
        int val ;
        Node left ;
        Node right ;

        public  Node(int val){
            this.val= val ;
        }
    }

    public static void preOrder(Node root){
        if(root== null) return;
        System.out.print(root.val+"-> ");
        preOrder(root.left);
        preOrder(root.right);
        System.out.println();

    }
    public static int size(Node root){
        if(root==null) return 0 ;
        return size(root.left)+ size(root.right)+1  ;
    }

    public static int sumOfNode(Node root){
        if(root==null) return 0 ;
        return sumOfNode(root.left)+sumOfNode(root.right) + root.val ;

    }
//    public static int maxValue(Node root){
//
//    }
    public static void main(String[] args) {

        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(20);
        b.right = e;
        b.left=f ;
         preOrder(root);
        System.out.println(size(root));

     //   System.out.println(sumOfNode(root));

    }
}
