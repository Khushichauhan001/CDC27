 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class SecondMin {
     private long secondMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
      if( root ==null) return -1 ;
      int min1 = root.val;
      dfs(root , min1);
      return secondMin == Long.MAX_VALUE ? -1 : (int)secondMin ;
    }
    private void dfs(TreeNode root , int min1){
        if(root == null) return ;
        if(root.val > min1 && root.val < secondMin){
            secondMin = root.val ;
        }

        else if(root.val  == min1) {
         dfs(root.left , min1);
         dfs(root.right , min1);
        }
    }
}
