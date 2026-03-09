package BST;

public class ValidBST02 {
    public boolean isValidBST(BSTNode root) {
        long max=Long.MAX_VALUE;
        long min=Long.MIN_VALUE;

        return validateBST(root,max,min);
    }
    boolean validateBST(BSTNode root , long max , long min ){
        if(root==null)return true;
        if(root.val<=min || root.val>=max){
            return false;
        }
        return (validateBST(root.left,(long)root.val,min) && validateBST(root.right,max,(long)root.val));
    }
}
