package Tree;

import java.util.ArrayList;
import java.util.List;

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
public class RightSideView {
       public List<Integer> rightSideView(TreeNode node) {
         List<Integer> ans = new ArrayList<>();
        rightView(node, 0 , ans);
        return ans ;
    }
     static void rightView(TreeNode node , int level, List<Integer> ans){
    //    List<Integer> ans = new ArrayList<>();
        if(node == null){
            return ;
        }
 
        if(level == ans.size()){
            ans.add(node.val);
        }
        rightView(node.right, level+1, ans);
        rightView(node.left, level+1, ans);
    }
}
