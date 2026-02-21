package AVLTree;

public class TreeNode {
    int val;
    TreeNode left,right;
    int bf;  // balance factor: -1, 0, +1

    TreeNode(int val) {
        this.val = val;
        this.bf = 0;
    }
    TreeNode singleRotateL(TreeNode X){
        TreeNode Y = X.left;
        X.left=Y.right;
        Y.right=X;
        return Y;
    }
    TreeNode singleRotateR(TreeNode X){
        TreeNode Y = X.right;
        X.right=Y.left;
        Y.left=X;
        return Y;
    }

}
