package Questions_BT;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElementInBT {
    static int findMaxBT(Node root){
        int lMax =0, rMax=0;
        lMax=traverse(root.left);
        rMax=traverse(root.right);

        return Math.max(root.data, Math.max(lMax,rMax));
    }
  static int  traverse(Node root){
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       Node temp=null;
       int max=Integer.MIN_VALUE;
       while(!q.isEmpty()){
           temp=q.remove();
           if(temp.data>max)max=temp.data;
           if(temp.left != null )q.add(temp.left);
           if(temp.right != null )q.add(temp.right);
       }
       return max;
   }

}
