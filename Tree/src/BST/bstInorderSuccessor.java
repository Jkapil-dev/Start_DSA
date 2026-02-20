package BST;

public class bstInorderSuccessor {
    public static BSTNode inorderSuccessor(BSTNode root, int key) {
        BSTNode successor = null;
        BSTNode curr = root;

        // Step 1: Search for the node
        while (curr != null && curr.val != key) {
            if (key < curr.val) {
                successor = curr;        // potential successor
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (curr == null) return null;   // key not found

        // Step 2: If right subtree exists → leftmost node in right subtree
        if (curr.right != null) {
            BSTNode temp = curr.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp;
        }

        return successor;
    }
}
