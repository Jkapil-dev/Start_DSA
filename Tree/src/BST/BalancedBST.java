package BST;

public class BalancedBST {
    public boolean isBalanced(BSTNode root) {
        return height(root) != -1;
    }

    public int height(BSTNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        if (left == -1) return -1;

        int right = height(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
