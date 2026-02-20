package BST;



import java.util.Stack;

public class KthSmallest {
    public int kthSmallest(BSTNode root, int k) {
        Stack<BSTNode> st= new Stack<>();

        while(root != null || !st.isEmpty()){
            while(root !=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            k--;
            if(k==0){
                return root.val;
            }

            root=root.right;
        }
        return -1;
    }
}
