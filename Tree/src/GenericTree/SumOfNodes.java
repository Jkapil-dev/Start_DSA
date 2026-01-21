package GenericTree;

public class SumOfNodes {
    static int recursiveSum(TreeNode root){
        if(root==null)return 0;
        return root.data+recursiveSum(root.firstChild)+recursiveSum(root.nextSibling);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.firstChild=new TreeNode(3);
        root.nextSibling=new TreeNode(2);
        int sum=recursiveSum(root);
        System.out.println(sum);
    }
}
