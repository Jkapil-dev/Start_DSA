package Random;

import java.util.Stack;

public class FindingMax {
     static int findMax(TreeNode root){
         if(root==null)return 0;
        int max=0;
         Stack<TreeNode> st = new Stack<>();
         st.push(root);
        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            if(root.val > max) max = root.val;
            root=root.right;

        }
        return max;
    }

    public static void main(String[] args) {
        // Construction of a balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int lMax=findMax(root.left);
        int rMax=findMax(root.right);

        System.out.println("Maximum element in BT is : "+Math.max(root.val, Math.max(lMax,rMax)));
    }
}
