package BTreeTransversal;



public class RecursivePreOrderTransversal {
    static void POTransversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        POTransversal(root.left);
        POTransversal(root.right);
    }


}
