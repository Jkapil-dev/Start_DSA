package ThreadedBinaryTree;

public class ThreadedNode {
    int val;
    ThreadedNode left, right;
    int lTag , rTag;
    // lTag = 0 → left is thread; 1 → real child
    // rTag = 0 → right is thread; 1 → real child

    ThreadedNode(int data) {
        this.val = data;
    }
}
