package Random;

import com.sun.source.tree.Tree;

//LCA=lowest common ancestor
public class BST_LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null)return null;
           while(root!=null){
               if (p.val < root.val && q.val < root.val) {
                   root = root.left;
               }
               else if (p.val > root.val && q.val > root.val) {
                   root = root.right;
               }
               else {
                   return root;   
               }


           }
    }
}
