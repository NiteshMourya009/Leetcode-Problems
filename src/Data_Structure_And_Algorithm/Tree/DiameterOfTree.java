package Data_Structure_And_Algorithm.Tree;

class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int val){
        this.val =val ;
    }
}
public class DiameterOfTree {
    public static int diameter(TreeNode root, int[] max){
        if(root == null){
            return 0 ;
        }
        int l= diameter(root.left, max) ;
        int r= diameter(root.right, max) ;
        max[0]= Math.max(max[0], l+r);
        return 1+ Math.max(l,r) ;
    }
    public static int diameterOfBinaryTree(TreeNode root) {

        int[]arr= new int[1] ;
        diameter(root, arr) ;
        return arr[0] ;
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        TreeNode a= new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.left=a ;
        root.right=b;
        TreeNode c= new TreeNode(4);
        TreeNode d=new TreeNode(5);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(6);
        TreeNode f=new TreeNode(7);
        b.left=e ;
        b.right=f ;
        TreeNode g=new TreeNode(8);
        TreeNode h= new TreeNode(9);
        c.right=g;
        d.left=h ;
        System.out.println(diameterOfBinaryTree(root));
    }
}
