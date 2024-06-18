package Data_Structure_And_Algorithm.Tree;

public class Symmetree_TreeWithCenter {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static boolean isSameTree(Node p, Node q){
        if(p==null && q==null) return true ;
        if(p==null || q==null) return false ;
        if(p.val!=q.val) return false ;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ;
    }

    public static Node invertTree(Node root){
        if(root==null) return root ;
        Node r= root.right ;
        Node l= root.left ;
        root.left= invertTree(r) ;
        root.right=invertTree(l);
        return root ;
    }

    public static boolean isSymmetric(Node root) {
        if(root==null) return true ;
        root.left= invertTree(root.left) ;
        return isSameTree(root.left, root.right);
    }
    public static void display(Node root){
        if(root==null){
            return ;
        }
        System.out.println(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root= new Node(1) ;
         Node a= new Node(2) ;
         Node b= new Node(3) ;
         root.left= a ;
         root.right=b ;

         Node c= new Node(4) ;
         Node d= new Node(5) ;
         Node e=new Node (6) ;
         Node f= new Node(7) ;

         a.left=c ;
         a.right=d ;
         b.left=e;
         b.right= f ;
        System.out.println(isSymmetric(root));

    }
}
