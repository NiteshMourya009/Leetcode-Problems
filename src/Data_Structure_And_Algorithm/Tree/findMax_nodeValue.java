package Data_Structure_And_Algorithm.Tree;

public class findMax_nodeValue {

    public static class Node{
        int val ;
        Node left ;
        Node right ;
        public Node(int val){
             this.val= val ;
        }

    }
    public static  int maxNode(Node root){
        if(root== null) return  Integer.MIN_VALUE;
        int a= root.val ;
        int b= maxNode(root.left) ;
        int c= maxNode(root.right) ;
        return Math.max(a,Math.max(b,c)) ;
    }
    public static int height(Node root){
//        if(root == null){
//            return 0 ;ode
//        }
//        // it gives height by level wise
//        return Math.max(height(root.left),height(root.right)) + 1;

        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0 ;
        // it gives the height by edge wise
        return 1+ Math.max(height(root.left),height(root.right));

    }
    public static  int minNumber(Node root){
        if(root==null) return Integer.MAX_VALUE ;
       // if(root.left==null && root.right==null) return 0 ;
        return Math.min(root.val, Math.min(minNumber(root.left),minNumber(root.right)));
    }
    public static void main(String[] args) {


        Node root = new Node(8);

        Node a = new Node(-20);
        Node b = new Node(39);
        root.left = a;
        root.right = b;

        Node c = new Node(41);
        Node d = new Node(50);
        a.left = c;
        a.right = d;

        Node e = new Node(69);
        Node f= new Node(34);

        b.right = e;
        e.left= f ;

      //  System.out.println(maxNode(root));
       // System.out.println(height(root));
        System.out.println(minNumber(root));
    }
}
