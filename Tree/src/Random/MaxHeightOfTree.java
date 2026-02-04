package Random;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeightOfTree {
    public class TreeNode {
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

    class Solution {
        public int maxDepth(TreeNode root) {

            if(root==null)return 0;
            Queue<TreeNode> queue = new LinkedList<>();
            int size=0;
            queue.add(root);
            TreeNode  curr=root;
            while(!queue.isEmpty()){
                int queueSize = queue.size();
                size++;
                for(int i=0 ; i < queueSize ; i++){
                    curr = queue.poll();
                    if(curr.left != null)queue.add(curr.left);
                    if(curr.right != null)queue.add(curr.right);
                }
            }
            return size;

        }
    }
}
