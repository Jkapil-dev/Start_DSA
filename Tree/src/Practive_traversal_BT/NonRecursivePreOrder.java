package Practive_traversal_BT;

import java.util.ArrayList;
import java.util.Stack;

public class NonRecursivePreOrder {
    static ArrayList<Integer> doPreOrder(Node root){
        ArrayList<Integer> preOrder=new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            preOrder.add(root.data);

            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }

        }
        return preOrder;
    }
}
