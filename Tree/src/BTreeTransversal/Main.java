package BTreeTransversal;

import static BTreeTransversal.NonRecursivePreOrderTransversal.StackPreOrderTraversal;
import static BTreeTransversal.RecursivePreOrderTransversal.POTransversal;
import static BTreeTransversal.RecursiveInorderTraversal.recursiveInOrder;
import static BTreeTransversal.NonRecursiveInOrder.inOrderTraversal;

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
    }
}
