package ThreadedBinaryTree;


import static ThreadedBinaryTree.PreOrderSuccessorInInorderTBT.preOrderSuccessor;

public class PreOrderTraversal {
    void preOrderTraversal(ThreadedNode root) {
        ThreadedNode p;

        p=preOrderSuccessor(root);
        while (p != root) {
            p = preOrderSuccessor(root);
            System.out.println(p.val);
        }

    }

}
