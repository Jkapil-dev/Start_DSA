package BST;

public class FindRecursively {
    static public BSTNode BSTSearchRecursively(BSTNode root , int data){
        if(root==null)return null;
        if(data < root.val)return BSTSearchRecursively(root.left , data);
        if(data > root.val)return BSTSearchRecursively(root.right , data);

        return root;
    }
}
