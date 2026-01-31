package BTreeTransversal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    static public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> levelorder = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                temp = q.remove();
                if (temp != null) sublist.add(temp.data);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            levelorder.add(sublist);

        }
        return levelorder;
    }
}
