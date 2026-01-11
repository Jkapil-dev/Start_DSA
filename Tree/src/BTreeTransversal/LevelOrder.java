package BTreeTransversal;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static void levelOrder(Node root ){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp=null;
        while(!q.isEmpty()){
            temp=q.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null)q.add(temp.left);
            if(temp.right != null)q.add(temp.right);
        }
    }
}
