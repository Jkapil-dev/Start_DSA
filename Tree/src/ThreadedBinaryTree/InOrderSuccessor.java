package ThreadedBinaryTree;

public class InOrderSuccessor {
    public static ThreadedNode inOrderSuccessor(ThreadedNode root){

        // Case 1: Right pointer is a thread -> direct successor
        if(root.rTag==0){
            return root.right;
        }
        // Case  2:Right pointer is subtree -> go right, then all the way left
        ThreadedNode curr=root;
        while(curr.rTag==1){
            curr=curr.left;
        }
        return curr;
    }
}
