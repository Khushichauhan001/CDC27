package Tree;
// gfg ques 
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class IsBTHeap {
    boolean isHeap(Node root) {
        int nodeCount = countNodes(root);
        int index = 0;
        return isComplete(root, index, nodeCount) && isMaxHeap(root);
    }

    int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    boolean isComplete(Node root, int index, int total) {
        if (root == null) return true;
        if (index >= total) return false;

        return isComplete(root.left, 2 * index + 1, total) &&
               isComplete(root.right, 2 * index + 2, total);
    }

    boolean isMaxHeap(Node root) {
        if (root == null) return true;

        if (root.left != null && root.left.data > root.data) return false;
        if (root.right != null && root.right.data > root.data) return false;

        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}
