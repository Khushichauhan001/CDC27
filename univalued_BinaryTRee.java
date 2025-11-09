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
public class univalued_BinaryTRee {
     private boolean helper(TreeNode root ,int val){
        if(root == null) return true ;
        if(root.val != val) return false ;
        return (helper(root.left , val) && helper(root.right , val));
    
    }
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return helper(root, val);
    }
}
