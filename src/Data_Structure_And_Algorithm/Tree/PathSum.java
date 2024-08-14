package Data_Structure_And_Algorithm.Tree;

public class PathSum {
    static class Node{
        Node left ;
        Node right ;
        int val ;
        Node(int val){
            this.val=val ;
        }
    }
    public static boolean pathSum(Node root, int sum){
         if(root== null){
             return false  ;
         }
         if(root.left==null && root.right==null && root.val==sum){
             return true ;
         }
         if(pathSum(root.left, sum-root.val) || pathSum(root.right, sum-root.val)){
             return true ;
         }
         return false ;
    }
    public static void main(String[] args) {
        Node root= new Node(5) ;
        Node a=new Node(4);
        Node b= new Node(8) ;
        root.left= a ;
        root.right=b ;
        Node c=new Node(11);
        Node d=new Node(7) ;
        Node e= new Node(2);
        a.left= c ;
        c.left=d ;
        c.right=e ;

        Node f= new Node(13) ;
        Node g=new Node(4) ;
        Node h=new Node(1) ;
        b.left=f ;
        b.right= g ;
        b.right=h ;
        int target=22 ;
        System.out.println(pathSum(root, target));
    }
}
