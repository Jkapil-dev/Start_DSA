package BTreeTransversal;

import static BTreeTransversal.NonRecursivePreOrderTransversal.StackPreOrderTraversal;
import static BTreeTransversal.RecursivePreOrderTransversal.POTransversal;
import static BTreeTransversal.RecursiveInorderTraversal.recursiveInOrder;
import static BTreeTransversal.NonRecursiveInOrder.inOrderTraversal;
import static BTreeTransversal.RecursivePostOrder.recursivePostOrder;
import static BTreeTransversal.NonRecursivePostOrder.postOrderTraversal;
import static BTreeTransversal.LevelOrder.levelOrder;

public class Main {
    public static void main(String[] args){
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.print("Recursive preOrder Transversal :");
        POTransversal(root);
        System.out.println();
        System.out.println("PreOrder transversal using stack: "+StackPreOrderTraversal(root));

        System.out.print("Recursive InOrder Traversal :");
        recursiveInOrder(root);
        System.out.println();
        System.out.println("InOrder traversal using stack :"+ inOrderTraversal(root));

        System.out.print("Recursive postOrder Traversal :");
        recursivePostOrder(root);
        System.out.println();
        System.out.println("postOrder traversal using stack :"+ postOrderTraversal(root));

        System.out.println("LevelOrder Traversal :");
        levelOrder(root);
    }
}
