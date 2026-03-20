package Questions_02;

public class FlattenBST {
    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode node = root;

        while (node != null) {
            if (node.left != null) {
                TreeNode leftHandler = node.left;

                while (leftHandler.right != null) {
                    leftHandler = leftHandler.right;
                }

                leftHandler.right = node.right;

                node.right = node.left;
                node.left = null;
            }

            node = node.right;
        }
    }
}
