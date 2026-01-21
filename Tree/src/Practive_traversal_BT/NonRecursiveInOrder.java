package Practive_traversal_BT;
import java.util.Stack;
import java.util.ArrayList;

public class NonRecursiveInOrder {
    static ArrayList<Integer> doInOrder(Node root){
        ArrayList<Integer> inOrder=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        while(true){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            if(st.isEmpty())break;
            root=st.pop();
            inOrder.add(root.data);
            root=root.right;

        }
        return inOrder;
    }
}
