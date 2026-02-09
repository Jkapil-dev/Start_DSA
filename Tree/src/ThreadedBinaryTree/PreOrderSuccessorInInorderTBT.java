package ThreadedBinaryTree;

public class PreOrderSuccessorInInorderTBT {
    ThreadedNode preOrderSuccessor(ThreadedNode p){
        ThreadedNode position;
        //case 1: left child exists
        if(p.lTag==1){
            return p.left;
        }else{
            position = p;
            while(position.rTag==0){
                position=position.right;
            }

        }
        return position.right;
    }
}
