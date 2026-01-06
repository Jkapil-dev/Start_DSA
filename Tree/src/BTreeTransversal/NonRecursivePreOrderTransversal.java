package BTreeTransversal;

import java.util.ArrayList;
import java.util.Stack;

public class NonRecursivePreOrderTransversal {
  static ArrayList<Integer> StackPreOrderTraversal(Node root){
      Stack<Node> stack = new Stack<>();
      ArrayList<Integer> preOrder=new ArrayList<>();
      if(root==null){
          return preOrder;
      }
      stack.push(root);
      while(!stack.isEmpty()){
           root=stack.pop();
           preOrder.add(root.data);

         if(root.right!=null){
             stack.push(root.right);
         }
         if(root.left != null){
             stack.push(root.left);
         }
      }
      return preOrder;
  }
}
