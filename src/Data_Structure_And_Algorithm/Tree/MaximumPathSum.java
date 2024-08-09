package Data_Structure_And_Algorithm.Tree;

class TreeNodes{
    int val ;
    TreeNodes left ;
    TreeNodes right ;
    TreeNodes(int val){
        this.val= val ;
    }
}
public class MaximumPathSum {
    public static int maxPathDOwn(TreeNodes node, int[]arr){
        if(node ==null){
            return 0 ;
        }
        int left =Math.max(0, maxPathDOwn(node.left,arr)) ;
        int right= Math.max(0, maxPathDOwn(node.right, arr)) ;
        arr[0]= Math.max(arr[0], left+right+node.val) ;
        return Math.max(left, right) + node.val ;
    }
    public static int maxPathSum(TreeNodes root){
        int[]arr= new int[1] ;
        arr[0]= Integer.MIN_VALUE ;
        maxPathDOwn(root, arr) ;
        return arr[0] ;
    }
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1);

        TreeNodes a = new TreeNodes(2);
        TreeNodes b = new TreeNodes(3);
        root.left = a;
        root.right = b;

        TreeNodes c = new TreeNodes(-30);
        TreeNodes d = new TreeNodes(5);
        a.left = c;
       a.right = d;

        TreeNodes e = new TreeNodes(6);
        TreeNodes f = new TreeNodes(20);
        b.right = e;
        b.left=f ;
        System.out.println(maxPathSum(root));
    }
}
