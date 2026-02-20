package BST;

public class bstInorderSuccessor {
    public static BSTNode inorderSuccessor(int key ,BSTNode root){
        BSTNode successor=null;
        BSTNode curr=root;

        if(root.right!=null){
            root=root.right;
            BSTNode temp = root;
            while(temp!=null){
                temp=temp.left;
            }
            return temp;
        }

        while(curr!=null && curr.val!=key){
            if(curr.val>key){
                successor=curr;
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
        if(curr==null){
            return null;
        }



        return successor;
    }
}
