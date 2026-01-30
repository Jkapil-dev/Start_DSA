package Questions_BT;
import java.util.Stack;
public class IsTreeSame {
    public boolean isSameTree(Node p, Node q) {
        Stack<Node> st = new Stack<>();
        st.push(p);
        st.push(q);

        while (!st.isEmpty()) {
            Node n2 = st.pop();
            Node n1 = st.pop();

            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;
            if (n1.data != n2.data) return false;

            st.push(n1.left);
            st.push(n2.left);
            st.push(n1.right);
            st.push(n2.right);
        }
        return true;
    }
}
