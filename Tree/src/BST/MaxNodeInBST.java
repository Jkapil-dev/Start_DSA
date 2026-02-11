package BST;

public class MaxNodeInBST {
    static BSTNode maxNodeInBST(BSTNode root) {
        if (root == null) return null;
        while (root.right != null) root = root.right;
        return root;
    }
}
