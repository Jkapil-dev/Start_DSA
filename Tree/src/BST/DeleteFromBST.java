package BST;


import static BST.MinElementInBST.minNodeInBST;

public class DeleteFromBST {
    BSTNode delete(BSTNode root, int key) {

        if (root == null) {
            return null;
        }

        // Search the node
        if (key < root.val) {
            root.left = delete(root.left, key);
        }
        else if (key > root.val) {
            root.right = delete(root.right, key);
        }
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            else {
                BSTNode successor = minNodeInBST(root.right);
                root.val = successor.val;
                root.right = delete(root.right, successor.val);
            }
        }

        return root;
    }

}
