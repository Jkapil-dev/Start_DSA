package BST;

public class MinElementInBST {
    static BSTNode minNodeInBST(BSTNode root) {
        if (root == null) return null;
        while (root.left != null) root = root.left;
        return root;
    }
}
