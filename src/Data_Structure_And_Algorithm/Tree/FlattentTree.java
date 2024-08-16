package Data_Structure_And_Algorithm.Tree;
import java.util.* ;
public class FlattentTree {
    public static class TreeNode{
        TreeNode left ;
        TreeNode right ;
        int val ;
        TreeNode(int val){
            this.val= val ;
        }
    }
    static Queue<TreeNode> pq= new LinkedList<>() ;
    public static void add(TreeNode root){
        if(root == null){
            return  ;
        }
        pq.add(root) ;
        add(root.left) ;
        add(root.right) ;
    }
    public static void flatten(TreeNode root) {
        add(root) ;

        while(!pq.isEmpty()){
            TreeNode temp = pq.poll();
            temp.right = pq.peek();
            temp.left = null;
        }
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4) ;
        TreeNode a = new TreeNode(7) ;
        TreeNode b = new TreeNode(9) ;
        root.left= a ;
        root.right= b ;
        TreeNode c= new TreeNode(12) ;
        TreeNode d = new TreeNode(45) ;
        a.left= c ;
        a.right= d ;

        flatten(root);




    }
}
