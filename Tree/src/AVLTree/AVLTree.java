package AVLTree;

public class AVLTree {

    // -------- Node --------
    static class TreeNode {
        int val;
        TreeNode left, right;
        int height;

        TreeNode(int val) {
            this.val = val;
            this.height = 0; // leaf node
        }
    }

    private TreeNode root;

    // -------- Public Insert --------
    public void insert(int key) {
        root = insert(root, key);
    }

    // -------- Internal Insert --------
    private TreeNode insert(TreeNode node, int key) {

        // 1️⃣ Standard BST insert
        if (node == null)
            return new TreeNode(key);

        if (key < node.val)
            node.left = insert(node.left, key);
        else if (key > node.val)
            node.right = insert(node.right, key);
        else
            return node; // no duplicates

        // 2️⃣ Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // 3️⃣ Get balance
        int balance = getBalance(node);

        // 4️⃣ Rebalance using reusable rotations

        // LL case
        if (balance > 1 && key < node.left.val)
            return rotateRight(node);

        // RR case
        if (balance < -1 && key > node.right.val)
            return rotateLeft(node);

        // LR case (compose rotations)
        if (balance > 1 && key > node.left.val) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RL case (compose rotations)
        if (balance < -1 && key < node.right.val) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // -------- Helper Methods --------

    private int height(TreeNode node) {
        return (node == null) ? -1 : node.height;
    }

    private int getBalance(TreeNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // -------- Rotations --------

    private TreeNode rotateRight(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        // update heights (bottom-up)
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private TreeNode rotateLeft(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // -------- Optional: Inorder Traversal --------
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}