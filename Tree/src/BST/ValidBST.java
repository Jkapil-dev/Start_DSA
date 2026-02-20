package BST;

import java.util.Stack;

public class ValidBST {
    public boolean isValidBST(BSTNode root) {
        if (root == null)
            return true;
        Stack<BSTNode> st = new Stack<>();
        long prev = Long.MIN_VALUE , curr = 0;
        while (true) {

            while (root != null) {
                st.push(root);
                root = root.left;
            }
            if (st.isEmpty())
                break;
            BSTNode node = st.pop();
            curr = node.val;
            root = node.right;
            if (prev >= curr){
                return false;
            }
            prev = curr;
        }
        return true;
    }
}
