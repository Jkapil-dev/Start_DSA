package ReadBlackTree;

public class RBTree {

    private RedBlackTreeNode root;

    private RedBlackTreeNode rotateLeft(RedBlackTreeNode x) {
        RedBlackTreeNode y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;

        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.left = x;
        x.parent = y;

        return y;
    }

    private RedBlackTreeNode rotateRight(RedBlackTreeNode x) {
        RedBlackTreeNode y = x.left;
        x.left = y.right;
        if (y.right != null) y.right.parent = x;

        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.right = x;
        x.parent = y;

        return y;
    }
}