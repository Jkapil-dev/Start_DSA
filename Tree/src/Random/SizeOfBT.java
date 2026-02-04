package Random;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBT {//Note: size of tree means no of nodes present in the tree
    int sizeOfBT(TreeNode root){
        if(root==null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int size=0;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode  curr = queue.poll();
            size++;
            if(curr.left != null)queue.add(curr.left);
            if(curr.right != null)queue.add(curr.right);
        }
        return size;
    }
}
