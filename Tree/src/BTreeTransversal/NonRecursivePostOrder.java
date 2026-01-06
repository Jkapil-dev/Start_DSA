package BTreeTransversal;

import java.util.ArrayList;
import java.util.Stack;

public class NonRecursivePostOrder {
    static ArrayList<Integer> postOrderTraversal(Node root) {
        ArrayList<Integer> postOrder = new ArrayList<>();
        if (root == null) return postOrder;

        Stack<Node> st = new Stack<>();
        Node curr = root;
        Node lastVisited = null;

        while (curr != null || !st.isEmpty()) {

            // Go as left as possible
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            else {
                Node peekNode = st.peek();

                // If right child exists and not processed yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                }
                else {
                    postOrder.add(peekNode.data);
                    lastVisited = st.pop();
                }
            }
        }
        return postOrder;
    }

}
