package Questions_02;

public class InvertBT {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null ;


        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public TreeNode invertTree02(TreeNode root) {
        if(root==null)return null ;


        TreeNode left=invertTree02(root.left);
        TreeNode right=invertTree02(root.right);

        root.left=right;
        root.right=left;

        return root;
    }
}
