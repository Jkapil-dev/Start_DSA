package ReadBlackTree;

public class RedBlackTreeNode {
    int val;
    RedBlackTreeNode left , right , parent;
    boolean isRed;
    //true = red ; false = black

    RedBlackTreeNode(int data){
        this.val=data;
        this.isRed=true;
    }
}
