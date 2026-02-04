package ThreadedBinaryTree;

import static ThreadedBinaryTree.InOrderSuccessor.inOrderSuccessor;

public class InOrderTraversal {
    static void inOrderTraversal(ThreadedNode root){
        ThreadedNode curr= inOrderSuccessor(root);
        while(curr!=root){
            curr= inOrderSuccessor(curr);
            System.out.println(curr.val);
        }

    }
}
