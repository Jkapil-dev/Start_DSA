package Questions_02;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeightOfTree {
    public int maxDepth(TreeNode root) {
        //DFS(Depth First Search Approach to solve this question)
        if(root==null)return 0;
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);

        return Math.max(leftHeight,rightHeight)+1;

    }

    class Solution {
        public int maxDepth(TreeNode root) {

            //(BFS: Breadth First Search Approach for this question)

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
