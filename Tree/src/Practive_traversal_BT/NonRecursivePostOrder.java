package Practive_traversal_BT;
import java.util.ArrayList;
import java.util.Stack;

public class NonRecursivePostOrder {
    static ArrayList<Integer> doPostOrder(Node root){
        ArrayList<Integer> postOrder=new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        Node temp;
        while(!st1.isEmpty()){
            temp=st1.pop();
            st2.push(temp);

            if(temp.left!=null)st1.push(temp.left);
            if(temp.right!=null)st1.push(temp.right);
        }
        Node element;
        while(!st2.isEmpty()){
            element =st2.pop();
            postOrder.add(element.data);
        }

        return postOrder;
    }
}
