package Practive_traversal_BT;

import java.util.ArrayList;
import java.util.Stack;

public class NewPostOrder {
    static ArrayList<Integer> newPostOrder(Node root){
        Stack<Node> stOne = new Stack<>();
        Stack<Node> stTwo = new Stack<>();
        ArrayList<Integer> postorder= new ArrayList<>();
        stOne.push(root);
        while(!stOne.isEmpty()){
            Node curr =stOne.pop();
            stTwo.push(curr);
            if (curr.left != null) stOne.push(curr.left);
            if (curr.right != null) stOne.push(curr.right);
        }
        while(!stTwo.isEmpty()){
            postorder.add(stTwo.pop().data);
        }
        return postorder;
    }
}
