package BTreeTransversal;
import java.util.Stack;
import java.util.ArrayList;

public class NonRecursiveInOrder {
    static ArrayList<Integer> inOrderTraversal(Node root){
        if(root==null)return new ArrayList<Integer>();
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> inOrder=new ArrayList<>();

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
