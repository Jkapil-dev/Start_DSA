package GenericTree;

public class TreeNode {
    int data;
    TreeNode firstChild;
    TreeNode nextSibling;
    TreeNode(int data){
        this.data=data;
        firstChild=null;
        nextSibling=null;
    }
}
