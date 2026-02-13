package BST;

public class InsertIntoBST {
    static BSTNode insertIntoBST(BSTNode root , int dataValue){
        if(root==null)return new BSTNode(dataValue);
        BSTNode curr =root;
        BSTNode parent=null;
        while(curr!=null){
                parent=curr;
            if(dataValue < curr.val){
                curr=curr.left;
            } else if (dataValue > curr.val) {
                curr=curr.right;
            }else{
                return root;//if same value exists directly return root tree
            }
        }
        BSTNode newNode = new BSTNode(dataValue);
        if(dataValue< parent.val){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }
        return root;

    }
}
