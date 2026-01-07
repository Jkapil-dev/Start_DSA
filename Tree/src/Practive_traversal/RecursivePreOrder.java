package Practive_traversal;

public class RecursivePreOrder {
    static void recursivePostOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
    }
}
