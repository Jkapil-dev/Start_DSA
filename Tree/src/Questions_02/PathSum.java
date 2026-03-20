package Questions_02;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;

        if(root.left==null && root.right==null){
            return targetSum==root.val;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root,targetSum,path,result);
        return result;
    }
    void dfs(TreeNode root, int remainingSum ,List<Integer> path , List<List<Integer>>result){
        if(root==null)return;

        path.add(root.val);
        if(root.left==null && root.right==null && root.val==remainingSum){
            result.add(new ArrayList<>(path));
        }else{
            dfs(root.left,remainingSum-root.val,path,result) ;
            dfs(root.right,remainingSum-root.val,path,result);
        }
        path.remove(path.size() - 1);

    }

}
