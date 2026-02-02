package Random;

import java.util.LinkedList;
import java.util.Queue;

public class InsertIntoBT {
    void findPos(TreeNode root , int newData){
        if (root==null) return ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr =queue.poll();
            if(curr.left==null){
                curr.left=new TreeNode(newData) ;
                return ;
            }else{
                queue.add(curr.left);
            }
            if(curr.right==null){
                curr.right=new TreeNode(newData) ;
                return;
            }else{
                queue.add(curr.right);
            }

        }
    }
}
