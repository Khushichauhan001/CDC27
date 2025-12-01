package Tree;
import java.util.ArrayList;
import java.util.List;

import TreeNode;
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
public class PathSum2 {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        backtrack(root , targetSum , new ArrayList<>());
        return result ;
    }
    private void backtrack(TreeNode root , int targetSum , List<Integer> path){
        if(root == null) return ;
        path.add(root.val);
        targetSum -= root.val;

        if(root.left ==null && root.right == null && targetSum == 0){
            result.add(new ArrayList<>(path));
        }   
        backtrack(root.left , targetSum , path );
        backtrack(root.right , targetSum , path);
        path.remove(path.size()-1);
    }
}
