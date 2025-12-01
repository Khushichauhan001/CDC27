package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
     public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> l1 = new LinkedList<List<Integer>>();
        if(root == null) return l1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0 ; i<levelNum ; i++){
              if(queue.peek().left != null) queue.offer(queue.peek().left);
              if(queue.peek().right != null) queue.offer(queue.peek().right);
              subList.add(queue.poll().val);
            }
            l1.add(subList);

        }
        return l1 ;

    }
}
