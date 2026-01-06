package BTreeTransversal;

public class RecursiveInorderTraversal {
    static void recursiveInOrder(Node root){
        if(root==null)return;
        recursiveInOrder(root.left);
        System.out.print(root.data+ " ");
        recursiveInOrder(root.right);
    }
}
