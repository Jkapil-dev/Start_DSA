package BTreeTransversal;

public class RecursivePostOrder {
    static void recursivePostOrder(Node root){
        if(root==null)return;
        recursivePostOrder(root.left);
        recursivePostOrder(root.left);
        System.out.print(root.data + " ");
    }
}
