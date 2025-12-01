import Tree.TreeNode;

class TreeNode{
    TreeNode node ;
    int data ;
    int level;
    TreeNode left ;
    TreeNode right;

    TreeNode(){};
    TreeNode(int data) { 
        this.data = data; 
    }
    TreeNode(int data, int level) { 
        this.data = data;
        this.level = level; 
    }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
}
public class MaxSumOfTree {
  public static int maxSum(TreeNode root , boolean inc){
    if(root == null) return 0;
    if( inc == true){
        return Math.max(maxSum(root.left, false) , maxSum(root.right, false))+root.data;
    }
    int x= Math.max(maxSum(root.left, true), maxSum(root.left, false));
    int y = Math.max(maxSum(root.right, true), maxSum(root.right, false));
    return x+y;

  }    
   public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(8);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(5);
        // root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(26);
        // root.left.right.left = new TreeNode(10);
        // root.left.right.right = new TreeNode(14);
        
        int ans = maxSum(root, false);
        int ans2 = maxSum(root, true);
        System.out.println(Math.max(ans, ans2));
   }
}
