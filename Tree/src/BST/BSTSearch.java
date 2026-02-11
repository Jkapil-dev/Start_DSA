package BST;

public class BSTSearch {
    static BSTNode searchIN(BSTNode root , int data){
        if(root == null)return null;
        while(root!=null){
            if(data == root.val)return root;
            else if(data < root.val)root=root.left;
            else root=root.right;
        }
        return null;
    }
}
