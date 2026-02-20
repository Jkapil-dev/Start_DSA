package BST;

public class bstInorderPredecessor {
    public static BSTNode inorderPredecessor(BSTNode root, int key) {
        BSTNode predecessor = null;
        BSTNode curr = root;

        // Step 1: Search for the node
        while (curr != null && curr.val != key) {
            if (key > curr.val) {
                predecessor = curr;      // potential predecessor
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        if (curr == null) return null;   // key not found

        // Step 2: If left subtree exists → rightmost node in left subtree
        if (curr.left != null) {
            BSTNode temp = curr.left;
            while (temp.right != null) {
                temp = temp.right;
            }
            return temp;
        }

        return predecessor;
    }
}
